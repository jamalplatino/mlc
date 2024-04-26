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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothAudio", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothAudio", "Landroidx/compose/material/icons/Icons$Filled;", "getBluetoothAudio", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BluetoothAudio.kt */
public final class BluetoothAudioKt {
    private static ImageVector _bluetoothAudio;

    public static final ImageVector getBluetoothAudio(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _bluetoothAudio;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.BluetoothAudio", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.24f, 12.01f);
        pathBuilder.lineToRelative(2.32f, 2.32f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        pathBuilder2.curveToRelative(0.0f, -0.82f, -0.16f, -1.59f, -0.43f, -2.31f);
        pathBuilder.lineToRelative(-2.33f, 2.32f);
        pathBuilder.close();
        pathBuilder.moveTo(19.53f, 6.71f);
        pathBuilder.lineToRelative(-1.26f, 1.26f);
        pathBuilder.curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        pathBuilder.reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f);
        pathBuilder.lineToRelative(1.2f, 1.2f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        pathBuilder3.curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(15.71f, 7.71f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(9.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.59f);
        pathBuilder.lineTo(4.41f, 5.0f);
        pathBuilder.lineTo(3.0f, 6.41f);
        pathBuilder.lineTo(8.59f, 12.0f);
        pathBuilder.lineTo(3.0f, 17.59f);
        pathBuilder.lineTo(4.41f, 19.0f);
        pathBuilder.lineTo(9.0f, 14.41f);
        pathBuilder.lineTo(9.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(5.71f, -5.71f);
        pathBuilder.lineToRelative(-4.3f, -4.29f);
        pathBuilder.lineToRelative(4.3f, -4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(11.0f, 9.59f);
        pathBuilder.lineTo(11.0f, 5.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.88f, 16.29f);
        pathBuilder.lineTo(11.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bluetoothAudio = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
