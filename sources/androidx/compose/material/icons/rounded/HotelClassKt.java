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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hotelClass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HotelClass", "Landroidx/compose/material/icons/Icons$Rounded;", "getHotelClass", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HotelClass.kt */
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.HotelClass", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.58f, 10.0f);
        pathBuilder.horizontalLineTo(2.56f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.69f, 0.62f, -0.29f, 0.91f);
        pathBuilder.lineToRelative(4.91f, 3.51f);
        pathBuilder.lineToRelative(-1.89f, 6.1f);
        pathBuilder.curveToRelative(-0.14f, 0.46f, 0.39f, 0.84f, 0.78f, 0.55f);
        pathBuilder.lineTo(11.0f, 17.31f);
        pathBuilder.lineToRelative(4.93f, 3.75f);
        pathBuilder.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilder.lineToRelative(-1.89f, -6.1f);
        pathBuilder.lineToRelative(4.91f, -3.51f);
        pathBuilder.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilder.horizontalLineToRelative(-6.02f);
        pathBuilder.lineToRelative(-1.95f, -6.42f);
        pathBuilder.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        pathBuilder.lineTo(8.58f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.9f, 20.51f);
        pathBuilder.lineToRelative(-1.4f, -4.52f);
        pathBuilder.lineToRelative(2.91f, -2.08f);
        pathBuilder.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilder.horizontalLineToRelative(-1.88f);
        pathBuilder.lineToRelative(-3.08f, 2.2f);
        pathBuilder.lineToRelative(1.46f, 4.72f);
        pathBuilder.lineToRelative(1.5f, 1.14f);
        pathBuilder.curveTo(20.51f, 21.35f, 21.04f, 20.97f, 20.9f, 20.51f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.0f);
        pathBuilder.lineToRelative(-1.34f, -4.42f);
        pathBuilder.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        pathBuilder.lineToRelative(-0.57f, 1.87f);
        pathBuilder.lineTo(14.91f, 8.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hotelClass = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
