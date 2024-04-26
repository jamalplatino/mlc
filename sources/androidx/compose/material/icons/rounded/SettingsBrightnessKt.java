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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsBrightness", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsBrightness", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsBrightness", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SettingsBrightness.kt */
public final class SettingsBrightnessKt {
    private static ImageVector _settingsBrightness;

    public static final ImageVector getSettingsBrightness(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _settingsBrightness;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SettingsBrightness", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder2.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.15f, 12.35f);
        pathBuilder.lineTo(16.0f, 13.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.15f, 1.15f);
        pathBuilder3.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        pathBuilder.lineTo(10.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder3.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.15f, -1.15f);
        pathBuilder3.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(8.0f, 10.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder3.curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.15f, -1.15f);
        pathBuilder3.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(15.78f, 8.0f, 16.0f, 8.22f, 16.0f, 8.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.15f, 1.15f);
        pathBuilder4.curveTo(17.34f, 11.84f, 17.34f, 12.16f, 17.15f, 12.35f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder5.curveTo(15.0f, 10.34f, 13.66f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settingsBrightness = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
