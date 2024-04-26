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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_whatshot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Whatshot", "Landroidx/compose/material/icons/Icons$Rounded;", "getWhatshot", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Whatshot.kt */
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Whatshot", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.09f, 4.56f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.7f, -1.03f, -1.5f, -1.99f, -2.4f, -2.85f);
        pathBuilder2.curveToRelative(-0.35f, -0.34f, -0.94f, -0.02f, -0.84f, 0.46f);
        pathBuilder2.curveToRelative(0.19f, 0.94f, 0.39f, 2.18f, 0.39f, 3.29f);
        pathBuilder2.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        pathBuilder2.curveToRelative(-1.54f, 0.0f, -2.8f, -0.93f, -3.35f, -2.26f);
        pathBuilder2.curveToRelative(-0.1f, -0.2f, -0.14f, -0.32f, -0.2f, -0.54f);
        pathBuilder2.curveToRelative(-0.11f, -0.42f, -0.66f, -0.55f, -0.9f, -0.18f);
        pathBuilder2.curveToRelative(-0.18f, 0.27f, -0.35f, 0.54f, -0.51f, 0.83f);
        pathBuilder2.curveTo(4.68f, 9.08f, 4.0f, 11.46f, 4.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -3.49f, -1.08f, -6.73f, -2.91f, -9.44f);
        pathBuilder.close();
        pathBuilder.moveTo(11.71f, 19.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        pathBuilder3.curveToRelative(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        pathBuilder3.curveToRelative(1.47f, -0.3f, 2.98f, -0.93f, 4.03f, -1.92f);
        pathBuilder3.curveToRelative(0.28f, -0.26f, 0.74f, -0.14f, 0.82f, 0.23f);
        pathBuilder3.curveToRelative(0.23f, 1.02f, 0.35f, 2.08f, 0.35f, 3.15f);
        pathBuilder3.curveToRelative(0.01f, 2.65f, -2.14f, 4.8f, -4.79f, 4.8f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _whatshot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
