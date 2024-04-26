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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_subway", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Subway", "Landroidx/compose/material/icons/Icons$Outlined;", "getSubway", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Subway.kt */
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Subway", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.8f, 2.8f);
        pathBuilder.curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 0.09f, -5.8f, 0.8f);
        pathBuilder.curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        pathBuilder.lineTo(2.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(22.0f, 8.86f);
        pathBuilder.curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        pathBuilder.close();
        pathBuilder.moveTo(9.17f, 20.0f);
        pathBuilder.lineToRelative(1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(2.66f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineTo(9.17f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.01f, 14.0f);
        pathBuilder.lineTo(7.01f, 9.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(-10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 15.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-3.5f);
        pathBuilder.verticalLineToRelative(-0.38f);
        pathBuilder.lineToRelative(-1.15f, -1.16f);
        pathBuilder.curveToRelative(1.49f, -0.17f, 2.65f, -1.42f, 2.65f, -2.96f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.63f, -3.0f, -3.0f, -6.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 0.37f, -6.0f, 3.0f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.curveToRelative(0.0f, 1.54f, 1.16f, 2.79f, 2.65f, 2.96f);
        pathBuilder.lineTo(7.5f, 19.62f);
        pathBuilder.lineTo(7.5f, 20.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 8.86f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -2.0f, 1.01f, -3.45f, 2.93f, -4.2f);
        pathBuilder2.curveTo(8.41f, 4.08f, 10.32f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, 0.08f, 5.07f, 0.66f);
        pathBuilder.curveToRelative(1.92f, 0.75f, 2.93f, 2.2f, 2.93f, 4.2f);
        pathBuilder.lineTo(20.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _subway = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
