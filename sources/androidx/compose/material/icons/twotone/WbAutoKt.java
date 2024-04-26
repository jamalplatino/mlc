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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbAuto", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWbAuto", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WbAuto.kt */
public final class WbAutoKt {
    private static ImageVector _wbAuto;

    public static final ImageVector getWbAuto(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.WbAuto", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(2.35f, 0.0f, 4.38f, -1.36f, 5.36f, -3.32f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder2.curveToRelative(0.4f, -0.81f, 0.63f, -1.71f, 0.63f, -2.67f);
        pathBuilder2.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.3f, 16.0f);
        pathBuilder.lineToRelative(-0.7f, -2.0f);
        pathBuilder.lineTo(6.4f, 14.0f);
        pathBuilder.lineToRelative(-0.7f, 2.0f);
        pathBuilder.lineTo(3.8f, 16.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(3.2f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.9f);
        pathBuilder.close();
        pathBuilder.moveTo(6.85f, 12.65f);
        pathBuilder.horizontalLineToRelative(2.3f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.0f, 7.0f);
        pathBuilder3.lineToRelative(-3.2f, 9.0f);
        pathBuilder3.horizontalLineToRelative(1.9f);
        pathBuilder3.lineToRelative(0.7f, -2.0f);
        pathBuilder3.horizontalLineToRelative(3.2f);
        pathBuilder3.lineToRelative(0.7f, 2.0f);
        pathBuilder3.horizontalLineToRelative(1.9f);
        pathBuilder3.lineTo(9.0f, 7.0f);
        pathBuilder3.lineTo(7.0f, 7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.85f, 12.65f);
        pathBuilder3.lineTo(8.0f, 9.0f);
        pathBuilder3.lineToRelative(1.15f, 3.65f);
        pathBuilder3.horizontalLineToRelative(-2.3f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.8f, 13.29f);
        pathBuilder3.lineTo(19.3f, 7.0f);
        pathBuilder3.horizontalLineToRelative(-1.6f);
        pathBuilder3.lineToRelative(-1.49f, 6.29f);
        pathBuilder3.lineTo(15.0f, 7.0f);
        pathBuilder3.horizontalLineToRelative(-0.76f);
        pathBuilder3.lineToRelative(-0.01f, 0.01f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(12.76f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f);
        pathBuilder4.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder3.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder4.curveToRelative(2.96f, 0.0f, 5.55f, -1.61f, 6.93f, -4.0f);
        pathBuilder4.curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f);
        pathBuilder4.curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f);
        pathBuilder3.lineToRelative(0.1f, 0.43f);
        pathBuilder3.lineTo(17.0f, 16.0f);
        pathBuilder3.lineToRelative(1.5f, -6.1f);
        pathBuilder3.lineTo(20.0f, 16.0f);
        pathBuilder3.horizontalLineToRelative(1.75f);
        pathBuilder3.lineToRelative(2.05f, -9.0f);
        pathBuilder3.lineTo(22.0f, 7.0f);
        pathBuilder3.lineToRelative(-1.2f, 6.29f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.37f, 14.67f);
        pathBuilder4.curveTo(12.38f, 16.64f, 10.35f, 18.0f, 8.0f, 18.0f);
        pathBuilder4.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder4.curveToRelative(0.0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wbAuto = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
