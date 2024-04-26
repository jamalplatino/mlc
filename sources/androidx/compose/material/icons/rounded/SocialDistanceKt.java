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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_socialDistance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SocialDistance", "Landroidx/compose/material/icons/Icons$Rounded;", "getSocialDistance", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SocialDistance.kt */
public final class SocialDistanceKt {
    private static ImageVector _socialDistance;

    public static final ImageVector getSocialDistance(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _socialDistance;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SocialDistance", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 6.1f, 4.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.78f, 8.58f);
        pathBuilder.curveTo(7.93f, 8.21f, 6.99f, 8.0f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(2.48f, 8.9f, 2.0f, 9.62f, 2.0f, 10.43f);
        pathBuilder.lineTo(2.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder3.curveTo(10.0f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveTo(16.0f, 6.1f, 16.9f, 7.0f, 18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.78f, 8.58f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(19.93f, 8.21f, 18.99f, 8.0f, 18.0f, 8.0f);
        pathBuilder5.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder5.curveTo(14.48f, 8.9f, 14.0f, 9.62f, 14.0f, 10.43f);
        pathBuilder.lineTo(14.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder.curveTo(22.0f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(21.65f, 16.65f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder.curveTo(18.54f, 13.54f, 18.0f, 13.76f, 18.0f, 14.21f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-1.79f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder6.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder6.curveTo(5.46f, 20.46f, 6.0f, 20.24f, 6.0f, 19.79f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(1.79f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder7.curveTo(21.84f, 17.16f, 21.84f, 16.84f, 21.65f, 16.65f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _socialDistance = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
