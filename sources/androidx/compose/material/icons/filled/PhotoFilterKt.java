package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoFilter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoFilter", "Landroidx/compose/material/icons/Icons$Filled;", "getPhotoFilter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhotoFilter.kt */
public final class PhotoFilterKt {
    private static ImageVector _photoFilter;

    public static final ImageVector getPhotoFilter(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _photoFilter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.PhotoFilter", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.02f, 10.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineTo(14.0f, 3.0f);
        pathBuilder.lineTo(5.02f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(20.0f, 7.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(17.0f, 4.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(14.0f, 7.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.close();
        pathBuilder.moveTo(13.25f, 10.75f);
        pathBuilder.lineTo(12.0f, 8.0f);
        pathBuilder.lineToRelative(-1.25f, 2.75f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.lineToRelative(2.75f, 1.25f);
        pathBuilder.lineTo(12.0f, 16.0f);
        pathBuilder.lineToRelative(1.25f, -2.75f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _photoFilter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
