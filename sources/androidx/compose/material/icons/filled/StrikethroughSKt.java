package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_strikethroughS", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StrikethroughS", "Landroidx/compose/material/icons/Icons$Filled;", "getStrikethroughS", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StrikethroughS.kt */
public final class StrikethroughSKt {
    private static ImageVector _strikethroughS;

    public static final ImageVector getStrikethroughS(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _strikethroughS;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.StrikethroughS", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.85f, 7.08f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.85f, 4.37f, 9.45f, 3.0f, 12.24f, 3.0f);
        pathBuilder2.curveToRelative(1.64f, 0.0f, 3.0f, 0.49f, 3.9f, 1.28f);
        pathBuilder2.curveToRelative(0.77f, 0.65f, 1.46f, 1.73f, 1.46f, 3.24f);
        pathBuilder.horizontalLineToRelative(-3.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f);
        pathBuilder3.curveToRelative(-0.29f, -0.86f, -1.2f, -1.28f, -2.25f, -1.28f);
        pathBuilder3.curveToRelative(-1.86f, 0.0f, -2.34f, 1.02f, -2.34f, 1.7f);
        pathBuilder3.curveToRelative(0.0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f);
        pathBuilder3.curveTo(10.97f, 8.55f, 11.36f, 8.78f, 12.0f, 9.0f);
        pathBuilder.horizontalLineTo(7.39f);
        pathBuilder.curveTo(7.18f, 8.66f, 6.85f, 8.11f, 6.85f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.62f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.15f, 0.45f, 1.96f, 0.75f, 1.96f, 1.97f);
        pathBuilder4.curveToRelative(0.0f, 1.0f, -0.81f, 1.67f, -2.28f, 1.67f);
        pathBuilder4.curveToRelative(-1.54f, 0.0f, -2.93f, -0.54f, -2.93f, -2.51f);
        pathBuilder.horizontalLineTo(6.4f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f);
        pathBuilder5.curveToRelative(0.81f, 2.29f, 3.29f, 3.3f, 5.67f, 3.3f);
        pathBuilder5.curveToRelative(2.27f, 0.0f, 5.3f, -0.89f, 5.3f, -4.05f);
        pathBuilder5.curveToRelative(0.0f, -0.3f, -0.01f, -1.16f, -0.48f, -1.94f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _strikethroughS = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
