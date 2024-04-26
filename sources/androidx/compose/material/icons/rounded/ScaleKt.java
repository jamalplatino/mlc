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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scale", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Scale", "Landroidx/compose/material/icons/Icons$Rounded;", "getScale", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scale.kt */
public final class ScaleKt {
    private static ImageVector _scale;

    public static final ImageVector getScale(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Scale", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.lineToRelative(3.43f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.87f, 0.0f, 1.58f, -0.75f, 1.5f, -1.62f);
        pathBuilder2.curveTo(21.34f, 14.18f, 17.4f, 11.68f, 14.0f, 11.0f);
        pathBuilder.verticalLineTo(8.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(3.31f, -0.42f, 6.03f, -1.86f, 7.27f, -3.73f);
        pathBuilder3.curveTo(21.92f, 3.3f, 21.15f, 2.0f, 19.98f, 2.0f);
        pathBuilder.horizontalLineTo(4.02f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(2.85f, 2.0f, 2.08f, 3.3f, 2.73f, 4.27f);
        pathBuilder4.curveTo(3.97f, 6.14f, 6.69f, 7.58f, 10.0f, 8.0f);
        pathBuilder.lineToRelative(0.0f, 3.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-3.4f, 0.68f, -7.34f, 3.18f, -7.93f, 9.38f);
        pathBuilder5.curveTo(1.99f, 21.25f, 2.7f, 22.0f, 3.57f, 22.0f);
        pathBuilder.lineTo(7.0f, 22.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(4.13f);
        pathBuilder.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        pathBuilder.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveTo(16.45f, 20.0f, 16.0f, 20.45f, 16.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 21.94f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.7f, -0.17f, -1.27f, -0.74f, -1.44f, -1.44f);
        pathBuilder7.curveToRelative(-0.18f, -0.74f, 0.06f, -1.44f, 0.53f, -1.91f);
        pathBuilder7.curveToRelative(0.55f, -0.55f, 2.91f, -1.57f, 4.33f, -2.15f);
        pathBuilder7.curveToRelative(0.41f, -0.17f, 0.82f, 0.24f, 0.65f, 0.65f);
        pathBuilder7.curveToRelative(-0.58f, 1.42f, -1.6f, 3.78f, -2.15f, 4.33f);
        pathBuilder7.curveTo(12.95f, 21.88f, 12.25f, 22.12f, 11.5f, 21.94f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _scale = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
