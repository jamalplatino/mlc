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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_support", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Support", "Landroidx/compose/material/icons/Icons$Rounded;", "getSupport", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Support.kt */
public final class SupportKt {
    private static ImageVector _support;

    public static final ImageVector getSupport(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _support;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Support", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.46f, 9.12f);
        pathBuilder.lineToRelative(-2.78f, 1.15f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f);
        pathBuilder.lineToRelative(1.15f, -2.78f);
        pathBuilder3.curveTo(16.98f, 5.35f, 18.65f, 7.02f, 19.46f, 9.12f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder3.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.13f, 4.54f);
        pathBuilder.lineToRelative(1.17f, 2.78f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f);
        pathBuilder.lineTo(4.54f, 9.13f);
        pathBuilder4.curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f);
        pathBuilder.close();
        pathBuilder.moveTo(4.54f, 14.87f);
        pathBuilder.lineToRelative(2.78f, -1.15f);
        pathBuilder.curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f);
        pathBuilder.lineToRelative(-1.17f, 2.78f);
        pathBuilder.curveTo(7.02f, 18.65f, 5.35f, 16.98f, 4.54f, 14.87f);
        pathBuilder.close();
        pathBuilder.moveTo(14.88f, 19.46f);
        pathBuilder.lineToRelative(-1.15f, -2.78f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f);
        pathBuilder.lineToRelative(2.78f, 1.17f);
        pathBuilder5.curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _support = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
