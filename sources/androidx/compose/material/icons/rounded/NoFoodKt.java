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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFood", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoFood", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoFood.kt */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.NoFood", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 22.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder2.curveTo(15.55f, 21.0f, 16.0f, 21.45f, 16.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.89f, 6.1f);
        pathBuilder2.curveTo(22.95f, 5.51f, 22.49f, 5.0f, 21.9f, 5.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.9f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f);
        pathBuilder.lineToRelative(0.24f, 2.41f);
        pathBuilder.lineTo(18.0f, 15.17f);
        pathBuilder.lineToRelative(3.62f, 3.62f);
        pathBuilder.lineTo(22.89f, 6.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 22.61f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(12.0f, 12.0f);
        pathBuilder.lineTo(9.01f, 9.01f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-6.2f, -6.2f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
        pathBuilder.lineToRelative(4.99f, 4.99f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-2.56f, 0.54f, -4.76f, 2.08f, -5.28f, 4.63f);
        pathBuilder4.curveTo(0.99f, 14.45f, 1.49f, 15.0f, 2.1f, 15.0f);
        pathBuilder.lineToRelative(10.07f, 0.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.curveTo(20.17f, 23.0f, 20.8f, 23.0f, 21.19f, 22.61f);
        pathBuilder.lineTo(21.19f, 22.61f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noFood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
