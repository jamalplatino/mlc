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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lightMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LightMode", "Landroidx/compose/material/icons/Icons$Sharp;", "getLightMode", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LightMode.kt */
public final class LightModeKt {
    private static ImageVector _lightMode;

    public static final ImageVector getLightMode(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _lightMode;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.LightMode", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        pathBuilder.lineTo(12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.lineTo(11.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(11.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 11.0f);
        pathBuilder.lineToRelative(-4.0f, 0.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(4.0f, 0.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 11.0f);
        pathBuilder.lineToRelative(-4.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.lineToRelative(4.0f, 0.0f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 17.66f);
        pathBuilder.lineToRelative(2.47f, 2.47f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-2.47f, -2.47f);
        pathBuilder.lineTo(16.24f, 17.66f);
        pathBuilder.close();
        pathBuilder.moveTo(3.87f, 5.28f);
        pathBuilder.lineToRelative(2.47f, 2.47f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(5.28f, 3.87f);
        pathBuilder.lineTo(3.87f, 5.28f);
        pathBuilder.close();
        pathBuilder.moveTo(6.34f, 16.24f);
        pathBuilder.lineToRelative(-2.47f, 2.47f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(2.47f, -2.47f);
        pathBuilder.lineTo(6.34f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(18.72f, 3.87f);
        pathBuilder.lineToRelative(-2.47f, 2.47f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(2.47f, -2.47f);
        pathBuilder.lineTo(18.72f, 3.87f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _lightMode = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
