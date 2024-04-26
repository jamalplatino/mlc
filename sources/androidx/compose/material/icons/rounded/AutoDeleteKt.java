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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoDelete", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoDelete", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutoDelete", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoDelete.kt */
public final class AutoDeleteKt {
    private static ImageVector _autoDelete;

    public static final ImageVector getAutoDelete(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _autoDelete;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.AutoDelete", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.68f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.12f, 2.36f, 3.53f, 4.0f, 6.32f, 4.0f);
        pathBuilder3.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder3.curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder3.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(14.0f, 4.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.horizontalLineToRelative(-2.5f);
        pathBuilder4.lineToRelative(-0.71f, -0.71f);
        pathBuilder5.curveTo(10.61f, 1.11f, 10.35f, 1.0f, 10.09f, 1.0f);
        pathBuilder4.horizontalLineTo(5.91f);
        pathBuilder5.curveTo(5.65f, 1.0f, 5.39f, 1.11f, 5.21f, 1.29f);
        pathBuilder4.lineTo(4.5f, 2.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveTo(1.45f, 2.0f, 1.0f, 2.45f, 1.0f, 3.0f);
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineTo(14.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(15.75f, 12.0f);
        pathBuilder7.lineTo(15.75f, 12.0f);
        pathBuilder7.curveTo(15.34f, 12.0f, 15.0f, 12.34f, 15.0f, 12.75f);
        pathBuilder7.verticalLineToRelative(3.68f);
        pathBuilder7.curveToRelative(0.0f, 0.36f, 0.19f, 0.68f, 0.5f, 0.86f);
        pathBuilder7.lineToRelative(2.52f, 1.47f);
        pathBuilder7.curveToRelative(0.33f, 0.19f, 0.75f, 0.09f, 0.96f, -0.22f);
        pathBuilder7.verticalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.23f, -0.34f, 0.12f, -0.81f, -0.24f, -1.02f);
        pathBuilder7.lineTo(16.5f, 16.2f);
        pathBuilder7.verticalLineToRelative(-3.45f);
        pathBuilder7.curveTo(16.5f, 12.34f, 16.16f, 12.0f, 15.75f, 12.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoDelete = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
