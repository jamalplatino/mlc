package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_opacity", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Opacity", "Landroidx/compose/material/icons/Icons$Outlined;", "getOpacity", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Opacity.kt */
public final class OpacityKt {
    private static ImageVector _opacity;

    public static final ImageVector getOpacity(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _opacity;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Opacity", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.66f, 8.0f);
        pathBuilder.lineTo(12.0f, 2.35f);
        pathBuilder.lineTo(6.34f, 8.0f);
        pathBuilder.curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
        pathBuilder.reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f);
        pathBuilder.reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f);
        pathBuilder.reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f);
        pathBuilder.reflectiveCurveTo(20.0f, 15.64f, 20.0f, 13.64f);
        pathBuilder.reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 14.0f);
        pathBuilder.curveToRelative(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
        pathBuilder.lineTo(12.0f, 5.27f);
        pathBuilder.lineToRelative(4.24f, 4.38f);
        pathBuilder.curveTo(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _opacity = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
