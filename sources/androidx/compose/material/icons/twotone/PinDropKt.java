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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinDrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PinDrop", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPinDrop", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PinDrop.kt */
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.PinDrop", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.19f, 3.0f, 6.0f, 5.11f, 6.0f, 9.13f);
        pathBuilder2.curveToRelative(0.0f, 2.68f, 2.0f, 5.49f, 6.0f, 8.44f);
        pathBuilder2.curveToRelative(4.0f, -2.95f, 6.0f, -5.77f, 6.0f, -8.44f);
        pathBuilder2.curveTo(18.0f, 5.11f, 14.81f, 3.0f, 12.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.93f, 0.0f, 5.0f, 1.4f, 5.0f, 5.15f);
        pathBuilder4.curveToRelative(0.0f, 2.16f, -1.72f, 4.67f, -5.0f, 7.32f);
        pathBuilder4.curveToRelative(-3.28f, -2.65f, -5.0f, -5.17f, -5.0f, -7.32f);
        pathBuilder4.curveTo(7.0f, 5.4f, 10.07f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.moveTo(12.0f, 2.0f);
        pathBuilder4.curveTo(8.73f, 2.0f, 5.0f, 4.46f, 5.0f, 9.15f);
        pathBuilder4.curveToRelative(0.0f, 3.12f, 2.33f, 6.41f, 7.0f, 9.85f);
        pathBuilder4.curveToRelative(4.67f, -3.44f, 7.0f, -6.73f, 7.0f, -9.85f);
        pathBuilder4.curveTo(19.0f, 4.46f, 15.27f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 7.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder5.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(5.0f, 20.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.verticalLineTo(20.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pinDrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
