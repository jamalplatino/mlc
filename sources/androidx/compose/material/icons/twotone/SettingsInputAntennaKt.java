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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsInputAntenna", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsInputAntenna", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSettingsInputAntenna", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SettingsInputAntenna.kt */
public final class SettingsInputAntennaKt {
    private static ImageVector _settingsInputAntenna;

    public static final ImageVector getSettingsInputAntenna(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _settingsInputAntenna;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.SettingsInputAntenna", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.29f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.88f, -0.39f, 1.5f, -1.26f, 1.5f, -2.29f);
        pathBuilder3.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(9.5f, 10.62f, 9.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f);
        pathBuilder.verticalLineToRelative(3.3f);
        pathBuilder.lineTo(7.59f, 21.0f);
        pathBuilder.lineTo(9.0f, 22.41f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineTo(16.41f, 21.0f);
        pathBuilder.lineTo(13.0f, 17.59f);
        pathBuilder.verticalLineToRelative(-3.3f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, 4.03f, 9.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -6.07f, -4.93f, -11.0f, -11.0f, -11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settingsInputAntenna = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}