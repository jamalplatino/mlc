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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_draw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Draw", "Landroidx/compose/material/icons/Icons$Rounded;", "getDraw", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Draw.kt */
public final class DrawKt {
    private static ImageVector _draw;

    public static final ImageVector getDraw(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _draw;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Draw", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.85f, 10.39f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineTo(18.5f, 5.09f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineTo(18.85f, 10.39f);
        pathBuilder.close();
        pathBuilder.moveTo(13.19f, 7.56f);
        pathBuilder.lineToRelative(-9.05f, 9.05f);
        pathBuilder2.curveTo(4.05f, 16.7f, 4.0f, 16.83f, 4.0f, 16.96f);
        pathBuilder.verticalLineToRelative(3.54f);
        pathBuilder2.curveTo(4.0f, 20.78f, 4.22f, 21.0f, 4.5f, 21.0f);
        pathBuilder.horizontalLineToRelative(3.54f);
        pathBuilder2.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        pathBuilder.lineToRelative(9.05f, -9.05f);
        pathBuilder.lineTo(13.19f, 7.56f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 2.19f, -2.54f, 3.5f, -5.0f, 3.5f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.54f, 0.0f, 3.0f, -0.73f, 3.0f, -1.5f);
        pathBuilder4.curveToRelative(0.0f, -0.47f, -0.48f, -0.87f, -1.23f, -1.2f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(18.32f, 15.45f, 19.0f, 16.29f, 19.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(4.58f, 13.35f);
        pathBuilder5.curveTo(3.61f, 12.79f, 3.0f, 12.06f, 3.0f, 11.0f);
        pathBuilder5.curveToRelative(0.0f, -1.8f, 1.89f, -2.63f, 3.56f, -3.36f);
        pathBuilder5.curveTo(7.59f, 7.18f, 9.0f, 6.56f, 9.0f, 6.0f);
        pathBuilder5.curveToRelative(0.0f, -0.41f, -0.78f, -1.0f, -2.0f, -1.0f);
        pathBuilder5.curveTo(5.74f, 5.0f, 5.2f, 5.61f, 5.17f, 5.64f);
        pathBuilder5.curveTo(4.82f, 6.05f, 4.19f, 6.1f, 3.77f, 5.76f);
        pathBuilder5.curveTo(3.36f, 5.42f, 3.28f, 4.81f, 3.62f, 4.38f);
        pathBuilder5.curveTo(3.73f, 4.24f, 4.76f, 3.0f, 7.0f, 3.0f);
        pathBuilder5.curveToRelative(2.24f, 0.0f, 4.0f, 1.32f, 4.0f, 3.0f);
        pathBuilder5.curveToRelative(0.0f, 1.87f, -1.93f, 2.72f, -3.64f, 3.47f);
        pathBuilder5.curveTo(6.42f, 9.88f, 5.0f, 10.5f, 5.0f, 11.0f);
        pathBuilder5.curveToRelative(0.0f, 0.31f, 0.43f, 0.6f, 1.07f, 0.86f);
        pathBuilder.lineTo(4.58f, 13.35f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _draw = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
