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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsRugby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsRugby", "Landroidx/compose/material/icons/Icons$Filled;", "getSportsRugby", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsRugby.kt */
public final class SportsRugbyKt {
    private static ImageVector _sportsRugby;

    public static final ImageVector getSportsRugby(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _sportsRugby;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.SportsRugby", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 3.51f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.56f, -0.56f, -2.15f, -0.97f, -4.16f, -0.97f);
        pathBuilder2.curveToRelative(-3.08f, 0.0f, -7.15f, 0.96f, -9.98f, 3.79f);
        pathBuilder2.curveTo(1.66f, 11.03f, 2.1f, 19.07f, 3.51f, 20.49f);
        pathBuilder2.curveToRelative(0.56f, 0.56f, 2.15f, 0.97f, 4.16f, 0.97f);
        pathBuilder2.curveToRelative(3.08f, 0.0f, 7.15f, -0.96f, 9.98f, -3.79f);
        pathBuilder2.curveTo(22.34f, 12.97f, 21.9f, 4.93f, 20.49f, 3.51f);
        pathBuilder.close();
        pathBuilder.moveTo(7.76f, 7.76f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(2.64f, -2.64f, 6.35f, -3.12f, 8.03f, -3.19f);
        pathBuilder3.curveToRelative(-2.05f, 0.94f, -4.46f, 2.45f, -6.61f, 4.61f);
        pathBuilder3.curveToRelative(-2.16f, 2.16f, -3.67f, 4.58f, -4.62f, 6.63f);
        pathBuilder3.curveTo(4.66f, 13.33f, 5.44f, 10.07f, 7.76f, 7.76f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.24f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-2.64f, 2.64f, -6.35f, 3.12f, -8.03f, 3.19f);
        pathBuilder4.curveToRelative(2.05f, -0.94f, 4.46f, -2.45f, 6.61f, -4.61f);
        pathBuilder4.curveToRelative(2.16f, -2.16f, 3.67f, -4.58f, 4.62f, -6.63f);
        pathBuilder4.curveTo(19.34f, 10.67f, 18.56f, 13.93f, 16.24f, 16.24f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsRugby = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
