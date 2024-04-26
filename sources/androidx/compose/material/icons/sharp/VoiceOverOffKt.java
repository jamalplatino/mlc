package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_voiceOverOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VoiceOverOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getVoiceOverOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VoiceOverOff.kt */
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.VoiceOverOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.76f, 5.36f);
        pathBuilder.lineToRelative(-1.68f, 1.69f);
        pathBuilder.curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f);
        pathBuilder.lineToRelative(1.7f, 1.7f);
        pathBuilder.curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f);
        pathBuilder.close();
        pathBuilder.moveTo(20.07f, 2.0f);
        pathBuilder.lineToRelative(-1.63f, 1.63f);
        pathBuilder.curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f);
        pathBuilder.lineToRelative(1.64f, 1.64f);
        pathBuilder.curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f);
        pathBuilder.close();
        pathBuilder.moveTo(9.43f, 5.04f);
        pathBuilder.lineToRelative(3.53f, 3.53f);
        pathBuilder.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        pathBuilder.close();
        pathBuilder.moveTo(4.41f, 2.86f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.62f, 2.62f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        pathBuilder.lineToRelative(4.4f, 4.4f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        pathBuilder3.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.41f, 2.86f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _voiceOverOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
