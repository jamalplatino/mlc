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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_php", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Php", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Php.kt */
public final class PhpKt {
    private static ImageVector _php;

    public static final ImageVector getPhp(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _php;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Php", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(9.5f, 14.66f, 9.5f, 14.25f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveTo(9.5f, 9.34f, 9.84f, 9.0f, 10.25f, 9.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 9.34f, 11.0f, 9.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.75f);
        pathBuilder.curveTo(13.0f, 9.34f, 13.34f, 9.0f, 13.75f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(13.0f, 14.66f, 13.0f, 14.25f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(14.25f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.curveTo(7.33f, 9.0f, 8.0f, 9.68f, 8.0f, 10.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(8.0f, 12.32f, 7.33f, 13.0f, 6.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _php = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
