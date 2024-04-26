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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_roundaboutRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RoundaboutRight", "Landroidx/compose/material/icons/Icons$Rounded;", "getRoundaboutRight", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RoundaboutRight.kt */
public final class RoundaboutRightKt {
    private static ImageVector _roundaboutRight;

    public static final ImageVector getRoundaboutRight(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _roundaboutRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.RoundaboutRight", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -5.09f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.98f, -0.71f, -1.8f, -1.67f, -1.97f);
        pathBuilder2.curveTo(5.44f, 12.63f, 4.0f, 10.98f, 4.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder2.curveToRelative(1.98f, 0.0f, 3.63f, 1.44f, 3.94f, 3.33f);
        pathBuilder2.curveTo(12.11f, 9.29f, 12.93f, 10.0f, 13.91f, 10.0f);
        pathBuilder.lineToRelative(4.26f, 0.0f);
        pathBuilder.lineToRelative(-0.88f, 0.88f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder3.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.59f, -2.59f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-2.59f, -2.59f);
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(18.17f, 8.0f);
        pathBuilder.lineToRelative(-4.25f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.44f, 5.16f, 10.97f, 3.0f, 8.0f, 3.0f);
        pathBuilder5.curveTo(4.69f, 3.0f, 2.0f, 5.69f, 2.0f, 9.0f);
        pathBuilder5.curveToRelative(0.0f, 2.97f, 2.16f, 5.44f, 5.0f, 5.92f);
        pathBuilder.lineTo(7.0f, 20.0f);
        pathBuilder.curveTo(7.0f, 20.55f, 7.45f, 21.0f, 8.0f, 21.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _roundaboutRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
