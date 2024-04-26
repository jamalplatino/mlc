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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_timeline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Timeline", "Landroidx/compose/material/icons/Icons$Outlined;", "getTimeline", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Timeline.kt */
public final class TimelineKt {
    private static ImageVector _timeline;

    public static final ImageVector getTimeline(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _timeline;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Timeline", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.curveToRelative(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        pathBuilder.lineToRelative(-3.56f, 3.55f);
        pathBuilder2.curveTo(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        pathBuilder.lineToRelative(-2.55f, -2.55f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        pathBuilder3.curveToRelative(-0.18f, 0.0f, -0.36f, -0.02f, -0.52f, -0.07f);
        pathBuilder.lineToRelative(-4.55f, 4.56f);
        pathBuilder3.curveTo(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.curveToRelative(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        pathBuilder.lineToRelative(4.56f, -4.55f);
        pathBuilder3.curveTo(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.curveToRelative(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        pathBuilder.lineToRelative(2.55f, 2.55f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        pathBuilder4.curveToRelative(0.18f, 0.0f, 0.36f, 0.02f, 0.52f, 0.07f);
        pathBuilder.lineToRelative(3.55f, -3.56f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(23.0f, 6.9f, 23.0f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _timeline = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
