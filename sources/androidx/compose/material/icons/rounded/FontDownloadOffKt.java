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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fontDownloadOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FontDownloadOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getFontDownloadOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontDownloadOff.kt */
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.FontDownloadOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.58f, 9.75f);
        pathBuilder.lineToRelative(-0.87f, -0.87f);
        pathBuilder.lineToRelative(0.23f, -0.66f);
        pathBuilder.horizontalLineToRelative(0.1f);
        pathBuilder.lineTo(12.58f, 9.75f);
        pathBuilder.close();
        pathBuilder.moveTo(10.35f, 7.52f);
        pathBuilder.lineTo(10.55f, 7.0f);
        pathBuilder.curveToRelative(0.23f, -0.6f, 0.8f, -1.0f, 1.45f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.22f, 0.4f, 1.45f, 1.0f);
        pathBuilder.lineToRelative(2.17f, 5.79f);
        pathBuilder.lineTo(22.0f, 19.17f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.83f);
        pathBuilder.lineTo(10.35f, 7.52f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 22.61f);
        pathBuilder.lineTo(21.19f, 22.61f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(19.17f, 22.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.83f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.1f, 14.93f);
        pathBuilder.lineToRelative(-3.3f, -3.3f);
        pathBuilder.lineTo(6.9f, 16.7f);
        pathBuilder.curveTo(6.67f, 17.33f, 7.13f, 18.0f, 7.8f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.64f);
        pathBuilder.lineToRelative(0.86f, -2.43f);
        pathBuilder.horizontalLineTo(12.1f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fontDownloadOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
