package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeDown", "Landroidx/compose/material/icons/Icons$Outlined;", "getSwipeDown", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeDown.kt */
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.SwipeDown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.22f, 10.0f);
        pathBuilder.lineToRelative(-4.15f, 0.01f);
        pathBuilder.curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f);
        pathBuilder.lineToRelative(-0.59f, 0.26f);
        pathBuilder.lineTo(13.2f, 6.25f);
        pathBuilder.curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f);
        pathBuilder.reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f);
        pathBuilder.lineToRelative(3.3f, 7.45f);
        pathBuilder.lineToRelative(-1.87f, 0.39f);
        pathBuilder.curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f);
        pathBuilder.lineTo(8.0f, 19.19f);
        pathBuilder.lineToRelative(6.78f, 2.67f);
        pathBuilder.curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f);
        pathBuilder.lineToRelative(5.99f, -2.65f);
        pathBuilder.curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f);
        pathBuilder.lineToRelative(-1.36f, -5.34f);
        pathBuilder.curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.49f, 17.34f);
        pathBuilder.lineTo(15.5f, 20.0f);
        pathBuilder.lineToRelative(-4.92f, -1.96f);
        pathBuilder.lineToRelative(4.18f, -0.88f);
        pathBuilder.lineToRelative(-4.3f, -9.7f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        pathBuilder2.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        pathBuilder.lineToRelative(2.5f, 5.65f);
        pathBuilder.lineToRelative(1.61f, -0.71f);
        pathBuilder.lineTo(20.13f, 12.0f);
        pathBuilder.lineTo(21.49f, 17.34f);
        pathBuilder.close();
        pathBuilder.moveTo(3.8f, 12.18f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f);
        pathBuilder3.curveToRelative(0.0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f);
        pathBuilder.lineTo(7.2f, 3.07f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(5.82f, 4.85f, 5.0f, 7.08f, 5.0f, 9.5f);
        pathBuilder4.curveToRelative(0.0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f);
        pathBuilder.lineToRelative(1.62f, -1.62f);
        pathBuilder.lineTo(8.0f, 11.5f);
        pathBuilder.lineTo(4.5f, 15.0f);
        pathBuilder.lineTo(1.0f, 11.5f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(3.8f, 12.18f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _swipeDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
