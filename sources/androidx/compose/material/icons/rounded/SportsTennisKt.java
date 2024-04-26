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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsTennis", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsTennis", "Landroidx/compose/material/icons/Icons$Rounded;", "getSportsTennis", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsTennis.kt */
public final class SportsTennisKt {
    private static ImageVector _sportsTennis;

    public static final ImageVector getSportsTennis(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _sportsTennis;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.SportsTennis", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.52f, 2.49f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.34f, -2.34f, -6.62f, -1.87f, -9.55f, 1.06f);
        pathBuilder2.curveToRelative(-1.6f, 1.6f, -2.52f, 3.87f, -2.54f, 5.46f);
        pathBuilder2.curveToRelative(-0.02f, 1.58f, 0.26f, 3.89f, -1.35f, 5.5f);
        pathBuilder.lineToRelative(-3.54f, 3.53f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(3.53f, -3.54f);
        pathBuilder3.curveToRelative(1.61f, -1.61f, 3.92f, -1.33f, 5.5f, -1.35f);
        pathBuilder.reflectiveCurveToRelative(3.86f, -0.94f, 5.46f, -2.54f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(21.38f, 9.11f, 21.86f, 4.83f, 19.52f, 2.49f);
        pathBuilder.close();
        pathBuilder.moveTo(10.32f, 11.68f);
        pathBuilder4.curveToRelative(-1.53f, -1.53f, -1.05f, -4.61f, 1.06f, -6.72f);
        pathBuilder.reflectiveCurveToRelative(5.18f, -2.59f, 6.72f, -1.06f);
        pathBuilder.curveToRelative(1.53f, 1.53f, 1.05f, 4.61f, -1.06f, 6.72f);
        pathBuilder.reflectiveCurveTo(11.86f, 13.21f, 10.32f, 11.68f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(18.0f, 17.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f);
        pathBuilder6.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder6.curveTo(19.04f, 20.79f, 18.53f, 21.0f, 18.0f, 21.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.04f, -0.21f, -1.41f, -0.59f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder7.curveTo(16.96f, 17.21f, 17.47f, 17.0f, 18.0f, 17.0f);
        pathBuilder5.moveTo(18.0f, 15.0f);
        pathBuilder7.curveToRelative(-1.02f, 0.0f, -2.05f, 0.39f, -2.83f, 1.17f);
        pathBuilder7.curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        pathBuilder7.curveTo(15.95f, 22.61f, 16.98f, 23.0f, 18.0f, 23.0f);
        pathBuilder5.reflectiveCurveToRelative(2.05f, -0.39f, 2.83f, -1.17f);
        PathBuilder pathBuilder8 = pathBuilder5;
        pathBuilder8.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        pathBuilder8.curveTo(20.05f, 15.39f, 19.02f, 15.0f, 18.0f, 15.0f);
        pathBuilder5.lineTo(18.0f, 15.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsTennis = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
