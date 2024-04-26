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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyShare", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmergencyShare", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EmergencyShare.kt */
public final class EmergencyShareKt {
    private static ImageVector _emergencyShare;

    public static final ImageVector getEmergencyShare(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _emergencyShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.EmergencyShare", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f);
        pathBuilder2.curveToRelative(0.0f, 2.35f, 1.78f, 5.11f, 5.34f, 8.27f);
        pathBuilder2.curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        pathBuilder2.curveTo(16.22f, 20.25f, 18.0f, 17.5f, 18.0f, 15.15f);
        pathBuilder2.curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(12.83f, 16.5f, 12.0f, 16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.18f, 6.82f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.35f, 0.35f, -0.89f, 0.38f, -1.3f, 0.09f);
        pathBuilder3.curveTo(14.07f, 6.34f, 13.07f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveTo(9.93f, 6.34f, 9.12f, 6.91f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.41f, 0.28f, -0.95f, 0.26f, -1.3f, -0.09f);
        pathBuilder4.curveToRelative(-0.43f, -0.43f, -0.39f, -1.15f, 0.09f, -1.5f);
        pathBuilder4.curveTo(9.06f, 4.49f, 10.48f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(2.94f, 0.49f, 4.09f, 1.32f);
        pathBuilder.curveTo(16.58f, 5.67f, 16.61f, 6.39f, 16.18f, 6.82f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 3.97f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(4.55f, 3.54f, 4.59f, 2.85f, 5.05f, 2.47f);
        pathBuilder5.curveTo(6.95f, 0.93f, 9.37f, 0.0f, 12.01f, 0.0f);
        pathBuilder5.curveToRelative(2.64f, 0.0f, 5.06f, 0.93f, 6.95f, 2.48f);
        pathBuilder5.curveToRelative(0.46f, 0.38f, 0.5f, 1.07f, 0.08f, 1.49f);
        pathBuilder5.curveToRelative(-0.36f, 0.36f, -0.93f, 0.39f, -1.32f, 0.07f);
        pathBuilder5.curveTo(16.16f, 2.77f, 14.17f, 2.0f, 12.01f, 2.0f);
        pathBuilder5.curveTo(9.83f, 2.0f, 7.84f, 2.77f, 6.29f, 4.04f);
        pathBuilder5.curveTo(5.9f, 4.36f, 5.33f, 4.32f, 4.97f, 3.97f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _emergencyShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
