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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_icecream", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Icecream", "Landroidx/compose/material/icons/Icons$Rounded;", "getIcecream", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Icecream.kt */
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Icecream", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.38f, 6.24f);
        pathBuilder.curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f);
        pathBuilder.lineToRelative(3.83f, 7.31f);
        pathBuilder.curveToRelative(0.38f, 0.72f, 1.41f, 0.71f, 1.78f, -0.01f);
        pathBuilder.lineToRelative(3.73f, -7.31f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f);
        pathBuilder3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.05f, 18.63f);
        pathBuilder.lineToRelative(-2.73f, -5.21f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f);
        pathBuilder4.curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f);
        pathBuilder.lineTo(12.05f, 18.63f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _icecream = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
