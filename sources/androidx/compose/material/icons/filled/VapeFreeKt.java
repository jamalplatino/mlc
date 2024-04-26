package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vapeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapeFree", "Landroidx/compose/material/icons/Icons$Filled;", "getVapeFree", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VapeFree.kt */
public final class VapeFreeKt {
    private static ImageVector _vapeFree;

    public static final ImageVector getVapeFree(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _vapeFree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.VapeFree", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 16.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(5.17f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(16.17f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.83f, 16.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-0.17f);
        pathBuilder.lineTo(18.83f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 17.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.76f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-2.23f);
        pathBuilder.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        pathBuilder.verticalLineTo(7.2f);
        pathBuilder.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        pathBuilder.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        pathBuilder.verticalLineTo(2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        pathBuilder3.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        pathBuilder3.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        pathBuilder.close();
        pathBuilder.moveTo(11.15f, 8.32f);
        pathBuilder3.curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, 0.0f, -0.02f);
        pathBuilder3.curveToRelative(0.0f, -1.85f, 1.5f, -3.35f, 3.35f, -3.35f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        pathBuilder.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.53f);
        pathBuilder.curveToRelative(1.87f, 0.0f, 3.47f, 1.35f, 3.47f, 3.16f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(-1.3f);
        pathBuilder.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        pathBuilder.horizontalLineTo(14.5f);
        pathBuilder.curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.0f);
        pathBuilder.lineTo(11.15f, 8.32f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _vapeFree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
