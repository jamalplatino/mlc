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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_frontHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FrontHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getFrontHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FrontHand.kt */
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.FrontHand", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder2.curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f);
        pathBuilder2.curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f);
        pathBuilder2.curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f);
        pathBuilder2.curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f);
        pathBuilder2.curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f);
        pathBuilder2.curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f);
        pathBuilder.verticalLineToRelative(0.55f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f);
        pathBuilder3.curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(8.5f);
        pathBuilder3.curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f);
        pathBuilder.reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        pathBuilder.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(2.5f);
        pathBuilder.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        pathBuilder.verticalLineToRelative(8.92f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(15.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _frontHand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
