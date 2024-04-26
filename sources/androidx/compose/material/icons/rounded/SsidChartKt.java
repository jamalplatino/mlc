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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ssidChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SsidChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getSsidChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SsidChart.kt */
public final class SsidChartKt {
    private static ImageVector _ssidChart;

    public static final ImageVector getSsidChart(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SsidChart", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 9.03f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f);
        pathBuilder.lineTo(7.14f, 5.5f);
        pathBuilder.curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f);
        pathBuilder.lineToRelative(3.78f, 3.78f);
        pathBuilder.lineToRelative(7.2f, -5.23f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(20.07f, 3.67f, 21.0f, 4.14f, 21.0f, 4.96f);
        pathBuilder2.curveToRelative(0.0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f);
        pathBuilder.lineToRelative(-7.9f, 5.73f);
        pathBuilder.curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f);
        pathBuilder.lineTo(7.62f, 7.62f);
        pathBuilder.lineTo(4.59f, 9.84f);
        pathBuilder.curveTo(3.93f, 10.32f, 3.0f, 9.85f, 3.0f, 9.03f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.35f);
        pathBuilder.curveToRelative(-0.23f, 0.0f, -0.45f, 0.08f, -0.62f, 0.22f);
        pathBuilder.lineToRelative(-3.9f, 3.12f);
        pathBuilder.lineTo(6.6f, 12.99f);
        pathBuilder.curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f);
        pathBuilder.lineToRelative(-1.9f, 1.35f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(3.16f, 14.43f, 3.0f, 14.74f, 3.0f, 15.06f);
        pathBuilder3.curveToRelative(0.0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f);
        pathBuilder.lineTo(5.8f, 15.0f);
        pathBuilder.lineToRelative(5.57f, 5.39f);
        pathBuilder.curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _ssidChart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
