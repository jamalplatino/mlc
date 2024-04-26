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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoCameraFront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoCameraFront", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhotoCameraFront", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhotoCameraFront.kt */
public final class PhotoCameraFrontKt {
    private static ImageVector _photoCameraFront;

    public static final ImageVector getPhotoCameraFront(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _photoCameraFront;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PhotoCameraFront", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.95f, 7.0f);
        pathBuilder.lineToRelative(-1.83f, -2.0f);
        pathBuilder.horizontalLineTo(9.88f);
        pathBuilder.lineTo(8.05f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(15.95f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(10.0f, 9.9f, 10.9f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 17.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-0.57f);
        pathBuilder3.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilder3.curveTo(10.07f, 14.21f, 11.01f, 14.0f, 12.0f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(15.52f, 14.9f, 16.0f, 15.62f, 16.0f, 16.43f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 5.0f);
        pathBuilder4.horizontalLineToRelative(-3.17f);
        pathBuilder4.lineTo(15.0f, 3.0f);
        pathBuilder4.horizontalLineTo(9.0f);
        pathBuilder4.lineTo(7.17f, 5.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.verticalLineTo(7.0f);
        pathBuilder5.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 19.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineTo(7.0f);
        pathBuilder4.horizontalLineToRelative(4.05f);
        pathBuilder4.lineToRelative(1.83f, -2.0f);
        pathBuilder4.horizontalLineToRelative(4.24f);
        pathBuilder4.lineToRelative(1.83f, 2.0f);
        pathBuilder4.horizontalLineTo(20.0f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 13.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder5.curveTo(10.0f, 12.1f, 10.9f, 13.0f, 12.0f, 13.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.78f, 14.58f);
        pathBuilder5.curveTo(13.93f, 14.21f, 12.99f, 14.0f, 12.0f, 14.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder5.curveTo(8.48f, 14.9f, 8.0f, 15.62f, 8.0f, 16.43f);
        pathBuilder4.verticalLineTo(17.0f);
        pathBuilder4.horizontalLineToRelative(8.0f);
        pathBuilder4.verticalLineToRelative(-0.57f);
        pathBuilder5.curveTo(16.0f, 15.62f, 15.52f, 14.9f, 14.78f, 14.58f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _photoCameraFront = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
