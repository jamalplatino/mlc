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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsCarFilled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsCarFilled", "Landroidx/compose/material/icons/Icons$Rounded;", "getDirectionsCarFilled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DirectionsCarFilled.kt */
public final class DirectionsCarFilledKt {
    private static ImageVector _directionsCarFilled;

    public static final ImageVector getDirectionsCarFilled(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _directionsCarFilled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.DirectionsCarFilled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.92f, 6.01f);
        pathBuilder.curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-11.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.84f, 5.0f, 5.29f, 5.42f, 5.08f, 6.01f);
        pathBuilder.lineTo(3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(7.5f);
        pathBuilder2.curveTo(3.0f, 20.33f, 3.67f, 21.0f, 4.5f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(5.33f, 21.0f, 6.0f, 20.33f, 6.0f, 19.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineTo(18.92f, 6.01f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 16.0f);
        pathBuilder3.curveTo(6.67f, 16.0f, 6.0f, 15.33f, 6.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 16.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.81f, 10.0f);
        pathBuilder.lineToRelative(1.04f, -3.0f);
        pathBuilder.horizontalLineToRelative(10.29f);
        pathBuilder.lineToRelative(1.04f, 3.0f);
        pathBuilder.horizontalLineTo(5.81f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _directionsCarFilled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
