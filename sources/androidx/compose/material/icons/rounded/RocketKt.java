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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rocket", "Landroidx/compose/material/icons/Icons$Rounded;", "getRocket", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Rocket.kt */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Rocket", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.41f, 2.87f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.35f, -0.26f, 0.82f, -0.26f, 1.18f, 0.0f);
        pathBuilder2.curveTo(13.81f, 3.75f, 16.5f, 6.46f, 16.5f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 2.16f, -0.78f, 4.76f, -1.36f, 6.35f);
        pathBuilder2.curveTo(15.0f, 19.74f, 14.63f, 20.0f, 14.21f, 20.0f);
        pathBuilder.lineToRelative(-4.41f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.42f, 0.0f, -0.8f, -0.26f, -0.94f, -0.65f);
        pathBuilder3.curveTo(8.28f, 17.76f, 7.5f, 15.16f, 7.5f, 13.0f);
        pathBuilder3.curveTo(7.5f, 6.46f, 10.19f, 3.75f, 11.41f, 2.87f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.69f, 20.52f);
        pathBuilder.curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f);
        pathBuilder.lineToRelative(-1.13f, 0.75f);
        pathBuilder.curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f);
        pathBuilder.verticalLineToRelative(4.45f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.71f, 1.19f, 1.37f, 0.93f);
        pathBuilder.lineTo(7.69f, 20.52f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.52f);
        pathBuilder.verticalLineToRelative(-4.45f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f);
        pathBuilder.lineToRelative(-1.13f, -0.75f);
        pathBuilder.curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f);
        pathBuilder.lineToRelative(2.32f, 0.93f);
        pathBuilder.curveTo(19.29f, 21.71f, 20.0f, 21.23f, 20.0f, 20.52f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rocket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
