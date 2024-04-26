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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flood", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlood", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Flood.kt */
public final class FloodKt {
    private static ImageVector _flood;

    public static final ImageVector getFlood(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Flood", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.67f, 19.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder2.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder2.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.54f, 0.0f, -1.96f, 0.62f, -2.67f, 0.88f);
        pathBuilder2.curveTo(2.27f, 20.03f, 2.0f, 20.4f, 2.0f, 20.83f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.71f, 0.72f, 1.19f, 1.38f, 0.94f);
        pathBuilder2.curveTo(4.15f, 21.48f, 4.49f, 21.0f, 5.34f, 21.0f);
        pathBuilder2.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder2.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(0.84f, 0.0f, 1.18f, 0.47f, 1.95f, 0.77f);
        pathBuilder2.curveToRelative(0.66f, 0.26f, 1.38f, -0.23f, 1.38f, -0.94f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder2.curveToRelative(0.0f, -0.42f, -0.27f, -0.8f, -0.67f, -0.94f);
        pathBuilder2.curveTo(20.62f, 19.62f, 20.21f, 19.0f, 18.67f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.68f, 17.5f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(0.82f, 0.0f, 1.17f, 0.46f, 1.93f, 0.76f);
        pathBuilder4.curveToRelative(0.66f, 0.26f, 1.38f, -0.23f, 1.38f, -0.94f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, -0.42f, -0.26f, -0.79f, -0.65f, -0.94f);
        pathBuilder4.curveToRelative(-0.29f, -0.11f, -0.54f, -0.27f, -0.83f, -0.43f);
        pathBuilder3.lineToRelative(-2.02f, -7.53f);
        pathBuilder3.lineToRelative(1.17f, 0.47f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.51f, 0.21f, 1.09f, -0.04f, 1.29f, -0.55f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.21f, -0.51f, -0.05f, -1.1f, -0.57f, -1.29f);
        pathBuilder3.lineToRelative(-9.24f, -3.54f);
        pathBuilder3.curveToRelative(-0.81f, -0.31f, -1.72f, -0.06f, -2.27f, 0.61f);
        pathBuilder3.lineToRelative(-6.23f, 7.7f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.16f, 1.4f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.43f, 0.34f, 1.06f, 0.26f, 1.39f, -0.17f);
        pathBuilder3.lineToRelative(0.78f, -1.0f);
        pathBuilder3.lineToRelative(0.93f, 3.48f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        pathBuilder7.curveToRelative(-1.54f, 0.0f, -1.95f, 0.62f, -2.66f, 0.88f);
        pathBuilder7.curveTo(2.27f, 15.53f, 2.0f, 15.91f, 2.0f, 16.33f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.0f, 0.7f, 0.69f, 1.19f, 1.35f, 0.95f);
        pathBuilder7.curveToRelative(0.8f, -0.29f, 1.18f, -0.78f, 2.0f, -0.78f);
        pathBuilder7.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.04f, 10.18f);
        pathBuilder3.lineToRelative(1.42f, 5.31f);
        PathBuilder pathBuilder8 = pathBuilder3;
        pathBuilder8.curveToRelative(-1.34f, 0.09f, -1.47f, -0.99f, -3.47f, -0.99f);
        pathBuilder8.curveToRelative(-0.36f, 0.0f, -0.65f, 0.04f, -0.91f, 0.1f);
        pathBuilder3.lineToRelative(-0.91f, -3.39f);
        pathBuilder3.lineTo(14.04f, 10.18f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
