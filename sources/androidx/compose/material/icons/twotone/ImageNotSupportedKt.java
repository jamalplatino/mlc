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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_imageNotSupported", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImageNotSupported", "Landroidx/compose/material/icons/Icons$TwoTone;", "getImageNotSupported", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageNotSupported.kt */
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.ImageNotSupported", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.83f, 5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(11.17f);
        pathBuilder.lineTo(7.83f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.lineToRelative(3.0f, -4.0f);
        pathBuilder.lineToRelative(2.0f, 2.72f);
        pathBuilder.lineToRelative(0.84f, -1.05f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(16.17f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.83f, 3.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(13.17f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(7.83f);
        pathBuilder2.lineTo(5.83f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(18.17f, 21.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.83f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.lineTo(5.0f, 5.0f);
        pathBuilder2.lineToRelative(8.11f, 8.11f);
        pathBuilder2.lineToRelative(2.69f, 2.69f);
        pathBuilder2.lineTo(19.0f, 19.0f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.17f, 19.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.lineToRelative(3.0f, -4.0f);
        pathBuilder2.lineToRelative(2.0f, 2.72f);
        pathBuilder2.lineToRelative(0.84f, -1.05f);
        pathBuilder2.lineTo(5.0f, 7.83f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineTo(16.17f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _imageNotSupported = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
