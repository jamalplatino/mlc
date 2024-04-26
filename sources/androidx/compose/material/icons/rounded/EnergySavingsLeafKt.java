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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_energySavingsLeaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EnergySavingsLeaf", "Landroidx/compose/material/icons/Icons$Rounded;", "getEnergySavingsLeaf", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EnergySavingsLeaf.kt */
public final class EnergySavingsLeafKt {
    private static ImageVector _energySavingsLeaf;

    public static final ImageVector getEnergySavingsLeaf(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.EnergySavingsLeaf", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        pathBuilder.lineToRelative(-1.68f, 1.68f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.68f, -1.68f);
        pathBuilder2.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        pathBuilder2.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder2.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.83f, 12.26f);
        pathBuilder.lineToRelative(-5.16f, 4.63f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.16f, 0.15f, -0.41f, 0.14f, -0.56f, -0.01f);
        pathBuilder3.curveToRelative(-0.14f, -0.14f, -0.16f, -0.36f, -0.04f, -0.52f);
        pathBuilder.lineToRelative(2.44f, -3.33f);
        pathBuilder.lineToRelative(-4.05f, -0.4f);
        pathBuilder.curveToRelative(-0.44f, -0.04f, -0.63f, -0.59f, -0.3f, -0.89f);
        pathBuilder.lineToRelative(5.16f, -4.63f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.16f, -0.15f, 0.41f, -0.14f, 0.56f, 0.01f);
        pathBuilder4.curveToRelative(0.14f, 0.14f, 0.16f, 0.36f, 0.04f, 0.52f);
        pathBuilder.lineToRelative(-2.44f, 3.33f);
        pathBuilder.lineToRelative(4.05f, 0.4f);
        pathBuilder.curveTo(15.98f, 11.41f, 16.16f, 11.96f, 15.83f, 12.26f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _energySavingsLeaf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
