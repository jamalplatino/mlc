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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dry", "Landroidx/compose/material/icons/Icons$Rounded;", "getDry", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Dry.kt */
public final class DryKt {
    private static ImageVector _dry;

    public static final ImageVector getDry(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _dry;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Dry", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.94f, 11.79f);
        pathBuilder.curveTo(1.34f, 12.36f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.lineToRelative(13.68f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder2.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder2.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(7.18f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder3.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder3.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(8.18f, 0.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder4.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder4.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(6.18f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder5.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.lineToRelative(1.49f, -2.61f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilder6.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder.lineTo(9.81f, 5.71f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f);
        pathBuilder.lineTo(1.94f, 11.79f);
        pathBuilder.close();
        pathBuilder.moveTo(16.99f, 8.07f);
        pathBuilder7.curveToRelative(0.0f, 0.52f, -0.42f, 0.93f, -0.93f, 0.93f);
        pathBuilder7.curveToRelative(-0.52f, 0.0f, -0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilder.lineToRelative(-0.07f, -0.06f);
        pathBuilder7.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveTo(13.0f, 2.42f, 13.42f, 2.0f, 13.93f, 2.0f);
        pathBuilder7.curveToRelative(0.51f, 0.0f, 0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilder.lineToRelative(0.07f, 0.07f);
        pathBuilder7.curveTo(16.55f, 5.74f, 17.03f, 6.88f, 16.99f, 8.07f);
        pathBuilder.lineTo(16.99f, 8.07f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 8.07f);
        pathBuilder7.curveTo(21.0f, 8.58f, 20.58f, 9.0f, 20.06f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilder.lineToRelative(-0.07f, -0.06f);
        pathBuilder8.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(0.0f, -0.51f, 0.42f, -0.93f, 0.93f, -0.93f);
        pathBuilder.reflectiveCurveToRelative(0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilder.lineToRelative(0.07f, 0.07f);
        pathBuilder9.curveTo(20.55f, 5.74f, 21.03f, 6.88f, 21.0f, 8.07f);
        pathBuilder.lineTo(21.0f, 8.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dry = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
