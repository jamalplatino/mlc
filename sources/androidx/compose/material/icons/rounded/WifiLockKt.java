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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiLock", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiLock", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiLock.kt */
public final class WifiLockKt {
    private static ImageVector _wifiLock;

    public static final ImageVector getWifiLock(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _wifiLock;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.WifiLock", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.21f, 8.24f);
        pathBuilder.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(3.78f, 5.6f, 0.79f, 8.24f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        pathBuilder.lineToRelative(5.62f, 5.63f);
        pathBuilder.lineToRelative(4.94f, 4.95f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(2.34f, -2.34f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder2.curveToRelative(0.0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f);
        pathBuilder2.curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f);
        pathBuilder.horizontalLineToRelative(2.94f);
        pathBuilder.lineToRelative(1.29f, -1.29f);
        pathBuilder2.curveTo(23.68f, 9.3f, 23.65f, 8.63f, 23.21f, 8.24f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 16.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.curveTo(23.0f, 16.45f, 22.55f, 16.0f, 22.0f, 16.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.0f, 16.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.verticalLineTo(16.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiLock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
