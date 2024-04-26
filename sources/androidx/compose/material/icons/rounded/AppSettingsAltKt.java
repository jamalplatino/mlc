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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppSettingsAlt.kt */
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.AppSettingsAlt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.0f, 1.01f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.13f, -0.02f, -0.26f, -0.04f, -0.39f);
        pathBuilder.lineToRelative(0.64f, -0.48f);
        pathBuilder.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilder.lineToRelative(-0.57f, -0.96f);
        pathBuilder.curveToRelative(-0.13f, -0.21f, -0.39f, -0.3f, -0.62f, -0.2f);
        pathBuilder.lineToRelative(-0.72f, 0.3f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.2f, -0.15f, -0.42f, -0.29f, -0.65f, -0.39f);
        pathBuilder.lineToRelative(-0.1f, -0.77f);
        pathBuilder3.curveToRelative(-0.03f, -0.25f, -0.24f, -0.43f, -0.49f, -0.44f);
        pathBuilder.lineToRelative(-1.12f, -0.02f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.47f, 0.18f, -0.5f, 0.44f);
        pathBuilder.lineToRelative(-0.1f, 0.79f);
        pathBuilder.curveToRelative(-0.24f, 0.1f, -0.45f, 0.23f, -0.65f, 0.39f);
        pathBuilder.lineToRelative(-0.72f, -0.3f);
        pathBuilder.curveToRelative(-0.23f, -0.1f, -0.5f, -0.01f, -0.62f, 0.2f);
        pathBuilder.lineToRelative(-0.57f, 0.96f);
        pathBuilder.curveToRelative(-0.13f, 0.22f, -0.08f, 0.5f, 0.13f, 0.66f);
        pathBuilder.lineToRelative(0.64f, 0.48f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(15.02f, 11.74f, 15.0f, 11.87f, 15.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 0.13f, 0.02f, 0.25f, 0.04f, 0.37f);
        pathBuilder.lineToRelative(-0.64f, 0.49f);
        pathBuilder.curveToRelative(-0.2f, 0.15f, -0.26f, 0.43f, -0.13f, 0.65f);
        pathBuilder.lineToRelative(0.56f, 0.97f);
        pathBuilder.curveToRelative(0.13f, 0.22f, 0.39f, 0.31f, 0.63f, 0.21f);
        pathBuilder.lineToRelative(0.73f, -0.31f);
        pathBuilder.curveToRelative(0.2f, 0.16f, 0.42f, 0.3f, 0.67f, 0.4f);
        pathBuilder.lineToRelative(0.1f, 0.77f);
        pathBuilder.curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f);
        pathBuilder.horizontalLineToRelative(1.12f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.25f, 0.0f, 0.46f, -0.19f, 0.5f, -0.44f);
        pathBuilder.lineToRelative(0.1f, -0.77f);
        pathBuilder5.curveToRelative(0.24f, -0.1f, 0.46f, -0.24f, 0.67f, -0.4f);
        pathBuilder.lineToRelative(0.73f, 0.31f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.5f, 0.01f, 0.63f, -0.21f);
        pathBuilder.lineToRelative(0.56f, -0.97f);
        pathBuilder.curveToRelative(0.13f, -0.22f, 0.07f, -0.5f, -0.13f, -0.65f);
        pathBuilder.lineToRelative(-0.64f, -0.49f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(20.98f, 12.25f, 21.0f, 12.13f, 21.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.5f);
        pathBuilder6.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(18.83f, 13.5f, 18.0f, 13.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _appSettingsAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
