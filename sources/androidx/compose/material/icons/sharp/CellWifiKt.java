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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cellWifi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellWifi", "Landroidx/compose/material/icons/Icons$Sharp;", "getCellWifi", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CellWifi.kt */
public final class CellWifiKt {
    private static ImageVector _cellWifi;

    public static final ImageVector getCellWifi(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _cellWifi;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.CellWifi", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(5.97f);
        pathBuilder.lineTo(6.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-7.22f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.22f, 7.22f);
        pathBuilder.lineTo(3.93f, 5.93f);
        pathBuilder.curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f);
        pathBuilder.lineToRelative(-1.29f, 1.29f);
        pathBuilder.curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 11.07f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.lineToRelative(-1.93f, -1.93f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f);
        pathBuilder.close();
        pathBuilder.moveTo(14.22f, 9.79f);
        pathBuilder2.curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f);
        pathBuilder.lineTo(6.5f, 8.5f);
        pathBuilder.curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f);
        pathBuilder.lineTo(14.22f, 9.79f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cellWifi = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
