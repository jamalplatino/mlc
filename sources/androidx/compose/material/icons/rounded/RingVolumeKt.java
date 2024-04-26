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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ringVolume", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RingVolume", "Landroidx/compose/material/icons/Icons$Rounded;", "getRingVolume", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RingVolume.kt */
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.RingVolume", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.98f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f);
        pathBuilder.lineTo(13.0f, 2.98f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.98f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(16.9f, 9.11f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder2.curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f);
        pathBuilder2.curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0.0f, -1.39f);
        pathBuilder2.curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f);
        pathBuilder.lineTo(16.89f, 7.7f);
        pathBuilder.curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(5.71f, 9.1f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.38f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder3.curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f);
        pathBuilder.lineTo(4.96f, 5.54f);
        pathBuilder.curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f);
        pathBuilder.lineToRelative(-0.02f, 0.01f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder4.curveToRelative(0.63f, 0.62f, 1.54f, 1.53f, 2.16f, 2.16f);
        pathBuilder.close();
        pathBuilder.moveTo(23.29f, 16.23f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f);
        pathBuilder5.curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f);
        pathBuilder.lineToRelative(1.22f, 1.22f);
        pathBuilder5.curveToRelative(0.72f, 0.72f, 1.86f, 0.78f, 2.66f, 0.15f);
        pathBuilder.lineToRelative(2.0f, -1.59f);
        pathBuilder.curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f);
        pathBuilder.verticalLineToRelative(-2.6f);
        pathBuilder.curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f);
        pathBuilder.verticalLineToRelative(2.61f);
        pathBuilder.curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f);
        pathBuilder.lineToRelative(1.99f, 1.58f);
        pathBuilder.curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f);
        pathBuilder.lineToRelative(1.22f, -1.22f);
        pathBuilder.curveToRelative(0.79f, -0.8f, 0.79f, -2.13f, -0.06f, -2.88f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _ringVolume = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
