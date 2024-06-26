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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dataThresholding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DataThresholding", "Landroidx/compose/material/icons/Icons$Rounded;", "getDataThresholding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DataThresholding.kt */
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.DataThresholding", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
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
        pathBuilder.moveTo(11.38f, 8.88f);
        pathBuilder.lineToRelative(1.29f, 1.29f);
        pathBuilder.lineToRelative(2.96f, -2.96f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(-3.67f, 3.67f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(10.67f, 11.0f);
        pathBuilder.lineToRelative(-2.3f, 2.3f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder4.curveTo(10.35f, 8.48f, 10.98f, 8.48f, 11.38f, 8.88f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.72f);
        pathBuilder.lineTo(5.0f, 17.72f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.84f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.83f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.84f);
        pathBuilder.close();
        pathBuilder.moveTo(9.8f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.62f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(9.8f);
        pathBuilder.close();
        pathBuilder.moveTo(13.53f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.62f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(13.53f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-1.73f);
        pathBuilder.lineTo(19.0f, 17.27f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dataThresholding = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
