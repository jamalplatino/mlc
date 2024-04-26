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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cancelScheduleSend", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CancelScheduleSend", "Landroidx/compose/material/icons/Icons$Rounded;", "getCancelScheduleSend", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CancelScheduleSend.kt */
public final class CancelScheduleSendKt {
    private static ImageVector _cancelScheduleSend;

    public static final ImageVector getCancelScheduleSend(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _cancelScheduleSend;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.CancelScheduleSend", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 9.0f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.83f, 0.04f, -1.24f, 0.11f);
        pathBuilder.lineTo(2.4f, 3.6f);
        pathBuilder.curveTo(1.74f, 3.31f, 1.01f, 3.8f, 1.01f, 4.51f);
        pathBuilder.lineTo(1.0f, 9.2f);
        pathBuilder.curveToRelative(0.0f, 0.47f, 0.33f, 0.88f, 0.78f, 0.98f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.lineToRelative(-8.22f, 1.83f);
        pathBuilder.curveTo(1.33f, 13.93f, 1.0f, 14.33f, 1.0f, 14.8f);
        pathBuilder.lineToRelative(0.01f, 4.68f);
        pathBuilder.curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f);
        pathBuilder.lineToRelative(6.68f, -2.86f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.59f, 21.19f, 12.71f, 24.0f, 16.5f, 24.0f);
        pathBuilder2.curveToRelative(4.14f, 0.0f, 7.5f, -3.36f, 7.5f, -7.5f);
        pathBuilder.reflectiveCurveTo(20.64f, 9.0f, 16.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 22.0f);
        pathBuilder.curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f);
        pathBuilder.reflectiveCurveTo(19.53f, 22.0f, 16.5f, 22.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.62f, 14.38f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder3.lineToRelative(-1.41f, 1.41f);
        pathBuilder3.lineToRelative(-1.41f, -1.41f);
        pathBuilder4.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder3.lineToRelative(1.41f, 1.41f);
        pathBuilder3.lineToRelative(-1.41f, 1.41f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder5.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineToRelative(1.41f, 1.41f);
        pathBuilder5.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder5.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder3.lineToRelative(-1.41f, -1.41f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder5.curveTo(18.82f, 14.89f, 18.82f, 14.57f, 18.62f, 14.38f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cancelScheduleSend = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
