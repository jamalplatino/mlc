package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pushPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PushPin", "Landroidx/compose/material/icons/Icons$Rounded;", "getPushPin", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PushPin.kt */
public final class PushPinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _pushPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.PushPin", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 12.87f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.47f, -0.34f, -0.85f, -0.8f, -0.98f);
        pathBuilder2.curveTo(16.93f, 11.54f, 16.0f, 10.38f, 16.0f, 9.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.lineToRelative(1.0f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.lineToRelative(1.0f, 0.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 1.38f, -0.93f, 2.54f, -2.2f, 2.89f);
        pathBuilder5.curveTo(5.34f, 12.02f, 5.0f, 12.4f, 5.0f, 12.87f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.98f);
        pathBuilder.lineTo(11.0f, 21.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(-0.02f, -7.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(12.87f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pushPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}