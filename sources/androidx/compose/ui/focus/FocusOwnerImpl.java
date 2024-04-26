package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001d\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001d\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000203H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\u001d\u00105\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u0010.J\u000e\u00107\u001a\u0004\u0018\u000108*\u000209H\u0002J\\\u0010:\u001a\u00020\u0005\"\n\b\u0000\u0010;\u0018\u0001*\u000209*\u0002H;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u0003H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier$annotations", "()V", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getRootFocusNode$ui_release$annotations", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchKeyEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchRotaryEvent", "event", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusOwnerImpl.kt */
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetModifierNode rootFocusNode = new FocusTargetModifierNode();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FocusOwnerImpl.kt */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    public static /* synthetic */ void getRootFocusNode$ui_release$annotations() {
    }

    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetModifierNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    public void setLayoutDirection(LayoutDirection layoutDirection2) {
        Intrinsics.checkNotNullParameter(layoutDirection2, "<set-?>");
        this.layoutDirection = layoutDirection2;
    }

    public final void setRootFocusNode$ui_release(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<set-?>");
        this.rootFocusNode = focusTargetModifierNode;
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onRequestApplyChangesListener");
        this.focusInvalidationManager = new FocusInvalidationManager(function1);
        this.modifier = new FocusOwnerImpl$modifier$1(this);
    }

    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection2 = this.layoutDirection;
        if (layoutDirection2 != null) {
            return layoutDirection2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    public void takeFocus() {
        if (this.rootFocusNode.getFocusStateImpl$ui_release() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        }
    }

    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    public void clearFocus(boolean z) {
        clearFocus(z, true);
    }

    public void clearFocus(boolean z, boolean z2) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl$ui_release = this.rootFocusNode.getFocusStateImpl$ui_release();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z, z2)) {
            FocusTargetModifierNode focusTargetModifierNode = this.rootFocusNode;
            int i = WhenMappings.$EnumSwitchMapping$0[focusStateImpl$ui_release.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else if (i == 4) {
                focusStateImpl = FocusStateImpl.Inactive;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(focusStateImpl);
        }
    }

    /* renamed from: moveFocus-3ESFkO8  reason: not valid java name */
    public boolean m2519moveFocus3ESFkO8(int i) {
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester r2 = FocusTraversalKt.m2524customFocusSearchOMvw8(findActiveFocusNode, i, getLayoutDirection());
        if (Intrinsics.areEqual((Object) r2, (Object) FocusRequester.Companion.getCancel())) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) r2, (Object) FocusRequester.Companion.getDefault())) {
            return r2.findFocusTarget$ui_release(FocusOwnerImpl$moveFocus$1.INSTANCE);
        }
        if (FocusTraversalKt.m2525focusSearchsMXa3k8(this.rootFocusNode, i, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode)) || m2517wrapAroundFocus3ESFkO8(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: dispatchKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m2518dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        int i;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            DelegatableNode delegatableNode = findActiveFocusNode;
            KeyInputModifierNode lastLocalKeyInputNode = lastLocalKeyInputNode(delegatableNode);
            List<Modifier.Node> list = null;
            if (lastLocalKeyInputNode == null) {
                Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(delegatableNode, NodeKind.m4780constructorimpl(8192));
                if (!(nearestAncestor instanceof KeyInputModifierNode)) {
                    nearestAncestor = null;
                }
                lastLocalKeyInputNode = (KeyInputModifierNode) nearestAncestor;
            }
            if (lastLocalKeyInputNode != null) {
                DelegatableNode delegatableNode2 = lastLocalKeyInputNode;
                List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(delegatableNode2, NodeKind.m4780constructorimpl(8192));
                if (ancestors instanceof List) {
                    list = ancestors;
                }
                if (list != null && list.size() - 1 >= 0) {
                    while (true) {
                        int i2 = i - 1;
                        if (((KeyInputModifierNode) list.get(i)).m4191onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        i = i2;
                    }
                }
                KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) delegatableNode2;
                if (keyInputModifierNode.m4191onPreKeyEventZmokQxo(keyEvent) || keyInputModifierNode.m4190onKeyEventZmokQxo(keyEvent)) {
                    return true;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((KeyInputModifierNode) list.get(i3)).m4190onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int i;
        Intrinsics.checkNotNullParameter(rotaryScrollEvent, NotificationCompat.CATEGORY_EVENT);
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        List<Modifier.Node> list = null;
        if (findActiveFocusNode != null) {
            Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(findActiveFocusNode, NodeKind.m4780constructorimpl(16384));
            if (!(nearestAncestor instanceof RotaryInputModifierNode)) {
                nearestAncestor = null;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) nearestAncestor;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            DelegatableNode delegatableNode = rotaryInputModifierNode;
            List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(delegatableNode, NodeKind.m4780constructorimpl(16384));
            if (ancestors instanceof List) {
                list = ancestors;
            }
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    if (((RotaryInputModifierNode) list.get(i)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            RotaryInputModifierNode rotaryInputModifierNode2 = (RotaryInputModifierNode) delegatableNode;
            if (rotaryInputModifierNode2.onPreRotaryScrollEvent(rotaryScrollEvent) || rotaryInputModifierNode2.onRotaryScrollEvent(rotaryScrollEvent)) {
                return true;
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((RotaryInputModifierNode) list.get(i3)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusTargetModifierNode);
    }

    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        Intrinsics.checkNotNullParameter(focusEventModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        Intrinsics.checkNotNullParameter(focusPropertiesModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }

    public Rect getFocusRect() {
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8  reason: not valid java name */
    private final boolean m2517wrapAroundFocus3ESFkO8(int i) {
        if (!this.rootFocusNode.getFocusState().getHasFocus() || this.rootFocusNode.getFocusState().isFocused() || (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s()) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2511getPreviousdhqQ8s()))) {
            return false;
        }
        clearFocus(false);
        if (!this.rootFocusNode.getFocusState().isFocused()) {
            return false;
        }
        return m2519moveFocus3ESFkO8(i);
    }

    /* renamed from: traverseAncestors-Y-YKmho  reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2516traverseAncestorsYYKmho(T t, int i, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        int i2;
        List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(t, i);
        if (!(ancestors instanceof List)) {
            ancestors = null;
        }
        if (ancestors != null && ancestors.size() - 1 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                function1.invoke(ancestors.get(i2));
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        function1.invoke(t);
        function12.invoke(t);
        if (ancestors != null) {
            int size = ancestors.size();
            for (int i4 = 0; i4 < size; i4++) {
                function12.invoke(ancestors.get(i4));
            }
        }
    }

    private final KeyInputModifierNode lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int r1 = NodeKind.m4780constructorimpl(1024) | NodeKind.m4780constructorimpl(8192);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            KeyInputModifierNode keyInputModifierNode = null;
            if ((node.getAggregateChildKindSet$ui_release() & r1) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & r1) != 0) {
                        if ((NodeKind.m4780constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                            return keyInputModifierNode;
                        }
                        if (child$ui_release instanceof KeyInputModifierNode) {
                            keyInputModifierNode = child$ui_release;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
            }
            return keyInputModifierNode;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
