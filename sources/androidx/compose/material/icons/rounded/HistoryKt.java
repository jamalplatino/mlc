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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_history", "Landroidx/compose/ui/graphics/vector/ImageVector;", "History", "Landroidx/compose/material/icons/Icons$Rounded;", "getHistory", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: History.kt */
public final class HistoryKt {
    private static ImageVector _history;

    public static final ImageVector getHistory(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _history;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.History", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.26f, 3.0f);
        pathBuilder.curveTo(8.17f, 2.86f, 4.0f, 6.95f, 4.0f, 12.0f);
        pathBuilder.lineTo(2.21f, 12.0f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.8f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.8f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.lineTo(6.0f, 12.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -3.9f, 3.18f, -7.05f, 7.1f, -7.0f);
        pathBuilder2.curveToRelative(3.72f, 0.05f, 6.85f, 3.18f, 6.9f, 6.9f);
        pathBuilder2.curveToRelative(0.05f, 3.91f, -3.1f, 7.1f, -7.0f, 7.1f);
        pathBuilder2.curveToRelative(-1.61f, 0.0f, -3.1f, -0.55f, -4.28f, -1.48f);
        pathBuilder2.curveToRelative(-0.4f, -0.31f, -0.96f, -0.28f, -1.32f, 0.08f);
        pathBuilder2.curveToRelative(-0.42f, 0.42f, -0.39f, 1.13f, 0.08f, 1.49f);
        pathBuilder2.curveTo(9.0f, 20.29f, 10.91f, 21.0f, 13.0f, 21.0f);
        pathBuilder2.curveToRelative(5.05f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f);
        pathBuilder2.curveToRelative(-0.13f, -4.69f, -4.05f, -8.61f, -8.74f, -8.74f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 8.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(3.68f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(3.12f, 1.85f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        pathBuilder3.curveToRelative(0.21f, -0.36f, 0.09f, -0.82f, -0.26f, -1.03f);
        pathBuilder.lineToRelative(-2.88f, -1.71f);
        pathBuilder.verticalLineToRelative(-3.4f);
        pathBuilder.curveToRelative(0.0f, -0.4f, -0.34f, -0.74f, -0.75f, -0.74f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _history = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
