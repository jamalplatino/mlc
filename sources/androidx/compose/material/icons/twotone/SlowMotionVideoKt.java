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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_slowMotionVideo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SlowMotionVideo", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSlowMotionVideo", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SlowMotionVideo.kt */
public final class SlowMotionVideoKt {
    private static ImageVector _slowMotionVideo;

    public static final ImageVector getSlowMotionVideo(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _slowMotionVideo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.SlowMotionVideo", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.26f, 18.32f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        pathBuilder.lineTo(2.05f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        pathBuilder.close();
        pathBuilder.moveTo(7.1f, 5.69f);
        pathBuilder2.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        pathBuilder.lineTo(11.0f, 2.05f);
        pathBuilder2.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.close();
        pathBuilder.moveTo(2.05f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder2.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        pathBuilder.lineTo(4.26f, 5.68f);
        pathBuilder2.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.05f, 2.05f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(16.97f, 4.59f, 20.0f, 7.95f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-3.03f, 7.41f, -6.95f, 7.93f);
        pathBuilder.verticalLineToRelative(2.02f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(18.08f, 21.42f, 22.0f, 17.16f, 22.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -5.16f, -3.92f, -9.42f, -8.95f, -9.95f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.95f, -2.21f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(3.05f, -2.29f);
        pathBuilder.close();
        pathBuilder.moveTo(5.68f, 19.74f);
        pathBuilder.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        pathBuilder.lineToRelative(-1.42f, 1.43f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _slowMotionVideo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
