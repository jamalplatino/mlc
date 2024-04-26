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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accessible", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Accessible", "Landroidx/compose/material/icons/Icons$Rounded;", "getAccessible", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Accessible.kt */
public final class AccessibleKt {
    private static ImageVector _accessible;

    public static final ImageVector getAccessible(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _accessible;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Accessible", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 11.9f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, -0.49f, -0.36f, -0.89f, -0.84f, -0.97f);
        pathBuilder4.curveToRelative(-1.25f, -0.21f, -2.43f, -0.88f, -3.23f, -1.76f);
        pathBuilder3.lineToRelative(-1.29f, -1.43f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-0.17f, -0.19f, -0.38f, -0.34f, -0.61f, -0.45f);
        pathBuilder5.curveToRelative(-0.01f, 0.0f, -0.01f, -0.01f, -0.02f, -0.01f);
        pathBuilder3.horizontalLineTo(13.0f);
        pathBuilder5.curveToRelative(-0.37f, -0.21f, -0.78f, -0.31f, -1.25f, -0.25f);
        pathBuilder5.curveTo(10.73f, 7.15f, 10.0f, 8.07f, 10.0f, 9.1f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-4.5f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-3.0f);
        pathBuilder3.verticalLineToRelative(-3.45f);
        pathBuilder6.curveToRelative(1.0f, 0.83f, 2.4f, 1.54f, 3.8f, 1.82f);
        pathBuilder6.curveToRelative(0.62f, 0.13f, 1.2f, -0.34f, 1.2f, -0.97f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.83f, 18.0f);
        pathBuilder6.curveToRelative(-0.41f, 1.16f, -1.52f, 2.0f, -2.83f, 2.0f);
        pathBuilder6.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder6.curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f);
        pathBuilder3.verticalLineTo(12.1f);
        pathBuilder6.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        pathBuilder6.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder6.curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f);
        pathBuilder3.horizontalLineToRelative(-2.07f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _accessible = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}