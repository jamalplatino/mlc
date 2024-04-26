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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spatialAudioOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpatialAudioOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getSpatialAudioOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpatialAudioOff.kt */
public final class SpatialAudioOffKt {
    private static ImageVector _spatialAudioOff;

    public static final ImageVector getSpatialAudioOff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _spatialAudioOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Outlined.SpatialAudioOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 6.79f, 6.0f, 9.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.0f, 11.21f, 7.79f, 13.0f, 10.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 7.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.curveTo(8.0f, 7.9f, 8.9f, 7.0f, 10.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.39f, 15.56f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f);
        pathBuilder5.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder5.curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f);
        pathBuilder4.verticalLineTo(21.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.verticalLineToRelative(-2.78f);
        pathBuilder5.curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.0f, 19.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineToRelative(-0.78f);
        pathBuilder5.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        pathBuilder5.curveTo(5.71f, 16.73f, 7.63f, 16.0f, 10.0f, 16.0f);
        pathBuilder5.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        pathBuilder5.curveTo(15.8f, 17.5f, 16.0f, 17.84f, 16.0f, 18.22f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(20.36f, 1.0f);
        pathBuilder6.lineToRelative(-1.41f, 1.41f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f);
        pathBuilder6.lineToRelative(1.41f, 1.41f);
        pathBuilder7.curveTo(23.88f, 10.21f, 23.88f, 4.51f, 20.36f, 1.0f);
        pathBuilder6.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(17.54f, 10.9f);
        PathBuilder pathBuilder9 = pathBuilder8;
        pathBuilder9.curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0.0f, -7.07f);
        pathBuilder8.lineToRelative(-1.41f, 1.41f);
        pathBuilder9.curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.0f, 4.24f);
        pathBuilder8.lineTo(17.54f, 10.9f);
        pathBuilder8.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _spatialAudioOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
