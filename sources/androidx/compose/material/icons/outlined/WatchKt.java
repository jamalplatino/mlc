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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Watch", "Landroidx/compose/material/icons/Icons$Outlined;", "getWatch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Watch.kt */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Watch", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.31f, 2.0f);
        pathBuilder.lineToRelative(0.41f, 2.48f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        pathBuilder.lineTo(9.7f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.61f);
        pathBuilder.moveToRelative(0.41f, 17.52f);
        pathBuilder.lineTo(14.31f, 22.0f);
        pathBuilder.lineTo(9.7f, 22.0f);
        pathBuilder.lineToRelative(-0.41f, -2.47f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        pathBuilder3.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        pathBuilder.moveTo(16.0f, 0.0f);
        pathBuilder.lineTo(8.0f, 0.0f);
        pathBuilder.lineToRelative(-0.95f, 5.73f);
        pathBuilder.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        pathBuilder.lineTo(8.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.96f, -5.73f);
        pathBuilder.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        pathBuilder.lineTo(16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _watch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
