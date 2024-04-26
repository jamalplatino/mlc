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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiPassword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiPassword", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWifiPassword", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiPassword.kt */
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.WifiPassword", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 8.98f);
        pathBuilder.lineToRelative(-2.12f, 2.13f);
        pathBuilder.curveTo(19.35f, 8.57f, 15.85f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f);
        pathBuilder.lineTo(0.0f, 8.98f);
        pathBuilder.curveTo(3.07f, 5.9f, 7.31f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(20.93f, 5.9f, 24.0f, 8.98f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 20.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(23.55f, 19.0f, 24.0f, 19.45f, 24.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.24f, 13.22f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.8f, 13.9f, 9.8f, 13.0f, 12.0f, 13.0f);
        pathBuilder3.curveToRelative(2.2f, 0.0f, 4.2f, 0.9f, 5.64f, 2.35f);
        pathBuilder.lineToRelative(2.12f, -2.12f);
        pathBuilder3.curveTo(17.78f, 11.23f, 15.03f, 10.0f, 12.0f, 10.0f);
        pathBuilder3.curveTo(8.97f, 10.0f, 6.22f, 11.23f, 4.24f, 13.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder3.curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.53f, -3.54f);
        pathBuilder.curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiPassword = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
