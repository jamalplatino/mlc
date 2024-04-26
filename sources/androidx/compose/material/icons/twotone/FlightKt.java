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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFlight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Flight.kt */
public final class FlightKt {
    private static ImageVector _flight;

    public static final ImageVector getFlight(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _flight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.Flight", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 19.0f);
        pathBuilder.lineToRelative(-2.0f, 1.5f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.lineToRelative(3.5f, -1.0f);
        pathBuilder.lineToRelative(3.5f, 1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.lineTo(13.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(8.0f, 2.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-8.0f, -5.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(-8.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(8.0f, -2.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}