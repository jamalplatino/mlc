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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_blurCircular", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BlurCircular", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBlurCircular", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BlurCircular.kt */
public final class BlurCircularKt {
    private static ImageVector _blurCircular;

    public static final ImageVector getBlurCircular(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _blurCircular;
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
        ImageVector.Builder builder9 = new ImageVector.Builder("TwoTone.BlurCircular", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 7.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder8, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.0f, 10.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder7, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(14.0f, 14.0f);
        pathBuilder4.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder5.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder6, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(10.0f, 16.5f);
        pathBuilder6.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder6.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder6.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder6.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder6.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(10.0f, 10.0f);
        pathBuilder7.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder8.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r107 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r108 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(7.0f, 13.5f);
        pathBuilder9.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder9.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder9.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder9.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder9.close();
        pathBuilder9.moveTo(12.0f, 2.0f);
        pathBuilder9.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder9.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder9.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder9.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder9.close();
        pathBuilder9.moveTo(12.0f, 20.0f);
        pathBuilder9.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder9.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder9.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder9.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder9.close();
        pathBuilder9.moveTo(7.0f, 9.5f);
        pathBuilder9.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder9.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder9.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder9.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder9.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r107, r108, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r124 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r125 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder10 = new PathBuilder();
        pathBuilder10.moveTo(10.0f, 14.0f);
        pathBuilder10.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder11 = pathBuilder10;
        pathBuilder11.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder11.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder10.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r124, r125, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r141 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r142 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder12 = new PathBuilder();
        pathBuilder12.moveTo(10.0f, 7.5f);
        PathBuilder pathBuilder13 = pathBuilder12;
        pathBuilder13.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder12.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder12.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder12.close();
        pathBuilder12.moveTo(14.0f, 16.5f);
        pathBuilder13.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder12.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder12.close();
        pathBuilder12.moveTo(17.0f, 9.5f);
        pathBuilder13.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder12.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder12.close();
        pathBuilder12.moveTo(17.0f, 13.5f);
        pathBuilder13.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder12.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder12.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder12.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder12.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r141, r142, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _blurCircular = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}