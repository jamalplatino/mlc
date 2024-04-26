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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_closeFullscreen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CloseFullscreen", "Landroidx/compose/material/icons/Icons$Rounded;", "getCloseFullscreen", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CloseFullscreen.kt */
public final class CloseFullscreenKt {
    private static ImageVector _closeFullscreen;

    public static final ImageVector getCloseFullscreen(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _closeFullscreen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.CloseFullscreen", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 4.12f);
        pathBuilder.lineToRelative(-4.59f, 4.59f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(6.41f);
        pathBuilder2.curveToRelative(0.0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.lineToRelative(4.59f, -4.59f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(21.68f, 3.1f, 21.68f, 3.73f, 21.29f, 4.12f);
        pathBuilder.close();
        pathBuilder.moveTo(4.12f, 21.29f);
        pathBuilder.lineToRelative(4.59f, -4.59f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder2.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.41f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.lineToRelative(-4.59f, 4.59f);
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(3.1f, 21.68f, 3.73f, 21.68f, 4.12f, 21.29f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _closeFullscreen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
