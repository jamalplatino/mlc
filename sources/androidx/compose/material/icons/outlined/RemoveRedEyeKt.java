package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeRedEye", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveRedEye", "Landroidx/compose/material/icons/Icons$Outlined;", "getRemoveRedEye", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RemoveRedEye.kt */
public final class RemoveRedEyeKt {
    private static ImageVector _removeRedEye;

    public static final ImageVector getRemoveRedEye(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _removeRedEye;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.RemoveRedEye", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        pathBuilder2.curveToRelative(-1.65f, 3.37f, -5.02f, 5.5f, -8.82f, 5.5f);
        pathBuilder.reflectiveCurveTo(4.83f, 15.37f, 3.18f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(4.83f, 8.63f, 8.21f, 6.5f, 12.0f, 6.5f);
        pathBuilder.moveToRelative(0.0f, -2.0f);
        pathBuilder3.curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        pathBuilder3.curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        pathBuilder.reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f);
        pathBuilder.curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.moveToRelative(0.0f, -2.0f);
        pathBuilder.curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder.reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _removeRedEye = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}