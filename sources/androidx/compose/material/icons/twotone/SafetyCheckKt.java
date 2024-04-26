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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_safetyCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SafetyCheck", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSafetyCheck", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SafetyCheck.kt */
public final class SafetyCheckKt {
    private static ImageVector _safetyCheck;

    public static final ImageVector getSafetyCheck(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _safetyCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.SafetyCheck", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.14f);
        pathBuilder.lineTo(6.0f, 6.39f);
        pathBuilder.verticalLineToRelative(4.7f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f);
        pathBuilder2.curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.lineTo(12.0f, 4.14f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(14.76f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.65f, 14.35f);
        pathBuilder.lineToRelative(-2.15f, -2.15f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.79f);
        pathBuilder.lineToRelative(1.85f, 1.85f);
        pathBuilder.lineTo(13.65f, 14.35f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 2.0f);
        pathBuilder3.lineTo(4.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(6.09f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder4.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.lineTo(12.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 11.09f);
        pathBuilder4.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        pathBuilder4.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        pathBuilder3.verticalLineToRelative(-4.7f);
        pathBuilder3.lineToRelative(6.0f, -2.25f);
        pathBuilder3.lineToRelative(6.0f, 2.25f);
        pathBuilder3.verticalLineTo(11.09f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 7.0f);
        pathBuilder4.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder3.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.65f, 14.35f);
        pathBuilder3.lineToRelative(-2.15f, -2.15f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineToRelative(2.79f);
        pathBuilder3.lineToRelative(1.85f, 1.85f);
        pathBuilder3.lineTo(13.65f, 14.35f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _safetyCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
