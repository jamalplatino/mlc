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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_heatPump", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeatPump", "Landroidx/compose/material/icons/Icons$Outlined;", "getHeatPump", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HeatPump.kt */
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.HeatPump", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
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
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 18.0f);
        pathBuilder3.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder3.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.25f, 15.92f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.55f, -0.1f, -1.05f, -0.32f, -1.5f, -0.62f);
        pathBuilder3.lineToRelative(1.5f, -1.5f);
        pathBuilder3.verticalLineTo(15.92f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.75f, 15.92f);
        pathBuilder3.verticalLineToRelative(-2.11f);
        pathBuilder3.lineToRelative(1.5f, 1.5f);
        pathBuilder4.curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.31f, 14.25f);
        pathBuilder3.lineToRelative(-1.5f, -1.5f);
        pathBuilder3.horizontalLineToRelative(2.11f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.92f, 11.25f);
        pathBuilder3.horizontalLineToRelative(-2.11f);
        pathBuilder3.lineToRelative(1.5f, -1.5f);
        pathBuilder5.curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.75f, 8.08f);
        pathBuilder5.curveToRelative(0.55f, 0.1f, 1.05f, 0.32f, 1.5f, 0.62f);
        pathBuilder3.lineToRelative(-1.5f, 1.5f);
        pathBuilder3.verticalLineTo(8.08f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 11.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder6.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.25f, 8.08f);
        pathBuilder3.verticalLineToRelative(2.11f);
        pathBuilder3.lineToRelative(-1.5f, -1.5f);
        pathBuilder7.curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.69f, 9.75f);
        pathBuilder3.lineToRelative(1.5f, 1.5f);
        pathBuilder3.horizontalLineTo(8.08f);
        PathBuilder pathBuilder8 = pathBuilder3;
        pathBuilder8.curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.19f, 12.75f);
        pathBuilder3.lineToRelative(-1.5f, 1.5f);
        pathBuilder8.curveToRelative(-0.3f, -0.44f, -0.51f, -0.95f, -0.62f, -1.5f);
        pathBuilder3.horizontalLineTo(10.19f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _heatPump = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
