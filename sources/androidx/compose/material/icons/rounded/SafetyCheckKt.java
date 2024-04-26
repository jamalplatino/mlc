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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_safetyCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SafetyCheck", "Landroidx/compose/material/icons/Icons$Rounded;", "getSafetyCheck", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SafetyCheck.kt */
public final class SafetyCheckKt {
    private static ImageVector _safetyCheck;

    public static final ImageVector getSafetyCheck(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _safetyCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SafetyCheck", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.3f, 2.26f);
        pathBuilder.lineToRelative(-6.0f, 2.25f);
        pathBuilder.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        pathBuilder.verticalLineToRelative(4.7f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        pathBuilder2.curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        pathBuilder2.curveToRelative(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        pathBuilder.lineToRelative(-6.0f, -2.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder3.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(14.76f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 14.0f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-1.65f, -1.65f);
        pathBuilder.curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f);
        pathBuilder.verticalLineTo(9.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(11.5f, 9.22f, 11.72f, 9.0f, 12.0f, 9.0f);
        pathBuilder4.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(2.29f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(14.2f, 13.49f, 14.2f, 13.8f, 14.0f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _safetyCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
