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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_downhillSkiing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DownhillSkiing", "Landroidx/compose/material/icons/Icons$Rounded;", "getDownhillSkiing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DownhillSkiing.kt */
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.DownhillSkiing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.78f, 20.9f);
        pathBuilder.lineToRelative(0.76f, 0.27f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        pathBuilder2.curveToRelative(0.68f, 0.0f, 1.34f, -0.12f, 1.95f, -0.33f);
        pathBuilder2.curveToRelative(0.27f, -0.09f, 0.57f, -0.02f, 0.78f, 0.18f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, 0.4f, 0.23f, 1.06f, -0.3f, 1.24f);
        pathBuilder2.curveTo(20.17f, 22.86f, 19.35f, 23.0f, 18.5f, 23.0f);
        pathBuilder2.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        pathBuilder.lineTo(2.7f, 17.72f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.39f, -0.14f, -0.59f, -0.57f, -0.45f, -0.95f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.45f);
        pathBuilder.lineToRelative(6.19f, 2.25f);
        pathBuilder.lineToRelative(1.72f, -4.44f);
        pathBuilder.lineTo(7.55f, 10.4f);
        pathBuilder.curveTo(6.65f, 9.46f, 6.87f, 7.93f, 8.0f, 7.28f);
        pathBuilder.lineToRelative(3.48f, -2.01f);
        pathBuilder.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        pathBuilder.lineToRelative(0.33f, 1.08f);
        pathBuilder.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        pathBuilder.lineToRelative(0.29f, -0.89f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.13f, -0.39f, 0.55f, -0.61f, 0.94f, -0.48f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.4f, 0.13f, 0.61f, 0.55f, 0.48f, 0.95f);
        pathBuilder.lineToRelative(-0.6f, 1.85f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.17f, 0.52f, -0.72f, 0.82f, -1.24f, 0.65f);
        pathBuilder5.curveToRelative(-2.02f, -0.63f, -3.64f, -2.15f, -4.42f, -4.1f);
        pathBuilder.lineToRelative(-2.53f, 1.45f);
        pathBuilder.lineToRelative(2.23f, 2.55f);
        pathBuilder.curveToRelative(0.49f, 0.56f, 0.63f, 1.34f, 0.36f, 2.04f);
        pathBuilder.lineToRelative(-1.78f, 4.63f);
        pathBuilder.lineToRelative(3.09f, 1.12f);
        pathBuilder.lineToRelative(2.1f, -6.44f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        pathBuilder.lineTo(15.78f, 20.9f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _downhillSkiing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
