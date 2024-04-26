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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhonelinkOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhonelinkOff.kt */
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PhonelinkOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.56f, 4.0f);
        pathBuilder.lineToRelative(-2.5f, -2.49f);
        pathBuilder.lineTo(4.56f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(4.61f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(18.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(-1.61f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.lineTo(7.39f, 4.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.06f, 1.51f);
        pathBuilder.lineTo(0.65f, 2.92f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.lineTo(2.0f, 17.0f);
        pathBuilder.lineTo(0.0f, 17.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(17.73f);
        pathBuilder.lineToRelative(2.35f, 2.35f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.06f, 1.51f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 17.0f);
        pathBuilder.lineTo(4.0f, 6.27f);
        pathBuilder.lineTo(14.73f, 17.0f);
        pathBuilder.lineTo(4.0f, 17.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phonelinkOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
