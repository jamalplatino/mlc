package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Lkotlin/Comparator;", "()V", "compare", "", "focusTarget1", "focusTarget2", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OneDimensionalFocusSearch.kt */
final class FocusableChildrenComparator implements Comparator<FocusTargetModifierNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    public int compare(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        if (focusTargetModifierNode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (focusTargetModifierNode2 != null) {
            int i = 0;
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
                LayoutNode layoutNode = null;
                LayoutNode layoutNode2 = coordinator$ui_release != null ? coordinator$ui_release.getLayoutNode() : null;
                if (layoutNode2 != null) {
                    NodeCoordinator coordinator$ui_release2 = focusTargetModifierNode2.getCoordinator$ui_release();
                    if (coordinator$ui_release2 != null) {
                        layoutNode = coordinator$ui_release2.getLayoutNode();
                    }
                    if (layoutNode == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (Intrinsics.areEqual((Object) layoutNode2, (Object) layoutNode)) {
                        return 0;
                    } else {
                        MutableVector<LayoutNode> pathFromRoot = pathFromRoot(layoutNode2);
                        MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(layoutNode);
                        int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
                        if (min >= 0) {
                            while (Intrinsics.areEqual(pathFromRoot.getContent()[i], pathFromRoot2.getContent()[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return Intrinsics.compare(((LayoutNode) pathFromRoot.getContent()[i]).getPlaceOrder$ui_release(), ((LayoutNode) pathFromRoot2.getContent()[i]).getPlaceOrder$ui_release());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode)) {
                return -1;
            } else {
                return FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) ? 1 : 0;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}
