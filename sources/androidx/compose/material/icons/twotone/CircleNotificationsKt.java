package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_circleNotifications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CircleNotifications", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCircleNotifications", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CircleNotifications.kt */
public final class CircleNotificationsKt {
    private static ImageVector _circleNotifications;

    public static final ImageVector getCircleNotifications(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _circleNotifications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.CircleNotifications", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder2.curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(16.41f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(13.5f, 17.83f, 12.83f, 18.5f, 12.0f, 18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-2.61f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(8.0f, 9.27f, 9.03f, 7.47f, 11.0f, 7.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder3.curveToRelative(0.0f, -0.57f, 0.43f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.43f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder3.curveToRelative(1.97f, 0.47f, 3.0f, 2.28f, 3.0f, 4.39f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 18.5f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder4.horizontalLineToRelative(-3.0f);
        pathBuilder5.curveTo(10.5f, 17.83f, 11.17f, 18.5f, 12.0f, 18.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 2.0f);
        pathBuilder5.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder4.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder5.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder4.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 20.0f);
        pathBuilder5.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder4.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder5.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder4.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.0f, 11.39f);
        pathBuilder5.curveToRelative(0.0f, -2.11f, -1.03f, -3.92f, -3.0f, -4.39f);
        pathBuilder4.verticalLineTo(6.5f);
        pathBuilder5.curveToRelative(0.0f, -0.57f, -0.43f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.0f, 0.43f, -1.0f, 1.0f);
        pathBuilder4.verticalLineTo(7.0f);
        pathBuilder5.curveToRelative(-1.97f, 0.47f, -3.0f, 2.27f, -3.0f, 4.39f);
        pathBuilder4.verticalLineTo(14.0f);
        pathBuilder4.horizontalLineTo(7.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(10.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(-1.0f);
        pathBuilder4.verticalLineTo(11.39f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.0f, 14.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder4.verticalLineToRelative(-3.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.verticalLineTo(14.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _circleNotifications = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
