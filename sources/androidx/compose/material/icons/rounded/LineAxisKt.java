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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lineAxis", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LineAxis", "Landroidx/compose/material/icons/Icons$Rounded;", "getLineAxis", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LineAxis.kt */
public final class LineAxisKt {
    private static ImageVector _lineAxis;

    public static final ImageVector getLineAxis(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _lineAxis;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LineAxis", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.34f, 6.77f);
        pathBuilder.lineTo(21.34f, 6.77f);
        pathBuilder.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        pathBuilder.lineToRelative(-3.33f, 3.74f);
        pathBuilder.lineToRelative(-5.65f, -5.24f);
        pathBuilder.curveTo(10.12f, 4.58f, 8.9f, 4.6f, 8.14f, 5.36f);
        pathBuilder.lineTo(2.7f, 10.81f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.09f, 0.09f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(5.44f, -5.45f);
        pathBuilder.lineToRelative(5.59f, 5.19f);
        pathBuilder.lineToRelative(-1.73f, 1.95f);
        pathBuilder.lineToRelative(-2.58f, -2.58f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineTo(2.7f, 16.8f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(2.8f, 18.3f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(5.3f, -5.3f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveToRelative(0.81f, 0.81f, 2.14f, 0.77f, 2.91f, -0.09f);
        pathBuilder.lineToRelative(1.78f, -2.01f);
        pathBuilder.lineToRelative(3.19f, 2.96f);
        pathBuilder.curveToRelative(0.39f, 0.36f, 1.0f, 0.35f, 1.38f, -0.03f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.4f, -0.4f, 0.39f, -1.05f, -0.03f, -1.43f);
        pathBuilder.lineToRelative(-3.22f, -2.99f);
        pathBuilder.lineToRelative(3.35f, -3.77f);
        pathBuilder.curveTo(21.73f, 7.74f, 21.71f, 7.14f, 21.34f, 6.77f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _lineAxis = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
