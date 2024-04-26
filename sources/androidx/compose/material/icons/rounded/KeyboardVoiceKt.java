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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardVoice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardVoice", "Landroidx/compose/material/icons/Icons$Rounded;", "getKeyboardVoice", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: KeyboardVoice.kt */
public final class KeyboardVoiceKt {
    private static ImageVector _keyboardVoice;

    public static final ImageVector getKeyboardVoice(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _keyboardVoice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.KeyboardVoice", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 15.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        pathBuilder.lineTo(15.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.08f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.42f, 0.0f, -0.77f, 0.3f, -0.83f, 0.71f);
        pathBuilder3.curveToRelative(-0.37f, 2.61f, -2.72f, 4.39f, -5.25f, 4.39f);
        pathBuilder.reflectiveCurveToRelative(-4.88f, -1.77f, -5.25f, -4.39f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f);
        pathBuilder4.curveToRelative(-0.52f, 0.0f, -0.92f, 0.46f, -0.85f, 0.97f);
        pathBuilder4.curveToRelative(0.46f, 2.97f, 2.96f, 5.3f, 5.93f, 5.75f);
        pathBuilder.lineTo(11.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.28f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(2.96f, -0.43f, 5.47f, -2.78f, 5.93f, -5.75f);
        pathBuilder5.curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _keyboardVoice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}