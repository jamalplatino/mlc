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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nightlife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Nightlife", "Landroidx/compose/material/icons/Icons$Rounded;", "getNightlife", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Nightlife.kt */
public final class NightlifeKt {
    private static ImageVector _nightlife;

    public static final ImageVector getNightlife(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _nightlife;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Nightlife", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.87f, 5.0f);
        pathBuilder.horizontalLineToRelative(10.26f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.28f, 0.89f, 0.83f, 1.55f);
        pathBuilder.lineTo(9.0f, 14.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(2.04f, 6.55f);
        pathBuilder.curveTo(1.59f, 5.89f, 2.07f, 5.0f, 2.87f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.1f, 9.0f);
        pathBuilder.lineToRelative(1.4f, -2.0f);
        pathBuilder.horizontalLineTo(4.49f);
        pathBuilder.lineToRelative(1.4f, 2.0f);
        pathBuilder.horizontalLineTo(10.1f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(21.33f, 5.0f, 22.0f, 5.67f, 22.0f, 6.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveTo(22.0f, 7.33f, 21.33f, 8.0f, 20.5f, 8.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.0f, 1.84f, -1.64f, 3.28f, -3.54f, 2.95f);
        pathBuilder4.curveToRelative(-1.21f, -0.21f, -2.2f, -1.2f, -2.41f, -2.41f);
        pathBuilder4.curveTo(12.72f, 15.64f, 14.16f, 14.0f, 16.0f, 14.0f);
        pathBuilder4.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveTo(17.0f, 5.9f, 17.9f, 5.0f, 19.0f, 5.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nightlife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
