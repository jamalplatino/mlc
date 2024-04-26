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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_alarmOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlarmOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlarmOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AlarmOff.kt */
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.AlarmOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.04f, 6.29f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(10.66f, 6.11f, 11.32f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f);
        pathBuilder.lineToRelative(1.56f, 1.56f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f);
        pathBuilder3.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder3.curveToRelative(-1.25f, 0.0f, -2.44f, 0.26f, -3.53f, 0.72f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.close();
        pathBuilder.moveTo(3.71f, 2.79f);
        pathBuilder.curveToRelative(-0.38f, -0.38f, -1.0f, -0.38f, -1.39f, 0.0f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.lineToRelative(0.68f, 0.68f);
        pathBuilder.lineToRelative(-0.17f, 0.14f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.42f, 0.34f, -0.47f, 0.96f, -0.13f, 1.38f);
        pathBuilder.lineToRelative(0.03f, 0.03f);
        pathBuilder4.curveToRelative(0.35f, 0.42f, 0.96f, 0.47f, 1.38f, 0.12f);
        pathBuilder.lineToRelative(0.31f, -0.25f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        pathBuilder5.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder5.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.38f, 0.38f, 1.0f, 0.38f, 1.39f, 0.0f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder6.curveToRelative(0.38f, -0.38f, 0.38f, -1.0f, 0.0f, -1.39f);
        pathBuilder.lineToRelative(-17.01f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder7.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f);
        pathBuilder.lineToRelative(9.85f, 9.85f);
        pathBuilder.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.91f, 6.56f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.42f, 0.35f, 1.03f, 0.29f, 1.38f, -0.12f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder8.curveToRelative(0.35f, -0.42f, 0.29f, -1.03f, -0.12f, -1.38f);
        pathBuilder.lineToRelative(-3.1f, -2.59f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(-0.42f, -0.35f, -1.03f, -0.29f, -1.38f, 0.12f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder9.curveToRelative(-0.35f, 0.42f, -0.29f, 1.03f, 0.12f, 1.38f);
        pathBuilder.lineToRelative(3.1f, 2.59f);
        pathBuilder.close();
        pathBuilder.moveTo(7.43f, 3.68f);
        PathBuilder pathBuilder10 = pathBuilder;
        pathBuilder10.curveToRelative(0.18f, -0.34f, 0.15f, -0.77f, -0.11f, -1.09f);
        pathBuilder.lineToRelative(-0.03f, -0.03f);
        pathBuilder10.curveToRelative(-0.3f, -0.36f, -0.8f, -0.43f, -1.2f, -0.22f);
        pathBuilder.lineToRelative(1.34f, 1.34f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _alarmOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
