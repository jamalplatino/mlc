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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatReclineExtra", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatReclineExtra", "Landroidx/compose/material/icons/Icons$Sharp;", "getAirlineSeatReclineExtra", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AirlineSeatReclineExtra.kt */
public final class AirlineSeatReclineExtraKt {
    private static ImageVector _airlineSeatReclineExtra;

    public static final ImageVector getAirlineSeatReclineExtra(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _airlineSeatReclineExtra;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.AirlineSeatReclineExtra", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.35f, 5.64f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f);
        pathBuilder2.curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f);
        pathBuilder2.curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f);
        pathBuilder2.curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 19.0f);
        pathBuilder.lineTo(6.5f, 19.0f);
        pathBuilder.lineTo(4.0f, 7.0f);
        pathBuilder.lineTo(2.0f, 7.0f);
        pathBuilder.lineToRelative(2.85f, 14.0f);
        pathBuilder.lineTo(16.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.23f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.88f);
        pathBuilder.lineToRelative(-1.03f, -4.1f);
        pathBuilder.curveToRelative(1.58f, 0.89f, 3.28f, 1.54f, 5.15f, 1.22f);
        pathBuilder.lineTo(15.47f, 9.99f);
        pathBuilder.curveToRelative(-1.63f, 0.31f, -3.44f, -0.27f, -4.69f, -1.25f);
        pathBuilder.lineTo(9.14f, 7.47f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f);
        pathBuilder3.curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f);
        pathBuilder.lineTo(7.44f, 18.0f);
        pathBuilder.horizontalLineToRelative(9.24f);
        pathBuilder.lineToRelative(3.82f, 3.0f);
        pathBuilder.lineToRelative(1.5f, -1.5f);
        pathBuilder.lineToRelative(-5.77f, -4.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _airlineSeatReclineExtra = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
