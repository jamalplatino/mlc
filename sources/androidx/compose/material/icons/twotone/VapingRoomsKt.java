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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vapingRooms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapingRooms", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVapingRooms", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VapingRooms.kt */
public final class VapingRoomsKt {
    private static ImageVector _vapingRooms;

    public static final ImageVector getVapingRooms(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.VapingRooms", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 17.5f);
        pathBuilder.moveToRelative(-0.5f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f);
        pathBuilder2.arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(2.0f, 16.5f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder4.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineTo(16.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(22.0f, 16.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineTo(8.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.horizontalLineTo(22.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.0f, 17.5f);
        pathBuilder3.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder3.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        pathBuilder3.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder3.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(22.0f, 12.76f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.horizontalLineToRelative(-1.5f);
        pathBuilder3.verticalLineToRelative(-2.23f);
        pathBuilder3.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        pathBuilder3.verticalLineTo(7.2f);
        pathBuilder3.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        pathBuilder3.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        pathBuilder3.verticalLineTo(2.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        pathBuilder5.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        pathBuilder5.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.5f, 13.36f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.horizontalLineTo(18.0f);
        pathBuilder3.verticalLineToRelative(-1.3f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        pathBuilder3.horizontalLineTo(14.5f);
        pathBuilder6.curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f);
        pathBuilder3.verticalLineToRelative(1.5f);
        pathBuilder3.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        pathBuilder3.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        pathBuilder3.horizontalLineToRelative(1.53f);
        pathBuilder3.curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _vapingRooms = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
