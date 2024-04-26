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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_loyalty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Loyalty", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLoyalty", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Loyalty.kt */
public final class LoyaltyKt {
    private static ImageVector _loyalty;

    public static final ImageVector getLoyalty(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("TwoTone.Loyalty", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(9.0f, 9.01f);
        pathBuilder.lineTo(20.0f, 13.0f);
        pathBuilder.lineToRelative(-9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 8.0f);
        pathBuilder.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 8.0f, 6.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.7f);
        pathBuilder.lineToRelative(0.6f, -0.6f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.37f, -0.37f, 0.89f, -0.6f, 1.45f, -0.6f);
        pathBuilder2.curveToRelative(1.13f, 0.0f, 2.05f, 0.92f, 2.05f, 2.05f);
        pathBuilder2.curveToRelative(0.0f, 0.57f, -0.23f, 1.08f, -0.6f, 1.45f);
        pathBuilder.lineTo(13.0f, 17.5f);
        pathBuilder.lineTo(9.5f, 14.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.37f, -0.38f, -0.6f, -0.89f, -0.6f, -1.45f);
        pathBuilder3.curveToRelative(0.0f, -1.13f, 0.92f, -2.05f, 2.05f, -2.05f);
        pathBuilder3.curveToRelative(0.57f, 0.0f, 1.08f, 0.23f, 1.45f, 0.61f);
        pathBuilder.lineToRelative(0.6f, 0.59f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.41f, 11.58f);
        pathBuilder4.lineToRelative(-9.0f, -9.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(7.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        pathBuilder4.lineToRelative(9.0f, 9.0f);
        pathBuilder5.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        pathBuilder4.reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f);
        pathBuilder4.lineToRelative(7.0f, -7.0f);
        pathBuilder5.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilder4.reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 20.01f);
        pathBuilder4.lineTo(4.0f, 11.0f);
        pathBuilder4.verticalLineTo(4.0f);
        pathBuilder4.horizontalLineToRelative(7.0f);
        pathBuilder4.verticalLineToRelative(-0.01f);
        pathBuilder4.lineToRelative(9.0f, 9.0f);
        pathBuilder4.lineToRelative(-7.0f, 7.02f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(6.5f, 6.5f);
        pathBuilder6.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder7.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(8.9f, 12.55f);
        PathBuilder pathBuilder9 = pathBuilder8;
        pathBuilder9.curveToRelative(0.0f, 0.57f, 0.23f, 1.07f, 0.6f, 1.45f);
        pathBuilder8.lineToRelative(3.5f, 3.5f);
        pathBuilder8.lineToRelative(3.5f, -3.5f);
        pathBuilder9.curveToRelative(0.37f, -0.37f, 0.6f, -0.89f, 0.6f, -1.45f);
        pathBuilder9.curveToRelative(0.0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f);
        pathBuilder9.curveToRelative(-0.57f, 0.0f, -1.08f, 0.23f, -1.45f, 0.6f);
        pathBuilder8.lineToRelative(-0.6f, 0.6f);
        pathBuilder8.lineToRelative(-0.6f, -0.59f);
        pathBuilder9.curveToRelative(-0.37f, -0.38f, -0.89f, -0.61f, -1.45f, -0.61f);
        pathBuilder9.curveToRelative(-1.13f, 0.0f, -2.05f, 0.92f, -2.05f, 2.05f);
        pathBuilder8.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _loyalty = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
