package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flaky", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flaky", "Landroidx/compose/material/icons/Icons$Filled;", "getFlaky", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Flaky.kt */
public final class FlakyKt {
    private static ImageVector _flaky;

    public static final ImageVector getFlaky(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _flaky;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Flaky", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.05f, 17.58f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.lineToRelative(-2.4f, -2.4f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(1.35f, 1.35f);
        pathBuilder.lineTo(16.54f, 13.0f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(-3.54f, 3.54f);
        pathBuilder.lineTo(14.05f, 17.58f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.34f, 6.28f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(9.81f, 8.75f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineTo(8.75f, 9.81f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(6.28f, 7.34f);
        pathBuilder.lineTo(7.34f, 6.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f);
        pathBuilder.lineTo(17.7f, 6.3f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f);
        pathBuilder2.curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flaky = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
