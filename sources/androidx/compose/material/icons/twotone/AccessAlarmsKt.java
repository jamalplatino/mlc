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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accessAlarms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccessAlarms", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccessAlarms", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AccessAlarms.kt */
public final class AccessAlarmsKt {
    private static ImageVector _accessAlarms;

    public static final ImageVector getAccessAlarms(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _accessAlarms;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.AccessAlarms", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-3.9f, 0.0f, -7.0f, 3.1f, -7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(3.1f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.1f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.1f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.7f, 16.9f);
        pathBuilder.lineTo(11.0f, 14.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(5.3f);
        pathBuilder.lineToRelative(4.0f, 2.4f);
        pathBuilder.lineToRelative(-0.8f, 1.2f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 5.7f);
        pathBuilder2.lineToRelative(-4.6f, -3.9f);
        pathBuilder2.lineToRelative(-1.3f, 1.5f);
        pathBuilder2.lineToRelative(4.6f, 3.9f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.5f, 8.0f);
        pathBuilder2.lineTo(11.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(4.7f, 2.9f);
        pathBuilder2.lineToRelative(0.8f, -1.2f);
        pathBuilder2.lineToRelative(-4.0f, -2.4f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f);
        pathBuilder2.reflectiveCurveToRelative(-4.0f, -9.0f, -9.0f, -9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder3.curveToRelative(-3.9f, 0.0f, -7.0f, -3.1f, -7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(3.1f, -7.0f, 7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(7.0f, 3.1f, 7.0f, 7.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.1f, 7.0f, -7.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.9f, 3.4f);
        pathBuilder2.lineTo(6.6f, 1.9f);
        pathBuilder2.lineTo(2.0f, 5.7f);
        pathBuilder2.lineToRelative(1.3f, 1.5f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _accessAlarms = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
