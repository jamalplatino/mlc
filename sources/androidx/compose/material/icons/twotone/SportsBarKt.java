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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsBar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsBar", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSportsBar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsBar.kt */
public final class SportsBarKt {
    private static ImageVector _sportsBar;

    public static final ImageVector getSportsBar(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _sportsBar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.SportsBar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineToRelative(0.0f, -6.63f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.26f, -0.34f, 2.11f, -1.27f, 2.77f, -1.99f);
        pathBuilder2.curveTo(11.6f, 9.47f, 12.08f, 9.0f, 13.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 10.5f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f);
        pathBuilder.lineToRelative(0.8f, -0.27f);
        pathBuilder.lineToRelative(0.36f, -0.76f);
        pathBuilder2.curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f);
        pathBuilder2.curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f);
        pathBuilder.lineToRelative(0.78f, 0.65f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f);
        pathBuilder2.curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f);
        pathBuilder2.curveTo(7.0f, 10.5f, 7.0f, 10.5f, 7.0f, 10.5f);
        pathBuilder.lineTo(7.0f, 10.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 19.0f);
        pathBuilder3.horizontalLineTo(8.0f);
        pathBuilder3.lineToRelative(0.0f, -6.63f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.26f, -0.34f, 2.11f, -1.27f, 2.77f, -1.99f);
        pathBuilder4.curveTo(11.6f, 9.47f, 12.08f, 9.0f, 13.0f, 9.0f);
        pathBuilder3.lineToRelative(2.0f, 0.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 2.02f);
        pathBuilder4.curveToRelative(-1.89f, 0.0f, -3.51f, 1.11f, -4.27f, 2.71f);
        pathBuilder4.curveTo(4.15f, 5.26f, 3.0f, 6.74f, 3.0f, 8.5f);
        pathBuilder4.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        pathBuilder3.lineTo(6.0f, 21.0f);
        pathBuilder3.horizontalLineToRelative(11.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineToRelative(-6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-1.56f);
        pathBuilder4.curveTo(17.79f, 8.41f, 18.0f, 7.73f, 18.0f, 7.0f);
        pathBuilder4.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder4.curveToRelative(-0.34f, 0.0f, -0.66f, 0.05f, -0.98f, 0.13f);
        pathBuilder4.curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10.0f, 2.02f);
        pathBuilder3.lineTo(10.0f, 2.02f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 10.5f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder4.curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f);
        pathBuilder3.lineToRelative(0.8f, -0.27f);
        pathBuilder3.lineToRelative(0.36f, -0.76f);
        pathBuilder4.curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f);
        pathBuilder4.curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f);
        pathBuilder3.lineToRelative(0.78f, 0.65f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f);
        pathBuilder4.curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f);
        pathBuilder4.curveTo(7.0f, 10.5f, 7.0f, 10.5f, 7.0f, 10.5f);
        pathBuilder3.lineTo(7.0f, 10.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.0f, 17.0f);
        pathBuilder3.verticalLineToRelative(-6.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(6.0f);
        pathBuilder3.horizontalLineTo(17.0f);
        pathBuilder3.lineTo(17.0f, 17.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsBar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
