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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carRepair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRepair", "Landroidx/compose/material/icons/Icons$Rounded;", "getCarRepair", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CarRepair.kt */
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.CarRepair", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(8.69f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.0f, -1.34f, -4.03f, -1.56f, -4.69f);
        pathBuilder3.curveToRelative(-0.05f, -0.16f, -0.12f, -0.29f, -0.19f, -0.4f);
        pathBuilder3.curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f);
        pathBuilder3.curveTo(16.82f, 3.01f, 16.28f, 3.0f, 16.28f, 3.0f);
        pathBuilder.horizontalLineTo(7.72f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 0.0f, -0.54f, 0.01f, -0.92f, 0.54f);
        pathBuilder4.curveTo(6.78f, 3.56f, 6.77f, 3.58f, 6.75f, 3.6f);
        pathBuilder4.curveTo(6.68f, 3.71f, 6.61f, 3.84f, 6.56f, 4.0f);
        pathBuilder4.curveTo(6.34f, 4.66f, 5.0f, 8.69f, 5.0f, 8.69f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveTo(6.55f, 16.0f, 7.0f, 15.55f, 7.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 11.5f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.55f, 11.5f, 9.0f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 11.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(15.55f, 11.5f, 15.0f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.33f, 5.0f);
        pathBuilder.horizontalLineToRelative(7.34f);
        pathBuilder.lineToRelative(0.23f, 0.69f);
        pathBuilder.lineTo(16.33f, 7.0f);
        pathBuilder.horizontalLineTo(7.67f);
        pathBuilder.lineTo(8.33f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(4.0f, 18.01f);
        pathBuilder5.lineTo(4.0f, 18.01f);
        pathBuilder5.curveTo(4.0f, 18.55f, 4.45f, 19.0f, 4.99f, 19.0f);
        pathBuilder5.horizontalLineTo(11.0f);
        pathBuilder5.verticalLineToRelative(2.01f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f);
        pathBuilder5.horizontalLineToRelative(0.01f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.horizontalLineToRelative(6.01f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.55f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
        pathBuilder5.verticalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -0.99f, -0.99f, -0.99f);
        pathBuilder5.horizontalLineTo(4.99f);
        pathBuilder6.curveTo(4.45f, 17.01f, 4.0f, 17.46f, 4.0f, 18.01f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _carRepair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
