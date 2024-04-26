package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusInvalidationManager.kt */
final class FocusInvalidationManager$invalidateNodes$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    public final void invoke() {
        FocusState focusState;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = this.this$0.focusPropertiesNodes.iterator();
        while (true) {
            int i = 16;
            if (it.hasNext()) {
                DelegatableNode delegatableNode = (FocusPropertiesModifierNode) it.next();
                int r5 = NodeKind.m4780constructorimpl(1024);
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
                        if ((node.getAggregateChildKindSet$ui_release() & r5) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                        } else {
                            while (true) {
                                if (node == null) {
                                    break;
                                } else if ((node.getKindSet$ui_release() & r5) == 0) {
                                    node = node.getChild$ui_release();
                                } else if (node instanceof FocusTargetModifierNode) {
                                    focusInvalidationManager.focusTargetNodes.add((FocusTargetModifierNode) node);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.this$0.focusPropertiesNodes.clear();
                Set linkedHashSet = new LinkedHashSet();
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (FocusEventModifierNode focusEventModifierNode : this.this$0.focusEventNodes) {
                    if (focusEventModifierNode.getNode().isAttached()) {
                        DelegatableNode delegatableNode2 = focusEventModifierNode;
                        int r11 = NodeKind.m4780constructorimpl(1024);
                        if (delegatableNode2.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i], 0);
                            Modifier.Node child$ui_release2 = delegatableNode2.getNode().getChild$ui_release();
                            if (child$ui_release2 == null) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode2.getNode());
                            } else {
                                mutableVector2.add(child$ui_release2);
                            }
                            FocusTargetModifierNode focusTargetModifierNode = null;
                            boolean z = true;
                            boolean z2 = false;
                            while (mutableVector2.isNotEmpty()) {
                                Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node2.getAggregateChildKindSet$ui_release() & r11) == 0) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                                } else {
                                    while (true) {
                                        if (node2 == null) {
                                            break;
                                        } else if ((node2.getKindSet$ui_release() & r11) == 0) {
                                            node2 = node2.getChild$ui_release();
                                        } else if (node2 instanceof FocusTargetModifierNode) {
                                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) node2;
                                            if (focusTargetModifierNode != null) {
                                                z2 = true;
                                            }
                                            if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetModifierNode2)) {
                                                linkedHashSet.add(focusTargetModifierNode2);
                                                z = false;
                                            }
                                            focusTargetModifierNode = focusTargetModifierNode2;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                if (z2) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetModifierNode == null || (focusState = focusTargetModifierNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    i = 16;
                }
                this.this$0.focusEventNodes.clear();
                for (FocusTargetModifierNode focusTargetModifierNode3 : this.this$0.focusTargetNodes) {
                    if (focusTargetModifierNode3.isAttached()) {
                        FocusState focusState2 = focusTargetModifierNode3.getFocusState();
                        focusTargetModifierNode3.invalidateFocus$ui_release();
                        if (!Intrinsics.areEqual((Object) focusState2, (Object) focusTargetModifierNode3.getFocusState()) || linkedHashSet.contains(focusTargetModifierNode3)) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode3);
                        }
                    }
                }
                this.this$0.focusTargetNodes.clear();
                linkedHashSet.clear();
                if (!this.this$0.focusPropertiesNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.focusEventNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.focusTargetNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else {
                    return;
                }
            }
        }
    }
}
