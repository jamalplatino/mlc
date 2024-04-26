package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_broadcastOnPersonal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BroadcastOnPersonal", "Landroidx/compose/material/icons/Icons$Sharp;", "getBroadcastOnPersonal", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BroadcastOnPersonal.kt */
public final class BroadcastOnPersonalKt {
    private static ImageVector _broadcastOnPersonal;

    public static final ImageVector getBroadcastOnPersonal(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _broadcastOnPersonal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Sharp.BroadcastOnPersonal", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 8.0f);
        pathBuilder.curveToRelative(0.7f, 0.0f, 1.38f, 0.1f, 2.02f, 0.27f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.lineTo(4.0f, 9.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(6.76f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.66f, 19.63f, 9.0f, 17.89f, 9.0f, 16.0f);
        pathBuilder2.curveTo(9.0f, 11.58f, 12.58f, 8.0f, 17.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 14.75f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder4.curveToRelative(0.0f, 0.4f, 0.2f, 0.75f, 0.5f, 0.97f);
        pathBuilder3.verticalLineTo(22.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.verticalLineToRelative(-5.03f);
        pathBuilder4.curveToRelative(0.3f, -0.23f, 0.5f, -0.57f, 0.5f, -0.97f);
        pathBuilder4.curveTo(18.25f, 15.31f, 17.69f, 14.75f, 17.0f, 14.75f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.0f, 12.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder5.lineToRelative(1.06f, -1.06f);
        pathBuilder6.curveToRelative(-0.45f, -0.45f, -0.73f, -1.08f, -0.73f, -1.77f);
        pathBuilder6.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder5.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(0.0f, 0.69f, -0.28f, 1.31f, -0.73f, 1.76f);
        pathBuilder5.lineToRelative(1.06f, 1.06f);
        pathBuilder7.curveTo(20.55f, 18.1f, 21.0f, 17.1f, 21.0f, 16.0f);
        pathBuilder7.curveTo(21.0f, 13.79f, 19.21f, 12.0f, 17.0f, 12.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(17.0f, 9.5f);
        PathBuilder pathBuilder9 = pathBuilder8;
        pathBuilder9.curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f);
        pathBuilder9.curveToRelative(0.0f, 1.79f, 0.73f, 3.42f, 1.9f, 4.6f);
        pathBuilder8.lineToRelative(1.06f, -1.06f);
        pathBuilder9.curveTo(12.56f, 18.63f, 12.0f, 17.38f, 12.0f, 16.0f);
        pathBuilder9.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder8.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        PathBuilder pathBuilder10 = pathBuilder8;
        pathBuilder10.curveToRelative(0.0f, 1.37f, -0.56f, 2.62f, -1.46f, 3.52f);
        pathBuilder8.lineToRelative(1.07f, 1.06f);
        pathBuilder10.curveToRelative(1.17f, -1.18f, 1.89f, -2.8f, 1.89f, -4.58f);
        pathBuilder10.curveTo(23.5f, 12.41f, 20.59f, 9.5f, 17.0f, 9.5f);
        pathBuilder8.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _broadcastOnPersonal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
