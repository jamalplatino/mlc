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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_micExternalOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MicExternalOn", "Landroidx/compose/material/icons/Icons$Rounded;", "getMicExternalOn", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MicExternalOn.kt */
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.MicExternalOn", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.22f, 7.0f);
        pathBuilder.horizontalLineTo(4.78f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 2.01f);
        pathBuilder.curveTo(18.32f, 2.13f, 20.0f, 4.08f, 20.0f, 6.16f);
        pathBuilder.lineTo(20.0f, 21.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -14.91f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f);
        pathBuilder4.curveTo(15.14f, 3.78f, 14.0f, 4.76f, 14.0f, 6.0f);
        pathBuilder.lineToRelative(0.0f, 11.84f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f);
        pathBuilder5.curveTo(7.92f, 22.13f, 6.0f, 20.29f, 6.0f, 18.0f);
        pathBuilder.horizontalLineTo(5.45f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.47f, -0.19f, -0.5f, -0.45f);
        pathBuilder.lineTo(4.11f, 9.1f);
        pathBuilder.curveTo(4.05f, 8.51f, 4.51f, 8.0f, 5.1f, 8.0f);
        pathBuilder.horizontalLineTo(8.9f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.05f, 0.51f, 1.0f, 1.1f);
        pathBuilder.lineToRelative(-0.85f, 8.45f);
        pathBuilder.curveTo(9.02f, 17.81f, 8.8f, 18.0f, 8.55f, 18.0f);
        pathBuilder.horizontalLineTo(8.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f);
        pathBuilder6.curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.curveTo(12.0f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _micExternalOn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
