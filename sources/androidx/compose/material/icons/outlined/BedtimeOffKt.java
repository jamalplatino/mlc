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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedtimeOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedtimeOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getBedtimeOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BedtimeOff.kt */
public final class BedtimeOffKt {
    private static ImageVector _bedtimeOff;

    public static final ImageVector getBedtimeOff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _bedtimeOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.BedtimeOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.27f, 4.49f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.14f, 5.08f, 9.07f, 5.64f, 9.03f, 6.2f);
        pathBuilder.lineToRelative(2.05f, 2.05f);
        pathBuilder2.curveToRelative(-0.27f, -2.05f, 0.1f, -4.22f, 1.26f, -6.23f);
        pathBuilder2.curveToRelative(-0.12f, 0.0f, -0.23f, -0.01f, -0.35f, -0.01f);
        pathBuilder2.curveToRelative(-2.05f, 0.0f, -3.93f, 0.61f, -5.5f, 1.65f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder2.curveTo(8.37f, 4.88f, 8.81f, 4.66f, 9.27f, 4.49f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(1.39f, 4.22f);
        pathBuilder3.lineToRelative(2.27f, 2.27f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(2.61f, 8.07f, 2.0f, 9.97f, 2.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder4.curveToRelative(2.04f, 0.0f, 3.92f, -0.63f, 5.5f, -1.67f);
        pathBuilder3.lineToRelative(2.28f, 2.28f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(2.81f, 2.81f);
        pathBuilder3.lineTo(1.39f, 4.22f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.13f, 7.96f);
        pathBuilder3.lineToRelative(10.92f, 10.92f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(14.84f, 19.6f, 13.45f, 20.0f, 12.0f, 20.0f);
        pathBuilder5.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder5.curveTo(4.0f, 10.52f, 4.42f, 9.15f, 5.13f, 7.96f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bedtimeOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
