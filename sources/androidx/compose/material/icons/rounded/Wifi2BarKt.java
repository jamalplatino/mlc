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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifi2Bar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wifi2Bar", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifi2Bar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Wifi2Bar.kt */
public final class Wifi2BarKt {
    private static ImageVector _wifi2Bar;

    public static final ImageVector getWifi2Bar(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _wifi2Bar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Wifi2Bar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.38f, 14.37f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.63f, -0.63f, -0.59f, -1.71f, 0.13f, -2.24f);
        pathBuilder2.curveTo(7.33f, 10.79f, 9.57f, 10.0f, 12.0f, 10.0f);
        pathBuilder2.curveToRelative(2.43f, 0.0f, 4.67f, 0.79f, 6.49f, 2.13f);
        pathBuilder2.curveToRelative(0.72f, 0.53f, 0.76f, 1.6f, 0.13f, 2.24f);
        pathBuilder2.curveToRelative(-0.53f, 0.54f, -1.37f, 0.57f, -1.98f, 0.12f);
        pathBuilder2.curveTo(15.33f, 13.55f, 13.73f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.curveToRelative(-1.73f, 0.0f, -3.33f, 0.55f, -4.64f, 1.49f);
        pathBuilder2.curveTo(6.75f, 14.93f, 5.91f, 14.9f, 5.38f, 14.37f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wifi2Bar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
