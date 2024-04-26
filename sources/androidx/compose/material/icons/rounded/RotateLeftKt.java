package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotateLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateLeft", "Landroidx/compose/material/icons/Icons$Rounded;", "getRotateLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RotateLeft.kt */
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.RotateLeft", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.56f, 7.98f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.1f, 7.52f, 5.31f, 7.6f, 5.0f, 8.17f);
        pathBuilder2.curveToRelative(-0.28f, 0.51f, -0.5f, 1.03f, -0.67f, 1.58f);
        pathBuilder2.curveToRelative(-0.19f, 0.63f, 0.31f, 1.25f, 0.96f, 1.25f);
        pathBuilder.horizontalLineToRelative(0.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.43f, 0.0f, 0.82f, -0.28f, 0.94f, -0.7f);
        pathBuilder3.curveToRelative(0.12f, -0.4f, 0.28f, -0.79f, 0.48f, -1.17f);
        pathBuilder3.curveToRelative(0.22f, -0.37f, 0.15f, -0.84f, -0.16f, -1.15f);
        pathBuilder.close();
        pathBuilder.moveTo(5.31f, 13.0f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.65f, 0.0f, -1.15f, 0.62f, -0.96f, 1.25f);
        pathBuilder4.curveToRelative(0.16f, 0.54f, 0.38f, 1.07f, 0.66f, 1.58f);
        pathBuilder4.curveToRelative(0.31f, 0.57f, 1.11f, 0.66f, 1.57f, 0.2f);
        pathBuilder4.curveToRelative(0.3f, -0.31f, 0.38f, -0.77f, 0.17f, -1.15f);
        pathBuilder4.curveToRelative(-0.2f, -0.37f, -0.36f, -0.76f, -0.48f, -1.16f);
        pathBuilder4.curveToRelative(-0.12f, -0.44f, -0.51f, -0.72f, -0.94f, -0.72f);
        pathBuilder.close();
        pathBuilder.moveTo(8.16f, 19.02f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.51f, 0.28f, 1.04f, 0.5f, 1.59f, 0.66f);
        pathBuilder5.curveToRelative(0.62f, 0.18f, 1.24f, -0.32f, 1.24f, -0.96f);
        pathBuilder.verticalLineToRelative(-0.03f);
        pathBuilder5.curveToRelative(0.0f, -0.43f, -0.28f, -0.82f, -0.7f, -0.94f);
        pathBuilder5.curveToRelative(-0.4f, -0.12f, -0.78f, -0.28f, -1.15f, -0.48f);
        pathBuilder5.curveToRelative(-0.38f, -0.21f, -0.86f, -0.14f, -1.16f, 0.17f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder.curveToRelative(-0.45f, 0.45f, -0.36f, 1.24f, 0.21f, 1.55f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.verticalLineToRelative(-0.66f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(9.17f, 4.83f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.43f);
        pathBuilder.lineToRelative(2.13f, 2.08f);
        pathBuilder.curveToRelative(0.63f, 0.62f, 1.7f, 0.17f, 1.7f, -0.72f);
        pathBuilder.lineTo(13.0f, 6.09f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        pathBuilder6.curveToRelative(0.0f, 2.73f, -1.82f, 5.02f, -4.32f, 5.75f);
        pathBuilder6.curveToRelative(-0.41f, 0.12f, -0.68f, 0.51f, -0.68f, 0.94f);
        pathBuilder.verticalLineToRelative(0.02f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.0f, 0.65f, 0.61f, 1.14f, 1.23f, 0.96f);
        pathBuilder7.curveTo(17.57f, 18.71f, 20.0f, 15.64f, 20.0f, 12.0f);
        pathBuilder7.curveToRelative(0.0f, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rotateLeft = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
