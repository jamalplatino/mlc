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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_multilineChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MultilineChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getMultilineChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MultilineChart.kt */
public final class MultilineChartKt {
    private static ImageVector _multilineChart;

    public static final ImageVector getMultilineChart(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _multilineChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.MultilineChart", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.36f, 6.28f);
        pathBuilder.lineToRelative(-0.06f, -0.06f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.37f, -1.39f, 0.04f);
        pathBuilder.lineToRelative(-2.18f, 2.45f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f);
        pathBuilder2.curveToRelative(-2.5f, 0.0f, -4.83f, 0.87f, -6.75f, 2.3f);
        pathBuilder2.curveToRelative(-0.47f, 0.35f, -0.52f, 1.04f, -0.11f, 1.45f);
        pathBuilder.lineToRelative(0.06f, 0.06f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.33f, 0.33f, 0.86f, 0.39f, 1.23f, 0.11f);
        pathBuilder3.curveTo(5.63f, 7.72f, 7.54f, 7.0f, 9.61f, 7.0f);
        pathBuilder3.curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f);
        pathBuilder.lineToRelative(-2.88f, 3.24f);
        pathBuilder.lineToRelative(-3.29f, -3.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-6.12f, 6.13f);
        pathBuilder.curveToRelative(-0.37f, 0.37f, -0.37f, 0.98f, 0.0f, 1.35f);
        pathBuilder.lineToRelative(0.15f, 0.15f);
        pathBuilder.curveToRelative(0.37f, 0.37f, 0.98f, 0.37f, 1.35f, 0.0f);
        pathBuilder.lineToRelative(5.32f, -5.33f);
        pathBuilder.lineToRelative(3.25f, 3.25f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        pathBuilder.lineToRelative(3.35f, -3.76f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.62f, 1.12f, 1.08f, 2.39f, 1.32f, 3.73f);
        pathBuilder4.curveToRelative(0.08f, 0.47f, 0.47f, 0.82f, 0.95f, 0.82f);
        pathBuilder.horizontalLineToRelative(0.09f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.6f, 0.0f, 1.05f, -0.55f, 0.94f, -1.14f);
        pathBuilder5.curveToRelative(-0.32f, -1.85f, -0.98f, -3.54f, -1.89f, -5.0f);
        pathBuilder.lineTo(21.4f, 7.6f);
        pathBuilder.curveToRelative(0.34f, -0.38f, 0.32f, -0.96f, -0.04f, -1.32f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _multilineChart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
