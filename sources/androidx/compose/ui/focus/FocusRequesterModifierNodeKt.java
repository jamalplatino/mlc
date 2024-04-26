package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "requestFocus", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusRequesterModifierNode.kt */
public final class FocusRequesterModifierNodeKt {
    public static final boolean requestFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        DelegatableNode delegatableNode = focusRequesterModifierNode;
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
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.requestFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean captureFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        DelegatableNode delegatableNode = focusRequesterModifierNode;
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
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.captureFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNode, "<this>");
        DelegatableNode delegatableNode = focusRequesterModifierNode;
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
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.freeFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
