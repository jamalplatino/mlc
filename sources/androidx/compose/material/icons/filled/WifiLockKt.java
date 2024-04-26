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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiLock", "Landroidx/compose/material/icons/Icons$Filled;", "getWifiLock", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiLock.kt */
public final class WifiLockKt {
    private static ImageVector _wifiLock;

    public static final ImageVector getWifiLock(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _wifiLock;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.WifiLock", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.98f, 11.0f);
        pathBuilder.lineTo(24.0f, 8.98f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder.lineToRelative(6.35f, 6.36f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.05f, -3.05f);
        pathBuilder.verticalLineTo(15.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f);
        pathBuilder3.curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f);
        pathBuilder.horizontalLineTo(21.98f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(22.0f, 16.0f);
        pathBuilder4.verticalLineToRelative(-1.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder4.verticalLineToRelative(-3.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(23.0f, 16.45f, 22.55f, 16.0f, 22.0f, 16.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(21.0f, 16.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(-1.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.verticalLineTo(16.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiLock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
