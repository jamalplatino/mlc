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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_houseboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Houseboat", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHouseboat", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Houseboat.kt */
public final class HouseboatKt {
    private static ImageVector _houseboat;

    public static final ImageVector getHouseboat(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Houseboat", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -4.82f);
        pathBuilder.lineToRelative(3.0f, -2.2f);
        pathBuilder.lineToRelative(3.0f, 2.2f);
        pathBuilder.lineToRelative(0.0f, 4.82f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 16.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder3.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder3.curveTo(3.38f, 16.0f, 3.24f, 17.0f, 2.0f, 17.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilder3.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder3.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(1.18f, 0.0f, 1.45f, 1.0f, 3.35f, 1.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder4.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder4.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        pathBuilder4.curveTo(14.1f, 17.0f, 13.95f, 16.0f, 12.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.34f, 11.34f);
        pathBuilder2.lineToRelative(-1.37f, 1.37f);
        pathBuilder4.curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f);
        pathBuilder2.horizontalLineTo(17.0f);
        pathBuilder2.verticalLineTo(9.65f);
        pathBuilder2.lineToRelative(1.32f, 0.97f);
        pathBuilder2.lineTo(19.5f, 9.0f);
        pathBuilder2.lineTo(12.0f, 3.5f);
        pathBuilder2.lineTo(4.5f, 9.0f);
        pathBuilder2.lineToRelative(1.18f, 1.61f);
        pathBuilder2.lineTo(7.0f, 9.65f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineTo(5.74f);
        pathBuilder2.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        pathBuilder2.lineToRelative(-1.37f, -1.37f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.37f, 1.37f);
        PathBuilder pathBuilder5 = pathBuilder2;
        pathBuilder5.curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f);
        pathBuilder2.horizontalLineToRelative(12.51f);
        pathBuilder5.curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f);
        pathBuilder2.lineToRelative(1.37f, -1.37f);
        pathBuilder2.lineTo(20.34f, 11.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.verticalLineTo(8.18f);
        pathBuilder2.lineToRelative(3.0f, -2.2f);
        pathBuilder2.lineToRelative(3.0f, 2.2f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _houseboat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
