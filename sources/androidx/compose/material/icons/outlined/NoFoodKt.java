package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFood", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoFood", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoFood.kt */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NoFood", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(15.01f);
        pathBuilder.verticalLineToRelative(0.98f);
        pathBuilder.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        pathBuilder.horizontalLineTo(2.01f);
        pathBuilder.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 23.31f);
        pathBuilder.lineTo(16.0f, 18.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        pathBuilder.lineToRelative(-5.7f, -5.7f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineTo(13.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(6.9f, 6.9f);
        pathBuilder.lineTo(20.49f, 23.31f);
        pathBuilder.close();
        pathBuilder.moveTo(10.17f, 13.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        pathBuilder.horizontalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(0.23f, 2.0f);
        pathBuilder.horizontalLineToRelative(9.56f);
        pathBuilder.lineToRelative(-1.0f, 9.97f);
        pathBuilder.lineToRelative(1.83f, 1.83f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noFood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
