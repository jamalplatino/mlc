package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001aE\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\b\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\b\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001a \u0010\u0010\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a5\u0010\u0018\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a \u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u001d\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "backwardFocusSearch", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "onFound", "Lkotlin/Function1;", "forEachItemAfter", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "action", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "generateAndSearchChildren", "focusedItem", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "isRoot", "oneDimensionalFocusSearch", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "pickChildForBackwardSearch", "pickChildForForwardSearch", "searchChildren", "searchChildren-4C6V_qg", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: OneDimensionalFocusSearch.kt */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: OneDimensionalFocusSearch.kt */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final boolean m2528oneDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(function1, "onFound");
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetModifierNode, function1);
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2511getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetModifierNode, function1);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean forwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild == null) {
                throw new IllegalStateException(NoActiveChild.toString());
            } else if (forwardFocusSearch(activeChild, function1) || m2527generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m2509getNextdhqQ8s(), function1)) {
                return true;
            } else {
                return false;
            }
        } else if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetModifierNode, function1);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNode).booleanValue();
            } else {
                return pickChildForForwardSearch(focusTargetModifierNode, function1);
            }
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusStateImpl$ui_release().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return m2527generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m2511getPreviousdhqQ8s(), function1);
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                } else if (!backwardFocusSearch(activeChild, function1) && !m2527generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m2511getPreviousdhqQ8s(), function1) && (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(activeChild).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        } else if (i == 2 || i == 3) {
            return pickChildForBackwardSearch(focusTargetModifierNode, function1);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (!pickChildForBackwardSearch(focusTargetModifierNode, function1) && (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(focusTargetModifierNode).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m2527generateAndSearchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m2529searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2492searchBeyondBoundsOMvw8(focusTargetModifierNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m2529searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (focusTargetModifierNode.getFocusStateImpl$ui_release() == FocusStateImpl.ActiveParent) {
            MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
            DelegatableNode delegatableNode = focusTargetModifierNode;
            int r4 = NodeKind.m4780constructorimpl(1024);
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
                    if ((node.getAggregateChildKindSet$ui_release() & r4) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            } else if ((node.getKindSet$ui_release() & r4) == 0) {
                                node = node.getChild$ui_release();
                            } else if (node instanceof FocusTargetModifierNode) {
                                mutableVector.add((FocusTargetModifierNode) node);
                            }
                        }
                    }
                }
                mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
                if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s())) {
                    IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
                    int first = intRange.getFirst();
                    int last = intRange.getLast();
                    if (first <= last) {
                        boolean z = false;
                        while (true) {
                            if (z) {
                                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) mutableVector.getContent()[first];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode3) && forwardFocusSearch(focusTargetModifierNode3, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(mutableVector.getContent()[first], (Object) focusTargetModifierNode2)) {
                                z = true;
                            }
                            if (first == last) {
                                break;
                            }
                            first++;
                        }
                    }
                } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2511getPreviousdhqQ8s())) {
                    IntRange intRange2 = new IntRange(0, mutableVector.getSize() - 1);
                    int first2 = intRange2.getFirst();
                    int last2 = intRange2.getLast();
                    if (first2 <= last2) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) mutableVector.getContent()[last2];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode4) && backwardFocusSearch(focusTargetModifierNode4, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(mutableVector.getContent()[last2], (Object) focusTargetModifierNode2)) {
                                z2 = true;
                            }
                            if (last2 == first2) {
                                break;
                            }
                            last2--;
                        }
                    }
                } else {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s()) || !focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetModifierNode)) {
                    return false;
                }
                return function1.invoke(focusTargetModifierNode).booleanValue();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    private static final boolean isRoot(FocusTargetModifierNode focusTargetModifierNode) {
        Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m4780constructorimpl(1024));
        if (!(nearestAncestor instanceof FocusTargetModifierNode)) {
            nearestAncestor = null;
        }
        return ((FocusTargetModifierNode) nearestAncestor) == null;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
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
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && forwardFocusSearch(focusTargetModifierNode2, function1)) {
                    return true;
                }
                i++;
            } while (i < size);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
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
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size > 0) {
                int i = size - 1;
                Object[] content = mutableVector.getContent();
                do {
                    FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i];
                    if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && backwardFocusSearch(focusTargetModifierNode2, function1)) {
                        return true;
                    }
                    i--;
                } while (i >= 0);
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t, Function1<? super T, Unit> function1) {
        boolean z = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                if (z) {
                    function1.invoke(mutableVector.getContent()[first]);
                }
                if (Intrinsics.areEqual(mutableVector.getContent()[first], (Object) t)) {
                    z = true;
                }
                if (first != last) {
                    first++;
                } else {
                    return;
                }
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t, Function1<? super T, Unit> function1) {
        boolean z = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                if (z) {
                    function1.invoke(mutableVector.getContent()[last]);
                }
                if (Intrinsics.areEqual(mutableVector.getContent()[last], (Object) t)) {
                    z = true;
                }
                if (last != first) {
                    last--;
                } else {
                    return;
                }
            }
        }
    }
}
