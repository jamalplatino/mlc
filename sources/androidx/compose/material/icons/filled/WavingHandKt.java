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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$Filled;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WavingHand.kt */
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.WavingHand", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.01f, 4.32f);
        pathBuilder.lineToRelative(-4.6f, 4.6f);
        pathBuilder.curveToRelative(-3.22f, 3.22f, -3.22f, 8.45f, 0.0f, 11.67f);
        pathBuilder.reflectiveCurveToRelative(8.45f, 3.22f, 11.67f, 0.0f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder2.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.lineToRelative(-4.42f, 4.42f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(6.54f, -6.54f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.lineToRelative(-5.83f, 5.83f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(6.89f, -6.89f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.lineToRelative(-6.89f, 6.89f);
        pathBuilder.lineTo(11.02f, 9.8f);
        pathBuilder.lineToRelative(5.48f, -5.48f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.lineToRelative(-7.62f, 7.62f);
        pathBuilder.curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilder.lineToRelative(-0.35f, -0.35f);
        pathBuilder.lineToRelative(4.07f, -4.07f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder3.curveTo(9.29f, 3.83f, 8.5f, 3.83f, 8.01f, 4.32f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wavingHand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
