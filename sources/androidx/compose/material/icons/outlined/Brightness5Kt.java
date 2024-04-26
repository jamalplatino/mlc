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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightness5", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness5", "Landroidx/compose/material/icons/Icons$Outlined;", "getBrightness5", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Brightness5.kt */
public final class Brightness5Kt {
    private static ImageVector _brightness5;

    public static final ImageVector getBrightness5(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _brightness5;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Brightness5", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.69f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.69f);
        pathBuilder.lineTo(12.0f, 0.69f);
        pathBuilder.lineTo(8.69f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(4.69f);
        pathBuilder.lineTo(0.69f, 12.0f);
        pathBuilder.lineTo(4.0f, 15.31f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.69f);
        pathBuilder.lineTo(12.0f, 23.31f);
        pathBuilder.lineTo(15.31f, 20.0f);
        pathBuilder.lineTo(20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-4.69f);
        pathBuilder.lineTo(23.31f, 12.0f);
        pathBuilder.lineTo(20.0f, 8.69f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.48f);
        pathBuilder.lineTo(18.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-3.52f);
        pathBuilder.lineTo(12.0f, 20.48f);
        pathBuilder.lineTo(9.52f, 18.0f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-3.52f);
        pathBuilder.lineTo(3.52f, 12.0f);
        pathBuilder.lineTo(6.0f, 9.52f);
        pathBuilder.lineTo(6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.52f);
        pathBuilder.lineTo(12.0f, 3.52f);
        pathBuilder.lineTo(14.48f, 6.0f);
        pathBuilder.lineTo(18.0f, 6.0f);
        pathBuilder.verticalLineToRelative(3.52f);
        pathBuilder.lineTo(20.48f, 12.0f);
        pathBuilder.lineTo(18.0f, 14.48f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _brightness5 = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
