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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsRemote", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsRemote", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsRemote", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SettingsRemote.kt */
public final class SettingsRemoteKt {
    private static ImageVector _settingsRemote;

    public static final ImageVector getSettingsRemote(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _settingsRemote;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.SettingsRemote", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 9.0f);
        pathBuilder.horizontalLineTo(9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder2.curveTo(16.0f, 9.45f, 15.55f, 9.0f, 15.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.25f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.reflectiveCurveTo(12.69f, 14.25f, 12.0f, 14.25f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.82f, 6.82f);
        pathBuilder3.lineTo(7.82f, 6.82f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.35f, 0.35f, 0.9f, 0.38f, 1.3f, 0.1f);
        pathBuilder4.curveTo(9.93f, 6.34f, 10.93f, 6.0f, 12.0f, 6.0f);
        pathBuilder4.curveToRelative(1.07f, 0.0f, 2.07f, 0.34f, 2.88f, 0.91f);
        pathBuilder4.curveToRelative(0.4f, 0.28f, 0.95f, 0.26f, 1.3f, -0.09f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.43f, -0.43f, 0.39f, -1.15f, -0.09f, -1.5f);
        pathBuilder4.curveTo(14.94f, 4.49f, 13.53f, 4.0f, 12.0f, 4.0f);
        pathBuilder4.curveToRelative(-1.53f, 0.0f, -2.94f, 0.49f, -4.09f, 1.32f);
        pathBuilder4.curveTo(7.42f, 5.67f, 7.39f, 6.39f, 7.82f, 6.82f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 0.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveTo(9.36f, 0.0f, 6.94f, 0.93f, 5.05f, 2.47f);
        pathBuilder6.curveToRelative(-0.46f, 0.38f, -0.5f, 1.07f, -0.08f, 1.49f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f);
        pathBuilder6.curveTo(7.84f, 2.77f, 9.83f, 2.0f, 12.0f, 2.0f);
        pathBuilder6.curveToRelative(2.17f, 0.0f, 4.16f, 0.77f, 5.7f, 2.04f);
        pathBuilder6.curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f);
        pathBuilder6.curveTo(17.06f, 0.93f, 14.64f, 0.0f, 12.0f, 0.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settingsRemote = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
