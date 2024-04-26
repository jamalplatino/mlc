package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_forward10", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forward10", "Landroidx/compose/material/icons/Icons$Filled;", "getForward10", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Forward10.kt */
public final class Forward10Kt {
    private static ImageVector _forward10;

    public static final ImageVector getForward10(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _forward10;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Filled.Forward10", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.86f, 15.94f);
        pathBuilder3.lineToRelative(0.0f, -4.27f);
        pathBuilder3.lineToRelative(-0.09f, 0.0f);
        pathBuilder3.lineToRelative(-1.77f, 0.63f);
        pathBuilder3.lineToRelative(0.0f, 0.69f);
        pathBuilder3.lineToRelative(1.01f, -0.31f);
        pathBuilder3.lineToRelative(0.0f, 3.26f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.25f, 13.44f);
        pathBuilder4.verticalLineToRelative(0.74f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
        pathBuilder5.curveToRelative(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
        pathBuilder4.verticalLineToRelative(-0.74f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.0f, -1.9f, -1.31f, -1.82f, -1.44f, -1.82f);
        pathBuilder6.curveTo(13.55f, 11.62f, 12.25f, 11.53f, 12.25f, 13.44f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.29f, 13.32f);
        pathBuilder4.verticalLineToRelative(0.97f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
        pathBuilder7.curveToRelative(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
        pathBuilder4.verticalLineToRelative(-0.97f);
        PathBuilder pathBuilder8 = pathBuilder4;
        pathBuilder8.curveToRelative(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
        pathBuilder8.curveTo(14.07f, 12.3f, 14.29f, 12.57f, 14.29f, 13.32f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _forward10 = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
