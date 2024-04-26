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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HdrOff.kt */
public final class HdrOffKt {
    private static ImageVector _hdrOff;

    public static final ImageVector getHdrOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hdrOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.HdrOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 14.25f);
        pathBuilder.lineTo(17.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.72f, 1.59f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilder2.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.96f);
        pathBuilder.lineToRelative(-0.49f, -1.14f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder3.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.lineTo(17.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.9f);
        pathBuilder.lineToRelative(1.04f, 1.04f);
        pathBuilder.curveToRelative(0.27f, -0.11f, 0.46f, -0.38f, 0.46f, -0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.5f);
        pathBuilder.verticalLineToRelative(0.4f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(-1.9f);
        pathBuilder.curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-1.9f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.4f);
        pathBuilder.close();
        pathBuilder.moveTo(21.03f, 21.03f);
        pathBuilder.lineToRelative(-18.0f, -18.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.29f, -0.29f, -0.76f, -0.29f, -1.05f, 0.0f);
        pathBuilder4.curveToRelative(-0.29f, 0.29f, -0.29f, 0.76f, 0.0f, 1.05f);
        pathBuilder.lineToRelative(4.98f, 4.98f);
        pathBuilder.curveToRelative(-0.27f, 0.11f, -0.46f, 0.38f, -0.46f, 0.69f);
        pathBuilder.lineTo(6.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(4.5f, 9.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.lineTo(4.5f, 12.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.lineTo(8.0f, 10.1f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(2.9f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.curveToRelative(0.12f, 0.0f, 0.24f, -0.01f, 0.36f, -0.04f);
        pathBuilder.lineToRelative(7.11f, 7.11f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.05f, 0.0f);
        pathBuilder5.curveToRelative(0.29f, -0.28f, 0.29f, -0.75f, 0.01f, -1.04f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hdrOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
