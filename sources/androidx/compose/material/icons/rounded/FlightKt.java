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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flight", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlight", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Flight.kt */
public final class FlightKt {
    private static ImageVector _flight;

    public static final ImageVector getFlight(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _flight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Flight", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 14.58f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.36f, -0.19f, -0.69f, -0.49f, -0.89f);
        pathBuilder.lineTo(13.0f, 9.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(-7.51f, 4.69f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.3f, 0.19f, -0.49f, 0.53f, -0.49f, 0.89f);
        pathBuilder3.curveToRelative(0.0f, 0.7f, 0.68f, 1.21f, 1.36f, 1.0f);
        pathBuilder.lineTo(10.0f, 13.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(-1.8f, 1.35f);
        pathBuilder.curveToRelative(-0.13f, 0.09f, -0.2f, 0.24f, -0.2f, 0.4f);
        pathBuilder.verticalLineToRelative(0.59f);
        pathBuilder.curveToRelative(0.0f, 0.33f, 0.32f, 0.57f, 0.64f, 0.48f);
        pathBuilder.lineTo(11.5f, 21.0f);
        pathBuilder.lineToRelative(2.86f, 0.82f);
        pathBuilder.curveToRelative(0.32f, 0.09f, 0.64f, -0.15f, 0.64f, -0.48f);
        pathBuilder.verticalLineToRelative(-0.59f);
        pathBuilder.curveToRelative(0.0f, -0.16f, -0.07f, -0.31f, -0.2f, -0.4f);
        pathBuilder.lineTo(13.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(6.64f, 2.08f);
        pathBuilder.curveToRelative(0.68f, 0.21f, 1.36f, -0.3f, 1.36f, -1.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
