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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_modeNight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ModeNight", "Landroidx/compose/material/icons/Icons$Rounded;", "getModeNight", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModeNight.kt */
public final class ModeNightKt {
    private static ImageVector _modeNight;

    public static final ImageVector getModeNight(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _modeNight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ModeNight", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.93f, 2.3f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.89f, 1.8f, 7.91f, 1.95f, 6.16f, 2.58f);
        pathBuilder2.curveTo(5.44f, 2.84f, 5.25f, 3.8f, 5.85f, 4.29f);
        pathBuilder2.curveTo(8.08f, 6.12f, 9.5f, 8.89f, 9.5f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 3.11f, -1.42f, 5.88f, -3.65f, 7.71f);
        pathBuilder2.curveToRelative(-0.59f, 0.49f, -0.42f, 1.45f, 0.31f, 1.7f);
        pathBuilder2.curveTo(7.2f, 21.79f, 8.33f, 22.0f, 9.5f, 22.0f);
        pathBuilder2.curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f);
        pathBuilder2.curveTo(18.76f, 6.48f, 15.78f, 3.24f, 11.93f, 2.3f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _modeNight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
