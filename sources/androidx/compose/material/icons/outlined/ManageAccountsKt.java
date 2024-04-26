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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_manageAccounts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageAccounts", "Landroidx/compose/material/icons/Icons$Outlined;", "getManageAccounts", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ManageAccounts.kt */
public final class ManageAccountsKt {
    private static ImageVector _manageAccounts;

    public static final ImageVector getManageAccounts(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _manageAccounts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.ManageAccounts", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-0.65f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.34f, 0.16f, -0.66f, 0.41f, -0.81f);
        pathBuilder2.curveTo(6.1f, 15.53f, 8.03f, 15.0f, 10.0f, 15.0f);
        pathBuilder2.curveToRelative(0.03f, 0.0f, 0.05f, 0.0f, 0.08f, 0.01f);
        pathBuilder2.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.98f);
        pathBuilder2.curveTo(10.45f, 13.01f, 10.23f, 13.0f, 10.0f, 13.0f);
        pathBuilder2.curveToRelative(-2.42f, 0.0f, -4.68f, 0.67f, -6.61f, 1.82f);
        pathBuilder2.curveTo(2.51f, 15.34f, 2.0f, 16.32f, 2.0f, 17.35f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(9.26f);
        pathBuilder.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.0f, 12.0f);
        pathBuilder3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder3.curveTo(7.79f, 4.0f, 6.0f, 5.79f, 6.0f, 8.0f);
        pathBuilder3.reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 6.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.75f, 16.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        pathBuilder4.lineToRelative(1.14f, -1.01f);
        pathBuilder4.lineToRelative(-1.0f, -1.73f);
        pathBuilder4.lineToRelative(-1.45f, 0.49f);
        pathBuilder5.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilder4.lineTo(18.0f, 11.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.lineToRelative(-0.3f, 1.49f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilder4.lineToRelative(-1.45f, -0.49f);
        pathBuilder4.lineToRelative(-1.0f, 1.73f);
        pathBuilder4.lineToRelative(1.14f, 1.01f);
        pathBuilder6.curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        pathBuilder4.reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f);
        pathBuilder4.lineToRelative(-1.14f, 1.01f);
        pathBuilder4.lineToRelative(1.0f, 1.73f);
        pathBuilder4.lineToRelative(1.45f, -0.49f);
        pathBuilder4.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilder4.lineTo(16.0f, 21.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.lineToRelative(0.3f, -1.49f);
        pathBuilder4.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilder4.lineToRelative(1.45f, 0.49f);
        pathBuilder4.lineToRelative(1.0f, -1.73f);
        pathBuilder4.lineToRelative(-1.14f, -1.01f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveTo(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(17.0f, 18.0f);
        pathBuilder7.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _manageAccounts = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
