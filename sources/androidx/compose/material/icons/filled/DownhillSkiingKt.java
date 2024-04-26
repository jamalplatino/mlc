package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_downhillSkiing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DownhillSkiing", "Landroidx/compose/material/icons/Icons$Filled;", "getDownhillSkiing", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DownhillSkiing.kt */
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.DownhillSkiing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
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
        pathBuilder2.curveToRelative(0.84f, 0.0f, 1.65f, -0.18f, 2.38f, -0.5f);
        pathBuilder.lineTo(22.0f, 22.13f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(20.95f, 22.68f, 19.76f, 23.0f, 18.5f, 23.0f);
        pathBuilder3.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        pathBuilder.lineTo(2.0f, 17.47f);
        pathBuilder.lineToRelative(0.5f, -1.41f);
        pathBuilder.lineToRelative(6.9f, 2.51f);
        pathBuilder.lineToRelative(1.72f, -4.44f);
        pathBuilder.lineTo(7.55f, 10.4f);
        pathBuilder.curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8.0f, 7.28f);
        pathBuilder.lineToRelative(3.48f, -2.01f);
        pathBuilder.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        pathBuilder.lineToRelative(0.33f, 1.08f);
        pathBuilder.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        pathBuilder.lineTo(18.07f, 9.0f);
        pathBuilder.lineToRelative(1.43f, 0.46f);
        pathBuilder.lineToRelative(-1.12f, 3.45f);
        pathBuilder.curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f);
        pathBuilder.lineToRelative(-2.53f, 1.45f);
        pathBuilder.lineToRelative(3.03f, 3.46f);
        pathBuilder.lineToRelative(-2.22f, 5.76f);
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
