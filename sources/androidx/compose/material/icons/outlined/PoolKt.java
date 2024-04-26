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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pool", "Landroidx/compose/material/icons/Icons$Outlined;", "getPool", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pool.kt */
public final class PoolKt {
    private static ImageVector _pool;

    public static final ImageVector getPool(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _pool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.Pool", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 8.0f);
        pathBuilder.lineToRelative(-3.25f, 3.25f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.31f, 0.12f, 0.56f, 0.27f, 0.77f, 0.39f);
        pathBuilder2.curveToRelative(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilder2.curveToRelative(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, 0.37f, 2.18f, 0.64f);
        pathBuilder2.curveToRelative(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilder2.curveToRelative(0.12f, -0.07f, 0.26f, -0.15f, 0.41f, -0.23f);
        pathBuilder.lineTo(10.48f, 5.0f);
        pathBuilder.curveTo(8.93f, 3.45f, 7.5f, 2.99f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.5f);
        pathBuilder.curveToRelative(1.82f, -0.01f, 2.89f, 0.39f, 4.0f, 1.5f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 16.5f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.horizontalLineToRelative(0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 15.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder3.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder3.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder3.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder3.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder3.curveToRelative(0.45f, 0.27f, 1.06f, 0.63f, 2.16f, 0.64f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder3.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder3.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder4.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder4.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder4.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.2f, -0.64f);
        pathBuilder4.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilder.close();
        pathBuilder.moveTo(18.67f, 18.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-1.11f, 0.0f, -1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder5.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder5.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder5.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder6.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder6.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilder6.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 0.78f, 0.13f, 1.15f, 0.36f);
        pathBuilder6.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder7.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder7.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder8.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder8.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder8.curveToRelative(-0.56f, 0.0f, -0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilder8.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(16.5f, 5.5f);
        pathBuilder9.moveToRelative(-2.5f, 0.0f);
        PathBuilder pathBuilder10 = pathBuilder9;
        pathBuilder10.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder10.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
