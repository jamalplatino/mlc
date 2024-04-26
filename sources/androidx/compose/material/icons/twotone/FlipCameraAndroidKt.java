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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flipCameraAndroid", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlipCameraAndroid", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFlipCameraAndroid", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlipCameraAndroid.kt */
public final class FlipCameraAndroidKt {
    private static ImageVector _flipCameraAndroid;

    public static final ImageVector getFlipCameraAndroid(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _flipCameraAndroid;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("TwoTone.FlipCameraAndroid", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder3.reflectiveCurveTo(9.0f, 10.34f, 9.0f, 12.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveTo(13.0f, 11.45f, 13.0f, 12.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.0f, 8.0f);
        pathBuilder4.horizontalLineTo(5.09f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(6.47f, 5.61f, 9.05f, 4.0f, 12.0f, 4.0f);
        pathBuilder5.curveToRelative(3.72f, 0.0f, 6.85f, 2.56f, 7.74f, 6.0f);
        pathBuilder4.horizontalLineToRelative(2.06f);
        pathBuilder5.curveToRelative(-0.93f, -4.56f, -4.96f, -8.0f, -9.8f, -8.0f);
        pathBuilder5.curveTo(8.73f, 2.0f, 5.82f, 3.58f, 4.0f, 6.01f);
        pathBuilder4.verticalLineTo(4.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        pathBuilder4.verticalLineToRelative(6.0f);
        pathBuilder4.horizontalLineToRelative(6.0f);
        pathBuilder4.verticalLineTo(8.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.0f, 14.0f);
        pathBuilder6.verticalLineToRelative(2.0f);
        pathBuilder6.horizontalLineToRelative(2.91f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(-1.38f, 2.39f, -3.96f, 4.0f, -6.91f, 4.0f);
        pathBuilder7.curveToRelative(-3.72f, 0.0f, -6.85f, -2.56f, -7.74f, -6.0f);
        pathBuilder6.horizontalLineTo(2.2f);
        pathBuilder7.curveToRelative(0.93f, 4.56f, 4.96f, 8.0f, 9.8f, 8.0f);
        pathBuilder7.curveToRelative(3.27f, 0.0f, 6.18f, -1.58f, 8.0f, -4.01f);
        pathBuilder6.verticalLineTo(20.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineToRelative(-6.0f);
        pathBuilder6.horizontalLineTo(16.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flipCameraAndroid = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
