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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneBluetoothSpeaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneBluetoothSpeaker", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhoneBluetoothSpeaker", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhoneBluetoothSpeaker.kt */
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PhoneBluetoothSpeaker", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.71f, 9.5f);
        pathBuilder.lineTo(17.0f, 7.21f);
        pathBuilder.lineTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.lineToRelative(2.85f, -2.85f);
        pathBuilder.lineTo(18.21f, 6.0f);
        pathBuilder.lineToRelative(2.15f, -2.15f);
        pathBuilder.lineTo(17.5f, 1.0f);
        pathBuilder.lineTo(17.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.79f);
        pathBuilder.lineTo(14.71f, 2.5f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineTo(16.79f, 6.0f);
        pathBuilder.lineTo(14.0f, 8.79f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 2.91f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.lineTo(18.0f, 2.91f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.21f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.lineTo(18.0f, 7.21f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 15.46f);
        pathBuilder.lineToRelative(-5.27f, -0.61f);
        pathBuilder.lineToRelative(-2.52f, 2.52f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(2.53f, -2.53f);
        pathBuilder.lineTo(8.54f, 3.0f);
        pathBuilder.lineTo(3.03f, 3.0f);
        pathBuilder.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        pathBuilder.verticalLineToRelative(-5.51f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phoneBluetoothSpeaker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
