package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sensors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sensors", "Landroidx/compose/material/icons/Icons$Sharp;", "getSensors", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sensors.kt */
public final class SensorsKt {
    private static ImageVector _sensors;

    public static final ImageVector getSensors(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _sensors;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Sensors", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.76f, 16.24f);
        pathBuilder.curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -3.16f, 1.76f, -4.24f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.45f, 9.9f, 8.0f, 10.9f, 8.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder.lineTo(7.76f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.24f);
        pathBuilder2.curveTo(17.33f, 15.16f, 18.0f, 13.66f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -3.16f, -1.76f, -4.24f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f);
        pathBuilder.lineTo(16.24f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder4.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.35f, 6.35f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(4.9f, 16.21f, 4.0f, 14.21f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 7.79f, 6.35f, 6.35f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sensors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
