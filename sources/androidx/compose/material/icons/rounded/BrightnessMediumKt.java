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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightnessMedium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrightnessMedium", "Landroidx/compose/material/icons/Icons$Rounded;", "getBrightnessMedium", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BrightnessMedium.kt */
public final class BrightnessMediumKt {
    private static ImageVector _brightnessMedium;

    public static final ImageVector getBrightnessMedium(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _brightnessMedium;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.BrightnessMedium", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 15.31f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineTo(20.0f, 8.69f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-2.69f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        pathBuilder2.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineTo(8.69f, 4.0f);
        pathBuilder.lineTo(6.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.69f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(1.9f, 1.9f);
        pathBuilder.lineTo(4.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.69f);
        pathBuilder.lineToRelative(1.9f, 1.9f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineTo(18.0f, 20.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.69f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.9f);
        pathBuilder.lineTo(12.0f, 7.1f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.61f, 0.55f, -1.11f, 1.15f, -0.99f);
        pathBuilder3.curveTo(15.91f, 6.65f, 18.0f, 9.08f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-2.09f, 5.35f, -4.85f, 5.89f);
        pathBuilder.curveToRelative(-0.6f, 0.12f, -1.15f, -0.38f, -1.15f, -0.99f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _brightnessMedium = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
