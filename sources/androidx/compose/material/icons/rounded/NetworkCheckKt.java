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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_networkCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkCheck", "Landroidx/compose/material/icons/Icons$Rounded;", "getNetworkCheck", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NetworkCheck.kt */
public final class NetworkCheckKt {
    private static ImageVector _networkCheck;

    public static final ImageVector getNetworkCheck(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _networkCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.NetworkCheck", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
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
        pathBuilder.moveTo(2.06f, 10.06f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.51f, 0.51f, 1.33f, 0.55f, 1.89f, 0.09f);
        pathBuilder3.curveToRelative(2.76f, -2.26f, 6.24f, -3.18f, 9.58f, -2.76f);
        pathBuilder.lineToRelative(1.19f, -2.68f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-4.35f, -0.78f, -8.96f, 0.3f, -12.57f, 3.25f);
        pathBuilder4.curveToRelative(-0.64f, 0.53f, -0.68f, 1.51f, -0.09f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.94f, 10.06f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        pathBuilder5.curveToRelative(-1.36f, -1.11f, -2.86f, -1.95f, -4.44f, -2.53f);
        pathBuilder.lineToRelative(-0.53f, 2.82f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(1.13f, 0.47f, 2.19f, 1.09f, 3.17f, 1.89f);
        pathBuilder6.curveToRelative(0.58f, 0.46f, 1.39f, 0.43f, 1.9f, -0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(17.91f, 14.09f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.6f, -0.6f, 0.56f, -1.63f, -0.14f, -2.12f);
        pathBuilder7.curveToRelative(-0.46f, -0.33f, -0.94f, -0.61f, -1.44f, -0.86f);
        pathBuilder.lineToRelative(-0.55f, 2.92f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.11f, 0.07f, 0.22f, 0.14f, 0.32f, 0.22f);
        pathBuilder8.curveToRelative(0.57f, 0.4f, 1.33f, 0.32f, 1.81f, -0.16f);
        pathBuilder.close();
        pathBuilder.moveTo(6.08f, 14.08f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(0.5f, 0.5f, 1.27f, 0.54f, 1.85f, 0.13f);
        pathBuilder9.curveToRelative(0.94f, -0.66f, 2.01f, -1.06f, 3.1f, -1.22f);
        pathBuilder.lineToRelative(1.28f, -2.88f);
        PathBuilder pathBuilder10 = pathBuilder;
        pathBuilder10.curveToRelative(-2.13f, -0.06f, -4.28f, 0.54f, -6.09f, 1.84f);
        pathBuilder10.curveToRelative(-0.69f, 0.51f, -0.74f, 1.53f, -0.14f, 2.13f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _networkCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
