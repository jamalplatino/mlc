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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_selfImprovement", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SelfImprovement", "Landroidx/compose/material/icons/Icons$Outlined;", "getSelfImprovement", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SelfImprovement.kt */
public final class SelfImprovementKt {
    private static ImageVector _selfImprovement;

    public static final ImageVector getSelfImprovement(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _selfImprovement;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.SelfImprovement", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.0f, 16.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-2.24f, 0.0f, -4.16f, -0.96f, -5.6f, -2.68f);
        pathBuilder3.lineToRelative(-1.34f, -1.6f);
        pathBuilder4.curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f);
        pathBuilder3.horizontalLineToRelative(-1.05f);
        pathBuilder4.curveToRelative(-0.59f, 0.0f, -1.15f, 0.26f, -1.53f, 0.72f);
        pathBuilder3.lineToRelative(-1.34f, 1.6f);
        pathBuilder4.curveTo(7.16f, 13.04f, 5.24f, 14.0f, 3.0f, 14.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(2.77f, 0.0f, 5.19f, -1.17f, 7.0f, -3.25f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.lineToRelative(-3.88f, 1.55f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(5.45f, 16.82f, 5.0f, 17.48f, 5.0f, 18.21f);
        pathBuilder5.curveTo(5.0f, 19.2f, 5.8f, 20.0f, 6.79f, 20.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.verticalLineToRelative(-0.5f);
        pathBuilder5.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder5.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder3.reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f);
        pathBuilder3.horizontalLineToRelative(-3.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder3.verticalLineTo(20.0f);
        pathBuilder3.horizontalLineToRelative(7.21f);
        pathBuilder6.curveTo(18.2f, 20.0f, 19.0f, 19.2f, 19.0f, 18.21f);
        pathBuilder6.curveToRelative(0.0f, -0.73f, -0.45f, -1.39f, -1.12f, -1.66f);
        pathBuilder3.lineTo(14.0f, 15.0f);
        pathBuilder3.verticalLineToRelative(-2.25f);
        pathBuilder6.curveTo(15.81f, 14.83f, 18.23f, 16.0f, 21.0f, 16.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _selfImprovement = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
