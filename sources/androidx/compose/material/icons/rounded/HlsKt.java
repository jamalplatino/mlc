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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hls", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hls", "Landroidx/compose/material/icons/Icons$Rounded;", "getHls", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Hls.kt */
public final class HlsKt {
    private static ImageVector _hls;

    public static final ImageVector getHls(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hls;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Hls", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.75f, 9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(10.34f, 9.0f, 10.0f, 9.34f, 10.0f, 9.75f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.25f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(11.5f);
        pathBuilder.verticalLineTo(9.75f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(11.5f, 9.34f, 11.16f, 9.0f, 10.75f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.04f, 10.5f);
        pathBuilder3.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        pathBuilder3.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.04f);
        pathBuilder.verticalLineToRelative(0.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        pathBuilder4.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.lineTo(19.04f, 10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 9.75f);
        pathBuilder.curveTo(8.0f, 9.34f, 7.66f, 9.0f, 7.25f, 9.0f);
        pathBuilder.reflectiveCurveTo(6.5f, 9.34f, 6.5f, 9.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(9.75f);
        pathBuilder.curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder.curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveTo(6.5f, 14.66f, 6.84f, 15.0f, 7.25f, 15.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 14.66f, 8.0f, 14.25f);
        pathBuilder.verticalLineTo(9.75f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hls = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
