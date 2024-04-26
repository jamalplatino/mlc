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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrAuto", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrAuto", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HdrAuto.kt */
public final class HdrAutoKt {
    private static ImageVector _hdrAuto;

    public static final ImageVector getHdrAuto(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hdrAuto;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.HdrAuto", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.04f, 8.04f);
        pathBuilder.lineToRelative(-0.09f, 0.0f);
        pathBuilder.lineToRelative(-1.6f, 4.55f);
        pathBuilder.lineToRelative(3.29f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 16.41f);
        pathBuilder2.lineToRelative(-0.78f, -2.22f);
        pathBuilder2.horizontalLineTo(9.78f);
        pathBuilder2.lineToRelative(-0.79f, 2.22f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveTo(8.87f, 16.76f, 8.53f, 17.0f, 8.16f, 17.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.62f, 0.0f, -1.05f, -0.62f, -0.83f, -1.2f);
        pathBuilder2.lineToRelative(3.34f, -8.88f);
        pathBuilder3.curveTo(10.88f, 6.37f, 11.4f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.59f, 0.0f, 1.12f, 0.37f, 1.33f, 0.92f);
        pathBuilder2.lineToRelative(3.34f, 8.88f);
        pathBuilder3.curveToRelative(0.22f, 0.58f, -0.21f, 1.2f, -0.83f, 1.2f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(15.46f, 17.0f, 15.12f, 16.76f, 15.0f, 16.41f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hdrAuto = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
