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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_houseboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Houseboat", "Landroidx/compose/material/icons/Icons$Sharp;", "getHouseboat", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Houseboat.kt */
public final class HouseboatKt {
    private static ImageVector _houseboat;

    public static final ImageVector getHouseboat(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Houseboat", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 16.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder2.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveTo(3.38f, 16.0f, 3.24f, 17.0f, 2.0f, 17.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        pathBuilder3.curveToRelative(1.18f, 0.0f, 1.45f, 1.0f, 3.35f, 1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder3.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        pathBuilder3.curveTo(14.1f, 17.0f, 13.95f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.34f, 11.34f);
        pathBuilder.lineTo(18.67f, 13.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineToRelative(1.32f, 0.97f);
        pathBuilder.lineTo(19.5f, 9.0f);
        pathBuilder.lineTo(12.0f, 3.5f);
        pathBuilder.lineTo(4.5f, 9.0f);
        pathBuilder.lineToRelative(1.18f, 1.61f);
        pathBuilder.lineTo(7.0f, 9.65f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineTo(5.33f);
        pathBuilder.lineToRelative(-1.66f, -1.66f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(4.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.lineToRelative(2.25f, -2.25f);
        pathBuilder.lineTo(20.34f, 11.34f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _houseboat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
