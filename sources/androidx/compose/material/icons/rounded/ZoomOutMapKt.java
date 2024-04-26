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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_zoomOutMap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ZoomOutMap", "Landroidx/compose/material/icons/Icons$Rounded;", "getZoomOutMap", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ZoomOutMap.kt */
public final class ZoomOutMapKt {
    private static ImageVector _zoomOutMap;

    public static final ImageVector getZoomOutMap(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _zoomOutMap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ZoomOutMap", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.85f, 3.85f);
        pathBuilder.lineTo(17.3f, 5.3f);
        pathBuilder.lineToRelative(-2.18f, 2.16f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineTo(18.7f, 6.7f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder2.curveTo(20.46f, 8.46f, 21.0f, 8.24f, 21.0f, 7.79f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder2.curveTo(21.0f, 3.22f, 20.78f, 3.0f, 20.5f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.29f);
        pathBuilder2.curveTo(15.76f, 3.0f, 15.54f, 3.54f, 15.85f, 3.85f);
        pathBuilder.close();
        pathBuilder.moveTo(3.85f, 8.15f);
        pathBuilder.lineTo(5.3f, 6.7f);
        pathBuilder.lineToRelative(2.16f, 2.18f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.lineTo(6.7f, 5.3f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder2.curveTo(8.46f, 3.54f, 8.24f, 3.0f, 7.79f, 3.0f);
        pathBuilder.horizontalLineTo(3.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(3.22f, 3.0f, 3.0f, 3.22f, 3.0f, 3.5f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder3.curveTo(3.0f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f);
        pathBuilder.close();
        pathBuilder.moveTo(8.15f, 20.15f);
        pathBuilder.lineTo(6.7f, 18.7f);
        pathBuilder.lineToRelative(2.18f, -2.16f);
        pathBuilder3.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.lineTo(5.3f, 17.3f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(3.54f, 15.54f, 3.0f, 15.76f, 3.0f, 16.21f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder4.curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder4.curveTo(8.24f, 21.0f, 8.46f, 20.46f, 8.15f, 20.15f);
        pathBuilder.close();
        pathBuilder.moveTo(20.15f, 15.85f);
        pathBuilder.lineTo(18.7f, 17.3f);
        pathBuilder.lineToRelative(-2.16f, -2.18f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder.lineToRelative(2.18f, 2.16f);
        pathBuilder.lineToRelative(-1.45f, 1.45f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(15.54f, 20.46f, 15.76f, 21.0f, 16.21f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder6.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-4.29f);
        pathBuilder.curveTo(21.0f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _zoomOutMap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
