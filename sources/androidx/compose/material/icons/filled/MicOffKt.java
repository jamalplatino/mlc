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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_micOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MicOff", "Landroidx/compose/material/icons/Icons$Filled;", "getMicOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MicOff.kt */
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.MicOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-1.7f);
        pathBuilder.curveToRelative(0.0f, 0.74f, -0.16f, 1.43f, -0.43f, 2.05f);
        pathBuilder.lineToRelative(1.23f, 1.23f);
        pathBuilder.curveToRelative(0.56f, -0.98f, 0.9f, -2.09f, 0.9f, -3.28f);
        pathBuilder.close();
        pathBuilder.moveTo(14.98f, 11.17f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.02f, -0.11f, 0.02f, -0.17f);
        pathBuilder.lineTo(15.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        pathBuilder.verticalLineToRelative(0.18f);
        pathBuilder.lineToRelative(5.98f, 5.99f);
        pathBuilder.close();
        pathBuilder.moveTo(4.27f, 3.0f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(6.01f, 6.01f);
        pathBuilder.lineTo(9.01f, 11.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.33f, 3.0f, 2.99f, 3.0f);
        pathBuilder2.curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        pathBuilder.lineToRelative(1.66f, 1.66f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        pathBuilder3.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder3.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        pathBuilder.lineTo(11.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-3.28f);
        pathBuilder.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.54f, -0.9f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineTo(21.0f, 19.73f);
        pathBuilder.lineTo(4.27f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _micOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}