package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_radar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Radar", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRadar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Radar.kt */
public final class RadarKt {
    private static ImageVector _radar;

    public static final ImageVector getRadar(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _radar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.Radar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.74f, 18.33f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(21.15f, 16.6f, 22.0f, 14.4f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.33f, -2.26f);
        pathBuilder3.curveToRelative(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f);
        pathBuilder3.curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f);
        pathBuilder3.curveTo(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f);
        pathBuilder4.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.51f, -0.42f, 3.49f, -1.13f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.92f, 12.51f);
        pathBuilder5.curveToRelative(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.77f, -0.77f, -2.0f, -0.78f, -2.78f, -0.04f);
        pathBuilder6.curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f);
        pathBuilder6.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(0.02f, 0.02f);
        pathBuilder.curveToRelative(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f);
        pathBuilder.lineToRelative(1.51f, 1.51f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f);
        pathBuilder7.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -0.21f, 1.41f, -0.56f, 2.0f);
        pathBuilder.lineTo(13.92f, 12.51f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _radar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
