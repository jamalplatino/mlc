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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localAirport", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalAirport", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalAirport", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalAirport.kt */
public final class LocalAirportKt {
    private static ImageVector _localAirport;

    public static final ImageVector getLocalAirport(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _localAirport;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LocalAirport", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.48f, 13.7f);
        pathBuilder.lineTo(13.5f, 9.0f);
        pathBuilder.verticalLineTo(3.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(-7.98f, 4.7f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(2.2f, 13.88f, 2.0f, 14.23f, 2.0f, 14.6f);
        pathBuilder3.curveToRelative(0.0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f);
        pathBuilder.lineToRelative(7.16f, -2.1f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(-2.26f, 1.35f);
        pathBuilder.curveTo(8.09f, 20.44f, 8.0f, 20.61f, 8.0f, 20.78f);
        pathBuilder.lineToRelative(0.0f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.08f);
        pathBuilder.curveToRelative(0.0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f);
        pathBuilder.lineToRelative(2.92f, -0.73f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(0.38f, 0.09f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.lineToRelative(0.42f, 0.11f);
        pathBuilder.lineToRelative(1.9f, 0.48f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(0.67f, 0.17f);
        pathBuilder.curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f);
        pathBuilder.verticalLineToRelative(-0.37f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-0.21f);
        pathBuilder.curveToRelative(0.0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f);
        pathBuilder.lineTo(13.5f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(7.16f, 2.1f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(21.33f, 15.8f, 22.0f, 15.3f, 22.0f, 14.6f);
        pathBuilder4.curveTo(22.0f, 14.23f, 21.8f, 13.88f, 21.48f, 13.7f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localAirport = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
