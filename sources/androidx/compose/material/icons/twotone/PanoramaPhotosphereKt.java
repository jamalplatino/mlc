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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaPhotosphere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaPhotosphere", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanoramaPhotosphere", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PanoramaPhotosphere.kt */
public final class PanoramaPhotosphereKt {
    private static ImageVector _panoramaPhotosphere;

    public static final ImageVector getPanoramaPhotosphere(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _panoramaPhotosphere;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PanoramaPhotosphere", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 9.91f);
        pathBuilder.lineToRelative(0.0f, 4.18f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder2.curveTo(5.19f, 15.3f, 8.47f, 16.0f, 12.0f, 16.0f);
        pathBuilder2.curveToRelative(3.53f, 0.0f, 6.81f, -0.69f, 9.0f, -1.91f);
        pathBuilder.lineToRelative(0.0f, -4.18f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder2.curveTo(18.81f, 8.7f, 15.53f, 8.0f, 12.0f, 8.0f);
        pathBuilder2.curveTo(8.47f, 8.0f, 5.2f, 8.69f, 3.0f, 9.91f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.95f, 8.15f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.29f, -0.16f, -0.61f, -0.31f, -0.93f, -0.46f);
        pathBuilder4.curveTo(19.4f, 4.33f, 15.98f, 2.0f, 12.0f, 2.0f);
        pathBuilder4.curveTo(8.02f, 2.0f, 4.6f, 4.33f, 2.99f, 7.68f);
        pathBuilder4.curveToRelative(-0.33f, 0.15f, -0.64f, 0.3f, -0.93f, 0.46f);
        pathBuilder4.curveTo(1.41f, 8.5f, 1.0f, 9.17f, 1.0f, 9.91f);
        pathBuilder3.verticalLineToRelative(4.18f);
        pathBuilder4.curveToRelative(0.0f, 0.74f, 0.41f, 1.41f, 1.05f, 1.77f);
        pathBuilder4.curveToRelative(0.29f, 0.16f, 0.61f, 0.31f, 0.93f, 0.46f);
        pathBuilder4.curveTo(4.6f, 19.67f, 8.02f, 22.0f, 12.0f, 22.0f);
        pathBuilder4.curveToRelative(3.98f, 0.0f, 7.4f, -2.33f, 9.01f, -5.68f);
        pathBuilder4.curveToRelative(0.33f, -0.15f, 0.64f, -0.3f, 0.93f, -0.46f);
        pathBuilder4.curveTo(22.59f, 15.5f, 23.0f, 14.83f, 23.0f, 14.09f);
        pathBuilder3.verticalLineTo(9.91f);
        pathBuilder4.curveTo(23.0f, 9.17f, 22.59f, 8.5f, 21.95f, 8.15f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(2.37f, 0.0f, 4.49f, 1.04f, 5.95f, 2.68f);
        pathBuilder5.curveTo(16.17f, 6.25f, 14.15f, 6.0f, 12.0f, 6.0f);
        pathBuilder5.curveTo(9.85f, 6.0f, 7.83f, 6.25f, 6.05f, 6.68f);
        pathBuilder5.curveTo(7.51f, 5.04f, 9.63f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 20.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(-2.37f, 0.0f, -4.49f, -1.04f, -5.95f, -2.68f);
        pathBuilder6.curveTo(7.83f, 17.75f, 9.85f, 18.0f, 12.0f, 18.0f);
        pathBuilder3.reflectiveCurveToRelative(4.17f, -0.25f, 5.95f, -0.68f);
        pathBuilder3.curveTo(16.49f, 18.96f, 14.37f, 20.0f, 12.0f, 20.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.0f, 9.91f);
        pathBuilder3.lineToRelative(0.0f, 4.18f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveTo(18.81f, 15.31f, 15.53f, 16.0f, 12.0f, 16.0f);
        pathBuilder7.curveToRelative(-3.53f, 0.0f, -6.81f, -0.7f, -9.0f, -1.91f);
        pathBuilder7.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -4.18f);
        pathBuilder7.curveTo(5.2f, 8.69f, 8.47f, 8.0f, 12.0f, 8.0f);
        pathBuilder7.curveTo(15.53f, 8.0f, 18.81f, 8.7f, 21.0f, 9.91f);
        pathBuilder7.curveTo(21.0f, 9.91f, 21.0f, 9.91f, 21.0f, 9.91f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _panoramaPhotosphere = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
