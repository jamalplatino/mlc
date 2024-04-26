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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiPassword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiPassword", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiPassword", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiPassword.kt */
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.WifiPassword", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.49f, 12.13f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(16.67f, 10.79f, 14.43f, 10.0f, 12.0f, 10.0f);
        pathBuilder2.curveToRelative(-2.43f, 0.0f, -4.67f, 0.79f, -6.49f, 2.13f);
        pathBuilder2.curveToRelative(-0.72f, 0.53f, -0.76f, 1.6f, -0.13f, 2.24f);
        pathBuilder2.curveToRelative(0.53f, 0.54f, 1.37f, 0.57f, 1.98f, 0.12f);
        pathBuilder2.curveTo(8.67f, 13.55f, 10.27f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.curveToRelative(1.73f, 0.0f, 3.33f, 0.55f, 4.64f, 1.49f);
        pathBuilder2.curveToRelative(0.62f, 0.44f, 1.45f, 0.41f, 1.98f, -0.12f);
        pathBuilder2.curveTo(19.26f, 13.73f, 19.22f, 12.66f, 18.49f, 12.13f);
        pathBuilder.close();
        pathBuilder.moveTo(22.8f, 7.89f);
        pathBuilder.curveTo(19.86f, 5.46f, 16.1f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(4.14f, 5.46f, 1.2f, 7.89f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(0.53f, 8.44f, 0.49f, 9.47f, 1.11f, 10.1f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.55f, 0.55f, 1.42f, 0.58f, 2.02f, 0.09f);
        pathBuilder3.curveTo(5.55f, 8.2f, 8.64f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(6.45f, 1.2f, 8.87f, 3.19f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.6f, 0.49f, 1.47f, 0.46f, 2.02f, -0.09f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveTo(23.51f, 9.47f, 23.47f, 8.44f, 22.8f, 7.89f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(24.0f, 19.45f, 23.55f, 19.0f, 23.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiPassword = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
