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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_networkWifi3Bar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkWifi3Bar", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNetworkWifi3Bar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NetworkWifi3Bar.kt */
public final class NetworkWifi3BarKt {
    private static ImageVector _networkWifi3Bar;

    public static final ImageVector getNetworkWifi3Bar(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _networkWifi3Bar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NetworkWifi3Bar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.92f, 9.07f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilder.lineToRelative(-2.85f, 2.86f);
        pathBuilder2.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        pathBuilder2.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        pathBuilder.lineTo(2.92f, 9.07f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder3.lineTo(12.0f, 21.0f);
        pathBuilder3.lineTo(24.0f, 8.98f);
        pathBuilder4.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(2.92f, 9.07f);
        pathBuilder4.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilder3.lineToRelative(-2.85f, 2.86f);
        pathBuilder4.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        pathBuilder4.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        pathBuilder3.lineTo(2.92f, 9.07f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _networkWifi3Bar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
