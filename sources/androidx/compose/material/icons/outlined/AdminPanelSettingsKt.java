package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_adminPanelSettings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AdminPanelSettings", "Landroidx/compose/material/icons/Icons$Outlined;", "getAdminPanelSettings", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AdminPanelSettings.kt */
public final class AdminPanelSettingsKt {
    private static ImageVector _adminPanelSettings;

    public static final ImageVector getAdminPanelSettings(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _adminPanelSettings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.AdminPanelSettings", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 15.5f);
        pathBuilder.moveToRelative(-1.12f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.12f, 1.12f, 0.0f, true, true, 2.24f, 0.0f);
        pathBuilder2.arcToRelative(1.12f, 1.12f, 0.0f, true, true, -2.24f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 17.5f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.73f, 0.0f, -2.19f, 0.36f, -2.24f, 1.08f);
        pathBuilder4.curveToRelative(0.5f, 0.71f, 1.32f, 1.17f, 2.24f, 1.17f);
        pathBuilder3.reflectiveCurveToRelative(1.74f, -0.46f, 2.24f, -1.17f);
        pathBuilder3.curveTo(19.19f, 17.86f, 17.73f, 17.5f, 17.0f, 17.5f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(18.0f, 11.09f);
        pathBuilder5.verticalLineTo(6.27f);
        pathBuilder5.lineTo(10.5f, 3.0f);
        pathBuilder5.lineTo(3.0f, 6.27f);
        pathBuilder5.verticalLineToRelative(4.91f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.0f, 4.54f, 3.2f, 8.79f, 7.5f, 9.82f);
        pathBuilder6.curveToRelative(0.55f, -0.13f, 1.08f, -0.32f, 1.6f, -0.55f);
        pathBuilder6.curveTo(13.18f, 21.99f, 14.97f, 23.0f, 17.0f, 23.0f);
        pathBuilder6.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder6.curveTo(23.0f, 14.03f, 20.84f, 11.57f, 18.0f, 11.09f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.0f, 17.0f);
        pathBuilder6.curveToRelative(0.0f, 0.56f, 0.08f, 1.11f, 0.23f, 1.62f);
        pathBuilder6.curveToRelative(-0.24f, 0.11f, -0.48f, 0.22f, -0.73f, 0.3f);
        pathBuilder6.curveToRelative(-3.17f, -1.0f, -5.5f, -4.24f, -5.5f, -7.74f);
        pathBuilder5.verticalLineToRelative(-3.6f);
        pathBuilder5.lineToRelative(5.5f, -2.4f);
        pathBuilder5.lineToRelative(5.5f, 2.4f);
        pathBuilder5.verticalLineToRelative(3.51f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveTo(13.16f, 11.57f, 11.0f, 14.03f, 11.0f, 17.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 21.0f);
        pathBuilder7.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder7.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder5.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder7.curveTo(21.0f, 19.21f, 19.21f, 21.0f, 17.0f, 21.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _adminPanelSettings = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
