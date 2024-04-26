package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0001¨\u0006\u0006"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "refreshFocusEventNodes", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusEventModifierNode.kt */
public final class FocusEventModifierNodeKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FocusEventModifierNode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FocusState getFocusState(FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "<this>");
        DelegatableNode delegatableNode = focusEventModifierNode;
        int r0 = NodeKind.m4780constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            continue;
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            FocusStateImpl focusStateImpl$ui_release = ((FocusTargetModifierNode) node).getFocusStateImpl$ui_release();
                            int i = WhenMappings.$EnumSwitchMapping$0[focusStateImpl$ui_release.ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return focusStateImpl$ui_release;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return FocusStateImpl.Inactive;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r2 = r6.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void refreshFocusEventNodes(androidx.compose.ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.node.DelegatableNode r6 = (androidx.compose.ui.node.DelegatableNode) r6
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r0)
            r1 = 1024(0x400, float:1.435E-42)
            int r2 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r1)
            r0 = r0 | r2
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.isAttached()
            java.lang.String r3 = "Check failed."
            if (r2 == 0) goto L_0x0084
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r6)
        L_0x002c:
            if (r6 == 0) goto L_0x0083
            androidx.compose.ui.node.NodeChain r4 = r6.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r4 = r4.getHead$ui_release()
            int r4 = r4.getAggregateChildKindSet$ui_release()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0070
        L_0x003d:
            if (r2 == 0) goto L_0x0070
            int r4 = r2.getKindSet$ui_release()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x006b
            int r4 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r1)
            int r5 = r2.getKindSet$ui_release()
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0052
            return
        L_0x0052:
            boolean r4 = r2 instanceof androidx.compose.ui.focus.FocusEventModifierNode
            if (r4 == 0) goto L_0x0061
            r4 = r2
            androidx.compose.ui.focus.FocusEventModifierNode r4 = (androidx.compose.ui.focus.FocusEventModifierNode) r4
            androidx.compose.ui.focus.FocusState r5 = getFocusState(r4)
            r4.onFocusEvent(r5)
            goto L_0x006b
        L_0x0061:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r3.toString()
            r6.<init>(r0)
            throw r6
        L_0x006b:
            androidx.compose.ui.Modifier$Node r2 = r2.getParent$ui_release()
            goto L_0x003d
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r6 = r6.getParent$ui_release()
            if (r6 == 0) goto L_0x0081
            androidx.compose.ui.node.NodeChain r2 = r6.getNodes$ui_release()
            if (r2 == 0) goto L_0x0081
            androidx.compose.ui.Modifier$Node r2 = r2.getTail$ui_release()
            goto L_0x002c
        L_0x0081:
            r2 = 0
            goto L_0x002c
        L_0x0083:
            return
        L_0x0084:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r3.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(androidx.compose.ui.focus.FocusTargetModifierNode):void");
    }
}
