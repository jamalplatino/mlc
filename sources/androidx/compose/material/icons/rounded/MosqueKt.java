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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mosque", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Mosque", "Landroidx/compose/material/icons/Icons$Rounded;", "getMosque", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Mosque.kt */
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Mosque", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.29f, 0.0f, 0.57f, 0.06f, 0.84f, 0.13f);
        pathBuilder2.curveTo(17.93f, 7.8f, 18.0f, 7.46f, 18.0f, 7.09f);
        pathBuilder2.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.lineTo(7.74f, 3.84f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        pathBuilder3.curveTo(6.0f, 7.46f, 6.07f, 7.8f, 6.16f, 8.13f);
        pathBuilder3.curveTo(6.43f, 8.06f, 6.71f, 8.0f, 7.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(24.0f, 7.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder4.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        pathBuilder5.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder4.verticalLineTo(13.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.horizontalLineTo(7.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineTo(3.0f);
        pathBuilder4.verticalLineTo(8.72f);
        pathBuilder5.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder4.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        pathBuilder4.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder4.verticalLineTo(21.0f);
        pathBuilder4.horizontalLineToRelative(9.0f);
        pathBuilder4.verticalLineToRelative(-4.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(4.0f);
        pathBuilder4.horizontalLineToRelative(9.0f);
        pathBuilder4.verticalLineTo(8.72f);
        pathBuilder4.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _mosque = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
