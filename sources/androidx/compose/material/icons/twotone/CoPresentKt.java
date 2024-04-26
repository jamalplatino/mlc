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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_coPresent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CoPresent", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCoPresent", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoPresent.kt */
public final class CoPresentKt {
    private static ImageVector _coPresent;

    public static final ImageVector getCoPresent(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _coPresent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = new ImageVector.Builder("TwoTone.CoPresent", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 10.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.48f, 18.34f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(13.29f, 17.73f, 11.37f, 17.0f, 9.0f, 17.0f);
        pathBuilder4.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilder4.curveTo(2.9f, 18.66f, 3.0f, 19.28f, 3.0f, 20.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder4.curveTo(15.0f, 19.29f, 15.11f, 18.66f, 14.48f, 18.34f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(21.0f, 3.0f);
        pathBuilder5.horizontalLineTo(3.0f);
        pathBuilder5.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        pathBuilder5.verticalLineToRelative(8.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.horizontalLineToRelative(18.0f);
        pathBuilder5.verticalLineToRelative(16.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder6.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(13.0f, 10.0f);
        pathBuilder7.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder7.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder7.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder7.reflectiveCurveTo(13.0f, 12.21f, 13.0f, 10.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(7.0f, 10.0f);
        pathBuilder7.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder7.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder7.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder7.reflectiveCurveTo(7.0f, 11.1f, 7.0f, 10.0f);
        pathBuilder7.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(15.39f, 16.56f);
        PathBuilder pathBuilder9 = pathBuilder8;
        pathBuilder9.curveTo(13.71f, 15.7f, 11.53f, 15.0f, 9.0f, 15.0f);
        pathBuilder9.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder9.curveTo(1.61f, 17.07f, 1.0f, 18.1f, 1.0f, 19.22f);
        pathBuilder8.verticalLineTo(22.0f);
        pathBuilder8.horizontalLineToRelative(16.0f);
        pathBuilder8.verticalLineToRelative(-2.78f);
        pathBuilder8.curveTo(17.0f, 18.1f, 16.39f, 17.07f, 15.39f, 16.56f);
        pathBuilder8.close();
        pathBuilder8.moveTo(15.0f, 20.0f);
        pathBuilder8.horizontalLineTo(3.0f);
        PathBuilder pathBuilder10 = pathBuilder8;
        pathBuilder10.curveToRelative(0.0f, -0.72f, -0.1f, -1.34f, 0.52f, -1.66f);
        pathBuilder10.curveTo(4.71f, 17.73f, 6.63f, 17.0f, 9.0f, 17.0f);
        pathBuilder10.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        pathBuilder10.curveTo(15.11f, 18.66f, 15.0f, 19.29f, 15.0f, 20.0f);
        pathBuilder8.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _coPresent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}