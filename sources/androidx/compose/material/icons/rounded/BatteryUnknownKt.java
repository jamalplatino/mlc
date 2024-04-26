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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_batteryUnknown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatteryUnknown", "Landroidx/compose/material/icons/Icons$Rounded;", "getBatteryUnknown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BatteryUnknown.kt */
public final class BatteryUnknownKt {
    private static ImageVector _batteryUnknown;

    public static final ImageVector getBatteryUnknown(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _batteryUnknown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.BatteryUnknown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.67f, 4.0f);
        pathBuilder.lineTo(14.0f, 4.0f);
        pathBuilder.lineTo(14.0f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(8.33f, 4.0f);
        pathBuilder.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        pathBuilder.verticalLineToRelative(15.33f);
        pathBuilder.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f);
        pathBuilder.horizontalLineToRelative(7.32f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        pathBuilder.lineTo(17.0f, 5.33f);
        pathBuilder.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.3f, 12.69f);
        pathBuilder.reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f);
        pathBuilder.curveToRelative(-0.14f, 0.14f, -0.27f, 0.31f, -0.39f, 0.47f);
        pathBuilder.lineToRelative(-0.09f, 0.15f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.08f, 0.12f, -0.14f, 0.25f, -0.19f, 0.37f);
        pathBuilder3.curveToRelative(-0.09f, 0.22f, -0.16f, 0.43f, -0.16f, 0.61f);
        pathBuilder.horizontalLineToRelative(-1.6f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.42f, 0.12f, -0.8f, 0.29f, -1.13f);
        pathBuilder4.curveToRelative(0.06f, -0.11f, 0.13f, -0.21f, 0.2f, -0.31f);
        pathBuilder4.curveToRelative(0.03f, -0.05f, 0.06f, -0.11f, 0.1f, -0.16f);
        pathBuilder4.curveToRelative(0.11f, -0.14f, 0.23f, -0.28f, 0.34f, -0.4f);
        pathBuilder.lineToRelative(0.93f, -0.94f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilder5.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder5.curveToRelative(-0.65f, 0.0f, -1.21f, 0.41f, -1.41f, 0.99f);
        pathBuilder5.curveToRelative(-0.11f, 0.31f, -0.39f, 0.51f, -0.71f, 0.51f);
        pathBuilder5.curveToRelative(-0.52f, 0.0f, -0.88f, -0.52f, -0.71f, -1.01f);
        pathBuilder5.curveTo(9.59f, 8.83f, 10.69f, 8.0f, 12.0f, 8.0f);
        pathBuilder5.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder5.curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _batteryUnknown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
