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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearMeDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearMeDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getNearMeDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NearMeDisabled.kt */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.NearMeDisabled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.34f);
        pathBuilder.lineToRelative(6.95f, -2.58f);
        pathBuilder.curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f);
        pathBuilder.lineTo(17.66f, 12.0f);
        pathBuilder.lineTo(12.0f, 6.34f);
        pathBuilder.close();
        pathBuilder.moveTo(21.9f, 19.07f);
        pathBuilder.lineTo(4.93f, 2.1f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder.lineToRelative(-4.2f, 1.56f);
        pathBuilder2.curveTo(3.27f, 9.59f, 3.0f, 9.97f, 3.0f, 10.4f);
        pathBuilder2.curveToRelative(0.0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f);
        pathBuilder.lineToRelative(6.42f, 2.57f);
        pathBuilder.lineToRelative(2.57f, 6.42f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(12.8f, 20.74f, 13.18f, 21.0f, 13.6f, 21.0f);
        pathBuilder3.curveToRelative(0.43f, 0.0f, 0.82f, -0.27f, 0.97f, -0.67f);
        pathBuilder.lineToRelative(1.56f, -4.2f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder3.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder3.curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nearMeDisabled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
