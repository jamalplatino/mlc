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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Filled;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StopScreenShare.kt */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.StopScreenShare", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.22f, 18.02f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(24.0f, 20.02f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.78f);
        pathBuilder.close();
        pathBuilder.moveTo(21.99f, 16.02f);
        pathBuilder.lineToRelative(0.01f, -10.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.22f, 4.02f);
        pathBuilder.lineToRelative(5.23f, 5.23f);
        pathBuilder.curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f);
        pathBuilder.lineTo(13.0f, 7.02f);
        pathBuilder.lineToRelative(4.0f, 3.73f);
        pathBuilder.lineToRelative(-1.58f, 1.47f);
        pathBuilder.lineToRelative(5.54f, 5.54f);
        pathBuilder.curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f);
        pathBuilder.close();
        pathBuilder.moveTo(2.39f, 1.73f);
        pathBuilder.lineTo(1.11f, 3.0f);
        pathBuilder.lineToRelative(1.54f, 1.54f);
        pathBuilder.curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.lineTo(0.0f, 18.02f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.13f);
        pathBuilder.lineToRelative(2.71f, 2.71f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineTo(2.39f, 1.73f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.02f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder2.curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _stopScreenShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}