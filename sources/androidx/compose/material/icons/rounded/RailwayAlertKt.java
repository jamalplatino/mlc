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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_railwayAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RailwayAlert", "Landroidx/compose/material/icons/Icons$Rounded;", "getRailwayAlert", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RailwayAlert.kt */
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.RailwayAlert", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 11.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(7.29f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.77f, -2.6f, 0.21f, -4.61f, 0.37f, -4.97f);
        pathBuilder2.curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(9.5f);
        pathBuilder2.curveTo(2.0f, 18.43f, 3.57f, 20.0f, 5.5f, 20.0f);
        pathBuilder.lineToRelative(-1.21f, 0.81f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(4.11f, 20.93f, 4.0f, 21.13f, 4.0f, 21.35f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveTo(4.0f, 21.71f, 4.29f, 22.0f, 4.65f, 22.0f);
        pathBuilder.horizontalLineToRelative(10.7f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.36f, 0.0f, 0.65f, -0.29f, 0.65f, -0.65f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f);
        pathBuilder.lineTo(14.5f, 20.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder5.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 17.0f);
        pathBuilder5.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder5.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder5.curveTo(11.5f, 16.33f, 10.83f, 17.0f, 10.0f, 17.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(18.0f, 1.0f);
        pathBuilder6.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder6.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.0f, 9.0f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder7.curveTo(17.5f, 8.22f, 17.72f, 8.0f, 18.0f, 8.0f);
        pathBuilder6.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder7.curveTo(18.5f, 8.78f, 18.28f, 9.0f, 18.0f, 9.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.5f, 6.5f);
        pathBuilder6.curveTo(18.5f, 6.78f, 18.28f, 7.0f, 18.0f, 7.0f);
        pathBuilder6.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder6.verticalLineToRelative(-3.0f);
        pathBuilder6.curveTo(17.5f, 3.22f, 17.72f, 3.0f, 18.0f, 3.0f);
        pathBuilder6.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder6.verticalLineTo(6.5f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _railwayAlert = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
