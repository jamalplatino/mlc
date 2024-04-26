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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_downloading", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Downloading", "Landroidx/compose/material/icons/Icons$Rounded;", "getDownloading", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Downloading.kt */
public final class DownloadingKt {
    private static ImageVector _downloading;

    public static final ImageVector getDownloading(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _downloading;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Downloading", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.33f, 3.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.94f, -0.6f, -1.99f, -1.04f, -3.12f, -1.3f);
        pathBuilder2.curveTo(13.59f, 2.11f, 13.0f, 2.59f, 13.0f, 3.23f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.97f);
        pathBuilder2.curveToRelative(0.91f, 0.2f, 1.77f, 0.56f, 2.53f, 1.05f);
        pathBuilder2.curveToRelative(0.39f, 0.25f, 0.89f, 0.17f, 1.22f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(17.94f, 4.64f, 17.87f, 3.89f, 17.33f, 3.55f);
        pathBuilder.close();
        pathBuilder.moveTo(20.77f, 11.0f);
        pathBuilder.lineTo(20.77f, 11.0f);
        pathBuilder2.curveToRelative(0.64f, 0.0f, 1.13f, -0.59f, 0.98f, -1.21f);
        pathBuilder2.curveToRelative(-0.26f, -1.12f, -0.7f, -2.17f, -1.3f, -3.12f);
        pathBuilder2.curveToRelative(-0.34f, -0.54f, -1.1f, -0.61f, -1.55f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(-0.32f, 0.32f, -0.4f, 0.83f, -0.16f, 1.22f);
        pathBuilder2.curveToRelative(0.49f, 0.77f, 0.85f, 1.62f, 1.05f, 2.53f);
        pathBuilder2.curveTo(19.9f, 10.7f, 20.31f, 11.0f, 20.77f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.9f, 17.49f);
        pathBuilder.lineTo(18.9f, 17.49f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.15f);
        pathBuilder3.curveToRelative(0.6f, -0.94f, 1.04f, -1.99f, 1.3f, -3.11f);
        pathBuilder3.curveToRelative(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.45f, 0.0f, -0.87f, 0.3f, -0.97f, 0.74f);
        pathBuilder3.curveToRelative(-0.2f, 0.91f, -0.57f, 1.76f, -1.05f, 2.53f);
        pathBuilder3.curveTo(18.5f, 16.66f, 18.58f, 17.17f, 18.9f, 17.49f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 20.77f);
        pathBuilder.lineTo(13.0f, 20.77f);
        pathBuilder3.curveToRelative(0.0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.98f);
        pathBuilder3.curveToRelative(1.12f, -0.26f, 2.17f, -0.7f, 3.11f, -1.3f);
        pathBuilder3.curveToRelative(0.54f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.15f);
        pathBuilder3.curveToRelative(-0.76f, 0.49f, -1.61f, 0.85f, -2.53f, 1.05f);
        pathBuilder3.curveTo(13.3f, 19.9f, 13.0f, 20.31f, 13.0f, 20.77f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(9.41f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        pathBuilder.lineToRelative(2.59f, 2.59f);
        pathBuilder5.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.59f, -2.59f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.77f);
        pathBuilder.lineTo(11.0f, 20.77f);
        pathBuilder6.curveToRelative(0.0f, 0.64f, -0.59f, 1.13f, -1.21f, 0.99f);
        pathBuilder6.curveTo(5.33f, 20.75f, 2.0f, 16.77f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(3.33f, -8.75f, 7.79f, -9.75f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveTo(10.41f, 2.11f, 11.0f, 2.59f, 11.0f, 3.23f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.0f, 0.46f, -0.31f, 0.87f, -0.76f, 0.97f);
        pathBuilder7.curveTo(6.67f, 5.0f, 4.0f, 8.19f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.67f, 7.0f, 6.24f, 7.8f);
        pathBuilder.curveTo(10.69f, 19.9f, 11.0f, 20.31f, 11.0f, 20.77f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _downloading = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
