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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_heartBroken", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeartBroken", "Landroidx/compose/material/icons/Icons$Rounded;", "getHeartBroken", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HeartBroken.kt */
public final class HeartBrokenKt {
    private static ImageVector _heartBroken;

    public static final ImageVector getHeartBroken(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _heartBroken;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.HeartBroken", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.57f, 3.95f);
        pathBuilder.curveToRelative(-1.92f, -1.29f, -4.08f, -1.17f, -5.8f, -0.26f);
        pathBuilder.lineTo(12.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.66f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        pathBuilder.lineToRelative(-1.82f, 6.07f);
        pathBuilder.curveToRelative(-0.09f, 0.29f, -0.52f, 0.2f, -0.49f, -0.1f);
        pathBuilder.lineTo(13.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.67f);
        pathBuilder.curveToRelative(-0.66f, 0.0f, -1.14f, -0.64f, -0.96f, -1.27f);
        pathBuilder.lineToRelative(1.18f, -4.11f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder2.curveTo(9.7f, 2.89f, 6.71f, 2.32f, 4.27f, 4.04f);
        pathBuilder2.curveTo(2.82f, 5.07f, 2.0f, 6.7f, 2.0f, 8.49f);
        pathBuilder2.curveToRelative(-0.01f, 3.81f, 3.53f, 6.71f, 8.66f, 11.3f);
        pathBuilder2.curveToRelative(0.76f, 0.68f, 1.92f, 0.69f, 2.69f, 0.01f);
        pathBuilder2.curveToRelative(4.98f, -4.42f, 8.87f, -7.58f, 8.64f, -11.62f);
        pathBuilder2.curveTo(21.9f, 6.45f, 21.0f, 4.92f, 19.57f, 3.95f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _heartBroken = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
