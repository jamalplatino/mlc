package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shieldMoon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShieldMoon", "Landroidx/compose/material/icons/Icons$Outlined;", "getShieldMoon", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ShieldMoon.kt */
public final class ShieldMoonKt {
    private static ImageVector _shieldMoon;

    public static final ImageVector getShieldMoon(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _shieldMoon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.ShieldMoon", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder2.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.09f);
        pathBuilder2.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        pathBuilder2.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.lineToRelative(6.0f, -2.25f);
        pathBuilder.lineToRelative(6.0f, 2.25f);
        pathBuilder.verticalLineTo(11.09f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.01f, 14.33f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.75f, 2.17f, 5.12f, 2.24f, 6.96f, 0.07f);
        pathBuilder4.curveToRelative(0.23f, -0.27f, 0.08f, -0.68f, -0.26f, -0.74f);
        pathBuilder4.curveToRelative(-1.29f, -0.21f, -2.48f, -0.98f, -3.18f, -2.2f);
        pathBuilder4.curveToRelative(-0.71f, -1.22f, -0.78f, -2.63f, -0.32f, -3.86f);
        pathBuilder4.curveToRelative(0.12f, -0.33f, -0.16f, -0.66f, -0.51f, -0.6f);
        pathBuilder4.curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.01f, 14.33f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _shieldMoon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
