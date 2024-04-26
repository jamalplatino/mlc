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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getWifiOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WifiOff.kt */
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.WifiOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 11.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveToRelative(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f);
        pathBuilder.lineToRelative(2.58f, 2.58f);
        pathBuilder.curveToRelative(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.curveToRelative(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f);
        pathBuilder.lineToRelative(3.02f, 3.02f);
        pathBuilder.lineToRelative(0.7f, -0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.41f, 1.64f);
        pathBuilder.lineTo(2.0f, 3.05f);
        pathBuilder.lineTo(5.05f, 6.1f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder2.curveToRelative(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f);
        pathBuilder.lineToRelative(2.24f, 2.24f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder3.curveToRelative(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f);
        pathBuilder.lineToRelative(7.08f, 7.08f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.41f, 1.64f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifiOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
