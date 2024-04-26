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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pestControl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PestControl", "Landroidx/compose/material/icons/Icons$Outlined;", "getPestControl", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PestControl.kt */
public final class PestControlKt {
    private static ImageVector _pestControl;

    public static final ImageVector getPestControl(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _pestControl;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.PestControl", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.07f);
        pathBuilder.curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f);
        pathBuilder.lineToRelative(2.58f, -1.49f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.lineTo(16.92f, 10.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f);
        pathBuilder2.curveToRelative(0.1f, -0.56f, 0.2f, -1.69f, -0.58f, -2.89f);
        pathBuilder.lineTo(17.0f, 4.17f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.72f, 1.72f);
        pathBuilder.curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f);
        pathBuilder.lineTo(8.41f, 2.76f);
        pathBuilder.lineTo(7.0f, 4.17f);
        pathBuilder.lineToRelative(1.65f, 1.65f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.78f, 1.2f, -0.68f, 2.34f, -0.58f, 2.89f);
        pathBuilder3.curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f);
        pathBuilder.lineTo(4.71f, 8.63f);
        pathBuilder.lineToRelative(-1.0f, 1.73f);
        pathBuilder.lineToRelative(2.58f, 1.49f);
        pathBuilder.curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.07f);
        pathBuilder.curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f);
        pathBuilder.lineToRelative(-2.58f, 1.49f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.lineTo(7.08f, 18.0f);
        pathBuilder.curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f);
        pathBuilder.lineToRelative(2.37f, 1.37f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.lineToRelative(-2.58f, -1.49f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder4.curveToRelative(0.88f, 0.0f, 1.62f, 0.57f, 1.88f, 1.36f);
        pathBuilder4.curveTo(13.29f, 7.13f, 12.66f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-1.29f, 0.13f, -1.88f, 0.36f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(10.38f, 6.57f, 11.12f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder5.curveToRelative(-2.21f, 0.0f, -4.0f, -2.24f, -4.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -5.0f, 4.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 2.24f, 4.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(14.21f, 19.0f, 12.0f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(11.0f, 11.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineToRelative(6.0f);
        pathBuilder6.horizontalLineToRelative(-2.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pestControl = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
