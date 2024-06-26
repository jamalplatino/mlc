package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_supervisorAccount", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SupervisorAccount", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSupervisorAccount", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SupervisorAccount.kt */
public final class SupervisorAccountKt {
    private static ImageVector _supervisorAccount;

    public static final ImageVector getSupervisorAccount(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _supervisorAccount;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.SupervisorAccount", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 8.5f);
        pathBuilder.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.77f, 17.0f);
        pathBuilder3.horizontalLineToRelative(4.28f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.01f, -0.06f, 0.12f, -0.58f, 0.29f, -0.99f);
        pathBuilder4.curveToRelative(-0.11f, 0.0f, -0.23f, -0.01f, -0.34f, -0.01f);
        pathBuilder4.curveToRelative(-1.53f, 0.0f, -3.25f, 0.5f, -4.23f, 1.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(9.0f, 12.0f);
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder5.reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f);
        pathBuilder5.reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f);
        pathBuilder5.reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.0f, 7.0f);
        pathBuilder5.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder5.reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder5.reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.05f, 17.0f);
        pathBuilder5.lineTo(4.77f, 17.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.99f, -0.5f, 2.7f, -1.0f, 4.23f, -1.0f);
        pathBuilder6.curveToRelative(0.11f, 0.0f, 0.23f, 0.01f, 0.34f, 0.01f);
        pathBuilder6.curveToRelative(0.34f, -0.73f, 0.93f, -1.33f, 1.64f, -1.81f);
        pathBuilder6.curveToRelative(-0.73f, -0.13f, -1.42f, -0.2f, -1.98f, -0.2f);
        pathBuilder6.curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        pathBuilder5.lineTo(2.0f, 19.0f);
        pathBuilder5.horizontalLineToRelative(7.0f);
        pathBuilder5.verticalLineToRelative(-1.5f);
        pathBuilder6.curveToRelative(0.0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f);
        pathBuilder5.close();
        pathBuilder5.moveTo(16.5f, 14.5f);
        pathBuilder6.curveToRelative(-1.84f, 0.0f, -5.5f, 1.01f, -5.5f, 3.0f);
        pathBuilder5.lineTo(11.0f, 19.0f);
        pathBuilder5.horizontalLineToRelative(11.0f);
        pathBuilder5.verticalLineToRelative(-1.5f);
        pathBuilder6.curveToRelative(0.0f, -1.99f, -3.66f, -3.0f, -5.5f, -3.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.71f, 12.68f);
        pathBuilder6.curveToRelative(0.76f, -0.43f, 1.29f, -1.24f, 1.29f, -2.18f);
        pathBuilder6.curveTo(19.0f, 9.12f, 17.88f, 8.0f, 16.5f, 8.0f);
        pathBuilder5.reflectiveCurveTo(14.0f, 9.12f, 14.0f, 10.5f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(0.0f, 0.94f, 0.53f, 1.75f, 1.29f, 2.18f);
        pathBuilder7.curveToRelative(0.36f, 0.2f, 0.77f, 0.32f, 1.21f, 0.32f);
        pathBuilder5.reflectiveCurveToRelative(0.85f, -0.12f, 1.21f, -0.32f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _supervisorAccount = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
