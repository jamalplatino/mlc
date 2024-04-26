package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0013H\u0003\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0003\u001a1\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001e\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a=\u0010#\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a=\u0010'\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&\u001a\f\u0010)\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a7\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "activeNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "bottomRight", "collectAccessibleChildren", "", "Landroidx/compose/ui/node/DelegatableNode;", "accessibleChildren", "Landroidx/compose/runtime/collection/MutableVector;", "findBestCandidate", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findChildCorrespondingToFocusEnter", "onFound", "Lkotlin/Function1;", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "searchChildren", "searchChildren-4C6V_qg", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TwoDimensionalFocusSearch.kt */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TwoDimensionalFocusSearch.kt */
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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final Boolean m2537twoDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(function1, "onFound");
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i2 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusStateImpl$ui_release().ordinal()];
                if (i3 == 1) {
                    Boolean r2 = m2537twoDimensionalFocusSearchOMvw8(activeChild, i, function1);
                    if (!Intrinsics.areEqual((Object) r2, (Object) false)) {
                        return r2;
                    }
                    FocusRequester invoke = activeChild.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2493boximpl(i));
                    if (Intrinsics.areEqual((Object) invoke, (Object) FocusRequester.Companion.getDefault())) {
                        invoke = null;
                    }
                    FocusRequester focusRequester = invoke;
                    if (focusRequester == null) {
                        return Boolean.valueOf(m2534generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeNode(activeChild), i, function1));
                    }
                    if (Intrinsics.areEqual((Object) focusRequester, (Object) FocusRequester.Companion.getCancel())) {
                        return null;
                    }
                    return Boolean.valueOf(focusRequester.findFocusTarget$ui_release(function1));
                } else if (i3 == 2 || i3 == 3) {
                    return Boolean.valueOf(m2534generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, i, function1));
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        } else if (i2 == 2 || i2 == 3) {
            return Boolean.valueOf(m2533findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, i, function1));
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNode);
            } else {
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: androidx.compose.ui.focus.FocusTargetModifierNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m2533findChildCorrespondingToFocusEnterOMvw8(androidx.compose.ui.focus.FocusTargetModifierNode r5, int r6, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetModifierNode, java.lang.Boolean> r7) {
        /*
            java.lang.String r0 = "$this$findChildCorrespondingToFocusEnter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.compose.ui.focus.FocusProperties r0 = r5.fetchFocusProperties$ui_release()
            kotlin.jvm.functions.Function1 r0 = r0.getEnter()
            androidx.compose.ui.focus.FocusDirection r1 = androidx.compose.ui.focus.FocusDirection.m2493boximpl(r6)
            java.lang.Object r0 = r0.invoke(r1)
            r1 = r0
            androidx.compose.ui.focus.FocusRequester r1 = (androidx.compose.ui.focus.FocusRequester) r1
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion
            androidx.compose.ui.focus.FocusRequester r2 = r2.getDefault()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r2 = 0
            if (r1 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            r1 = 0
            if (r0 == 0) goto L_0x0044
            androidx.compose.ui.focus.FocusRequester$Companion r5 = androidx.compose.ui.focus.FocusRequester.Companion
            androidx.compose.ui.focus.FocusRequester r5 = r5.getCancel()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            boolean r1 = r0.findFocusTarget$ui_release(r7)
        L_0x0043:
            return r1
        L_0x0044:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.focus.FocusTargetModifierNode[] r3 = new androidx.compose.ui.focus.FocusTargetModifierNode[r3]
            r0.<init>(r3, r1)
            r3 = r5
            androidx.compose.ui.node.DelegatableNode r3 = (androidx.compose.ui.node.DelegatableNode) r3
            collectAccessibleChildren(r3, r0)
            int r3 = r0.getSize()
            r4 = 1
            if (r3 > r4) goto L_0x0076
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            java.lang.Object[] r5 = r0.getContent()
            r2 = r5[r1]
        L_0x0067:
            androidx.compose.ui.focus.FocusTargetModifierNode r2 = (androidx.compose.ui.focus.FocusTargetModifierNode) r2
            if (r2 == 0) goto L_0x0075
            java.lang.Object r5 = r7.invoke(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x0075:
            return r1
        L_0x0076:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.Companion
            int r2 = r2.m2505getEnterdhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m2496equalsimpl0(r6, r2)
            if (r2 == 0) goto L_0x0088
            androidx.compose.ui.focus.FocusDirection$Companion r6 = androidx.compose.ui.focus.FocusDirection.Companion
            int r6 = r6.m2512getRightdhqQ8s()
        L_0x0088:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.Companion
            int r2 = r2.m2512getRightdhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m2496equalsimpl0(r6, r2)
            if (r2 == 0) goto L_0x0095
            goto L_0x00a1
        L_0x0095:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.Companion
            int r2 = r2.m2504getDowndhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m2496equalsimpl0(r6, r2)
            if (r2 == 0) goto L_0x00aa
        L_0x00a1:
            androidx.compose.ui.geometry.Rect r5 = androidx.compose.ui.focus.FocusTraversalKt.focusRect(r5)
            androidx.compose.ui.geometry.Rect r5 = topLeft(r5)
            goto L_0x00cb
        L_0x00aa:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.Companion
            int r2 = r2.m2508getLeftdhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m2496equalsimpl0(r6, r2)
            if (r2 == 0) goto L_0x00b7
            goto L_0x00c3
        L_0x00b7:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.Companion
            int r2 = r2.m2513getUpdhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m2496equalsimpl0(r6, r2)
            if (r2 == 0) goto L_0x00dc
        L_0x00c3:
            androidx.compose.ui.geometry.Rect r5 = androidx.compose.ui.focus.FocusTraversalKt.focusRect(r5)
            androidx.compose.ui.geometry.Rect r5 = bottomRight(r5)
        L_0x00cb:
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = m2532findBestCandidate4WY_MpI(r0, r5, r6)
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r7.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x00db:
            return r1
        L_0x00dc:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This function should only be used for 2-D focus search"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m2533findChildCorrespondingToFocusEnterOMvw8(androidx.compose.ui.focus.FocusTargetModifierNode, int, kotlin.jvm.functions.Function1):boolean");
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m2534generateAndSearchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m2536searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2492searchBeyondBoundsOMvw8(focusTargetModifierNode, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: findBestCandidate-4WY_MpI  reason: not valid java name */
    private static final FocusTargetModifierNode m2532findBestCandidate4WY_MpI(MutableVector<FocusTargetModifierNode> mutableVector, Rect rect, int i) {
        Rect rect2;
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            rect2 = rect.translate(rect.getWidth() + ((float) 1), 0.0f);
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            rect2 = rect.translate(-(rect.getWidth() + ((float) 1)), 0.0f);
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
            rect2 = rect.translate(0.0f, rect.getHeight() + ((float) 1));
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            rect2 = rect.translate(0.0f, -(rect.getHeight() + ((float) 1)));
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        int size = mutableVector.getSize();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetModifierNode2);
                    if (m2535isBetterCandidateI7lrPNg(focusRect, rect2, rect, i)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        rect2 = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
        }
        return focusTargetModifierNode;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else if (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
            return true;
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float top;
        float bottom;
        float top2;
        float bottom2;
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s()) || FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            f4 = (float) 2;
            f2 = rect2.getTop() + (rect2.getHeight() / f4);
            f = rect.getTop();
            f3 = rect.getHeight();
        } else if (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s()) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else {
            f4 = (float) 2;
            f2 = rect2.getLeft() + (rect2.getWidth() / f4);
            f = rect.getLeft();
            f3 = rect.getWidth();
        }
        return f2 - (f + (f3 / f4));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long abs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long abs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: isBetterCandidate-I7lrPNg  reason: not valid java name */
    private static final boolean m2535isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) && !m2531beamBeatsI7lrPNg(rect3, rect, rect2, i) && (m2531beamBeatsI7lrPNg(rect3, rect2, rect, i) || isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) >= isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2))) {
            return false;
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        if (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s()) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            if (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s()) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else if (!FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else if (rect2.getBottom() <= rect.getTop()) {
            return true;
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$15(Rect rect, int i, Rect rect2) {
        float f;
        float top;
        float bottom;
        float top2;
        float bottom2;
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float f;
        float bottom;
        float bottom2;
        float top;
        float top2;
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            top = rect2.getLeft();
            top2 = rect.getLeft();
        } else {
            if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        f = top - top2;
        return Math.max(1.0f, f);
    }

    /* renamed from: beamBeats-I7lrPNg  reason: not valid java name */
    private static final boolean m2531beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s()) && !FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$15(rect2, i, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect)) {
            return false;
        }
        return true;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final FocusTargetModifierNode activeNode(FocusTargetModifierNode focusTargetModifierNode) {
        if (focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent) {
            FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetModifierNode);
            if (findActiveFocusNode != null) {
                return findActiveFocusNode;
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m2536searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusTargetModifierNode r6;
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        DelegatableNode delegatableNode = focusTargetModifierNode;
        int r2 = NodeKind.m4780constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r2) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & r2) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            mutableVector.add((FocusTargetModifierNode) node);
                        }
                    }
                }
            }
            while (mutableVector.isNotEmpty() && (r6 = m2532findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetModifierNode2), i)) != null) {
                if (r6.fetchFocusProperties$ui_release().getCanFocus()) {
                    return function1.invoke(r6).booleanValue();
                }
                FocusRequester invoke = r6.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2493boximpl(i));
                if (Intrinsics.areEqual((Object) invoke, (Object) FocusRequester.Companion.getDefault())) {
                    invoke = null;
                }
                FocusRequester focusRequester = invoke;
                if (focusRequester != null) {
                    if (Intrinsics.areEqual((Object) focusRequester, (Object) FocusRequester.Companion.getCancel())) {
                        return false;
                    }
                    return focusRequester.findFocusTarget$ui_release(function1);
                } else if (m2534generateAndSearchChildren4C6V_qg(r6, focusTargetModifierNode2, i, function1)) {
                    return true;
                } else {
                    mutableVector.remove(r6);
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetModifierNode> mutableVector) {
        MutableVector<FocusRequesterModifierNode> focusRequesterNodes$ui_release;
        int size;
        int r0 = NodeKind.m4780constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) != 0) {
                    Modifier.Node node2 = node;
                    while (true) {
                        if (node2 == null) {
                            break;
                        }
                        if ((node2.getKindSet$ui_release() & r0) != 0 && (node2 instanceof FocusTargetModifierNode)) {
                            FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) node2;
                            if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                mutableVector.add(focusTargetModifierNode);
                                break;
                            }
                            FocusRequester invoke = focusTargetModifierNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2493boximpl(FocusDirection.Companion.m2505getEnterdhqQ8s()));
                            if (Intrinsics.areEqual((Object) invoke, (Object) FocusRequester.Companion.getDefault())) {
                                invoke = null;
                            }
                            FocusRequester focusRequester = invoke;
                            if (focusRequester != null) {
                                if (!Intrinsics.areEqual((Object) focusRequester, (Object) FocusRequester.Companion.getCancel()) && (size = focusRequesterNodes$ui_release.getSize()) > 0) {
                                    Object[] content = (focusRequesterNodes$ui_release = focusRequester.getFocusRequesterNodes$ui_release()).getContent();
                                    int i = 0;
                                    do {
                                        collectAccessibleChildren((FocusRequesterModifierNode) content[i], mutableVector);
                                        i++;
                                    } while (i < size);
                                }
                            }
                        }
                        node2 = node2.getChild$ui_release();
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}