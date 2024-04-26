package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifier;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\u001bH\u0003\u001a\f\u0010\u001c\u001a\u00020\u0005*\u00020\u001bH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"%\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00068@X\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Inserted", "", "Removed", "Updated", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNode", "phase", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NodeKind.kt */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    /* renamed from: getIncludeSelfInTraversal-H91voCI$annotations  reason: not valid java name */
    public static /* synthetic */ void m4789getIncludeSelfInTraversalH91voCI$annotations(int i) {
    }

    /* renamed from: or-64DMado  reason: not valid java name */
    public static final int m4790or64DMado(int i, int i2) {
        return i | i2;
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 0);
    }

    private static final void autoInvalidateNode(Modifier.Node node, int i) {
        if (node.isAttached()) {
            if ((NodeKind.m4780constructorimpl(2) & node.getKindSet$ui_release()) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurements((LayoutModifierNode) node);
                if (i == 2) {
                    DelegatableNodeKt.m4622requireCoordinator64DMado(node, NodeKind.m4780constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m4780constructorimpl(256) & node.getKindSet$ui_release()) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m4780constructorimpl(4) & node.getKindSet$ui_release()) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m4780constructorimpl(8) & node.getKindSet$ui_release()) != 0 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((NodeKind.m4780constructorimpl(64) & node.getKindSet$ui_release()) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m4780constructorimpl(1024) & node.getKindSet$ui_release()) != 0 && (node instanceof FocusTargetModifierNode)) {
                if (i == 2) {
                    node.onReset();
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
                }
            }
            if ((NodeKind.m4780constructorimpl(2048) & node.getKindSet$ui_release()) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
                    }
                }
            }
            if ((NodeKind.m4780constructorimpl(4096) & node.getKindSet$ui_release()) != 0 && (node instanceof FocusEventModifierNode) && i != 2) {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) node);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNode delegatableNode = focusPropertiesModifierNode;
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
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            DelegatableNodeKt.requireOwner(delegatableNode).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker.INSTANCE.reset();
        focusPropertiesModifierNode.modifyFocusProperties(CanFocusChecker.INSTANCE);
        return CanFocusChecker.INSTANCE.isCanFocusSet();
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI  reason: not valid java name */
    public static final boolean m4788getIncludeSelfInTraversalH91voCI(int i) {
        return (i & NodeKind.m4780constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int r0 = NodeKind.m4780constructorimpl(1);
        if (element instanceof LayoutModifier) {
            r0 |= NodeKind.m4780constructorimpl(2);
        }
        if (element instanceof IntermediateLayoutModifier) {
            r0 |= NodeKind.m4780constructorimpl(512);
        }
        if (element instanceof DrawModifier) {
            r0 |= NodeKind.m4780constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            r0 |= NodeKind.m4780constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            r0 |= NodeKind.m4780constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            r0 |= NodeKind.m4780constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            r0 |= NodeKind.m4780constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            r0 |= NodeKind.m4780constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            r0 |= NodeKind.m4780constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            r0 |= NodeKind.m4780constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier) || (element instanceof LookaheadOnPlacedModifier)) ? r0 | NodeKind.m4780constructorimpl(128) : r0;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int r0 = NodeKind.m4780constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(16);
        }
        if (node instanceof ModifierLocalNode) {
            r0 |= NodeKind.m4780constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(512);
        }
        if (node instanceof FocusTargetModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            r0 |= NodeKind.m4780constructorimpl(8192);
        }
        return node instanceof RotaryInputModifierNode ? r0 | NodeKind.m4780constructorimpl(16384) : r0;
    }
}
