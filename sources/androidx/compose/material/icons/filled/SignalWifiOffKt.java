package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signalWifiOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignalWifiOff", "Landroidx/compose/material/icons/Icons$Filled;", "getSignalWifiOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SignalWifiOff.kt */
public final class SignalWifiOffKt {
    private static ImageVector _signalWifiOff;

    public static final ImageVector getSignalWifiOff(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _signalWifiOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.SignalWifiOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.64f, 7.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f);
        pathBuilder2.curveToRelative(-1.5f, 0.0f, -2.89f, 0.19f, -4.15f, 0.48f);
        pathBuilder.lineTo(18.18f, 13.8f);
        pathBuilder.lineTo(23.64f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.04f, 15.22f);
        pathBuilder.lineTo(3.27f, 1.44f);
        pathBuilder.lineTo(2.0f, 2.72f);
        pathBuilder.lineToRelative(2.05f, 2.06f);
        pathBuilder.curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f);
        pathBuilder.lineToRelative(11.63f, 14.49f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.lineToRelative(3.9f, -4.86f);
        pathBuilder.lineToRelative(3.32f, 3.32f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineToRelative(-3.46f, -3.46f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _signalWifiOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
