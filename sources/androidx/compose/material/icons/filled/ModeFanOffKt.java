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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_modeFanOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ModeFanOff", "Landroidx/compose/material/icons/Icons$Filled;", "getModeFanOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModeFanOff.kt */
public final class ModeFanOffKt {
    private static ImageVector _modeFanOff;

    public static final ImageVector getModeFanOff(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _modeFanOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.ModeFanOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.34f, 8.36f);
        pathBuilder.lineToRelative(-2.29f, 0.82f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.18f, -0.13f, -0.38f, -0.25f, -0.58f, -0.34f);
        pathBuilder2.curveToRelative(0.17f, -0.83f, 0.63f, -1.58f, 1.36f, -2.06f);
        pathBuilder2.curveTo(16.85f, 5.44f, 16.18f, 2.0f, 13.39f, 2.0f);
        pathBuilder2.curveToRelative(-3.08f, 0.0f, -4.9f, 1.47f, -5.3f, 3.26f);
        pathBuilder.lineTo(18.73f, 15.9f);
        pathBuilder2.curveToRelative(1.5f, 0.39f, 3.27f, -0.51f, 3.27f, -2.51f);
        pathBuilder2.curveTo(22.0f, 9.0f, 18.99f, 7.16f, 16.34f, 8.36f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(2.81f, 2.81f);
        pathBuilder3.lineTo(1.39f, 4.22f);
        pathBuilder3.lineTo(5.27f, 8.1f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(3.77f, 7.7f, 2.0f, 8.61f, 2.0f, 10.61f);
        pathBuilder4.curveToRelative(0.0f, 4.4f, 3.01f, 6.24f, 5.66f, 5.03f);
        pathBuilder3.lineToRelative(2.29f, -0.82f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.18f, 0.13f, 0.38f, 0.25f, 0.58f, 0.34f);
        pathBuilder5.curveToRelative(-0.17f, 0.83f, -0.63f, 1.58f, -1.36f, 2.06f);
        pathBuilder5.curveTo(7.15f, 18.56f, 7.82f, 22.0f, 10.61f, 22.0f);
        pathBuilder5.curveToRelative(3.08f, 0.0f, 4.9f, -1.47f, 5.3f, -3.26f);
        pathBuilder3.lineToRelative(3.87f, 3.87f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(2.81f, 2.81f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _modeFanOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
