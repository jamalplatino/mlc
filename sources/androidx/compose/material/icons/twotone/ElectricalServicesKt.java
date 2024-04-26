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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricalServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricalServices", "Landroidx/compose/material/icons/Icons$TwoTone;", "getElectricalServices", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ElectricalServices.kt */
public final class ElectricalServicesKt {
    private static ImageVector _electricalServices;

    public static final ImageVector getElectricalServices(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _electricalServices;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("TwoTone.ElectricalServices", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(21.0f, 14.55f, 20.55f, 15.0f, 20.0f, 15.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 19.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder4.curveTo(21.0f, 18.55f, 20.55f, 19.0f, 20.0f, 19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.0f, 12.0f);
        pathBuilder5.lineTo(14.0f, 12.0f);
        pathBuilder5.lineTo(14.0f, 12.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder5.verticalLineToRelative(0.0f);
        pathBuilder5.horizontalLineToRelative(-2.0f);
        pathBuilder5.verticalLineToRelative(4.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder5.horizontalLineToRelative(3.0f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder5.verticalLineToRelative(-8.0f);
        pathBuilder5.horizontalLineTo(14.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(4.0f, 5.0f);
        pathBuilder7.lineTo(4.0f, 5.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder7.horizontalLineToRelative(3.5f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveTo(9.33f, 6.0f, 10.0f, 6.67f, 10.0f, 7.5f);
        pathBuilder7.verticalLineToRelative(0.0f);
        pathBuilder8.curveTo(10.0f, 8.33f, 9.33f, 9.0f, 8.5f, 9.0f);
        pathBuilder7.horizontalLineTo(7.0f);
        pathBuilder8.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder7.verticalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder7.horizontalLineToRelative(2.0f);
        pathBuilder7.verticalLineToRelative(-2.0f);
        pathBuilder7.horizontalLineTo(7.0f);
        pathBuilder8.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder7.verticalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder7.horizontalLineToRelative(1.5f);
        pathBuilder8.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder7.verticalLineToRelative(0.0f);
        pathBuilder8.curveTo(12.0f, 5.57f, 10.43f, 4.0f, 8.5f, 4.0f);
        pathBuilder7.horizontalLineTo(5.0f);
        pathBuilder8.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _electricalServices = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
