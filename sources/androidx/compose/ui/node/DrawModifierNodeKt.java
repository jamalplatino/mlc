package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"invalidateDraw", "", "Landroidx/compose/ui/node/DrawModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DrawModifierNode.kt */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m4622requireCoordinator64DMado(drawModifierNode, NodeKind.m4780constructorimpl(1)).invalidateLayer();
        }
    }
}
