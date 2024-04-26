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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_agriculture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Agriculture", "Landroidx/compose/material/icons/Icons$Outlined;", "getAgriculture", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Agriculture.kt */
public final class AgricultureKt {
    private static ImageVector _agriculture;

    public static final ImageVector getAgriculture(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _agriculture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.Agriculture", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f);
        pathBuilder2.curveTo(3.0f, 8.55f, 3.45f, 9.0f, 4.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 14.06f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-6.29f);
        pathBuilder3.lineToRelative(-1.06f, -1.06f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineToRelative(-0.71f, -0.71f);
        pathBuilder3.lineTo(9.82f, 6.35f);
        pathBuilder3.lineToRelative(0.71f, 0.71f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(13.0f, 6.71f);
        pathBuilder3.verticalLineTo(9.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.horizontalLineTo(8.96f);
        pathBuilder4.curveToRelative(-0.22f, -0.16f, -0.45f, -0.3f, -0.69f, -0.43f);
        pathBuilder3.lineToRelative(-0.4f, 0.89f);
        pathBuilder3.lineToRelative(-0.46f, -0.21f);
        pathBuilder3.lineToRelative(0.4f, -0.9f);
        pathBuilder4.curveTo(7.26f, 10.13f, 6.64f, 10.0f, 6.0f, 10.0f);
        pathBuilder4.curveToRelative(-0.53f, 0.0f, -1.04f, 0.11f, -1.52f, 0.26f);
        pathBuilder3.lineToRelative(0.34f, 0.91f);
        pathBuilder3.lineToRelative(-0.47f, 0.18f);
        pathBuilder3.lineTo(4.0f, 10.42f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f);
        pathBuilder3.lineToRelative(0.89f, 0.4f);
        pathBuilder3.lineToRelative(-0.21f, 0.46f);
        pathBuilder3.lineToRelative(-0.9f, -0.4f);
        pathBuilder5.curveTo(1.13f, 13.74f, 1.0f, 14.36f, 1.0f, 15.0f);
        pathBuilder5.curveToRelative(0.0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f);
        pathBuilder3.lineToRelative(0.91f, -0.34f);
        pathBuilder3.lineToRelative(0.18f, 0.47f);
        pathBuilder3.lineTo(1.42f, 17.0f);
        pathBuilder3.curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f);
        pathBuilder3.lineToRelative(0.4f, -0.89f);
        pathBuilder3.lineToRelative(0.46f, 0.21f);
        pathBuilder3.lineToRelative(-0.4f, 0.9f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveTo(4.74f, 19.87f, 5.36f, 20.0f, 6.0f, 20.0f);
        pathBuilder6.curveToRelative(0.53f, 0.0f, 1.04f, -0.11f, 1.52f, -0.26f);
        pathBuilder3.lineToRelative(-0.34f, -0.91f);
        pathBuilder3.lineToRelative(0.47f, -0.18f);
        pathBuilder3.lineTo(8.0f, 19.58f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f);
        pathBuilder3.lineToRelative(-0.89f, -0.4f);
        pathBuilder3.lineToRelative(0.21f, -0.46f);
        pathBuilder3.lineToRelative(0.9f, 0.4f);
        pathBuilder7.curveToRelative(0.1f, -0.26f, 0.18f, -0.54f, 0.24f, -0.82f);
        pathBuilder3.horizontalLineToRelative(5.16f);
        pathBuilder7.curveTo(16.03f, 16.16f, 16.0f, 16.33f, 16.0f, 16.5f);
        pathBuilder7.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder3.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        PathBuilder pathBuilder8 = pathBuilder3;
        pathBuilder8.curveTo(23.0f, 15.55f, 22.62f, 14.69f, 22.0f, 14.06f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.0f, 18.0f);
        pathBuilder8.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveTo(7.66f, 18.0f, 6.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.87f, 14.0f);
        pathBuilder3.curveToRelative(-0.04f, -0.18f, -0.08f, -0.35f, -0.13f, -0.52f);
        pathBuilder3.lineToRelative(-0.91f, 0.34f);
        pathBuilder3.lineToRelative(-0.18f, -0.47f);
        pathBuilder3.lineTo(10.58f, 13.0f);
        PathBuilder pathBuilder9 = pathBuilder3;
        pathBuilder9.curveToRelative(0.0f, 0.0f, 0.42f, 0.0f, 0.42f, 0.0f);
        pathBuilder9.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineToRelative(5.05f);
        pathBuilder9.curveTo(19.84f, 13.03f, 19.67f, 13.0f, 19.5f, 13.0f);
        pathBuilder9.curveToRelative(-0.95f, 0.0f, -1.81f, 0.38f, -2.44f, 1.0f);
        pathBuilder3.horizontalLineTo(10.87f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.5f, 18.0f);
        pathBuilder9.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder3.reflectiveCurveTo(20.33f, 18.0f, 19.5f, 18.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _agriculture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}