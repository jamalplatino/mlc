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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiFind", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiFind", "Landroidx/compose/material/icons/Icons$Filled;", "getWifiFind", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiFind.kt */
public final class WifiFindKt {
    private static ImageVector _wifiFind;

    public static final ImageVector getWifiFind(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _wifiFind;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.WifiFind", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 14.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -3.36f, 2.64f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.curveToRelative(2.2f, 0.0f, 4.08f, 1.13f, 5.13f, 2.86f);
        pathBuilder.lineTo(24.0f, 8.98f);
        pathBuilder2.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(1.86f, -1.87f);
        pathBuilder.curveTo(12.14f, 18.09f, 11.0f, 16.2f, 11.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.0f, 14.0f);
        pathBuilder3.curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f);
        pathBuilder4.curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f);
        pathBuilder3.lineTo(21.59f, 20.0f);
        pathBuilder3.lineTo(23.0f, 18.59f);
        pathBuilder3.lineToRelative(-2.56f, -2.56f);
        pathBuilder4.curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.0f, 14.0f);
        pathBuilder4.curveToRelative(0.0f, -1.12f, 0.88f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(2.0f, 0.88f, 2.0f, 2.0f);
        pathBuilder3.curveToRelative(0.0f, 1.12f, -0.88f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.reflectiveCurveTo(15.0f, 15.12f, 15.0f, 14.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiFind = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
