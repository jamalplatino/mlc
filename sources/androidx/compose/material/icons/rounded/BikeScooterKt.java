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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bikeScooter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BikeScooter", "Landroidx/compose/material/icons/Icons$Rounded;", "getBikeScooter", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BikeScooter.kt */
public final class BikeScooterKt {
    private static ImageVector _bikeScooter;

    public static final ImageVector getBikeScooter(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _bikeScooter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.BikeScooter", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(0.74f);
        pathBuilder.lineTo(8.82f, 5.56f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.61f, 4.65f, 7.8f, 4.0f, 6.87f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(3.45f, 4.0f, 3.0f, 4.45f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.87f);
        pathBuilder.lineToRelative(1.42f, 6.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f);
        pathBuilder3.curveTo(6.12f, 12.9f, 4.47f, 14.73f, 4.09f, 17.0f);
        pathBuilder.horizontalLineTo(0.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(6.0f, 15.79f, 7.79f, 14.0f, 10.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(18.75f, 8.0f);
        pathBuilder4.lineToRelative(-0.56f, 0.0f);
        pathBuilder4.lineToRelative(-1.35f, -3.69f);
        pathBuilder4.curveTo(16.55f, 3.52f, 15.8f, 3.0f, 14.96f, 3.0f);
        pathBuilder4.horizontalLineTo(12.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder4.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(2.96f);
        pathBuilder4.lineToRelative(1.1f, 3.0f);
        pathBuilder4.horizontalLineTo(10.4f);
        pathBuilder4.lineToRelative(0.46f, 2.0f);
        pathBuilder4.horizontalLineTo(15.0f);
        pathBuilder4.curveToRelative(-0.43f, 0.58f, -0.75f, 1.25f, -0.9f, 2.0f);
        pathBuilder4.horizontalLineToRelative(-2.79f);
        pathBuilder4.lineToRelative(0.46f, 2.0f);
        pathBuilder4.horizontalLineToRelative(2.33f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilder6.curveToRelative(3.16f, 0.15f, 5.88f, -2.83f, 5.12f, -6.1f);
        pathBuilder6.curveTo(23.34f, 9.57f, 21.13f, 8.0f, 18.75f, 8.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.88f, 16.0f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f);
        pathBuilder7.curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f);
        pathBuilder4.lineToRelative(0.62f, 1.7f);
        PathBuilder pathBuilder8 = pathBuilder4;
        pathBuilder8.curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f);
        pathBuilder4.lineToRelative(-0.63f, -1.73f);
        PathBuilder pathBuilder9 = pathBuilder4;
        pathBuilder9.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f);
        pathBuilder9.curveTo(20.64f, 9.96f, 22.0f, 11.29f, 22.0f, 13.0f);
        pathBuilder9.curveTo(22.0f, 14.72f, 20.62f, 16.06f, 18.88f, 16.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder10 = new PathBuilder();
        pathBuilder10.moveTo(10.0f, 15.0f);
        pathBuilder10.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder10.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder10.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder10.reflectiveCurveTo(11.66f, 15.0f, 10.0f, 15.0f);
        pathBuilder10.close();
        pathBuilder10.moveTo(10.0f, 19.0f);
        pathBuilder10.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder10.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder10.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder10.reflectiveCurveTo(10.55f, 19.0f, 10.0f, 19.0f);
        pathBuilder10.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder10.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bikeScooter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
