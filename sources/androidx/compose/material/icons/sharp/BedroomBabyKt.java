package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedroomBaby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomBaby", "Landroidx/compose/material/icons/Icons$Sharp;", "getBedroomBaby", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BedroomBaby.kt */
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Sharp.BedroomBaby", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.64f, 0.0f, -5.13f, -1.03f, -7.0f, -2.9f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder2.curveToRelative(0.34f, 0.34f, 0.71f, 0.65f, 1.1f, 0.92f);
        pathBuilder.lineTo(8.0f, 13.5f);
        pathBuilder.verticalLineTo(9.51f);
        pathBuilder.lineTo(6.45f, 10.5f);
        pathBuilder.lineToRelative(-0.95f, -1.0f);
        pathBuilder.lineTo(7.0f, 7.76f);
        pathBuilder.lineTo(6.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.65f);
        pathBuilder.lineToRelative(1.73f, 3.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(2.5f);
        pathBuilder.lineToRelative(0.84f, 1.46f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.39f, -0.28f, 0.76f, -0.58f, 1.1f, -0.92f);
        pathBuilder.lineTo(19.0f, 15.1f);
        pathBuilder3.curveTo(17.13f, 16.97f, 14.64f, 18.0f, 12.0f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(14.69f, 14.24f);
        pathBuilder4.curveToRelative(-1.74f, 0.65f, -3.66f, 0.65f, -5.4f, 0.0f);
        pathBuilder4.lineToRelative(-0.81f, 1.41f);
        pathBuilder4.lineToRelative(-0.03f, 0.06f);
        pathBuilder4.curveToRelative(1.1f, 0.52f, 2.28f, 0.79f, 3.53f, 0.79f);
        pathBuilder4.reflectiveCurveToRelative(2.45f, -0.28f, 3.55f, -0.79f);
        pathBuilder4.lineToRelative(-0.03f, -0.06f);
        pathBuilder4.lineTo(14.69f, 14.24f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bedroomBaby = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
