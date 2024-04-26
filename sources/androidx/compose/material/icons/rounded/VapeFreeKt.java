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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vapeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapeFree", "Landroidx/compose/material/icons/Icons$Rounded;", "getVapeFree", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VapeFree.kt */
public final class VapeFreeKt {
    private static ImageVector _vapeFree;

    public static final ImageVector getVapeFree(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _vapeFree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.VapeFree", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-2.9f, -2.9f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(5.17f);
        pathBuilder.lineTo(2.1f, 4.93f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(18.83f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.67f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.curveToRelative(0.0f, 0.46f, -0.21f, 0.87f, -0.53f, 1.14f);
        pathBuilder.lineTo(18.83f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 17.0f);
        pathBuilder2.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.78f, 17.0f, 10.5f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 7.73f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilder3.curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f);
        pathBuilder3.curveTo(16.99f, 2.0f, 16.5f, 2.36f, 16.5f, 2.86f);
        pathBuilder3.curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f);
        pathBuilder3.curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f);
        pathBuilder3.curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f);
        pathBuilder3.curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder3.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        pathBuilder3.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        pathBuilder.verticalLineToRelative(1.48f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(22.0f, 14.66f, 22.0f, 14.25f);
        pathBuilder.verticalLineToRelative(-1.49f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f);
        pathBuilder.close();
        pathBuilder.moveTo(14.48f, 11.65f);
        pathBuilder4.curveToRelative(0.04f, 0.0f, 0.09f, 0.0f, 0.13f, 0.0f);
        pathBuilder.horizontalLineToRelative(1.42f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.verticalLineToRelative(0.55f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.76f, 0.75f);
        pathBuilder5.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(-0.89f);
        pathBuilder.curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f);
        pathBuilder.horizontalLineToRelative(-1.3f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        pathBuilder6.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        pathBuilder6.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        pathBuilder6.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        pathBuilder6.curveToRelative(-1.41f, 0.41f, -2.43f, 1.71f, -2.42f, 3.24f);
        pathBuilder.lineTo(14.48f, 11.65f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 18.5f);
        pathBuilder6.curveToRelative(1.33f, 0.0f, 2.71f, 0.18f, 4.0f, 0.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder6.curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4.0f, 0.5f);
        pathBuilder6.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(2.45f, 18.5f, 3.0f, 18.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _vapeFree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
