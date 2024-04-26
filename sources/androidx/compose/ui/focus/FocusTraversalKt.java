package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0001\u001a=\u0010\u0016\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018@X\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\t\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getActiveChild$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "isEligibleForFocusSearch", "", "isEligibleForFocusSearch$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "onFound", "Lkotlin/Function1;", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusTraversal.kt */
public final class FocusTraversalKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FocusTraversal.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r3 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ void getActiveChild$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    public static /* synthetic */ void isEligibleForFocusSearch$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m2524customFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties fetchFocusProperties$ui_release = focusTargetModifierNode.fetchFocusProperties$ui_release();
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2511getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                focusRequester2 = fetchFocusProperties$ui_release.getStart();
            } else if (i2 == 2) {
                focusRequester2 = fetchFocusProperties$ui_release.getEnd();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual((Object) focusRequester2, (Object) FocusRequester.Companion.getDefault())) {
                focusRequester2 = null;
            }
            if (focusRequester2 == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                focusRequester = fetchFocusProperties$ui_release.getEnd();
            } else if (i3 == 2) {
                focusRequester = fetchFocusProperties$ui_release.getStart();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual((Object) focusRequester, (Object) FocusRequester.Companion.getDefault())) {
                focusRequester = null;
            }
            if (focusRequester2 == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2505getEnterdhqQ8s())) {
            return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m2493boximpl(i));
        } else {
            if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2506getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m2493boximpl(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return focusRequester2;
    }

    /* renamed from: focusSearch-sMXa3k8  reason: not valid java name */
    public static final boolean m2525focusSearchsMXa3k8(FocusTargetModifierNode focusTargetModifierNode, int i, LayoutDirection layoutDirection, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i2;
        Boolean r2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(function1, "onFound");
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2509getNextdhqQ8s()) || FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2511getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m2528oneDimensionalFocusSearchOMvw8(focusTargetModifierNode, i, function1);
        }
        if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2508getLeftdhqQ8s()) || FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2512getRightdhqQ8s()) || FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2513getUpdhqQ8s()) || FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2504getDowndhqQ8s())) {
            Boolean r22 = TwoDimensionalFocusSearchKt.m2537twoDimensionalFocusSearchOMvw8(focusTargetModifierNode, i, function1);
            if (r22 != null) {
                return r22.booleanValue();
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2505getEnterdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = FocusDirection.Companion.m2512getRightdhqQ8s();
            } else if (i3 == 2) {
                i2 = FocusDirection.Companion.m2508getLeftdhqQ8s();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetModifierNode findActiveFocusNode = findActiveFocusNode(focusTargetModifierNode);
            if (!(findActiveFocusNode == null || (r2 = TwoDimensionalFocusSearchKt.m2537twoDimensionalFocusSearchOMvw8(findActiveFocusNode, i2, function1)) == null)) {
                return r2.booleanValue();
            }
        } else if (FocusDirection.m2496equalsimpl0(i, FocusDirection.Companion.m2506getExitdhqQ8s())) {
            FocusTargetModifierNode findActiveFocusNode2 = findActiveFocusNode(focusTargetModifierNode);
            FocusTargetModifierNode findNonDeactivatedParent = findActiveFocusNode2 != null ? findNonDeactivatedParent(findActiveFocusNode2) : null;
            if (findNonDeactivatedParent != null && !Intrinsics.areEqual((Object) findNonDeactivatedParent, (Object) focusTargetModifierNode)) {
                return function1.invoke(findNonDeactivatedParent).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.m2498toStringimpl(i)).toString());
        }
        return false;
    }

    public static final Rect focusRect(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            LayoutCoordinates layoutCoordinates = coordinator$ui_release;
            Rect localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, false);
            if (localBoundingBoxOf != null) {
                return localBoundingBoxOf;
            }
        }
        return Rect.Companion.getZero();
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator$ui_release2 = focusTargetModifierNode.getCoordinator$ui_release();
        if (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) {
            return false;
        }
        return true;
    }

    public static final FocusTargetModifierNode getActiveChild(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().isAttached()) {
            return null;
        }
        DelegatableNode delegatableNode = focusTargetModifierNode;
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
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) node;
                            int i = WhenMappings.$EnumSwitchMapping$1[focusTargetModifierNode2.getFocusStateImpl$ui_release().ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return focusTargetModifierNode2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final FocusTargetModifierNode findActiveFocusNode(FocusTargetModifierNode focusTargetModifierNode) {
        FocusTargetModifierNode findActiveFocusNode;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i != 1) {
            if (i == 2) {
                DelegatableNode delegatableNode = focusTargetModifierNode;
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
                                } else if ((node instanceof FocusTargetModifierNode) && (findActiveFocusNode = findActiveFocusNode((FocusTargetModifierNode) node)) != null) {
                                    return findActiveFocusNode;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Check failed.".toString());
            } else if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetModifierNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r1 = r5.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.focus.FocusTargetModifierNode findNonDeactivatedParent(androidx.compose.ui.focus.FocusTargetModifierNode r5) {
        /*
            androidx.compose.ui.node.DelegatableNode r5 = (androidx.compose.ui.node.DelegatableNode) r5
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4780constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto L_0x0064
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r5)
        L_0x001e:
            r2 = 0
            if (r5 == 0) goto L_0x0063
            androidx.compose.ui.node.NodeChain r3 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r3 = r3.getHead$ui_release()
            int r3 = r3.getAggregateChildKindSet$ui_release()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0050
        L_0x0030:
            if (r1 == 0) goto L_0x0050
            int r3 = r1.getKindSet$ui_release()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x004b
            boolean r3 = r1 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r3 == 0) goto L_0x004b
            r3 = r1
            androidx.compose.ui.focus.FocusTargetModifierNode r3 = (androidx.compose.ui.focus.FocusTargetModifierNode) r3
            androidx.compose.ui.focus.FocusProperties r4 = r3.fetchFocusProperties$ui_release()
            boolean r4 = r4.getCanFocus()
            if (r4 == 0) goto L_0x004b
            return r3
        L_0x004b:
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui_release()
            goto L_0x0030
        L_0x0050:
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            if (r5 == 0) goto L_0x0061
            androidx.compose.ui.node.NodeChain r1 = r5.getNodes$ui_release()
            if (r1 == 0) goto L_0x0061
            androidx.compose.ui.Modifier$Node r1 = r1.getTail$ui_release()
            goto L_0x001e
        L_0x0061:
            r1 = r2
            goto L_0x001e
        L_0x0063:
            return r2
        L_0x0064:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findNonDeactivatedParent(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }
}
