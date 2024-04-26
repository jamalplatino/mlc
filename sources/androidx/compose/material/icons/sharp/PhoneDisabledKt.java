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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneDisabled", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhoneDisabled", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhoneDisabled.kt */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PhoneDisabled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.52f, 17.35f);
        pathBuilder.curveTo(11.39f, 19.83f, 7.36f, 21.22f, 3.0f, 20.97f);
        pathBuilder.verticalLineToRelative(-5.51f);
        pathBuilder.lineToRelative(5.27f, -0.61f);
        pathBuilder.lineToRelative(2.52f, 2.52f);
        pathBuilder.curveToRelative(0.81f, -0.41f, 1.58f, -0.9f, 2.3f, -1.45f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(21.19f, 21.2f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(14.52f, 17.35f);
        pathBuilder.close();
        pathBuilder.moveTo(15.91f, 13.11f);
        pathBuilder.curveToRelative(0.56f, -0.73f, 1.05f, -1.51f, 1.47f, -2.33f);
        pathBuilder.lineToRelative(-2.53f, -2.53f);
        pathBuilder.lineTo(15.46f, 3.0f);
        pathBuilder.horizontalLineToRelative(5.51f);
        pathBuilder.curveToRelative(0.25f, 4.37f, -1.15f, 8.4f, -3.63f, 11.54f);
        pathBuilder.lineTo(15.91f, 13.11f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phoneDisabled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
