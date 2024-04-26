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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fastForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FastForward", "Landroidx/compose/material/icons/Icons$Rounded;", "getFastForward", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastForward.kt */
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.FastForward", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.58f, 16.89f);
        pathBuilder.lineToRelative(5.77f, -4.07f);
        pathBuilder.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        pathBuilder.lineTo(5.58f, 7.11f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.91f, 6.65f, 4.0f, 7.12f, 4.0f, 7.93f);
        pathBuilder.verticalLineToRelative(8.14f);
        pathBuilder2.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 7.93f);
        pathBuilder.verticalLineToRelative(8.14f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        pathBuilder.lineToRelative(5.77f, -4.07f);
        pathBuilder3.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        pathBuilder.lineToRelative(-5.77f, -4.07f);
        pathBuilder.curveToRelative(-0.67f, -0.47f, -1.58f, 0.0f, -1.58f, 0.81f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fastForward = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}