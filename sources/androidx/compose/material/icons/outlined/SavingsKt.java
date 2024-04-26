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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_savings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Savings", "Landroidx/compose/material/icons/Icons$Outlined;", "getSavings", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Savings.kt */
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Savings", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 10.55f, 15.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.5f);
        pathBuilder.verticalLineToRelative(6.97f);
        pathBuilder.lineToRelative(-2.82f, 0.94f);
        pathBuilder.lineTo(17.5f, 21.0f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-5.5f, 0.0f);
        pathBuilder.curveTo(4.5f, 21.0f, 2.0f, 12.54f, 2.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(4.46f, 4.0f, 7.5f, 4.0f);
        pathBuilder.lineToRelative(5.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.91f, -1.21f, 2.36f, -2.0f, 4.0f, -2.0f);
        pathBuilder2.curveTo(17.33f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, 0.21f, -0.04f, 0.4f, -0.12f, 0.58f);
        pathBuilder2.curveToRelative(-0.14f, 0.34f, -0.26f, 0.73f, -0.32f, 1.15f);
        pathBuilder.lineToRelative(2.27f, 2.27f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 9.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineTo(15.5f, 6.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f);
        pathBuilder3.curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f);
        pathBuilder.lineTo(7.5f, 6.0f);
        pathBuilder3.curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f);
        pathBuilder3.curveToRelative(0.0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.01f, 0.0f);
        pathBuilder.lineToRelative(1.55f, -5.15f);
        pathBuilder.lineTo(20.0f, 13.03f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _savings = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
