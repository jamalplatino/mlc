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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaPhotosphereSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaPhotosphereSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getPanoramaPhotosphereSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PanoramaPhotosphereSelect.kt */
public final class PanoramaPhotosphereSelectKt {
    private static ImageVector _panoramaPhotosphereSelect;

    public static final ImageVector getPanoramaPhotosphereSelect(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _panoramaPhotosphereSelect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PanoramaPhotosphereSelect", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.95f, 8.15f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.29f, -0.16f, -0.61f, -0.31f, -0.93f, -0.46f);
        pathBuilder2.curveTo(19.4f, 4.33f, 15.98f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveTo(8.02f, 2.0f, 4.6f, 4.33f, 2.99f, 7.68f);
        pathBuilder2.curveToRelative(-0.33f, 0.15f, -0.64f, 0.3f, -0.93f, 0.46f);
        pathBuilder2.curveTo(1.41f, 8.5f, 1.0f, 9.17f, 1.0f, 9.91f);
        pathBuilder.verticalLineToRelative(4.18f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.74f, 0.41f, 1.41f, 1.05f, 1.77f);
        pathBuilder3.curveToRelative(0.29f, 0.16f, 0.61f, 0.31f, 0.93f, 0.46f);
        pathBuilder3.curveTo(4.6f, 19.67f, 8.02f, 22.0f, 12.0f, 22.0f);
        pathBuilder3.curveToRelative(3.98f, 0.0f, 7.4f, -2.33f, 9.01f, -5.68f);
        pathBuilder3.curveToRelative(0.33f, -0.15f, 0.64f, -0.3f, 0.93f, -0.46f);
        pathBuilder3.curveTo(22.59f, 15.5f, 23.0f, 14.83f, 23.0f, 14.09f);
        pathBuilder.verticalLineTo(9.91f);
        pathBuilder.curveTo(23.0f, 9.17f, 22.59f, 8.5f, 21.95f, 8.15f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(2.37f, 0.0f, 4.49f, 1.04f, 5.95f, 2.68f);
        pathBuilder4.curveTo(16.17f, 6.25f, 14.15f, 6.0f, 12.0f, 6.0f);
        pathBuilder4.curveTo(9.85f, 6.0f, 7.83f, 6.25f, 6.05f, 6.68f);
        pathBuilder4.curveTo(7.51f, 5.04f, 9.63f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-2.37f, 0.0f, -4.49f, -1.04f, -5.95f, -2.68f);
        pathBuilder5.curveTo(7.83f, 17.75f, 9.85f, 18.0f, 12.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(4.17f, -0.25f, 5.95f, -0.68f);
        pathBuilder.curveTo(16.49f, 18.96f, 14.37f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _panoramaPhotosphereSelect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
