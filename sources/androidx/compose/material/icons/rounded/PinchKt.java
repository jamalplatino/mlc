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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pinch", "Landroidx/compose/material/icons/Icons$Rounded;", "getPinch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pinch.kt */
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Pinch", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.2f, 17.43f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        pathBuilder.lineTo(13.0f, 17.24f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(0.91f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilder.lineToRelative(4.09f, 2.04f);
        pathBuilder.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        pathBuilder.lineToRelative(-0.63f, 4.46f);
        pathBuilder.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        pathBuilder.horizontalLineToRelative(-6.16f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilder.lineToRelative(-4.07f, -4.29f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 5.25f);
        pathBuilder2.curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f);
        pathBuilder.verticalLineTo(2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.75f);
        pathBuilder3.curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f);
        pathBuilder.reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f);
        pathBuilder.horizontalLineToRelative(1.69f);
        pathBuilder.lineTo(2.5f, 8.44f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f);
        pathBuilder.reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f);
        pathBuilder.reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f);
        pathBuilder.horizontalLineTo(3.56f);
        pathBuilder.lineTo(9.5f, 3.56f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pinch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
