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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_skateboarding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Skateboarding", "Landroidx/compose/material/icons/Icons$Rounded;", "getSkateboarding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Skateboarding.kt */
public final class SkateboardingKt {
    private static ImageVector _skateboarding;

    public static final ImageVector getSkateboarding(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _skateboarding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Skateboarding", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 4.1f, 13.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.25f, 22.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(6.84f, 24.0f, 7.25f, 24.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 23.66f, 8.0f, 23.25f);
        pathBuilder.reflectiveCurveTo(7.66f, 22.5f, 7.25f, 22.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.75f, 22.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(15.34f, 24.0f, 15.75f, 24.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(16.16f, 22.5f, 15.75f, 22.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.24f, 19.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.24f, 0.0f, -0.45f, 0.11f, -0.59f, 0.3f);
        pathBuilder2.curveToRelative(-0.55f, 0.73f, -1.42f, 1.2f, -2.4f, 1.2f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-4.88f);
        pathBuilder2.curveToRelative(0.0f, -0.69f, -0.36f, -1.34f, -0.95f, -1.7f);
        pathBuilder.lineToRelative(-3.37f, -2.08f);
        pathBuilder.lineToRelative(1.8f, -2.89f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.96f, 1.53f, 2.54f, 2.64f, 4.39f, 2.96f);
        pathBuilder3.curveToRelative(0.6f, 0.11f, 1.13f, -0.39f, 1.13f, -0.99f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.48f, -0.35f, -0.89f, -0.83f, -0.98f);
        pathBuilder3.curveToRelative(-1.49f, -0.28f, -2.72f, -1.29f, -3.3f, -2.64f);
        pathBuilder.lineToRelative(-0.52f, -1.21f);
        pathBuilder.curveTo(14.16f, 5.64f, 13.61f, 5.0f, 12.7f, 5.0f);
        pathBuilder.horizontalLineTo(8.11f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.33f, 0.36f, -1.7f, 0.94f);
        pathBuilder.lineTo(5.03f, 8.15f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(4.74f, 8.62f, 4.88f, 9.24f, 5.35f, 9.53f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.47f, 0.29f, 1.09f, 0.15f, 1.38f, -0.32f);
        pathBuilder.lineTo(8.1f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.lineToRelative(-2.4f, 3.84f);
        pathBuilder.curveToRelative(-0.31f, 0.5f, -0.39f, 1.11f, -0.21f, 1.67f);
        pathBuilder.lineToRelative(1.34f, 4.15f);
        pathBuilder.lineToRelative(-3.12f, 3.76f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.7f, -0.16f, -1.3f, -0.57f, -1.71f, -1.12f);
        pathBuilder5.curveTo(4.21f, 19.11f, 3.99f, 19.0f, 3.75f, 19.0f);
        pathBuilder5.curveTo(3.31f, 19.0f, 3.0f, 19.36f, 3.0f, 19.75f);
        pathBuilder5.curveToRelative(0.0f, 0.15f, 0.05f, 0.31f, 0.15f, 0.45f);
        pathBuilder5.curveToRelative(0.82f, 1.1f, 2.13f, 1.8f, 3.6f, 1.8f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder5.curveToRelative(1.47f, 0.0f, 2.78f, -0.7f, 3.6f, -1.8f);
        pathBuilder5.curveToRelative(0.1f, -0.14f, 0.15f, -0.3f, 0.15f, -0.45f);
        pathBuilder5.curveTo(20.0f, 19.36f, 19.68f, 19.0f, 19.24f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.5f);
        pathBuilder.horizontalLineTo(8.6f);
        pathBuilder.lineToRelative(2.21f, -2.67f);
        pathBuilder.curveToRelative(0.43f, -0.52f, 0.57f, -1.21f, 0.37f, -1.86f);
        pathBuilder.lineTo(10.5f, 13.7f);
        pathBuilder.lineToRelative(3.5f, 2.2f);
        pathBuilder.verticalLineTo(20.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _skateboarding = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
