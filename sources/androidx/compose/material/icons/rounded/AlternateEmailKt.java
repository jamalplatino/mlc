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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_alternateEmail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlternateEmail", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlternateEmail", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AlternateEmail.kt */
public final class AlternateEmailKt {
    private static ImageVector _alternateEmail;

    public static final ImageVector getAlternateEmail(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _alternateEmail;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.AlternateEmail", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.72f, 2.03f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.63f, 1.6f, 1.6f, 6.63f, 2.03f, 12.72f);
        pathBuilder2.curveTo(2.39f, 18.01f, 7.01f, 22.0f, 12.31f, 22.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.67f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-3.73f, 0.0f, -7.15f, -2.42f, -8.08f, -6.03f);
        pathBuilder3.curveToRelative(-1.49f, -5.8f, 3.91f, -11.21f, 9.71f, -9.71f);
        pathBuilder3.curveTo(17.58f, 5.18f, 20.0f, 8.6f, 20.0f, 12.33f);
        pathBuilder.verticalLineToRelative(1.1f);
        pathBuilder.curveToRelative(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f);
        pathBuilder.verticalLineToRelative(-1.25f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -2.51f, -1.78f, -4.77f, -4.26f, -5.12f);
        pathBuilder4.curveToRelative(-3.4f, -0.49f, -6.27f, 2.45f, -5.66f, 5.87f);
        pathBuilder4.curveToRelative(0.34f, 1.91f, 1.83f, 3.49f, 3.72f, 3.94f);
        pathBuilder4.curveToRelative(1.84f, 0.43f, 3.59f, -0.16f, 4.74f, -1.33f);
        pathBuilder4.curveToRelative(0.89f, 1.22f, 2.67f, 1.86f, 4.3f, 1.21f);
        pathBuilder4.curveToRelative(1.34f, -0.53f, 2.16f, -1.9f, 2.16f, -3.34f);
        pathBuilder.verticalLineToRelative(-1.09f);
        pathBuilder.curveToRelative(0.0f, -5.31f, -3.99f, -9.93f, -9.28f, -10.29f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _alternateEmail = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
