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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_powerSettingsNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PowerSettingsNew", "Landroidx/compose/material/icons/Icons$Rounded;", "getPowerSettingsNew", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PowerSettingsNew.kt */
public final class PowerSettingsNewKt {
    private static ImageVector _powerSettingsNew;

    public static final ImageVector getPowerSettingsNew(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _powerSettingsNew;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PowerSettingsNew", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(13.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.14f, 5.86f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.38f, 1.0f, -0.01f, 1.39f);
        pathBuilder2.curveToRelative(1.13f, 1.2f, 1.83f, 2.8f, 1.87f, 4.57f);
        pathBuilder2.curveToRelative(0.09f, 3.83f, -3.08f, 7.13f, -6.91f, 7.17f);
        pathBuilder2.curveTo(8.18f, 19.05f, 5.0f, 15.9f, 5.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.84f, 0.71f, -3.51f, 1.87f, -4.76f);
        pathBuilder2.curveToRelative(0.37f, -0.39f, 0.37f, -1.0f, -0.01f, -1.38f);
        pathBuilder2.curveToRelative(-0.4f, -0.4f, -1.05f, -0.39f, -1.43f, 0.02f);
        pathBuilder2.curveTo(3.98f, 7.42f, 3.07f, 9.47f, 3.0f, 11.74f);
        pathBuilder2.curveToRelative(-0.14f, 4.88f, 3.83f, 9.1f, 8.71f, 9.25f);
        pathBuilder2.curveToRelative(5.1f, 0.16f, 9.29f, -3.93f, 9.29f, -9.0f);
        pathBuilder2.curveToRelative(0.0f, -2.37f, -0.92f, -4.51f, -2.42f, -6.11f);
        pathBuilder2.curveToRelative(-0.38f, -0.41f, -1.04f, -0.42f, -1.44f, -0.02f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _powerSettingsNew = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
