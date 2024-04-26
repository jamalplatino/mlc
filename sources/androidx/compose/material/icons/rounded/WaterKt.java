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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_water", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Water", "Landroidx/compose/material/icons/Icons$Rounded;", "getWater", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Water.kt */
public final class WaterKt {
    private static ImageVector _water;

    public static final ImageVector getWater(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _water;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Water", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.98f, 14.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.horizontalLineTo(21.98f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(0.93f, 0.0f, 1.05f, 0.45f, 2.01f, 0.79f);
        pathBuilder2.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder2.curveToRelative(0.0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f);
        pathBuilder2.curveToRelative(-0.6f, -0.22f, -1.15f, -0.9f, -2.69f, -0.9f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder2.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder2.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.54f, 0.0f, -2.13f, 0.71f, -2.68f, 0.91f);
        pathBuilder2.curveTo(2.24f, 12.05f, 2.0f, 12.35f, 2.0f, 12.89f);
        pathBuilder2.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f);
        pathBuilder2.curveTo(4.35f, 13.44f, 4.39f, 13.0f, 5.35f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.67f, 15.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder3.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder3.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder3.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder3.curveToRelative(-1.53f, 0.0f, -2.15f, 0.71f, -2.69f, 0.91f);
        pathBuilder3.curveTo(2.24f, 16.05f, 2.0f, 16.36f, 2.0f, 16.89f);
        pathBuilder3.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.3f, 0.91f);
        pathBuilder3.curveTo(4.32f, 17.44f, 4.38f, 17.0f, 5.34f, 17.0f);
        pathBuilder3.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder3.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder3.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder3.curveToRelative(1.94f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder3.curveToRelative(0.94f, 0.0f, 1.06f, 0.46f, 2.03f, 0.8f);
        pathBuilder3.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder3.curveToRelative(0.0f, -0.53f, -0.24f, -0.83f, -0.65f, -0.98f);
        pathBuilder3.curveTo(20.82f, 15.72f, 20.21f, 15.0f, 18.67f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 9.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(0.93f, 0.0f, 1.05f, 0.45f, 2.01f, 0.79f);
        pathBuilder4.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder4.curveToRelative(0.0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f);
        pathBuilder4.curveTo(20.74f, 7.68f, 20.19f, 7.0f, 18.65f, 7.0f);
        pathBuilder4.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder4.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder4.curveTo(10.04f, 7.0f, 9.9f, 8.0f, 8.66f, 8.0f);
        pathBuilder4.curveTo(7.47f, 8.0f, 7.24f, 7.0f, 5.33f, 7.0f);
        pathBuilder4.curveTo(3.79f, 7.0f, 3.2f, 7.71f, 2.65f, 7.91f);
        pathBuilder4.curveTo(2.24f, 8.05f, 2.0f, 8.35f, 2.0f, 8.89f);
        pathBuilder4.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f);
        pathBuilder4.curveTo(4.35f, 9.44f, 4.39f, 9.0f, 5.35f, 9.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _water = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
