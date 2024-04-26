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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarCrash", "Landroidx/compose/material/icons/Icons$Outlined;", "getCarCrash", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CarCrash.kt */
public final class CarCrashKt {
    private static ImageVector _carCrash;

    public static final ImageVector getCarCrash(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.CarCrash", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 1.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.5f);
        pathBuilder.curveTo(6.0f, 12.67f, 6.67f, 12.0f, 7.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 14.33f, 6.0f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.93f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.65f, -0.09f, 1.34f, -0.28f, 2.0f, -0.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.lineToRelative(2.08f, -5.99f);
        pathBuilder.curveTo(5.29f, 4.42f, 5.84f, 4.0f, 6.5f, 4.0f);
        pathBuilder.lineToRelative(4.79f, 0.0f);
        pathBuilder.curveTo(11.1f, 4.63f, 11.0f, 5.31f, 11.0f, 6.0f);
        pathBuilder.horizontalLineTo(6.85f);
        pathBuilder.lineTo(5.81f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.86f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.36f, 0.75f, 0.84f, 1.43f, 1.43f, 2.0f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(19.0f, 12.93f);
        pathBuilder.close();
        pathBuilder.moveTo(17.91f, 13.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.89f, -0.01f, -1.74f, -0.19f, -2.53f, -0.51f);
        pathBuilder3.curveTo(15.15f, 12.76f, 15.0f, 13.11f, 15.0f, 13.5f);
        pathBuilder3.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveTo(18.0f, 13.32f, 17.97f, 13.16f, 17.91f, 13.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _carCrash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
