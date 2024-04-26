package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.ObserverNode;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\r\u0010\u001b\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverNode;", "Landroidx/compose/ui/modifier/ModifierLocalNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent$ui_release", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "focusStateImpl", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusStateImpl$ui_release", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusStateImpl$ui_release", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "invalidateFocus", "", "invalidateFocus$ui_release", "onObservedReadsChanged", "onReset", "scheduleInvalidationForFocusEvents", "scheduleInvalidationForFocusEvents$ui_release", "FocusTargetModifierElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusTargetModifierNode.kt */
public final class FocusTargetModifierNode extends Modifier.Node implements ObserverNode, ModifierLocalNode {
    public static final int $stable = 8;
    private FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;

    public final FocusStateImpl getFocusStateImpl$ui_release() {
        return this.focusStateImpl;
    }

    public final void setFocusStateImpl$ui_release(FocusStateImpl focusStateImpl2) {
        Intrinsics.checkNotNullParameter(focusStateImpl2, "<set-?>");
        this.focusStateImpl = focusStateImpl2;
    }

    public final FocusState getFocusState() {
        return this.focusStateImpl;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent$ui_release() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    public void onObservedReadsChanged() {
        FocusState focusState = getFocusState();
        invalidateFocus$ui_release();
        if (!Intrinsics.areEqual((Object) focusState, (Object) getFocusState())) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    public void onReset() {
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        } else if (focusState == FocusStateImpl.ActiveParent) {
            scheduleInvalidationForFocusEvents$ui_release();
            this.focusStateImpl = FocusStateImpl.Inactive;
        } else if (focusState == FocusStateImpl.Inactive) {
            scheduleInvalidationForFocusEvents$ui_release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r4 = r1.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui_release() {
        /*
            r8 = this;
            androidx.compose.ui.focus.FocusPropertiesImpl r0 = new androidx.compose.ui.focus.FocusPropertiesImpl
            r0.<init>()
            r1 = r8
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            r2 = 2048(0x800, float:2.87E-42)
            int r2 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r2)
            r3 = 1024(0x400, float:1.435E-42)
            int r4 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r3)
            r2 = r2 | r4
            androidx.compose.ui.Modifier$Node r4 = r1.getNode()
            boolean r4 = r4.isAttached()
            java.lang.String r5 = "Check failed."
            if (r4 == 0) goto L_0x0088
            androidx.compose.ui.Modifier$Node r4 = r1.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r1 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r1)
        L_0x002d:
            if (r1 == 0) goto L_0x0085
            androidx.compose.ui.node.NodeChain r6 = r1.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r6 = r6.getHead$ui_release()
            int r6 = r6.getAggregateChildKindSet$ui_release()
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0072
        L_0x003e:
            if (r4 == 0) goto L_0x0072
            int r6 = r4.getKindSet$ui_release()
            r6 = r6 & r2
            if (r6 == 0) goto L_0x006d
            int r6 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r3)
            int r7 = r4.getKindSet$ui_release()
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0055
            androidx.compose.ui.focus.FocusProperties r0 = (androidx.compose.ui.focus.FocusProperties) r0
            return r0
        L_0x0055:
            boolean r6 = r4 instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode
            if (r6 == 0) goto L_0x0063
            r6 = r4
            androidx.compose.ui.focus.FocusPropertiesModifierNode r6 = (androidx.compose.ui.focus.FocusPropertiesModifierNode) r6
            r7 = r0
            androidx.compose.ui.focus.FocusProperties r7 = (androidx.compose.ui.focus.FocusProperties) r7
            r6.modifyFocusProperties(r7)
            goto L_0x006d
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x006d:
            androidx.compose.ui.Modifier$Node r4 = r4.getParent$ui_release()
            goto L_0x003e
        L_0x0072:
            androidx.compose.ui.node.LayoutNode r1 = r1.getParent$ui_release()
            if (r1 == 0) goto L_0x0083
            androidx.compose.ui.node.NodeChain r4 = r1.getNodes$ui_release()
            if (r4 == 0) goto L_0x0083
            androidx.compose.ui.Modifier$Node r4 = r4.getTail$ui_release()
            goto L_0x002d
        L_0x0083:
            r4 = 0
            goto L_0x002d
        L_0x0085:
            androidx.compose.ui.focus.FocusProperties r0 = (androidx.compose.ui.focus.FocusProperties) r0
            return r0
        L_0x0088:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetModifierNode.fetchFocusProperties$ui_release():androidx.compose.ui.focus.FocusProperties");
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverNodeKt.observeReads(this, new FocusTargetModifierNode$invalidateFocus$1(objectRef, this));
            if (objectRef.element == null) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) objectRef.element;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            }
        } else if (focusState != FocusStateImpl.ActiveParent) {
            FocusStateImpl focusStateImpl2 = FocusStateImpl.Inactive;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r3 = r5.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void scheduleInvalidationForFocusEvents$ui_release() {
        /*
            r8 = this;
            r0 = r8
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            r1 = 4096(0x1000, float:5.74E-42)
            int r1 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r1)
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r2)
            r1 = r1 | r3
            androidx.compose.ui.Modifier$Node r3 = r0.getNode()
            boolean r3 = r3.isAttached()
            java.lang.String r4 = "Check failed."
            if (r3 == 0) goto L_0x0084
            androidx.compose.ui.Modifier$Node r3 = r0.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r0)
        L_0x0028:
            if (r5 == 0) goto L_0x0083
            androidx.compose.ui.node.NodeChain r6 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r6 = r6.getHead$ui_release()
            int r6 = r6.getAggregateChildKindSet$ui_release()
            r6 = r6 & r1
            if (r6 == 0) goto L_0x0070
        L_0x0039:
            if (r3 == 0) goto L_0x0070
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r1
            if (r6 == 0) goto L_0x006b
            int r6 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r2)
            int r7 = r3.getKindSet$ui_release()
            r6 = r6 & r7
            if (r6 == 0) goto L_0x004e
            goto L_0x006b
        L_0x004e:
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusEventModifierNode
            if (r6 == 0) goto L_0x0061
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r0)
            androidx.compose.ui.focus.FocusOwner r6 = r6.getFocusOwner()
            r7 = r3
            androidx.compose.ui.focus.FocusEventModifierNode r7 = (androidx.compose.ui.focus.FocusEventModifierNode) r7
            r6.scheduleInvalidation((androidx.compose.ui.focus.FocusEventModifierNode) r7)
            goto L_0x006b
        L_0x0061:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x006b:
            androidx.compose.ui.Modifier$Node r3 = r3.getParent$ui_release()
            goto L_0x0039
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            if (r5 == 0) goto L_0x0081
            androidx.compose.ui.node.NodeChain r3 = r5.getNodes$ui_release()
            if (r3 == 0) goto L_0x0081
            androidx.compose.ui.Modifier$Node r3 = r3.getTail$ui_release()
            goto L_0x0028
        L_0x0081:
            r3 = 0
            goto L_0x0028
        L_0x0083:
            return
        L_0x0084:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetModifierNode.scheduleInvalidationForFocusEvents$ui_release():void");
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FocusTargetModifierNode.kt */
    public static final class FocusTargetModifierElement extends ModifierNodeElement<FocusTargetModifierNode> {
        public static final FocusTargetModifierElement INSTANCE = new FocusTargetModifierElement();

        public boolean equals(Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        public FocusTargetModifierNode update(FocusTargetModifierNode focusTargetModifierNode) {
            Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
            return focusTargetModifierNode;
        }

        private FocusTargetModifierElement() {
        }

        public FocusTargetModifierNode create() {
            return new FocusTargetModifierNode();
        }

        public void inspectableProperties(InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
        }
    }
}
