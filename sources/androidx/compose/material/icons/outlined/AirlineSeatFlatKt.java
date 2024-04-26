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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatFlat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlat", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirlineSeatFlat", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AirlineSeatFlat.kt */
public final class AirlineSeatFlatKt {
    private static ImageVector _airlineSeatFlat;

    public static final ImageVector getAirlineSeatFlat(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _airlineSeatFlat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.AirlineSeatFlat", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.78f, 0.0f, 1.55f, -0.3f, 2.14f, -0.9f);
        pathBuilder2.curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f);
        pathBuilder2.curveTo(6.51f, 7.29f, 5.75f, 7.0f, 5.0f, 7.0f);
        pathBuilder2.curveToRelative(-0.78f, 0.0f, -1.55f, 0.3f, -2.14f, 0.9f);
        pathBuilder2.curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f);
        pathBuilder2.curveToRelative(0.59f, 0.57f, 1.35f, 0.86f, 2.1f, 0.86f);
        pathBuilder.close();
        pathBuilder.moveTo(4.29f, 9.3f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f);
        pathBuilder3.curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.7f, 0.28f);
        pathBuilder3.curveToRelative(0.4f, 0.39f, 0.4f, 1.01f, 0.02f, 1.41f);
        pathBuilder3.curveToRelative(-0.2f, 0.2f, -0.45f, 0.31f, -0.72f, 0.31f);
        pathBuilder3.curveToRelative(-0.26f, 0.0f, -0.51f, -0.1f, -0.7f, -0.28f);
        pathBuilder3.curveToRelative(-0.4f, -0.4f, -0.4f, -1.02f, -0.01f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.lineTo(9.0f, 7.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 11.0f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(2.0f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _airlineSeatFlat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
