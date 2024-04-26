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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatFlatAngled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlatAngled", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirlineSeatFlatAngled", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AirlineSeatFlatAngled.kt */
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.AirlineSeatFlatAngled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 6.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f);
        pathBuilder2.curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f);
        pathBuilder2.curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f);
        pathBuilder2.curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f);
        pathBuilder2.curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f);
        pathBuilder2.curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f);
        pathBuilder2.curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f);
        pathBuilder.moveToRelative(6.47f, 2.11f);
        pathBuilder.lineToRelative(6.69f, 2.41f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f);
        pathBuilder3.curveToRelative(0.22f, 0.48f, 0.25f, 1.03f, 0.06f, 1.53f);
        pathBuilder.lineToRelative(-0.01f, 0.02f);
        pathBuilder.lineToRelative(-8.59f, -3.11f);
        pathBuilder.lineToRelative(0.7f, -1.9f);
        pathBuilder.moveTo(10.0f, 15.19f);
        pathBuilder.lineToRelative(4.0f, 1.44f);
        pathBuilder.lineTo(14.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-1.81f);
        pathBuilder.moveTo(6.0f, 4.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f);
        pathBuilder4.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilder4.curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f);
        pathBuilder4.curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f);
        pathBuilder4.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilder4.curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.28f, 6.05f);
        pathBuilder.lineTo(9.2f, 11.71f);
        pathBuilder.lineToRelative(12.36f, 4.47f);
        pathBuilder.lineToRelative(0.69f, -1.89f);
        pathBuilder.curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f);
        pathBuilder.lineToRelative(-8.56f, -3.09f);
        pathBuilder.close();
        pathBuilder.moveTo(2.19f, 10.25f);
        pathBuilder.lineToRelative(-0.69f, 1.89f);
        pathBuilder.lineTo(8.0f, 14.48f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-1.63f);
        pathBuilder.lineTo(20.52f, 19.0f);
        pathBuilder.lineToRelative(0.69f, -1.89f);
        pathBuilder.lineToRelative(-19.02f, -6.86f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _airlineSeatFlatAngled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}