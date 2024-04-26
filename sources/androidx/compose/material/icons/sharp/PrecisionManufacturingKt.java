package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_precisionManufacturing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PrecisionManufacturing", "Landroidx/compose/material/icons/Icons$Sharp;", "getPrecisionManufacturing", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PrecisionManufacturing.kt */
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PrecisionManufacturing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 10.0f);
        pathBuilder.verticalLineTo(9.82f);
        pathBuilder.lineToRelative(2.01f, 2.01f);
        pathBuilder.lineToRelative(5.23f, -2.44f);
        pathBuilder.lineToRelative(-0.63f, -1.36f);
        pathBuilder.lineToRelative(-4.28f, 2.0f);
        pathBuilder.lineTo(14.0f, 7.7f);
        pathBuilder.verticalLineTo(6.3f);
        pathBuilder.lineToRelative(2.33f, -2.33f);
        pathBuilder.lineToRelative(4.28f, 2.0f);
        pathBuilder.lineToRelative(0.63f, -1.36f);
        pathBuilder.lineToRelative(-5.23f, -2.44f);
        pathBuilder.lineTo(14.0f, 4.18f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.82f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f);
        pathBuilder2.curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f);
        pathBuilder.lineTo(7.08f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-3.62f);
        pathBuilder.lineTo(8.41f, 8.76f);
        pathBuilder.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _precisionManufacturing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
