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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_polyline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Polyline", "Landroidx/compose/material/icons/Icons$Rounded;", "getPolyline", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Polyline.kt */
public final class PolylineKt {
    private static ImageVector _polyline;

    public static final ImageVector getPolyline(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _polyline;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Polyline", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.04f, 6.85f);
        pathBuilder.lineTo(7.3f, 10.0f);
        pathBuilder.horizontalLineTo(4.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(3.67f, 10.0f, 3.0f, 10.67f, 3.0f, 11.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder2.curveTo(3.0f, 15.33f, 3.67f, 16.0f, 4.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.14f, 0.0f, 0.27f, -0.02f, 0.39f, -0.05f);
        pathBuilder.lineTo(15.0f, 19.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder3.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder3.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder3.curveToRelative(-0.75f, 0.0f, -1.37f, 0.55f, -1.48f, 1.27f);
        pathBuilder.lineTo(9.0f, 14.26f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.curveToRelative(0.0f, -0.12f, -0.01f, -0.24f, -0.04f, -0.36f);
        pathBuilder.lineTo(11.7f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.8f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(15.33f, 8.0f, 16.0f, 7.33f, 16.0f, 6.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder4.curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder4.curveTo(10.67f, 2.0f, 10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder4.curveTo(10.0f, 6.62f, 10.01f, 6.74f, 10.04f, 6.85f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _polyline = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}