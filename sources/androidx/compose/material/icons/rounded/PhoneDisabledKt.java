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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhoneDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhoneDisabled.kt */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PhoneDisabled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.54f, 17.37f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.63f, 2.08f, -5.89f, 3.39f, -9.45f, 3.61f);
        pathBuilder2.curveToRelative(-1.13f, 0.07f, -2.07f, -0.87f, -2.07f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.73f);
        pathBuilder.curveToRelative(-0.01f, -1.01f, 0.75f, -1.86f, 1.76f, -1.98f);
        pathBuilder.lineToRelative(2.54f, -0.29f);
        pathBuilder.curveToRelative(0.61f, -0.07f, 1.21f, 0.14f, 1.64f, 0.57f);
        pathBuilder.lineToRelative(1.84f, 1.84f);
        pathBuilder.curveToRelative(0.81f, -0.41f, 1.59f, -0.9f, 2.31f, -1.45f);
        pathBuilder.lineTo(2.1f, 4.93f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f);
        pathBuilder.lineTo(20.49f, 20.5f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(14.54f, 17.37f);
        pathBuilder.close();
        pathBuilder.moveTo(17.39f, 10.8f);
        pathBuilder.lineToRelative(-1.85f, -1.85f);
        pathBuilder.curveToRelative(-0.43f, -0.43f, -0.64f, -1.03f, -0.57f, -1.64f);
        pathBuilder.lineToRelative(0.29f, -2.52f);
        pathBuilder.curveToRelative(0.12f, -1.01f, 0.97f, -1.77f, 1.99f, -1.77f);
        pathBuilder.horizontalLineToRelative(1.73f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.13f, 0.0f, 2.07f, 0.94f, 2.0f, 2.07f);
        pathBuilder4.curveToRelative(-0.22f, 3.57f, -1.54f, 6.83f, -3.62f, 9.47f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.curveTo(16.48f, 12.4f, 16.97f, 11.62f, 17.39f, 10.8f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phoneDisabled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
