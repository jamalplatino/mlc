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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoCameraBack", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoCameraBack", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhotoCameraBack", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhotoCameraBack.kt */
public final class PhotoCameraBackKt {
    private static ImageVector _photoCameraBack;

    public static final ImageVector getPhotoCameraBack(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _photoCameraBack;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PhotoCameraBack", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-3.17f);
        pathBuilder.lineToRelative(-1.24f, -1.35f);
        pathBuilder.curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f);
        pathBuilder.horizontalLineTo(9.88f);
        pathBuilder.curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.41f, 3.65f);
        pathBuilder.lineTo(7.17f, 5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder2.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 17.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f);
        pathBuilder.lineToRelative(2.0f, -2.67f);
        pathBuilder.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        pathBuilder.lineTo(11.25f, 16.0f);
        pathBuilder.lineToRelative(2.6f, -3.47f);
        pathBuilder.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        pathBuilder.lineToRelative(2.75f, 3.67f);
        pathBuilder.curveTo(17.65f, 16.53f, 17.41f, 17.0f, 17.0f, 17.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _photoCameraBack = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}