package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cyclone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cyclone", "Landroidx/compose/material/icons/Icons$Rounded;", "getCyclone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Cyclone.kt */
public final class CycloneKt {
    private static ImageVector _cyclone;

    public static final ImageVector getCyclone(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _cyclone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Cyclone", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 6.11f);
        pathBuilder3.lineTo(22.0f, 6.11f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f);
        pathBuilder4.curveTo(19.23f, 4.6f, 16.03f, 4.0f, 12.0f, 4.0f);
        pathBuilder4.curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f);
        pathBuilder4.curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f);
        pathBuilder4.curveTo(7.25f, 2.64f, 6.78f, 2.0f, 6.11f, 2.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder4.curveTo(5.66f, 2.0f, 5.26f, 2.3f, 5.14f, 2.74f);
        pathBuilder4.curveTo(4.6f, 4.77f, 4.0f, 7.97f, 4.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f);
        pathBuilder4.curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f);
        pathBuilder4.curveTo(2.64f, 16.75f, 2.0f, 17.22f, 2.0f, 17.89f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f);
        pathBuilder4.curveTo(4.77f, 19.4f, 7.97f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f);
        pathBuilder4.curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f);
        pathBuilder4.curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.46f, 0.0f, 0.86f, -0.3f, 0.97f, -0.74f);
        pathBuilder4.curveTo(19.4f, 19.23f, 20.0f, 16.03f, 20.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f);
        pathBuilder4.curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f);
        pathBuilder4.curveTo(21.36f, 7.25f, 22.0f, 6.78f, 22.0f, 6.11f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 18.0f);
        pathBuilder4.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder3.reflectiveCurveTo(15.31f, 18.0f, 12.0f, 18.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cyclone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
