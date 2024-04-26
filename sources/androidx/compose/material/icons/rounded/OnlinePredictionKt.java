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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_onlinePrediction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OnlinePrediction", "Landroidx/compose/material/icons/Icons$Rounded;", "getOnlinePrediction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: OnlinePrediction.kt */
public final class OnlinePredictionKt {
    private static ImageVector _onlinePrediction;

    public static final ImageVector getOnlinePrediction(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _onlinePrediction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.OnlinePrediction", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 11.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder2.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -2.46f, -0.89f, -4.71f, -2.36f, -6.45f);
        pathBuilder4.curveToRelative(-0.29f, -0.34f, -0.8f, -0.38f, -1.12f, -0.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(-0.27f, 0.27f, -0.3f, 0.71f, -0.06f, 1.0f);
        pathBuilder4.curveTo(19.73f, 7.97f, 20.5f, 9.9f, 20.5f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 2.1f, -0.77f, 4.03f, -2.04f, 5.52f);
        pathBuilder4.curveToRelative(-0.25f, 0.29f, -0.21f, 0.73f, 0.06f, 1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.32f, 0.32f, 0.83f, 0.28f, 1.12f, -0.06f);
        pathBuilder4.curveTo(21.11f, 16.71f, 22.0f, 14.46f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 12.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, -2.1f, 0.77f, -4.03f, 2.04f, -5.52f);
        pathBuilder5.curveToRelative(0.25f, -0.29f, 0.21f, -0.73f, -0.06f, -1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveTo(5.17f, 5.17f, 4.65f, 5.2f, 4.36f, 5.54f);
        pathBuilder5.curveTo(2.89f, 7.29f, 2.0f, 9.54f, 2.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 2.46f, 0.89f, 4.71f, 2.36f, 6.46f);
        pathBuilder5.curveToRelative(0.29f, 0.34f, 0.8f, 0.38f, 1.12f, 0.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.27f, -0.27f, 0.3f, -0.71f, 0.06f, -1.0f);
        pathBuilder5.curveTo(4.27f, 16.03f, 3.5f, 14.1f, 3.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.28f, -0.44f, 2.47f, -1.18f, 3.41f);
        pathBuilder5.curveToRelative(-0.23f, 0.29f, -0.2f, 0.71f, 0.07f, 0.98f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.32f, 0.32f, 0.85f, 0.29f, 1.13f, -0.07f);
        pathBuilder5.curveTo(18.44f, 15.13f, 19.0f, 13.63f, 19.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -1.63f, -0.56f, -3.13f, -1.49f, -4.31f);
        pathBuilder5.curveToRelative(-0.28f, -0.36f, -0.81f, -0.39f, -1.13f, -0.07f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(-0.26f, 0.26f, -0.3f, 0.68f, -0.07f, 0.98f);
        pathBuilder5.curveTo(17.06f, 9.53f, 17.5f, 10.72f, 17.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.62f, 16.38f);
        pathBuilder.lineTo(7.62f, 16.38f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.26f, -0.26f, 0.3f, -0.68f, 0.07f, -0.98f);
        pathBuilder6.curveTo(6.94f, 14.47f, 6.5f, 13.28f, 6.5f, 12.0f);
        pathBuilder6.curveToRelative(0.0f, -1.28f, 0.44f, -2.47f, 1.18f, -3.41f);
        pathBuilder6.curveToRelative(0.23f, -0.29f, 0.2f, -0.71f, -0.07f, -0.98f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveTo(7.3f, 7.3f, 6.77f, 7.33f, 6.49f, 7.68f);
        pathBuilder6.curveTo(5.56f, 8.87f, 5.0f, 10.37f, 5.0f, 12.0f);
        pathBuilder6.curveToRelative(0.0f, 1.63f, 0.56f, 3.13f, 1.49f, 4.32f);
        pathBuilder6.curveTo(6.77f, 16.67f, 7.3f, 16.7f, 7.62f, 16.38f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _onlinePrediction = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
