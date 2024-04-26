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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_helpOutline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HelpOutline", "Landroidx/compose/material/icons/Icons$Rounded;", "getHelpOutline", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HelpOutline.kt */
public final class HelpOutlineKt {
    private static ImageVector _helpOutline;

    public static final ImageVector getHelpOutline(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _helpOutline;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.HelpOutline", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.61f, 6.04f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.06f, -0.3f, -3.88f, 0.97f, -4.43f, 2.79f);
        pathBuilder2.curveToRelative(-0.18f, 0.58f, 0.26f, 1.17f, 0.87f, 1.17f);
        pathBuilder.horizontalLineToRelative(0.2f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.41f, 0.0f, 0.74f, -0.29f, 0.88f, -0.67f);
        pathBuilder3.curveToRelative(0.32f, -0.89f, 1.27f, -1.5f, 2.3f, -1.28f);
        pathBuilder3.curveToRelative(0.95f, 0.2f, 1.65f, 1.13f, 1.57f, 2.1f);
        pathBuilder3.curveToRelative(-0.1f, 1.34f, -1.62f, 1.63f, -2.45f, 2.88f);
        pathBuilder3.curveToRelative(0.0f, 0.01f, -0.01f, 0.01f, -0.01f, 0.02f);
        pathBuilder3.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.05f);
        pathBuilder3.curveToRelative(-0.09f, 0.15f, -0.18f, 0.32f, -0.25f, 0.5f);
        pathBuilder3.curveToRelative(-0.01f, 0.03f, -0.03f, 0.05f, -0.04f, 0.08f);
        pathBuilder3.curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.02f, 0.07f);
        pathBuilder3.curveToRelative(-0.12f, 0.34f, -0.2f, 0.75f, -0.2f, 1.25f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(0.0f, -0.42f, 0.11f, -0.77f, 0.28f, -1.07f);
        pathBuilder3.curveToRelative(0.02f, -0.03f, 0.03f, -0.06f, 0.05f, -0.09f);
        pathBuilder3.curveToRelative(0.08f, -0.14f, 0.18f, -0.27f, 0.28f, -0.39f);
        pathBuilder3.curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.03f, -0.04f);
        pathBuilder3.curveToRelative(0.1f, -0.12f, 0.21f, -0.23f, 0.33f, -0.34f);
        pathBuilder3.curveToRelative(0.96f, -0.91f, 2.26f, -1.65f, 1.99f, -3.56f);
        pathBuilder3.curveToRelative(-0.24f, -1.74f, -1.61f, -3.21f, -3.35f, -3.47f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _helpOutline = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
