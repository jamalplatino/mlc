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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flipCameraAndroid", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlipCameraAndroid", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlipCameraAndroid", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlipCameraAndroid.kt */
public final class FlipCameraAndroidKt {
    private static ImageVector _flipCameraAndroid;

    public static final ImageVector getFlipCameraAndroid(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _flipCameraAndroid;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.FlipCameraAndroid", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 10.34f, 9.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.0f, 9.0f);
        pathBuilder2.lineTo(8.0f, 9.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.horizontalLineTo(5.09f);
        pathBuilder3.curveTo(6.47f, 5.61f, 9.05f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.curveToRelative(3.49f, 0.0f, 6.45f, 2.24f, 7.54f, 5.36f);
        pathBuilder3.curveTo(19.68f, 9.75f, 20.07f, 10.0f, 20.48f, 10.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.68f, 0.0f, 1.18f, -0.67f, 0.96f, -1.31f);
        pathBuilder3.curveTo(20.07f, 4.79f, 16.36f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.curveTo(8.73f, 2.0f, 5.82f, 3.58f, 4.0f, 6.01f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(2.45f, 4.0f, 2.0f, 4.45f, 2.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder3.curveTo(7.55f, 10.0f, 8.0f, 9.55f, 8.0f, 9.0f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 15.0f);
        pathBuilder4.lineTo(16.0f, 15.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(1.91f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-1.38f, 2.39f, -3.96f, 4.0f, -6.91f, 4.0f);
        pathBuilder5.curveToRelative(-3.49f, 0.0f, -6.45f, -2.24f, -7.54f, -5.36f);
        pathBuilder5.curveTo(4.32f, 14.25f, 3.93f, 14.0f, 3.52f, 14.0f);
        pathBuilder4.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(-0.68f, 0.0f, -1.18f, 0.67f, -0.96f, 1.31f);
        pathBuilder5.curveTo(3.93f, 19.21f, 7.64f, 22.0f, 12.0f, 22.0f);
        pathBuilder5.curveToRelative(3.27f, 0.0f, 6.18f, -1.58f, 8.0f, -4.01f);
        pathBuilder4.verticalLineTo(19.0f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder4.verticalLineToRelative(-4.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder6.curveTo(16.45f, 14.0f, 16.0f, 14.45f, 16.0f, 15.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flipCameraAndroid = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
