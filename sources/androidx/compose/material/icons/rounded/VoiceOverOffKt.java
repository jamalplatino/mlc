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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_voiceOverOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VoiceOverOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getVoiceOverOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VoiceOverOff.kt */
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.VoiceOverOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.72f, 6.41f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.35f, 0.35f, -0.44f, 0.88f, -0.25f, 1.35f);
        pathBuilder2.curveToRelative(0.3f, 0.75f, 0.32f, 1.58f, 0.05f, 2.34f);
        pathBuilder2.curveToRelative(-0.16f, 0.46f, -0.06f, 0.98f, 0.29f, 1.32f);
        pathBuilder2.curveToRelative(0.6f, 0.6f, 1.66f, 0.47f, 2.02f, -0.31f);
        pathBuilder2.curveToRelative(0.64f, -1.39f, 0.6f, -2.99f, -0.12f, -4.41f);
        pathBuilder2.curveToRelative(-0.4f, -0.75f, -1.41f, -0.88f, -1.99f, -0.29f);
        pathBuilder.close();
        pathBuilder.moveTo(19.18f, 2.89f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f);
        pathBuilder3.curveToRelative(1.93f, 2.68f, 1.95f, 6.25f, 0.09f, 9.07f);
        pathBuilder3.curveToRelative(-0.31f, 0.46f, -0.23f, 1.08f, 0.16f, 1.47f);
        pathBuilder3.curveToRelative(0.51f, 0.51f, 1.38f, 0.46f, 1.81f, -0.13f);
        pathBuilder3.curveToRelative(2.57f, -3.51f, 2.52f, -8.2f, -0.17f, -11.77f);
        pathBuilder3.curveToRelative(-0.43f, -0.56f, -1.26f, -0.62f, -1.76f, -0.12f);
        pathBuilder.close();
        pathBuilder.moveTo(9.43f, 5.04f);
        pathBuilder.lineToRelative(3.53f, 3.53f);
        pathBuilder.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        pathBuilder.close();
        pathBuilder.moveTo(3.71f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.91f, 1.91f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.56f, 0.89f, -0.79f, 2.01f, -0.47f, 3.2f);
        pathBuilder4.curveToRelative(0.36f, 1.33f, 1.44f, 2.4f, 2.77f, 2.77f);
        pathBuilder4.curveToRelative(1.19f, 0.33f, 2.31f, 0.09f, 3.2f, -0.47f);
        pathBuilder.lineToRelative(4.4f, 4.4f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        pathBuilder5.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        pathBuilder.lineToRelative(2.31f, 2.31f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder6.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(5.12f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _voiceOverOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
