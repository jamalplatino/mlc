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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyShare", "Landroidx/compose/material/icons/Icons$Outlined;", "getEmergencyShare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EmergencyShare.kt */
public final class EmergencyShareKt {
    private static ImageVector _emergencyShare;

    public static final ImageVector getEmergencyShare(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _emergencyShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.EmergencyShare", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.68f, 0.78f, 4.95f, 2.05f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.curveTo(14.63f, 6.56f, 13.38f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveTo(9.37f, 6.56f, 8.46f, 7.46f);
        pathBuilder.lineTo(7.05f, 6.05f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(8.32f, 4.78f, 10.07f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 3.23f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder3.curveTo(16.74f, 3.01f, 14.49f, 2.0f, 12.01f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.27f, 3.01f, 5.64f, 4.63f);
        pathBuilder.lineTo(4.22f, 3.22f);
        pathBuilder.curveTo(6.22f, 1.23f, 8.97f, 0.0f, 12.01f, 0.0f);
        pathBuilder.reflectiveCurveTo(17.79f, 1.23f, 19.78f, 3.23f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.94f, 0.0f, 4.0f, 1.45f, 4.0f, 4.15f);
        pathBuilder4.curveToRelative(0.0f, 0.94f, -0.55f, 2.93f, -4.0f, 6.17f);
        pathBuilder4.curveToRelative(-3.45f, -3.24f, -4.0f, -5.23f, -4.0f, -6.17f);
        pathBuilder4.curveTo(8.0f, 12.45f, 10.06f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f);
        pathBuilder5.curveToRelative(0.0f, 2.49f, 2.0f, 5.44f, 6.0f, 8.85f);
        pathBuilder5.curveToRelative(4.0f, -3.41f, 6.0f, -6.36f, 6.0f, -8.85f);
        pathBuilder5.curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 15.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder6.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder6.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder6.curveTo(12.83f, 16.5f, 13.5f, 15.83f, 13.5f, 15.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _emergencyShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
