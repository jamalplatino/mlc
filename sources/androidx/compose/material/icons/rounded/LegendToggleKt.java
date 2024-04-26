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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_legendToggle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LegendToggle", "Landroidx/compose/material/icons/Icons$Rounded;", "getLegendToggle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LegendToggle.kt */
public final class LegendToggleKt {
    private static ImageVector _legendToggle;

    public static final ImageVector getLegendToggle(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _legendToggle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LegendToggle", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 15.0f);
        pathBuilder.horizontalLineTo(5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(20.0f, 14.55f, 19.55f, 15.0f, 19.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.horizontalLineTo(5.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveTo(20.0f, 17.45f, 19.55f, 17.0f, 19.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 11.0f);
        pathBuilder.lineToRelative(4.58f, -3.25f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(19.84f, 7.56f, 20.0f, 7.26f, 20.0f, 6.94f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, -0.81f, -0.92f, -1.29f, -1.58f, -0.82f);
        pathBuilder.lineTo(15.0f, 8.55f);
        pathBuilder.lineTo(10.0f, 5.0f);
        pathBuilder.lineTo(4.48f, 8.36f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(4.18f, 8.55f, 4.0f, 8.87f, 4.0f, 9.22f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.0f, 0.78f, 0.85f, 1.26f, 1.52f, 0.85f);
        pathBuilder.lineToRelative(4.4f, -2.68f);
        pathBuilder.lineTo(15.0f, 11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _legendToggle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
