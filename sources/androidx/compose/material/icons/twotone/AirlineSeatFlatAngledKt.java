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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatFlatAngled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlatAngled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAirlineSeatFlatAngled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AirlineSeatFlatAngled.kt */
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.AirlineSeatFlatAngled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 16.64f);
        pathBuilder.lineToRelative(-4.0f, -1.45f);
        pathBuilder.lineTo(10.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.15f, 0.0f, 0.3f, -0.03f, 0.44f, -0.1f);
        pathBuilder2.curveToRelative(0.49f, -0.24f, 0.7f, -0.84f, 0.46f, -1.34f);
        pathBuilder2.curveToRelative(-0.19f, -0.41f, -0.59f, -0.56f, -0.9f, -0.56f);
        pathBuilder2.curveToRelative(-0.15f, 0.0f, -0.3f, 0.03f, -0.44f, 0.1f);
        pathBuilder2.curveToRelative(-0.32f, 0.16f, -0.45f, 0.42f, -0.5f, 0.56f);
        pathBuilder2.curveToRelative(-0.05f, 0.15f, -0.12f, 0.44f, 0.04f, 0.77f);
        pathBuilder2.curveToRelative(0.2f, 0.42f, 0.59f, 0.57f, 0.9f, 0.57f);
        pathBuilder.close();
        pathBuilder.moveTo(19.16f, 11.02f);
        pathBuilder.lineToRelative(-6.69f, -2.41f);
        pathBuilder.lineToRelative(-0.7f, 1.91f);
        pathBuilder.lineToRelative(8.59f, 3.11f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.19f, -0.51f, 0.17f, -1.05f, -0.06f, -1.53f);
        pathBuilder3.curveToRelative(-0.23f, -0.5f, -0.63f, -0.87f, -1.15f, -1.06f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(1.5f, 12.14f);
        pathBuilder4.lineTo(8.0f, 14.48f);
        pathBuilder4.lineTo(8.0f, 19.0f);
        pathBuilder4.horizontalLineToRelative(8.0f);
        pathBuilder4.verticalLineToRelative(-1.63f);
        pathBuilder4.lineTo(20.52f, 19.0f);
        pathBuilder4.lineToRelative(0.69f, -1.89f);
        pathBuilder4.lineToRelative(-19.02f, -6.86f);
        pathBuilder4.lineToRelative(-0.69f, 1.89f);
        pathBuilder4.close();
        pathBuilder4.moveTo(10.0f, 15.19f);
        pathBuilder4.lineToRelative(4.0f, 1.44f);
        pathBuilder4.lineTo(14.0f, 17.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder4.verticalLineToRelative(-1.81f);
        pathBuilder4.close();
        pathBuilder4.moveTo(19.84f, 9.14f);
        pathBuilder4.lineToRelative(-8.56f, -3.09f);
        pathBuilder4.lineToRelative(-2.08f, 5.66f);
        pathBuilder4.lineToRelative(12.36f, 4.47f);
        pathBuilder4.lineToRelative(0.69f, -1.89f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.37f, 13.6f);
        pathBuilder4.lineToRelative(-0.01f, 0.02f);
        pathBuilder4.lineToRelative(-8.59f, -3.11f);
        pathBuilder4.lineToRelative(0.7f, -1.91f);
        pathBuilder4.lineToRelative(6.69f, 2.41f);
        pathBuilder5.curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f);
        pathBuilder5.curveToRelative(0.23f, 0.49f, 0.25f, 1.04f, 0.06f, 1.54f);
        pathBuilder4.close();
        pathBuilder4.moveTo(6.0f, 10.5f);
        pathBuilder5.curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f);
        pathBuilder5.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilder5.curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f);
        pathBuilder5.curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f);
        pathBuilder5.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilder5.curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f);
        pathBuilder4.close();
        pathBuilder4.moveTo(5.06f, 7.16f);
        pathBuilder5.curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f);
        pathBuilder5.curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f);
        pathBuilder5.curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f);
        pathBuilder5.curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f);
        pathBuilder5.curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f);
        pathBuilder5.curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f);
        pathBuilder5.curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _airlineSeatFlatAngled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
