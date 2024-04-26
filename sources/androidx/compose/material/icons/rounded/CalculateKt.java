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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_calculate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Calculate", "Landroidx/compose/material/icons/Icons$Rounded;", "getCalculate", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Calculate.kt */
public final class CalculateKt {
    private static ImageVector _calculate;

    public static final ImageVector getCalculate(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _calculate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Calculate", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.56f, 6.53f);
        pathBuilder.lineTo(13.56f, 6.53f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(0.88f, 0.88f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder3.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineToRelative(-0.88f, 0.88f);
        pathBuilder.lineToRelative(0.88f, 0.88f);
        pathBuilder3.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineTo(15.5f, 9.54f);
        pathBuilder.lineToRelative(-0.88f, 0.88f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.lineToRelative(-0.88f, -0.88f);
        pathBuilder4.curveTo(13.26f, 7.3f, 13.26f, 6.82f, 13.56f, 6.53f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 7.72f);
        pathBuilder.horizontalLineToRelative(3.5f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder5.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder5.curveTo(6.25f, 8.06f, 6.59f, 7.72f, 7.0f, 7.72f);
        pathBuilder.close();
        pathBuilder.moveTo(10.75f, 16.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.verticalLineToRelative(1.25f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder6.curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(6.75f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveTo(6.34f, 16.0f, 6.0f, 15.66f, 6.0f, 15.25f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-1.25f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder8.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder8.curveTo(11.5f, 15.66f, 11.16f, 16.0f, 10.75f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 17.25f);
        pathBuilder.horizontalLineToRelative(-3.5f);
        pathBuilder8.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder8.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveTo(18.0f, 16.91f, 17.66f, 17.25f, 17.25f, 17.25f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 14.75f);
        pathBuilder.horizontalLineToRelative(-3.5f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveTo(13.34f, 14.75f, 13.0f, 14.41f, 13.0f, 14.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder9.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder9.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder9.curveTo(18.0f, 14.41f, 17.66f, 14.75f, 17.25f, 14.75f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _calculate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
