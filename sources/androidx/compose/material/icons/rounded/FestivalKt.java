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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_festival", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Festival", "Landroidx/compose/material/icons/Icons$Rounded;", "getFestival", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Festival.kt */
public final class FestivalKt {
    private static ImageVector _festival;

    public static final ImageVector getFestival(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _festival;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Festival", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 11.0f);
        pathBuilder.verticalLineToRelative(-0.61f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.8f, -0.48f, -1.54f, -1.23f, -1.84f);
        pathBuilder2.curveToRelative(-3.65f, -1.48f, -6.81f, -3.93f, -8.48f, -5.37f);
        pathBuilder2.curveToRelative(-0.74f, -0.64f, -1.84f, -0.64f, -2.58f, 0.0f);
        pathBuilder2.curveTo(9.03f, 4.62f, 5.88f, 7.06f, 2.23f, 8.55f);
        pathBuilder2.curveTo(1.48f, 8.85f, 1.0f, 9.58f, 1.0f, 10.39f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder2.curveToRelative(0.0f, 1.49f, 0.93f, 2.75f, 2.24f, 3.26f);
        pathBuilder2.curveToRelative(-0.03f, 1.68f, -0.16f, 3.55f, -0.52f, 5.29f);
        pathBuilder2.curveTo(2.46f, 20.81f, 3.38f, 22.0f, 4.67f, 22.0f);
        pathBuilder.horizontalLineToRelative(14.67f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.29f, 0.0f, 2.21f, -1.19f, 1.95f, -2.45f);
        pathBuilder3.curveToRelative(-0.36f, -1.75f, -0.5f, -3.62f, -0.52f, -5.29f);
        pathBuilder3.curveTo(22.07f, 13.75f, 23.0f, 12.49f, 23.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.71f);
        pathBuilder.curveToRelative(1.33f, 1.14f, 3.49f, 2.84f, 6.11f, 4.29f);
        pathBuilder.horizontalLineTo(5.89f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(8.51f, 7.55f, 10.67f, 5.85f, 12.0f, 4.71f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder4.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(13.0f, 11.83f, 13.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 12.5f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(8.67f, 12.5f, 8.0f, 11.83f, 8.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder5.curveTo(11.0f, 11.83f, 10.33f, 12.5f, 9.5f, 12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 11.0f);
        pathBuilder5.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(3.0f, 11.83f, 3.0f, 11.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.66f, 20.0f);
        pathBuilder5.curveToRelative(0.39f, -1.86f, 0.54f, -3.82f, 0.57f, -5.58f);
        pathBuilder5.curveToRelative(0.68f, -0.15f, 1.29f, -0.49f, 1.76f, -0.98f);
        pathBuilder5.curveToRelative(0.25f, 0.25f, 0.54f, 0.45f, 0.85f, 0.62f);
        pathBuilder5.curveToRelative(-0.1f, 1.87f, -0.26f, 4.0f, -0.52f, 5.93f);
        pathBuilder.horizontalLineTo(4.66f);
        pathBuilder.close();
        pathBuilder.moveTo(9.35f, 20.0f);
        pathBuilder5.curveToRelative(0.24f, -1.83f, 0.39f, -3.78f, 0.48f, -5.53f);
        pathBuilder5.curveToRelative(0.84f, -0.08f, 1.61f, -0.45f, 2.17f, -1.02f);
        pathBuilder5.curveToRelative(0.56f, 0.57f, 1.32f, 0.94f, 2.17f, 1.02f);
        pathBuilder5.curveToRelative(0.1f, 1.75f, 0.24f, 3.7f, 0.48f, 5.53f);
        pathBuilder.horizontalLineTo(9.35f);
        pathBuilder.close();
        pathBuilder.moveTo(16.67f, 20.0f);
        pathBuilder5.curveToRelative(-0.27f, -1.94f, -0.43f, -4.07f, -0.52f, -5.93f);
        pathBuilder5.curveToRelative(0.31f, -0.17f, 0.61f, -0.37f, 0.85f, -0.62f);
        pathBuilder5.curveToRelative(0.47f, 0.48f, 1.08f, 0.83f, 1.76f, 0.98f);
        pathBuilder5.curveToRelative(0.03f, 1.76f, 0.18f, 3.72f, 0.57f, 5.58f);
        pathBuilder.horizontalLineTo(16.67f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 12.5f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder6.curveTo(21.0f, 11.83f, 20.33f, 12.5f, 19.5f, 12.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _festival = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
