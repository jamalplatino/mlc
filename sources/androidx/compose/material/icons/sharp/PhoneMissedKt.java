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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneMissed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneMissed", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhoneMissed", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhoneMissed.kt */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.PhoneMissed", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.32f, 16.67f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f);
        pathBuilder2.curveToRelative(-4.39f, 0.0f, -8.37f, 1.72f, -11.31f, 4.51f);
        pathBuilder.lineToRelative(-0.69f, 0.69f);
        pathBuilder.lineTo(3.65f, 21.0f);
        pathBuilder.lineToRelative(3.93f, -2.72f);
        pathBuilder.lineToRelative(-0.01f, -3.49f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f);
        pathBuilder3.curveToRelative(1.55f, 0.0f, 3.04f, 0.24f, 4.44f, 0.7f);
        pathBuilder.lineToRelative(-0.01f, 3.49f);
        pathBuilder.lineTo(20.37f, 21.0f);
        pathBuilder.lineToRelative(3.64f, -3.64f);
        pathBuilder.curveToRelative(0.0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 6.43f);
        pathBuilder.lineToRelative(4.94f, 4.94f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineTo(8.4f, 5.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phoneMissed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
