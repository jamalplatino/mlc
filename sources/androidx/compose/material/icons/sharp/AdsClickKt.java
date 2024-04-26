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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_adsClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AdsClick", "Landroidx/compose/material/icons/Icons$Sharp;", "getAdsClick", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AdsClick.kt */
public final class AdsClickKt {
    private static ImageVector _adsClick;

    public static final ImageVector getAdsClick(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _adsClick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.AdsClick", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.71f, 17.99f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.53f, 17.84f, 6.0f, 15.22f, 6.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.curveToRelative(3.22f, 0.0f, 5.84f, 2.53f, 5.99f, 5.71f);
        pathBuilder.lineToRelative(-2.1f, -0.63f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(15.48f, 9.31f, 13.89f, 8.0f, 12.0f, 8.0f);
        pathBuilder3.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 1.89f, 1.31f, 3.48f, 3.08f, 3.89f);
        pathBuilder.lineTo(11.71f, 17.99f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 0.3f, -0.01f, 0.6f, -0.04f, 0.9f);
        pathBuilder.lineToRelative(-1.97f, -0.59f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(20.0f, 12.21f, 20.0f, 12.1f, 20.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.1f, 0.0f, 0.21f, 0.0f, 0.31f, -0.01f);
        pathBuilder.lineToRelative(0.59f, 1.97f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(12.6f, 21.99f, 12.3f, 22.0f, 12.0f, 22.0f);
        pathBuilder5.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder5.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.23f, 16.26f);
        pathBuilder.lineTo(22.0f, 15.0f);
        pathBuilder.lineToRelative(-10.0f, -3.0f);
        pathBuilder.lineToRelative(3.0f, 10.0f);
        pathBuilder.lineToRelative(1.26f, -3.77f);
        pathBuilder.lineToRelative(4.27f, 4.27f);
        pathBuilder.lineToRelative(1.98f, -1.98f);
        pathBuilder.lineTo(18.23f, 16.26f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _adsClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
