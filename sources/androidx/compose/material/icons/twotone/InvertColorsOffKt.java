package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_invertColorsOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InvertColorsOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getInvertColorsOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: InvertColorsOff.kt */
public final class InvertColorsOffKt {
    private static ImageVector _invertColorsOff;

    public static final ImageVector getInvertColorsOff(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _invertColorsOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.InvertColorsOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 14.83f);
        pathBuilder.lineTo(12.0f, 19.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        pathBuilder2.curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f);
        pathBuilder.lineTo(12.0f, 14.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.81f);
        pathBuilder.lineToRelative(0.0f, 4.37f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.lineTo(12.0f, 4.81f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.19f, 21.19f);
        pathBuilder3.lineTo(2.81f, 2.81f);
        pathBuilder3.lineTo(1.39f, 4.22f);
        pathBuilder3.lineToRelative(4.2f, 4.2f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-1.0f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f);
        pathBuilder4.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        pathBuilder4.curveToRelative(1.75f, 0.0f, 3.36f, -0.56f, 4.67f, -1.5f);
        pathBuilder3.lineToRelative(3.1f, 3.1f);
        pathBuilder3.lineTo(21.19f, 21.19f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 19.0f);
        pathBuilder4.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        pathBuilder4.curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f);
        pathBuilder3.lineTo(12.0f, 14.83f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.38f, 5.56f);
        pathBuilder3.lineTo(12.0f, 2.0f);
        pathBuilder3.lineToRelative(5.65f, 5.56f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveTo(19.1f, 8.99f, 20.0f, 10.96f, 20.0f, 13.13f);
        pathBuilder4.curveToRelative(0.0f, 1.18f, -0.27f, 2.29f, -0.74f, 3.3f);
        pathBuilder3.lineTo(12.0f, 9.17f);
        pathBuilder3.verticalLineTo(4.81f);
        pathBuilder3.lineTo(9.8f, 6.97f);
        pathBuilder3.lineTo(8.38f, 5.56f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _invertColorsOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}