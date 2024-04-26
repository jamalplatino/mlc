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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyRecording", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyRecording", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmergencyRecording", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EmergencyRecording.kt */
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.EmergencyRecording", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 10.48f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.48f);
        pathBuilder.lineToRelative(3.15f, 3.13f);
        pathBuilder.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        pathBuilder.verticalLineTo(7.7f);
        pathBuilder.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineTo(18.0f, 10.48f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 14.6f);
        pathBuilder.curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f);
        pathBuilder.lineTo(11.0f, 13.73f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.27f);
        pathBuilder.lineToRelative(-2.13f, 1.23f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f);
        pathBuilder3.curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.lineToRelative(-2.13f, -1.23f);
        pathBuilder3.curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f);
        pathBuilder3.curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f);
        pathBuilder.lineTo(9.0f, 10.27f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.27f);
        pathBuilder.lineToRelative(2.13f, -1.23f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f);
        pathBuilder4.curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f);
        pathBuilder.lineTo(12.0f, 12.0f);
        pathBuilder.lineToRelative(2.13f, 1.23f);
        pathBuilder4.curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _emergencyRecording = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
