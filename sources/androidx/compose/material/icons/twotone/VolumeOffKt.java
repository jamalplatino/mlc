package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_volumeOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VolumeOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVolumeOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VolumeOff.kt */
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.VolumeOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.83f, 11.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(10.0f, 15.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(-1.29f, -1.29f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.34f, 2.93f);
        pathBuilder2.lineTo(2.93f, 4.34f);
        pathBuilder2.lineTo(7.29f, 8.7f);
        pathBuilder2.lineTo(7.0f, 9.0f);
        pathBuilder2.lineTo(3.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.lineToRelative(5.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(-6.59f);
        pathBuilder2.lineToRelative(4.18f, 4.18f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(-0.65f, 0.49f, -1.38f, 0.88f, -2.18f, 1.11f);
        pathBuilder2.verticalLineToRelative(2.06f);
        pathBuilder3.curveToRelative(1.34f, -0.3f, 2.57f, -0.92f, 3.61f, -1.75f);
        pathBuilder2.lineToRelative(2.05f, 2.05f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(4.34f, 2.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 15.17f);
        pathBuilder2.lineTo(7.83f, 13.0f);
        pathBuilder2.lineTo(5.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(2.83f);
        pathBuilder2.lineToRelative(0.88f, -0.88f);
        pathBuilder2.lineTo(10.0f, 11.41f);
        pathBuilder2.verticalLineToRelative(3.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveToRelative(0.0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f);
        pathBuilder2.lineToRelative(1.53f, 1.53f);
        pathBuilder4.curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f);
        pathBuilder4.curveToRelative(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        pathBuilder2.verticalLineToRelative(2.06f);
        pathBuilder4.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.lineToRelative(-1.88f, 1.88f);
        pathBuilder2.lineTo(12.0f, 7.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.5f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        pathBuilder2.verticalLineToRelative(1.79f);
        pathBuilder2.lineToRelative(2.48f, 2.48f);
        pathBuilder4.curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _volumeOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}