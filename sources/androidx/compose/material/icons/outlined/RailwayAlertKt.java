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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_railwayAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RailwayAlert", "Landroidx/compose/material/icons/Icons$Outlined;", "getRailwayAlert", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RailwayAlert.kt */
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.RailwayAlert", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 15.5f);
        pathBuilder.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 11.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.horizontalLineToRelative(7.29f);
        pathBuilder3.curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f);
        pathBuilder3.horizontalLineTo(4.43f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.9f, -0.77f, 3.28f, -1.08f, 6.65f, -0.98f);
        pathBuilder4.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f);
        pathBuilder4.curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f);
        pathBuilder3.verticalLineToRelative(9.5f);
        pathBuilder3.curveTo(2.0f, 18.43f, 3.57f, 20.0f, 5.5f, 20.0f);
        pathBuilder3.lineTo(4.0f, 21.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.lineToRelative(-1.5f, -1.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder5.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 16.5f);
        pathBuilder3.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder3.horizontalLineToRelative(-9.0f);
        pathBuilder3.curveTo(4.67f, 18.0f, 4.0f, 17.33f, 4.0f, 16.5f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineTo(16.5f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(18.0f, 1.0f);
        pathBuilder6.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder6.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.5f, 9.0f);
        pathBuilder6.horizontalLineToRelative(-1.0f);
        pathBuilder6.verticalLineTo(8.0f);
        pathBuilder6.horizontalLineToRelative(1.0f);
        pathBuilder6.verticalLineTo(9.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.5f, 7.0f);
        pathBuilder6.horizontalLineToRelative(-1.0f);
        pathBuilder6.verticalLineTo(3.0f);
        pathBuilder6.horizontalLineToRelative(1.0f);
        pathBuilder6.verticalLineTo(7.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _railwayAlert = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
