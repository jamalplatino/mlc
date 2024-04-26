package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Swipe", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSwipe", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Swipe.kt */
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.Swipe", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.13f, 3.87f);
        pathBuilder.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        pathBuilder.lineTo(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        pathBuilder.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.lineTo(20.13f, 3.87f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 13.68f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.curveTo(12.0f, 7.22f, 11.78f, 7.0f, 11.5f, 7.0f);
        pathBuilder2.reflectiveCurveTo(11.0f, 7.22f, 11.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(10.61f);
        pathBuilder2.lineToRelative(-4.17f, -0.89f);
        pathBuilder2.lineToRelative(3.7f, 3.78f);
        pathBuilder2.horizontalLineToRelative(6.55f);
        pathBuilder2.lineTo(18.0f, 15.56f);
        pathBuilder2.lineToRelative(-4.24f, -1.89f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.89f, 13.77f);
        pathBuilder3.lineToRelative(-3.8f, -1.67f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilder3.horizontalLineTo(14.0f);
        pathBuilder3.verticalLineTo(7.63f);
        pathBuilder4.curveToRelative(0.0f, -1.32f, -0.96f, -2.5f, -2.27f, -2.62f);
        pathBuilder4.curveTo(10.25f, 4.88f, 9.0f, 6.05f, 9.0f, 7.5f);
        pathBuilder3.verticalLineToRelative(8.15f);
        pathBuilder3.lineToRelative(-1.87f, -0.4f);
        pathBuilder3.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder3.lineTo(4.0f, 17.22f);
        pathBuilder3.lineToRelative(5.12f, 5.19f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilder3.horizontalLineToRelative(6.55f);
        pathBuilder5.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder3.lineToRelative(0.92f, -5.44f);
        pathBuilder5.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.08f, 21.0f);
        pathBuilder3.horizontalLineToRelative(-6.55f);
        pathBuilder3.lineToRelative(-3.7f, -3.78f);
        pathBuilder3.lineTo(11.0f, 18.11f);
        pathBuilder3.verticalLineTo(7.5f);
        pathBuilder3.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder3.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder3.verticalLineToRelative(6.18f);
        pathBuilder3.horizontalLineToRelative(1.76f);
        pathBuilder3.lineTo(18.0f, 15.56f);
        pathBuilder3.lineTo(17.08f, 21.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _swipe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
