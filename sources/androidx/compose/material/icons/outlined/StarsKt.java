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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Stars", "Landroidx/compose/material/icons/Icons$Outlined;", "getStars", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Stars.kt */
public final class StarsKt {
    private static ImageVector _stars;

    public static final ImageVector getStars(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _stars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Stars", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.47f, 9.16f);
        pathBuilder.lineToRelative(-5.01f, -0.43f);
        pathBuilder.lineToRelative(-2.0f, -4.71f);
        pathBuilder.curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f);
        pathBuilder.close();
        pathBuilder.moveTo(14.4f, 15.42f);
        pathBuilder.lineTo(12.0f, 13.98f);
        pathBuilder.lineToRelative(-2.39f, 1.44f);
        pathBuilder.lineToRelative(0.63f, -2.72f);
        pathBuilder.lineToRelative(-2.11f, -1.83f);
        pathBuilder.lineToRelative(2.78f, -0.24f);
        pathBuilder.lineTo(12.0f, 8.06f);
        pathBuilder.lineToRelative(1.09f, 2.56f);
        pathBuilder.lineToRelative(2.78f, 0.24f);
        pathBuilder.lineToRelative(-2.11f, 1.83f);
        pathBuilder.lineToRelative(0.64f, 2.73f);
        pathBuilder.close();
        pathBuilder.moveTo(11.54f, 4.02f);
        pathBuilder.lineToRelative(-2.0f, 4.72f);
        pathBuilder.lineToRelative(-5.02f, 0.43f);
        pathBuilder.curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f);
        pathBuilder.lineToRelative(3.79f, 3.28f);
        pathBuilder.lineToRelative(-1.11f, 4.75f);
        pathBuilder.curveTo(5.13f, 16.7f, 4.0f, 14.48f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.84f, 18.82f);
        pathBuilder.lineTo(12.0f, 16.31f);
        pathBuilder.lineToRelative(4.16f, 2.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.22f, 0.75f, -2.64f, 1.19f, -4.17f, 1.19f);
        pathBuilder2.curveToRelative(-1.52f, 0.0f, -2.94f, -0.44f, -4.15f, -1.18f);
        pathBuilder.close();
        pathBuilder.moveTo(17.09f, 18.17f);
        pathBuilder.lineToRelative(-1.11f, -4.75f);
        pathBuilder.lineToRelative(3.79f, -3.28f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.14f, 0.59f, 0.23f, 1.22f, 0.23f, 1.86f);
        pathBuilder3.curveToRelative(0.0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _stars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
