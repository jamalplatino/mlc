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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeVertical", "Landroidx/compose/material/icons/Icons$Rounded;", "getSwipeVertical", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeVertical.kt */
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SwipeVertical", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(0.0f, 12.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 3.22f, 1.13f, 6.18f, 3.02f, 8.5f);
        pathBuilder.horizontalLineTo(1.75f);
        pathBuilder2.curveTo(1.34f, 20.5f, 1.0f, 20.84f, 1.0f, 21.25f);
        pathBuilder.reflectiveCurveTo(1.34f, 22.0f, 1.75f, 22.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.0f, 17.34f, 5.66f, 17.0f, 5.25f, 17.0f);
        pathBuilder3.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(2.16f);
        pathBuilder3.curveToRelative(-1.86f, -2.11f, -3.0f, -4.88f, -3.0f, -7.91f);
        pathBuilder.reflectiveCurveToRelative(1.14f, -5.79f, 3.0f, -7.91f);
        pathBuilder.verticalLineToRelative(2.16f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(4.5f, 6.66f, 4.84f, 7.0f, 5.25f, 7.0f);
        pathBuilder4.curveTo(5.66f, 7.0f, 6.0f, 6.66f, 6.0f, 6.25f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder4.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(1.75f);
        pathBuilder4.curveTo(1.34f, 2.0f, 1.0f, 2.34f, 1.0f, 2.75f);
        pathBuilder.reflectiveCurveTo(1.34f, 3.5f, 1.75f, 3.5f);
        pathBuilder.horizontalLineToRelative(1.27f);
        pathBuilder.curveTo(1.13f, 5.82f, 0.0f, 8.78f, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.83f, 19.1f);
        pathBuilder.curveToRelative(-0.26f, -0.6f, 0.09f, -1.28f, 0.73f, -1.41f);
        pathBuilder.lineToRelative(3.58f, -0.71f);
        pathBuilder.lineTo(8.79f, 7.17f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        pathBuilder5.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        pathBuilder.lineToRelative(2.43f, 5.49f);
        pathBuilder.lineToRelative(0.84f, -0.37f);
        pathBuilder.curveToRelative(0.28f, -0.13f, 0.59f, -0.18f, 0.9f, -0.17f);
        pathBuilder.lineToRelative(4.56f, 0.21f);
        pathBuilder.curveToRelative(0.86f, 0.04f, 1.6f, 0.63f, 1.83f, 1.45f);
        pathBuilder.lineToRelative(1.23f, 4.33f);
        pathBuilder.curveToRelative(0.27f, 0.96f, -0.2f, 1.97f, -1.11f, 2.37f);
        pathBuilder.lineToRelative(-5.63f, 2.49f);
        pathBuilder.curveToRelative(-0.48f, 0.21f, -1.26f, 0.33f, -1.76f, 0.14f);
        pathBuilder.lineToRelative(-5.45f, -2.27f);
        pathBuilder.curveTo(9.13f, 19.53f, 8.93f, 19.34f, 8.83f, 19.1f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _swipeVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
