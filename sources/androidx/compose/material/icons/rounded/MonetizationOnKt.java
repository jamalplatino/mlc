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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_monetizationOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonetizationOn", "Landroidx/compose/material/icons/Icons$Rounded;", "getMonetizationOn", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MonetizationOn.kt */
public final class MonetizationOnKt {
    private static ImageVector _monetizationOn;

    public static final ImageVector getMonetizationOn(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.MonetizationOn", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.41f, 18.09f);
        pathBuilder.verticalLineToRelative(0.58f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -0.6f, 1.33f, -1.33f, 1.33f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.73f, 0.0f, -1.33f, -0.6f, -1.33f, -1.33f);
        pathBuilder.verticalLineToRelative(-0.6f);
        pathBuilder2.curveToRelative(-1.33f, -0.28f, -2.51f, -1.01f, -3.01f, -2.24f);
        pathBuilder2.curveToRelative(-0.23f, -0.55f, 0.2f, -1.16f, 0.8f, -1.16f);
        pathBuilder.horizontalLineToRelative(0.24f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.37f, 0.0f, 0.67f, 0.25f, 0.81f, 0.6f);
        pathBuilder3.curveToRelative(0.29f, 0.75f, 1.05f, 1.27f, 2.51f, 1.27f);
        pathBuilder3.curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f);
        pathBuilder3.curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f);
        pathBuilder3.curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f);
        pathBuilder3.curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f);
        pathBuilder.verticalLineToRelative(-0.6f);
        pathBuilder3.curveToRelative(0.0f, -0.73f, 0.6f, -1.33f, 1.33f, -1.33f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.33f, 0.6f, 1.33f, 1.33f);
        pathBuilder.verticalLineToRelative(0.62f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.38f, 0.34f, 2.25f, 1.2f, 2.63f, 2.26f);
        pathBuilder4.curveToRelative(0.2f, 0.55f, -0.22f, 1.13f, -0.81f, 1.13f);
        pathBuilder.horizontalLineToRelative(-0.26f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.37f, 0.0f, -0.67f, -0.26f, -0.77f, -0.62f);
        pathBuilder5.curveToRelative(-0.23f, -0.76f, -0.86f, -1.25f, -2.12f, -1.25f);
        pathBuilder5.curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f);
        pathBuilder5.curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f);
        pathBuilder.reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f);
        pathBuilder.curveToRelative(-0.02f, 1.83f, -1.39f, 2.83f, -3.13f, 3.16f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _monetizationOn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
