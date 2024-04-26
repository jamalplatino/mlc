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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cached", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cached", "Landroidx/compose/material/icons/Icons$Rounded;", "getCached", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Cached.kt */
public final class CachedKt {
    private static ImageVector _cached;

    public static final ImageVector getCached(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _cached;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Cached", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.65f, 8.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        pathBuilder.horizontalLineTo(18.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.curveToRelative(-0.79f, 0.0f, -1.56f, -0.15f, -2.25f, -0.44f);
        pathBuilder2.curveToRelative(-0.36f, -0.15f, -0.77f, -0.04f, -1.04f, 0.23f);
        pathBuilder2.curveToRelative(-0.51f, 0.51f, -0.33f, 1.37f, 0.34f, 1.64f);
        pathBuilder2.curveToRelative(0.91f, 0.37f, 1.91f, 0.57f, 2.95f, 0.57f);
        pathBuilder2.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder3.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder4.curveToRelative(0.79f, 0.0f, 1.56f, 0.15f, 2.25f, 0.44f);
        pathBuilder4.curveToRelative(0.36f, 0.15f, 0.77f, 0.04f, 1.04f, -0.23f);
        pathBuilder4.curveToRelative(0.51f, -0.51f, 0.33f, -1.37f, -0.34f, -1.64f);
        pathBuilder4.curveTo(14.04f, 4.2f, 13.04f, 4.0f, 12.0f, 4.0f);
        pathBuilder4.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(2.21f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder5.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder5.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cached = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
