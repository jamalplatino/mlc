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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrAutoSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrAutoSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrAutoSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HdrAutoSelect.kt */
public final class HdrAutoSelectKt {
    private static ImageVector _hdrAutoSelect;

    public static final ImageVector getHdrAutoSelect(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hdrAutoSelect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = r1;
        ImageVector.Builder builder7 = new ImageVector.Builder("Rounded.HdrAutoSelect", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 16.0f);
        pathBuilder.horizontalLineTo(7.25f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder2.curveTo(6.5f, 21.66f, 6.84f, 22.0f, 7.25f, 22.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder2.curveTo(11.5f, 16.67f, 10.83f, 16.0f, 10.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(20.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder6, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.25f, 16.0f);
        pathBuilder3.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-1.25f);
        pathBuilder3.curveTo(1.5f, 16.34f, 1.16f, 16.0f, 0.75f, 16.0f);
        pathBuilder3.reflectiveCurveTo(0.0f, 16.34f, 0.0f, 16.75f);
        pathBuilder3.verticalLineToRelative(4.5f);
        pathBuilder3.curveTo(0.0f, 21.66f, 0.34f, 22.0f, 0.75f, 22.0f);
        pathBuilder3.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder3.verticalLineTo(19.5f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(1.75f);
        pathBuilder3.curveTo(3.5f, 21.66f, 3.84f, 22.0f, 4.25f, 22.0f);
        pathBuilder3.reflectiveCurveTo(5.0f, 21.66f, 5.0f, 21.25f);
        pathBuilder3.verticalLineToRelative(-4.5f);
        pathBuilder3.curveTo(5.0f, 16.34f, 4.66f, 16.0f, 4.25f, 16.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(23.25f, 18.5f);
        pathBuilder4.horizontalLineTo(22.0f);
        pathBuilder4.verticalLineToRelative(-1.25f);
        pathBuilder4.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder4.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder4.verticalLineToRelative(1.25f);
        pathBuilder4.horizontalLineToRelative(-1.25f);
        pathBuilder4.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder4.reflectiveCurveTo(18.84f, 20.0f, 19.25f, 20.0f);
        pathBuilder4.horizontalLineToRelative(1.25f);
        pathBuilder4.verticalLineToRelative(1.25f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder4.reflectiveCurveTo(22.0f, 21.66f, 22.0f, 21.25f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder4.horizontalLineToRelative(1.25f);
        pathBuilder5.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder4.reflectiveCurveTo(23.66f, 18.5f, 23.25f, 18.5f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.5f, 16.0f);
        pathBuilder6.horizontalLineToRelative(-2.75f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveTo(13.34f, 16.0f, 13.0f, 16.34f, 13.0f, 16.75f);
        pathBuilder6.verticalLineToRelative(4.56f);
        pathBuilder7.curveToRelative(0.0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f);
        pathBuilder6.horizontalLineToRelative(0.11f);
        pathBuilder7.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder6.verticalLineTo(20.0f);
        pathBuilder6.horizontalLineToRelative(1.1f);
        pathBuilder6.lineToRelative(0.72f, 1.59f);
        PathBuilder pathBuilder8 = pathBuilder6;
        pathBuilder8.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilder8.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder6.lineTo(17.1f, 19.9f);
        PathBuilder pathBuilder9 = pathBuilder6;
        pathBuilder9.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilder6.verticalLineToRelative(-1.0f);
        pathBuilder9.curveTo(18.0f, 16.67f, 17.33f, 16.0f, 16.5f, 16.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(16.5f, 18.5f);
        pathBuilder6.horizontalLineToRelative(-2.0f);
        pathBuilder6.verticalLineToRelative(-1.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineTo(18.5f);
        pathBuilder6.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder10 = new PathBuilder();
        pathBuilder10.moveTo(11.97f, 5.3f);
        pathBuilder10.lineToRelative(-1.02f, 2.89f);
        pathBuilder10.lineToRelative(2.1f, 0.0f);
        pathBuilder10.lineToRelative(-1.02f, -2.89f);
        pathBuilder10.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder10.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r107 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r108 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder11 = new PathBuilder();
        pathBuilder11.moveTo(12.0f, 2.0f);
        pathBuilder11.curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f);
        pathBuilder11.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder11.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder11.reflectiveCurveTo(15.31f, 2.0f, 12.0f, 2.0f);
        pathBuilder11.close();
        pathBuilder11.moveTo(14.44f, 11.0f);
        pathBuilder11.curveToRelative(-0.24f, 0.0f, -0.45f, -0.15f, -0.53f, -0.38f);
        pathBuilder11.lineToRelative(-0.49f, -1.41f);
        pathBuilder11.horizontalLineToRelative(-2.83f);
        pathBuilder11.lineToRelative(-0.5f, 1.41f);
        PathBuilder pathBuilder12 = pathBuilder11;
        pathBuilder12.curveTo(10.01f, 10.85f, 9.8f, 11.0f, 9.56f, 11.0f);
        pathBuilder12.curveToRelative(-0.39f, 0.0f, -0.67f, -0.39f, -0.53f, -0.76f);
        pathBuilder11.lineToRelative(2.12f, -5.65f);
        pathBuilder11.curveTo(11.29f, 4.23f, 11.62f, 4.0f, 12.0f, 4.0f);
        pathBuilder11.reflectiveCurveToRelative(0.71f, 0.23f, 0.85f, 0.59f);
        pathBuilder11.lineToRelative(2.12f, 5.65f);
        pathBuilder11.curveTo(15.11f, 10.61f, 14.84f, 11.0f, 14.44f, 11.0f);
        pathBuilder11.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder11.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r107, r108, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hdrAutoSelect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
