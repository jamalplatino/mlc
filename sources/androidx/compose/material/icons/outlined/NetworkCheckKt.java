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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_networkCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkCheck", "Landroidx/compose/material/icons/Icons$Outlined;", "getNetworkCheck", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NetworkCheck.kt */
public final class NetworkCheckKt {
    private static ImageVector _networkCheck;

    public static final ImageVector getNetworkCheck(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _networkCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NetworkCheck", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.9f, 5.0f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.32f, 0.09f, -0.41f, 0.23f);
        pathBuilder.lineToRelative(-0.07f, 0.15f);
        pathBuilder.lineToRelative(-5.18f, 11.65f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.16f, 0.29f, -0.26f, 0.61f, -0.26f, 0.96f);
        pathBuilder2.curveToRelative(0.0f, 1.11f, 0.9f, 2.01f, 2.01f, 2.01f);
        pathBuilder2.curveToRelative(0.96f, 0.0f, 1.77f, -0.68f, 1.96f, -1.59f);
        pathBuilder.lineToRelative(0.01f, -0.03f);
        pathBuilder.lineTo(16.4f, 5.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(2.88f, -2.88f, 6.79f, -4.08f, 10.53f, -3.62f);
        pathBuilder.lineToRelative(1.19f, -2.68f);
        pathBuilder.curveTo(9.89f, 3.84f, 4.74f, 5.27f, 1.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 11.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveToRelative(-1.64f, -1.64f, -3.55f, -2.82f, -5.59f, -3.57f);
        pathBuilder.lineToRelative(-0.53f, 2.82f);
        pathBuilder.curveToRelative(1.5f, 0.62f, 2.9f, 1.53f, 4.12f, 2.75f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveToRelative(-0.8f, -0.8f, -1.7f, -1.42f, -2.66f, -1.89f);
        pathBuilder.lineToRelative(-0.55f, 2.92f);
        pathBuilder.curveToRelative(0.42f, 0.27f, 0.83f, 0.59f, 1.21f, 0.97f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(1.13f, -1.13f, 2.56f, -1.79f, 4.03f, -2.0f);
        pathBuilder.lineToRelative(1.28f, -2.88f);
        pathBuilder.curveToRelative(-2.63f, -0.08f, -5.3f, 0.87f, -7.31f, 2.88f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _networkCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
