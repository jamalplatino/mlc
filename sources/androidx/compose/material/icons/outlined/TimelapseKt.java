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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_timelapse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Timelapse", "Landroidx/compose/material/icons/Icons$Outlined;", "getTimelapse", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Timelapse.kt */
public final class TimelapseKt {
    private static ImageVector _timelapse;

    public static final ImageVector getTimelapse(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _timelapse;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Timelapse", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.24f, 7.75f);
        pathBuilder.curveToRelative(-1.17f, -1.17f, -2.7f, -1.76f, -4.24f, -1.76f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(-4.24f, 4.24f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(2.34f, 2.34f, 6.14f, 2.34f, 8.49f, 0.0f);
        pathBuilder2.curveToRelative(2.34f, -2.34f, 2.34f, -6.14f, -0.01f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.99f);
        pathBuilder.curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.99f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _timelapse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}