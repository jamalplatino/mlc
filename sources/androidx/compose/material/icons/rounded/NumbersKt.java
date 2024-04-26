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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_numbers", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Numbers", "Landroidx/compose/material/icons/Icons$Rounded;", "getNumbers", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Numbers.kt */
public final class NumbersKt {
    private static ImageVector _numbers;

    public static final ImageVector getNumbers(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _numbers;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Numbers", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.68f, 9.27f);
        pathBuilder.lineToRelative(0.01f, -0.06f);
        pathBuilder.curveTo(20.85f, 8.59f, 20.39f, 8.0f, 19.76f, 8.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.lineToRelative(0.7f, -2.79f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(17.85f, 4.59f, 17.39f, 4.0f, 16.76f, 4.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(15.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(0.7f, -2.79f);
        pathBuilder2.curveTo(11.85f, 4.59f, 11.39f, 4.0f, 10.76f, 4.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(9.0f, 8.0f);
        pathBuilder.horizontalLineTo(5.76f);
        pathBuilder.curveTo(5.31f, 8.0f, 4.92f, 8.3f, 4.82f, 8.73f);
        pathBuilder.lineTo(4.8f, 8.79f);
        pathBuilder.curveTo(4.65f, 9.41f, 5.11f, 10.0f, 5.74f, 10.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.lineToRelative(-1.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.26f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(3.3f, 14.79f);
        pathBuilder.curveTo(3.15f, 15.41f, 3.61f, 16.0f, 4.24f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.lineToRelative(-0.7f, 2.79f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.15f, 19.41f, 6.61f, 20.0f, 7.24f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineTo(9.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(-0.7f, 2.79f);
        pathBuilder3.curveTo(12.15f, 19.41f, 12.61f, 20.0f, 13.24f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineTo(15.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(3.24f);
        pathBuilder3.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineToRelative(0.01f, -0.06f);
        pathBuilder.curveToRelative(0.15f, -0.61f, -0.31f, -1.21f, -0.94f, -1.21f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.lineToRelative(1.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(3.24f);
        pathBuilder.curveTo(20.19f, 10.0f, 20.58f, 9.7f, 20.68f, 9.27f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(1.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(13.5f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _numbers = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
