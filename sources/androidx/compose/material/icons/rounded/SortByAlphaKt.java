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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sortByAlpha", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SortByAlpha", "Landroidx/compose/material/icons/Icons$Rounded;", "getSortByAlpha", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SortByAlpha.kt */
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SortByAlpha", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.93f, 2.65f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-2.01f, 2.01f);
        pathBuilder.horizontalLineToRelative(4.72f);
        pathBuilder.lineToRelative(-2.0f, -2.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.23f, 21.35f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.98f, -1.98f);
        pathBuilder.horizontalLineToRelative(-4.66f);
        pathBuilder.lineToRelative(1.97f, 1.98f);
        pathBuilder.close();
        pathBuilder.moveTo(10.98f, 17.73f);
        pathBuilder.curveToRelative(0.6f, 0.0f, 1.01f, -0.6f, 0.79f, -1.16f);
        pathBuilder.lineTo(8.04f, 7.03f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f);
        pathBuilder2.curveToRelative(-0.49f, 0.0f, -0.94f, 0.3f, -1.12f, 0.76f);
        pathBuilder.lineToRelative(-3.74f, 9.53f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f);
        pathBuilder3.curveToRelative(0.35f, 0.0f, 0.67f, -0.22f, 0.8f, -0.55f);
        pathBuilder.lineToRelative(0.71f, -1.9f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.71f, 1.9f);
        pathBuilder.curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 13.64f);
        pathBuilder.lineToRelative(1.94f, -5.18f);
        pathBuilder.lineToRelative(1.94f, 5.18f);
        pathBuilder.lineTo(4.97f, 13.64f);
        pathBuilder.close();
        pathBuilder.moveTo(21.05f, 16.14f);
        pathBuilder.horizontalLineToRelative(-5.33f);
        pathBuilder.lineToRelative(5.72f, -8.29f);
        pathBuilder.curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f);
        pathBuilder.horizontalLineToRelative(-6.48f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.79f, 0.36f, -0.79f, 0.8f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f);
        pathBuilder.horizontalLineToRelative(5.09f);
        pathBuilder.lineToRelative(-5.73f, 8.28f);
        pathBuilder.curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f);
        pathBuilder.horizontalLineToRelative(6.72f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.44f, 0.0f, 0.79f, -0.36f, 0.79f, -0.79f);
        pathBuilder4.curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sortByAlpha = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
