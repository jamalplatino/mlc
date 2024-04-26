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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaWideAngle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaWideAngle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanoramaWideAngle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PanoramaWideAngle.kt */
public final class PanoramaWideAngleKt {
    private static ImageVector _panoramaWideAngle;

    public static final ImageVector getPanoramaWideAngle(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _panoramaWideAngle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PanoramaWideAngle", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.45f, 0.0f, -4.71f, 0.2f, -7.29f, 0.64f);
        pathBuilder2.curveTo(4.24f, 8.42f, 4.0f, 10.22f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.78f, 0.24f, 3.58f, 0.71f, 5.36f);
        pathBuilder2.curveToRelative(2.58f, 0.44f, 4.84f, 0.64f, 7.29f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(4.71f, -0.2f, 7.29f, -0.64f);
        pathBuilder2.curveToRelative(0.47f, -1.78f, 0.71f, -3.58f, 0.71f, -5.36f);
        pathBuilder2.curveToRelative(0.0f, -1.78f, -0.24f, -3.58f, -0.71f, -5.36f);
        pathBuilder2.curveTo(16.71f, 6.2f, 14.45f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.13f, 5.78f);
        pathBuilder3.lineToRelative(-0.25f, -0.89f);
        pathBuilder3.lineToRelative(-0.93f, -0.16f);
        pathBuilder3.curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.22f, 0.24f, -7.95f, 0.72f);
        pathBuilder3.lineToRelative(-0.93f, 0.16f);
        pathBuilder3.lineToRelative(-0.25f, 0.9f);
        pathBuilder3.curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f);
        pathBuilder3.lineToRelative(0.25f, 0.89f);
        pathBuilder3.lineToRelative(0.93f, 0.16f);
        pathBuilder3.curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f);
        pathBuilder3.reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f);
        pathBuilder3.lineToRelative(0.93f, -0.16f);
        pathBuilder3.lineToRelative(0.25f, -0.89f);
        pathBuilder3.curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f);
        pathBuilder3.reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.29f, 17.36f);
        pathBuilder3.curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f);
        pathBuilder3.reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f);
        pathBuilder4.curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.reflectiveCurveToRelative(4.71f, 0.2f, 7.29f, 0.64f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f);
        pathBuilder5.curveToRelative(0.0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _panoramaWideAngle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
