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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stackedLineChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StackedLineChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getStackedLineChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StackedLineChart.kt */
public final class StackedLineChartKt {
    private static ImageVector _stackedLineChart;

    public static final ImageVector getStackedLineChart(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _stackedLineChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.StackedLineChart", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.79f, 14.78f);
        pathBuilder.lineTo(2.7f, 14.69f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(6.09f, -6.1f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.lineToRelative(6.39f, -7.18f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.38f, -0.43f, 1.05f, -0.44f, 1.45f, -0.04f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.37f, 0.38f, 0.39f, 0.98f, 0.04f, 1.37f);
        pathBuilder.lineToRelative(-7.17f, 8.07f);
        pathBuilder.curveToRelative(-0.38f, 0.43f, -1.04f, 0.45f, -1.45f, 0.04f);
        pathBuilder.lineTo(9.5f, 9.48f);
        pathBuilder.lineToRelative(-5.3f, 5.3f);
        pathBuilder.curveTo(3.82f, 15.17f, 3.18f, 15.17f, 2.79f, 14.78f);
        pathBuilder.close();
        pathBuilder.moveTo(4.2f, 20.78f);
        pathBuilder.lineToRelative(5.3f, -5.3f);
        pathBuilder.lineToRelative(3.25f, 3.25f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        pathBuilder.lineToRelative(7.17f, -8.07f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.35f, -0.39f, 0.33f, -0.99f, -0.04f, -1.37f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        pathBuilder.lineToRelative(-6.39f, 7.18f);
        pathBuilder.lineToRelative(-3.29f, -3.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-6.09f, 6.1f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.09f, 0.09f);
        pathBuilder.curveTo(3.18f, 21.17f, 3.82f, 21.17f, 4.2f, 20.78f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _stackedLineChart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
