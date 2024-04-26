package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flightTakeoff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlightTakeoff", "Landroidx/compose/material/icons/Icons$Outlined;", "getFlightTakeoff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlightTakeoff.kt */
public final class FlightTakeoffKt {
    private static ImageVector _flightTakeoff;

    public static final ImageVector getFlightTakeoff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.FlightTakeoff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.07f, 9.64f);
        pathBuilder.curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        pathBuilder.lineTo(14.92f, 10.0f);
        pathBuilder.lineToRelative(-6.9f, -6.43f);
        pathBuilder.lineToRelative(-1.93f, 0.51f);
        pathBuilder.lineToRelative(4.14f, 7.17f);
        pathBuilder.lineToRelative(-4.97f, 1.33f);
        pathBuilder.lineToRelative(-1.97f, -1.54f);
        pathBuilder.lineToRelative(-1.45f, 0.39f);
        pathBuilder.lineToRelative(2.59f, 4.49f);
        pathBuilder.lineTo(21.0f, 11.49f);
        pathBuilder.curveToRelative(0.81f, -0.23f, 1.28f, -1.05f, 1.07f, -1.85f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flightTakeoff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
