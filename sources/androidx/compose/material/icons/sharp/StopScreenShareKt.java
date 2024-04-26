package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Sharp;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StopScreenShare.kt */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.StopScreenShare", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.79f, 18.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.13f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.lineToRelative(4.0f, 3.74f);
        pathBuilder.lineToRelative(-1.28f, 1.19f);
        pathBuilder.lineToRelative(5.18f, 5.18f);
        pathBuilder.lineTo(22.0f, 16.0f);
        pathBuilder.lineTo(22.0f, 4.02f);
        pathBuilder.lineTo(7.8f, 4.02f);
        pathBuilder.lineToRelative(5.13f, 5.13f);
        pathBuilder.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.07f, -0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(1.11f, 2.98f);
        pathBuilder.lineToRelative(0.89f, 0.9f);
        pathBuilder.verticalLineToRelative(12.14f);
        pathBuilder.lineToRelative(2.0f, 1.99f);
        pathBuilder.lineTo(0.0f, 18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.13f);
        pathBuilder.lineToRelative(2.71f, 2.71f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.52f, 1.57f);
        pathBuilder.lineTo(1.11f, 2.98f);
        pathBuilder.close();
        pathBuilder.moveTo(9.08f, 10.95f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        pathBuilder2.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _stopScreenShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
