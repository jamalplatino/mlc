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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pin", "Landroidx/compose/material/icons/Icons$Rounded;", "getPin", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pin.kt */
public final class PinKt {
    private static ImageVector _pin;

    public static final ImageVector getPin(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Pin", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.64f, 14.47f);
        pathBuilder.curveTo(7.64f, 14.76f, 7.4f, 15.0f, 7.11f, 15.0f);
        pathBuilder.horizontalLineTo(7.02f);
        pathBuilder.curveToRelative(-0.29f, 0.0f, -0.53f, -0.24f, -0.53f, -0.53f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.lineToRelative(-0.45f, 0.33f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.24f, 0.18f, -0.59f, 0.12f, -0.76f, -0.14f);
        pathBuilder2.curveToRelative(-0.15f, -0.24f, -0.1f, -0.55f, 0.13f, -0.72f);
        pathBuilder.lineTo(6.6f, 9.12f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.71f, 9.04f, 6.84f, 9.0f, 6.98f, 9.0f);
        pathBuilder3.curveToRelative(0.36f, 0.0f, 0.66f, 0.29f, 0.66f, 0.66f);
        pathBuilder.verticalLineTo(14.47f);
        pathBuilder.close();
        pathBuilder.moveTo(13.01f, 15.0f);
        pathBuilder.horizontalLineToRelative(-2.67f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.4f, 0.0f, -0.72f, -0.32f, -0.72f, -0.72f);
        pathBuilder4.curveToRelative(0.0f, -0.19f, 0.08f, -0.38f, 0.21f, -0.51f);
        pathBuilder4.curveToRelative(0.95f, -0.95f, 1.58f, -1.58f, 1.92f, -1.94f);
        pathBuilder4.curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f);
        pathBuilder4.curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f);
        pathBuilder4.curveToRelative(-0.34f, 0.0f, -0.57f, 0.16f, -0.72f, 0.37f);
        pathBuilder4.curveToRelative(-0.15f, 0.2f, -0.41f, 0.26f, -0.64f, 0.16f);
        pathBuilder4.curveToRelative(-0.34f, -0.14f, -0.45f, -0.57f, -0.22f, -0.85f);
        pathBuilder4.curveToRelative(0.15f, -0.19f, 0.37f, -0.38f, 0.67f, -0.53f);
        pathBuilder4.curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f);
        pathBuilder4.curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f);
        pathBuilder4.curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f);
        pathBuilder4.curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f);
        pathBuilder.lineToRelative(0.03f, 0.05f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.49f, 0.22f, 0.49f, 0.49f);
        pathBuilder.reflectiveCurveTo(13.28f, 15.0f, 13.01f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.75f, 14.15f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f);
        pathBuilder5.curveToRelative(-0.03f, 0.0f, -1.23f, 0.06f, -1.83f, -0.98f);
        pathBuilder5.curveToRelative(-0.15f, -0.26f, -0.04f, -0.6f, 0.24f, -0.71f);
        pathBuilder.lineToRelative(0.12f, -0.05f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.22f, -0.09f, 0.47f, -0.01f, 0.59f, 0.19f);
        pathBuilder6.curveToRelative(0.14f, 0.24f, 0.39f, 0.49f, 0.88f, 0.49f);
        pathBuilder6.curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(-0.27f, 0.0f, -0.49f, -0.23f, -0.49f, -0.5f);
        pathBuilder6.curveToRelative(0.0f, -0.26f, 0.2f, -0.47f, 0.45f, -0.49f);
        pathBuilder.lineToRelative(0.0f, -0.01f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f);
        pathBuilder7.curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f);
        pathBuilder7.curveToRelative(-0.32f, 0.0f, -0.53f, 0.13f, -0.67f, 0.3f);
        pathBuilder7.curveToRelative(-0.14f, 0.18f, -0.37f, 0.26f, -0.58f, 0.17f);
        pathBuilder.lineToRelative(-0.08f, -0.03f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(-0.3f, -0.12f, -0.4f, -0.5f, -0.2f, -0.75f);
        pathBuilder8.curveTo(15.67f, 9.35f, 16.16f, 9.0f, 16.94f, 9.0f);
        pathBuilder8.curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f);
        pathBuilder8.curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f);
        pathBuilder8.curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f);
        pathBuilder.verticalLineToRelative(0.07f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f);
        pathBuilder9.curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
