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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_offlineBolt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OfflineBolt", "Landroidx/compose/material/icons/Icons$Rounded;", "getOfflineBolt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: OfflineBolt.kt */
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.OfflineBolt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.02f);
        pathBuilder.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilder.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.48f, 17.88f);
        pathBuilder.verticalLineToRelative(-4.14f);
        pathBuilder.lineTo(8.82f, 13.74f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.62f, -0.4f, -0.44f, -0.73f);
        pathBuilder.lineToRelative(3.68f, -7.17f);
        pathBuilder.curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f);
        pathBuilder.verticalLineToRelative(4.19f);
        pathBuilder.horizontalLineToRelative(2.54f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.61f, 0.39f, 0.45f, 0.72f);
        pathBuilder.lineToRelative(-3.56f, 7.12f);
        pathBuilder.curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _offlineBolt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
