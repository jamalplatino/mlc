package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sledding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sledding", "Landroidx/compose/material/icons/Icons$Sharp;", "getSledding", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sledding.kt */
public final class SleddingKt {
    private static ImageVector _sledding;

    public static final ImageVector getSledding(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _sledding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Sledding", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.22f, 17.9f);
        pathBuilder.lineToRelative(1.93f, 0.63f);
        pathBuilder.lineToRelative(-0.46f, 1.43f);
        pathBuilder.lineToRelative(-3.32f, -1.08f);
        pathBuilder.lineTo(14.9f, 20.3f);
        pathBuilder.lineToRelative(3.32f, 1.08f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f);
        pathBuilder2.curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder2.curveToRelative(2.1f, 0.68f, 3.25f, 2.94f, 2.57f, 5.04f);
        pathBuilder2.curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(1.0f, 17.36f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineToRelative(3.93f, 1.28f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineTo(1.93f, 14.5f);
        pathBuilder.lineToRelative(0.46f, -1.43f);
        pathBuilder.lineTo(4.0f, 13.6f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.lineToRelative(5.47f, -2.35f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f);
        pathBuilder3.curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f);
        pathBuilder.lineToRelative(-1.05f, 3.24f);
        pathBuilder.lineTo(14.5f, 12.0f);
        pathBuilder.lineTo(17.22f, 17.9f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 14.25f);
        pathBuilder.lineToRelative(0.48f, 0.16f);
        pathBuilder.lineToRelative(0.75f, -2.31f);
        pathBuilder.lineTo(7.92f, 10.0f);
        pathBuilder.lineTo(6.0f, 10.82f);
        pathBuilder.verticalLineTo(14.25f);
        pathBuilder.close();
        pathBuilder.moveTo(13.94f, 18.41f);
        pathBuilder.lineToRelative(-6.66f, -2.16f);
        pathBuilder.lineToRelative(-0.46f, 1.43f);
        pathBuilder.lineToRelative(6.66f, 2.16f);
        pathBuilder.lineTo(13.94f, 18.41f);
        pathBuilder.close();
        pathBuilder.moveTo(14.63f, 17.05f);
        pathBuilder.lineToRelative(-1.18f, -2.56f);
        pathBuilder.lineToRelative(-3.97f, 0.89f);
        pathBuilder.lineTo(14.63f, 17.05f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sledding = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
