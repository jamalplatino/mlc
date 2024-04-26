package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsApplications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsApplications", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsApplications", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SettingsApplications.kt */
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Sharp.SettingsApplications", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.24f, -0.02f, 0.47f, -0.05f, 0.71f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        pathBuilder.lineToRelative(1.47f, 1.16f);
        pathBuilder.curveToRelative(0.14f, 0.1f, 0.23f, 0.18f, 0.23f, 0.18f);
        pathBuilder.lineToRelative(-1.7f, 2.94f);
        pathBuilder.lineToRelative(-2.02f, -0.8f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveToRelative(-0.37f, 0.29f, -0.77f, 0.53f, -1.21f, 0.71f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineToRelative(-0.27f, 1.85f);
        pathBuilder.curveToRelative(-0.02f, 0.17f, -0.04f, 0.3f, -0.04f, 0.3f);
        pathBuilder.horizontalLineToRelative(-3.4f);
        pathBuilder.lineToRelative(-0.31f, -2.15f);
        pathBuilder.lineTo(10.0f, 16.85f);
        pathBuilder.curveToRelative(-0.44f, -0.18f, -0.84f, -0.42f, -1.21f, -0.71f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.lineToRelative(-2.02f, 0.8f);
        pathBuilder.lineToRelative(-1.7f, -2.94f);
        pathBuilder.reflectiveCurveToRelative(0.1f, -0.08f, 0.23f, -0.18f);
        pathBuilder.lineToRelative(1.47f, -1.16f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.curveToRelative(-0.03f, -0.24f, -0.05f, -0.47f, -0.05f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(0.02f, -0.47f, 0.05f, -0.69f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.lineToRelative(-1.7f, -1.34f);
        pathBuilder.lineToRelative(1.7f, -2.95f);
        pathBuilder.lineToRelative(2.01f, 0.81f);
        pathBuilder.verticalLineToRelative(0.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.37f, -0.28f, 0.77f, -0.52f, 1.2f, -0.7f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.lineTo(10.3f, 5.0f);
        pathBuilder.horizontalLineToRelative(3.41f);
        pathBuilder.lineToRelative(0.3f, 2.15f);
        pathBuilder.lineTo(14.0f, 7.15f);
        pathBuilder3.curveToRelative(0.43f, 0.18f, 0.83f, 0.42f, 1.2f, 0.7f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.lineToRelative(2.01f, -0.81f);
        pathBuilder.lineToRelative(1.7f, 2.95f);
        pathBuilder.lineToRelative(-1.71f, 1.34f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder3.curveToRelative(0.04f, 0.22f, 0.06f, 0.45f, 0.06f, 0.69f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 12.0f);
        pathBuilder4.moveToRelative(-2.45f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.arcToRelative(2.45f, 2.45f, 0.0f, true, true, 4.9f, 0.0f);
        pathBuilder5.arcToRelative(2.45f, 2.45f, 0.0f, true, true, -4.9f, 0.0f);
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settingsApplications = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
