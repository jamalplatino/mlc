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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_windPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WindPower", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWindPower", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindPower.kt */
public final class WindPowerKt {
    private static ImageVector _windPower;

    public static final ImageVector getWindPower(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _windPower;
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
        ImageVector.Builder builder7 = r1;
        ImageVector.Builder builder8 = r1;
        ImageVector.Builder builder9 = new ImageVector.Builder("TwoTone.WindPower", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder8, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(3.28f, 13.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(3.13f, 13.0f, 3.0f, 13.13f, 3.0f, 13.28f);
        pathBuilder4.curveToRelative(0.0f, 0.12f, 0.08f, 0.24f, 0.2f, 0.27f);
        pathBuilder3.lineToRelative(4.51f, 1.29f);
        pathBuilder3.lineToRelative(2.33f, -1.4f);
        pathBuilder3.curveToRelative(-0.02f, -0.15f, -0.03f, -0.29f, -0.03f, -0.44f);
        pathBuilder3.horizontalLineTo(3.28f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder7, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.76f, 3.54f);
        pathBuilder5.curveToRelative(-0.15f, -0.09f, -0.29f, -0.01f, -0.34f, 0.04f);
        pathBuilder5.lineTo(14.0f, 6.78f);
        pathBuilder5.verticalLineToRelative(3.36f);
        pathBuilder5.lineToRelative(0.11f, 0.03f);
        pathBuilder5.lineToRelative(3.74f, -6.24f);
        pathBuilder5.curveTo(17.94f, 3.79f, 17.89f, 3.62f, 17.76f, 3.54f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder6, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(18.19f, 15.48f);
        pathBuilder6.lineToRelative(-2.78f, -0.69f);
        pathBuilder6.curveToRelative(-0.07f, 0.1f, -0.15f, 0.19f, -0.24f, 0.28f);
        pathBuilder6.lineToRelative(4.85f, 4.85f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(0.16f, 0.16f, 0.35f, 0.05f, 0.4f, 0.0f);
        pathBuilder7.curveToRelative(0.09f, -0.09f, 0.11f, -0.23f, 0.05f, -0.33f);
        pathBuilder6.lineTo(18.19f, 15.48f);
        pathBuilder6.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(4.0f, 3.0f);
        pathBuilder8.horizontalLineToRelative(6.0f);
        pathBuilder8.verticalLineToRelative(2.0f);
        pathBuilder8.horizontalLineToRelative(-6.0f);
        pathBuilder8.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r107 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r108 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(1.0f, 7.0f);
        pathBuilder9.horizontalLineToRelative(5.0f);
        pathBuilder9.verticalLineToRelative(2.0f);
        pathBuilder9.horizontalLineToRelative(-5.0f);
        pathBuilder9.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r107, r108, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r124 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r125 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder10 = new PathBuilder();
        pathBuilder10.moveTo(3.0f, 19.0f);
        pathBuilder10.horizontalLineToRelative(5.0f);
        pathBuilder10.verticalLineToRelative(2.0f);
        pathBuilder10.horizontalLineToRelative(-5.0f);
        pathBuilder10.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder10.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r124, r125, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r141 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r142 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder11 = new PathBuilder();
        pathBuilder11.moveTo(22.21f, 18.61f);
        pathBuilder11.lineToRelative(-2.28f, -4.1f);
        PathBuilder pathBuilder12 = pathBuilder11;
        pathBuilder12.curveToRelative(-0.27f, -0.48f, -0.73f, -0.83f, -1.26f, -0.97f);
        pathBuilder11.lineToRelative(-2.69f, -0.67f);
        pathBuilder12.curveToRelative(-0.02f, -0.47f, -0.14f, -0.92f, -0.37f, -1.33f);
        pathBuilder11.lineToRelative(3.96f, -6.59f);
        pathBuilder12.curveToRelative(0.65f, -1.08f, 0.3f, -2.48f, -0.78f, -3.13f);
        pathBuilder12.curveToRelative(-0.36f, -0.22f, -0.77f, -0.32f, -1.17f, -0.32f);
        pathBuilder12.curveToRelative(-0.56f, 0.0f, -1.12f, 0.21f, -1.56f, 0.62f);
        pathBuilder11.lineToRelative(-3.43f, 3.21f);
        pathBuilder12.curveTo(12.23f, 5.7f, 12.0f, 6.23f, 12.0f, 6.78f);
        pathBuilder11.verticalLineToRelative(3.4f);
        pathBuilder12.curveToRelative(-0.47f, 0.17f, -0.89f, 0.45f, -1.23f, 0.82f);
        pathBuilder11.horizontalLineTo(3.28f);
        pathBuilder12.curveTo(2.02f, 11.0f, 1.0f, 12.02f, 1.0f, 13.28f);
        pathBuilder12.curveToRelative(0.0f, 1.02f, 0.67f, 1.91f, 1.65f, 2.19f);
        pathBuilder11.lineToRelative(4.51f, 1.29f);
        pathBuilder12.curveToRelative(0.18f, 0.05f, 0.37f, 0.08f, 0.55f, 0.08f);
        pathBuilder12.curveToRelative(0.36f, 0.0f, 0.72f, -0.1f, 1.03f, -0.29f);
        pathBuilder11.lineToRelative(2.24f, -1.34f);
        pathBuilder12.curveToRelative(0.29f, 0.26f, 0.63f, 0.47f, 1.02f, 0.61f);
        pathBuilder11.verticalLineTo(21.0f);
        pathBuilder12.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder11.horizontalLineToRelative(6.0f);
        pathBuilder12.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder11.verticalLineToRelative(-4.28f);
        pathBuilder11.lineToRelative(4.61f, 4.61f);
        pathBuilder12.curveToRelative(0.45f, 0.45f, 1.03f, 0.67f, 1.61f, 0.67f);
        pathBuilder12.curveToRelative(0.58f, 0.0f, 1.17f, -0.22f, 1.61f, -0.67f);
        pathBuilder11.horizontalLineToRelative(0.0f);
        pathBuilder12.curveTo(22.55f, 20.61f, 22.71f, 19.5f, 22.21f, 18.61f);
        pathBuilder11.close();
        pathBuilder11.moveTo(7.72f, 14.84f);
        pathBuilder11.lineTo(3.2f, 13.55f);
        pathBuilder12.curveTo(3.08f, 13.52f, 3.0f, 13.4f, 3.0f, 13.28f);
        pathBuilder12.curveTo(3.0f, 13.13f, 3.13f, 13.0f, 3.28f, 13.0f);
        pathBuilder11.horizontalLineToRelative(6.73f);
        pathBuilder12.curveToRelative(0.0f, 0.15f, 0.01f, 0.3f, 0.03f, 0.44f);
        pathBuilder11.lineTo(7.72f, 14.84f);
        pathBuilder11.close();
        pathBuilder11.moveTo(13.0f, 14.0f);
        pathBuilder12.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder12.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder11.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder12.curveTo(14.0f, 13.55f, 13.55f, 14.0f, 13.0f, 14.0f);
        pathBuilder11.close();
        pathBuilder11.moveTo(14.0f, 10.14f);
        pathBuilder11.verticalLineTo(6.78f);
        pathBuilder11.lineToRelative(3.43f, -3.21f);
        pathBuilder12.curveToRelative(0.05f, -0.05f, 0.19f, -0.12f, 0.34f, -0.04f);
        pathBuilder12.curveToRelative(0.13f, 0.08f, 0.18f, 0.25f, 0.1f, 0.38f);
        pathBuilder11.lineToRelative(-3.74f, 6.24f);
        pathBuilder11.lineTo(14.0f, 10.14f);
        pathBuilder11.close();
        pathBuilder11.moveTo(20.42f, 19.92f);
        pathBuilder12.curveToRelative(-0.05f, 0.05f, -0.24f, 0.16f, -0.4f, 0.0f);
        pathBuilder11.lineToRelative(-4.85f, -4.85f);
        pathBuilder12.curveToRelative(0.08f, -0.09f, 0.16f, -0.18f, 0.24f, -0.28f);
        pathBuilder11.lineToRelative(2.78f, 0.69f);
        pathBuilder11.lineToRelative(2.28f, 4.1f);
        pathBuilder12.curveTo(20.53f, 19.69f, 20.51f, 19.83f, 20.42f, 19.92f);
        pathBuilder11.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder11.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r141, r142, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _windPower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}