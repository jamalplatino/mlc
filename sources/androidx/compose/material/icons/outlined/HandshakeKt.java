package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handshake", "Landroidx/compose/material/icons/Icons$Outlined;", "getHandshake", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Handshake.kt */
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Handshake", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.22f, 19.85f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder2.curveToRelative(-0.18f, -0.18f, -0.21f, -0.5f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        pathBuilder2.curveToRelative(-0.19f, 0.2f, -0.51f, 0.19f, -0.71f, 0.0f);
        pathBuilder2.curveToRelative(-0.21f, -0.21f, -0.18f, -0.53f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        pathBuilder2.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder2.curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineTo(9.24f, 10.1f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder3.curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(9.52f, 8.4f);
        pathBuilder.lineToRelative(1.87f, 1.86f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.95f, 0.95f, 2.59f, 0.94f, 3.54f, 0.0f);
        pathBuilder4.curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0.0f, -3.54f);
        pathBuilder.lineToRelative(-1.86f, -1.86f);
        pathBuilder.lineToRelative(0.28f, -0.28f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineTo(12.22f, 19.85f);
        pathBuilder.close();
        pathBuilder.moveTo(21.83f, 13.07f);
        pathBuilder5.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        pathBuilder.lineToRelative(-4.24f, -4.24f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-0.28f, 0.28f);
        pathBuilder.lineToRelative(-0.28f, -0.28f);
        pathBuilder6.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilder.lineTo(2.17f, 6.71f);
        pathBuilder.curveToRelative(-1.42f, 1.42f, -1.55f, 3.63f, -0.4f, 5.19f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.curveTo(2.83f, 9.7f, 2.96f, 8.75f, 3.59f, 8.12f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(3.56f, 3.56f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.18f, 0.18f, 0.21f, 0.5f, 0.0f, 0.71f);
        pathBuilder7.curveToRelative(-0.21f, 0.21f, -0.53f, 0.18f, -0.71f, 0.0f);
        pathBuilder.lineTo(9.52f, 5.57f);
        pathBuilder.lineToRelative(-5.8f, 5.79f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(-0.98f, 0.97f, -0.98f, 2.56f, 0.0f, 3.54f);
        pathBuilder8.curveToRelative(0.39f, 0.39f, 0.89f, 0.63f, 1.42f, 0.7f);
        pathBuilder8.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilder8.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilder8.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilder8.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilder8.curveToRelative(0.07f, 0.54f, 0.31f, 1.03f, 0.7f, 1.42f);
        pathBuilder8.curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f);
        pathBuilder8.curveToRelative(0.67f, 0.0f, 1.3f, -0.26f, 1.77f, -0.73f);
        pathBuilder.lineTo(21.83f, 13.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _handshake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
