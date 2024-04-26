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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_connectedTv", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectedTv", "Landroidx/compose/material/icons/Icons$Rounded;", "getConnectedTv", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ConnectedTv.kt */
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ConnectedTv", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(22.0f, 5.0f);
        pathBuilder.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.97f);
        pathBuilder.curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(15.97f);
        pathBuilder.close();
        pathBuilder.moveTo(5.62f, 12.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f);
        pathBuilder2.curveTo(8.51f, 15.75f, 8.82f, 16.0f, 9.18f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.46f, 0.0f, 0.82f, -0.41f, 0.75f, -0.86f);
        pathBuilder2.curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f);
        pathBuilder2.curveTo(5.41f, 11.0f, 5.0f, 11.36f, 5.0f, 11.82f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(5.0f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 9.53f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f);
        pathBuilder3.curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f);
        pathBuilder3.curveToRelative(0.45f, 0.0f, 0.79f, -0.4f, 0.75f, -0.85f);
        pathBuilder3.curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f);
        pathBuilder3.curveTo(5.4f, 8.0f, 5.0f, 8.34f, 5.0f, 8.79f);
        pathBuilder3.curveTo(5.0f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _connectedTv = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
