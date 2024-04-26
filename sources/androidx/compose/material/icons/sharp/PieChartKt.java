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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pieChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PieChart", "Landroidx/compose/material/icons/Icons$Sharp;", "getPieChart", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PieChart.kt */
public final class PieChartKt {
    private static ImageVector _pieChart;

    public static final ImageVector getPieChart(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _pieChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PieChart", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 2.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.curveToRelative(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f);
        pathBuilder.reflectiveCurveToRelative(3.93f, -9.5f, 9.0f, -10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.03f, 2.0f);
        pathBuilder.verticalLineToRelative(8.99f);
        pathBuilder.lineTo(22.0f, 10.99f);
        pathBuilder.curveToRelative(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f);
        pathBuilder.close();
        pathBuilder.moveTo(13.03f, 13.01f);
        pathBuilder.lineTo(13.03f, 22.0f);
        pathBuilder.curveToRelative(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f);
        pathBuilder.horizontalLineToRelative(-8.97f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pieChart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}