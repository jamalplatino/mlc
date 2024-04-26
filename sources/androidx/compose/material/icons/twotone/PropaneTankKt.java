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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_propaneTank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PropaneTank", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPropaneTank", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PropaneTank.kt */
public final class PropaneTankKt {
    private static ImageVector _propaneTank;

    public static final ImageVector getPropaneTank(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _propaneTank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.PropaneTank", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 18.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.0f, 8.0f);
        pathBuilder3.horizontalLineTo(8.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder4.curveTo(18.0f, 8.9f, 17.1f, 8.0f, 16.0f, 8.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.0f, 6.14f);
        pathBuilder5.verticalLineTo(4.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder5.horizontalLineTo(9.0f);
        pathBuilder6.curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        pathBuilder5.verticalLineToRelative(2.14f);
        pathBuilder6.curveToRelative(-1.72f, 0.45f, -3.0f, 2.0f, -3.0f, 3.86f);
        pathBuilder5.verticalLineToRelative(8.0f);
        pathBuilder6.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder5.horizontalLineToRelative(8.0f);
        pathBuilder6.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder5.verticalLineToRelative(-8.0f);
        pathBuilder6.curveTo(20.0f, 8.14f, 18.72f, 6.59f, 17.0f, 6.14f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.0f, 4.0f);
        pathBuilder5.horizontalLineToRelative(6.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(-2.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder5.horizontalLineTo(9.0f);
        pathBuilder5.verticalLineTo(4.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 18.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder5.horizontalLineTo(8.0f);
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder5.verticalLineToRelative(-3.0f);
        pathBuilder5.horizontalLineToRelative(12.0f);
        pathBuilder5.verticalLineTo(18.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 13.0f);
        pathBuilder5.horizontalLineTo(6.0f);
        pathBuilder5.verticalLineToRelative(-3.0f);
        pathBuilder6.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder5.horizontalLineToRelative(8.0f);
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder5.verticalLineTo(13.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _propaneTank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
