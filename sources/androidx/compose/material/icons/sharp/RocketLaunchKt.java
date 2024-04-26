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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$Sharp;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RocketLaunch.kt */
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.RocketLaunch", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.19f, 6.35f);
        pathBuilder.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilder.lineTo(2.0f, 10.69f);
        pathBuilder.lineToRelative(4.81f, -4.81f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.close();
        pathBuilder.moveTo(11.17f, 17.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f);
        pathBuilder2.curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
        pathBuilder2.curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
        pathBuilder2.curveTo(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
        pathBuilder.lineTo(11.17f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.65f, 14.81f);
        pathBuilder2.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilder.lineTo(13.31f, 22.0f);
        pathBuilder.lineToRelative(4.81f, -4.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 18.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
        pathBuilder3.curveTo(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
        pathBuilder4.curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 10.1f, 13.0f, 9.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rocketLaunch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
