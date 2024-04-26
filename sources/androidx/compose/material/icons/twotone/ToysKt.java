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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_toys", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Toys", "Landroidx/compose/material/icons/Icons$TwoTone;", "getToys", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Toys.kt */
public final class ToysKt {
    private static ImageVector _toys;

    public static final ImageVector getToys(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Toys", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.horizontalLineTo(6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.51f, 0.2f, 0.97f, 0.51f, 1.32f);
        pathBuilder2.curveTo(5.05f, 14.53f, 5.97f, 14.0f, 7.0f, 14.0f);
        pathBuilder2.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.37f);
        pathBuilder2.curveToRelative(0.41f, -1.16f, 1.51f, -2.0f, 2.82f, -2.0f);
        pathBuilder2.curveToRelative(1.03f, 0.0f, 1.95f, 0.53f, 2.49f, 1.32f);
        pathBuilder2.curveTo(19.8f, 14.97f, 20.0f, 14.51f, 20.0f, 14.0f);
        pathBuilder2.curveTo(20.0f, 12.9f, 19.1f, 12.0f, 18.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.75f, 10.08f);
        pathBuilder3.lineTo(17.4f, 6.05f);
        pathBuilder3.curveTo(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f);
        pathBuilder3.horizontalLineTo(9.44f);
        pathBuilder3.curveTo(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f);
        pathBuilder3.lineTo(5.81f, 8.4f);
        pathBuilder3.lineTo(4.41f, 7.0f);
        pathBuilder3.lineToRelative(0.29f, -0.29f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder3.lineToRelative(-2.0f, 2.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder5.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder3.lineTo(3.0f, 8.41f);
        pathBuilder3.lineToRelative(1.79f, 1.79f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveTo(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f);
        pathBuilder6.curveToRelative(0.0f, 1.49f, 0.83f, 2.78f, 2.05f, 3.47f);
        pathBuilder6.curveTo(4.27f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f);
        pathBuilder6.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder3.horizontalLineToRelative(4.37f);
        pathBuilder6.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilder6.curveToRelative(1.49f, 0.0f, 2.73f, -1.1f, 2.95f, -2.53f);
        pathBuilder6.curveTo(21.17f, 16.78f, 22.0f, 15.49f, 22.0f, 14.0f);
        pathBuilder6.curveTo(22.0f, 12.05f, 20.6f, 10.43f, 18.75f, 10.08f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(1.56f);
        pathBuilder3.curveToRelative(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f);
        pathBuilder3.lineTo(16.61f, 10.0f);
        pathBuilder3.horizontalLineTo(13.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.49f, 6.68f);
        pathBuilder3.curveTo(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f);
        pathBuilder3.horizontalLineTo(11.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineTo(7.41f);
        pathBuilder3.lineTo(7.39f, 9.98f);
        pathBuilder3.lineTo(8.49f, 6.68f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 18.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.0f, 18.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveTo(17.55f, 18.0f, 17.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.49f, 15.32f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveTo(18.95f, 14.53f, 18.03f, 14.0f, 17.0f, 14.0f);
        pathBuilder7.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        pathBuilder3.horizontalLineTo(9.82f);
        pathBuilder7.curveTo(9.4f, 14.84f, 8.3f, 14.0f, 7.0f, 14.0f);
        pathBuilder7.curveToRelative(-1.03f, 0.0f, -1.95f, 0.53f, -2.49f, 1.32f);
        pathBuilder7.curveTo(4.2f, 14.97f, 4.0f, 14.51f, 4.0f, 14.0f);
        pathBuilder7.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder7.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder7.curveTo(20.0f, 14.51f, 19.8f, 14.97f, 19.49f, 15.32f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _toys = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
