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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playForWork", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayForWork", "Landroidx/compose/material/icons/Icons$Rounded;", "getPlayForWork", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PlayForWork.kt */
public final class PlayForWorkKt {
    private static ImageVector _playForWork;

    public static final ImageVector getPlayForWork(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _playForWork;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PlayForWork", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.verticalLineToRelative(4.59f);
        pathBuilder.lineTo(8.71f, 10.59f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(3.29f, -3.29f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilder.lineTo(13.0f, 10.59f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.1f, 14.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.61f, 0.0f, -1.11f, 0.55f, -0.99f, 1.15f);
        pathBuilder3.curveTo(6.65f, 17.91f, 9.08f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(5.35f, -2.09f, 5.89f, -4.85f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.12f, -0.6f, -0.38f, -1.15f, -0.99f, -1.15f);
        pathBuilder4.curveToRelative(-0.49f, 0.0f, -0.88f, 0.35f, -0.98f, 0.83f);
        pathBuilder4.curveTo(15.53f, 16.64f, 13.93f, 18.0f, 12.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(-3.53f, -1.36f, -3.91f, -3.17f);
        pathBuilder.curveToRelative(-0.1f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _playForWork = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
