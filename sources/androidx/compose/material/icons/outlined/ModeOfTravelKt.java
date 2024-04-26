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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_modeOfTravel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ModeOfTravel", "Landroidx/compose/material/icons/Icons$Outlined;", "getModeOfTravel", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModeOfTravel.kt */
public final class ModeOfTravelKt {
    private static ImageVector _modeOfTravel;

    public static final ImageVector getModeOfTravel(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _modeOfTravel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.ModeOfTravel", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.31f, 18.9f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.96f, 1.0f, -2.06f, 2.03f, -3.31f, 3.1f);
        pathBuilder2.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder2.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveToRelative(4.19f, 0.0f, 7.99f, 3.21f, 8.0f, 8.17f);
        pathBuilder.lineToRelative(2.09f, -2.09f);
        pathBuilder.lineTo(23.5f, 9.5f);
        pathBuilder.lineTo(19.0f, 14.0f);
        pathBuilder.lineToRelative(-4.5f, -4.5f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(18.0f, 10.17f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(17.99f, 6.55f, 15.34f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f);
        pathBuilder3.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder3.curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f);
        pathBuilder3.curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f);
        pathBuilder3.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(17.38f, 19.0f, 16.0f, 19.0f);
        pathBuilder.curveTo(15.76f, 19.0f, 15.53f, 18.97f, 15.31f, 18.9f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _modeOfTravel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}