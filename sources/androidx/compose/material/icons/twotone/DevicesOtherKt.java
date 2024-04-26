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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_devicesOther", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DevicesOther", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDevicesOther", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DevicesOther.kt */
public final class DevicesOtherKt {
    private static ImageVector _devicesOther;

    public static final ImageVector getDevicesOther(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _devicesOther;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.DevicesOther", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 16.0f);
        pathBuilder2.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(3.0f, 6.0f);
        pathBuilder4.horizontalLineToRelative(18.0f);
        pathBuilder4.lineTo(21.0f, 4.0f);
        pathBuilder4.lineTo(3.0f, 4.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.lineTo(3.0f, 18.0f);
        pathBuilder4.lineTo(3.0f, 6.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(22.0f, 8.0f);
        pathBuilder4.horizontalLineToRelative(-6.0f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        pathBuilder4.verticalLineToRelative(10.0f);
        pathBuilder6.curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(6.0f);
        pathBuilder6.curveToRelative(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        pathBuilder4.lineTo(23.0f, 9.0f);
        pathBuilder6.curveToRelative(0.0f, -0.5f, -0.5f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(21.0f, 18.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder4.verticalLineToRelative(-8.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineToRelative(8.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 12.0f);
        pathBuilder4.lineTo(9.0f, 12.0f);
        pathBuilder4.verticalLineToRelative(1.78f);
        pathBuilder6.curveToRelative(-0.61f, 0.55f, -1.0f, 1.33f, -1.0f, 2.22f);
        pathBuilder4.reflectiveCurveToRelative(0.39f, 1.67f, 1.0f, 2.22f);
        pathBuilder4.lineTo(9.0f, 20.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineToRelative(-1.78f);
        pathBuilder4.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        pathBuilder4.reflectiveCurveToRelative(-0.39f, -1.67f, -1.0f, -2.22f);
        pathBuilder4.lineTo(13.0f, 12.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(11.0f, 17.5f);
        pathBuilder4.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder4.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder4.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder4.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _devicesOther = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
