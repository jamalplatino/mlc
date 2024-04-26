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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pedalBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PedalBike", "Landroidx/compose/material/icons/Icons$Rounded;", "getPedalBike", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PedalBike.kt */
public final class PedalBikeKt {
    private static ImageVector _pedalBike;

    public static final ImageVector getPedalBike(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _pedalBike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PedalBike", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.18f, 10.0f);
        pathBuilder.lineToRelative(-1.7f, -4.68f);
        pathBuilder.curveTo(16.19f, 4.53f, 15.44f, 4.0f, 14.6f, 4.0f);
        pathBuilder.horizontalLineTo(13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.6f);
        pathBuilder.lineToRelative(1.46f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.81f);
        pathBuilder.lineToRelative(-0.36f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.09f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(7.45f, 7.0f, 7.0f, 7.45f, 7.0f, 8.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.lineToRelative(1.82f, 5.0f);
        pathBuilder.horizontalLineTo(9.9f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f);
        pathBuilder5.curveTo(2.45f, 9.87f, 0.0f, 12.2f, 0.0f, 15.0f);
        pathBuilder5.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder5.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.2f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilder6.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilder6.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilder.horizontalLineTo(18.18f);
        pathBuilder.close();
        pathBuilder.moveTo(7.82f, 16.0f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.42f, 1.23f, -1.6f, 2.08f, -3.02f, 1.99f);
        pathBuilder7.curveTo(3.31f, 17.9f, 2.07f, 16.64f, 2.0f, 15.14f);
        pathBuilder7.curveTo(1.93f, 13.39f, 3.27f, 12.0f, 5.0f, 12.0f);
        pathBuilder7.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(7.82f);
        pathBuilder.close();
        pathBuilder.moveTo(14.1f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.73f, -2.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.88f, 18.0f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f);
        pathBuilder9.curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f);
        pathBuilder.lineToRelative(0.62f, 1.7f);
        PathBuilder pathBuilder10 = pathBuilder;
        pathBuilder10.curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder10.curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f);
        pathBuilder.lineToRelative(-0.63f, -1.73f);
        PathBuilder pathBuilder11 = pathBuilder;
        pathBuilder11.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f);
        pathBuilder11.curveToRelative(1.72f, -0.04f, 3.08f, 1.29f, 3.08f, 3.0f);
        pathBuilder11.curveTo(22.0f, 16.72f, 20.62f, 18.06f, 18.88f, 18.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pedalBike = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
