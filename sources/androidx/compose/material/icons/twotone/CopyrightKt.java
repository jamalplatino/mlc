package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_copyright", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Copyright", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCopyright", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Copyright.kt */
public final class CopyrightKt {
    private static ImageVector _copyright;

    public static final ImageVector getCopyright(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _copyright;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Copyright", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.08f, 13.14f);
        pathBuilder.curveToRelative(0.05f, 0.33f, 0.16f, 0.63f, 0.3f, 0.88f);
        pathBuilder.reflectiveCurveToRelative(0.34f, 0.46f, 0.59f, 0.62f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.23f, 0.15f, 0.53f, 0.22f, 0.89f, 0.23f);
        pathBuilder2.curveToRelative(0.21f, -0.01f, 0.41f, -0.03f, 0.6f, -0.1f);
        pathBuilder2.curveToRelative(0.2f, -0.07f, 0.37f, -0.17f, 0.52f, -0.3f);
        pathBuilder2.curveToRelative(0.15f, -0.13f, 0.27f, -0.28f, 0.36f, -0.46f);
        pathBuilder2.curveToRelative(0.09f, -0.18f, 0.14f, -0.37f, 0.15f, -0.58f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder2.curveToRelative(-0.01f, 0.41f, -0.12f, 0.79f, -0.3f, 1.15f);
        pathBuilder2.curveToRelative(-0.18f, 0.36f, -0.43f, 0.67f, -0.74f, 0.94f);
        pathBuilder2.curveToRelative(-0.31f, 0.27f, -0.67f, 0.48f, -1.08f, 0.63f);
        pathBuilder2.curveToRelative(-0.41f, 0.15f, -0.85f, 0.23f, -1.32f, 0.23f);
        pathBuilder2.curveToRelative(-0.65f, 0.0f, -1.22f, -0.12f, -1.7f, -0.34f);
        pathBuilder2.curveToRelative(-0.48f, -0.22f, -0.88f, -0.53f, -1.2f, -0.91f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -0.83f, -0.71f, -1.35f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.15f, -0.52f, -0.23f, -1.06f, -0.23f, -1.64f);
        pathBuilder.verticalLineToRelative(-0.27f);
        pathBuilder3.curveToRelative(0.0f, -0.58f, 0.09f, -1.12f, 0.24f, -1.64f);
        pathBuilder3.curveToRelative(0.15f, -0.52f, 0.39f, -0.97f, 0.71f, -1.36f);
        pathBuilder.reflectiveCurveToRelative(0.72f, -0.69f, 1.2f, -0.92f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.48f, -0.23f, 1.05f, -0.34f, 1.7f, -0.34f);
        pathBuilder4.curveToRelative(0.51f, 0.0f, 0.97f, 0.07f, 1.39f, 0.23f);
        pathBuilder4.curveToRelative(0.42f, 0.16f, 0.78f, 0.38f, 1.08f, 0.66f);
        pathBuilder4.curveToRelative(0.3f, 0.28f, 0.53f, 0.62f, 0.7f, 1.01f);
        pathBuilder4.curveToRelative(0.17f, 0.39f, 0.26f, 0.82f, 0.28f, 1.29f);
        pathBuilder.horizontalLineToRelative(-1.79f);
        pathBuilder4.curveToRelative(-0.01f, -0.22f, -0.05f, -0.44f, -0.14f, -0.64f);
        pathBuilder4.curveToRelative(-0.09f, -0.2f, -0.2f, -0.38f, -0.34f, -0.53f);
        pathBuilder4.curveToRelative(-0.14f, -0.15f, -0.32f, -0.27f, -0.52f, -0.36f);
        pathBuilder4.curveToRelative(-0.19f, -0.08f, -0.4f, -0.12f, -0.63f, -0.13f);
        pathBuilder4.curveToRelative(-0.37f, 0.01f, -0.67f, 0.08f, -0.91f, 0.23f);
        pathBuilder4.curveToRelative(-0.25f, 0.16f, -0.45f, 0.37f, -0.59f, 0.62f);
        pathBuilder.reflectiveCurveToRelative(-0.25f, 0.54f, -0.3f, 0.87f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.05f, 0.33f, -0.08f, 0.66f, -0.08f, 1.01f);
        pathBuilder.verticalLineToRelative(0.27f);
        pathBuilder5.curveToRelative(0.0f, 0.33f, 0.03f, 0.67f, 0.08f, 1.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(10.08f, 10.86f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(0.05f, -0.33f, 0.16f, -0.62f, 0.3f, -0.87f);
        pathBuilder6.reflectiveCurveToRelative(0.34f, -0.46f, 0.59f, -0.62f);
        pathBuilder7.curveToRelative(0.24f, -0.15f, 0.54f, -0.22f, 0.91f, -0.23f);
        pathBuilder7.curveToRelative(0.23f, 0.01f, 0.44f, 0.05f, 0.63f, 0.13f);
        pathBuilder7.curveToRelative(0.2f, 0.09f, 0.38f, 0.21f, 0.52f, 0.36f);
        pathBuilder6.reflectiveCurveToRelative(0.25f, 0.33f, 0.34f, 0.53f);
        pathBuilder7.curveToRelative(0.09f, 0.2f, 0.13f, 0.42f, 0.14f, 0.64f);
        pathBuilder6.horizontalLineToRelative(1.79f);
        pathBuilder7.curveToRelative(-0.02f, -0.47f, -0.11f, -0.9f, -0.28f, -1.29f);
        pathBuilder7.curveToRelative(-0.17f, -0.39f, -0.4f, -0.73f, -0.7f, -1.01f);
        pathBuilder7.curveToRelative(-0.3f, -0.28f, -0.66f, -0.5f, -1.08f, -0.66f);
        pathBuilder7.curveToRelative(-0.42f, -0.16f, -0.88f, -0.23f, -1.39f, -0.23f);
        pathBuilder7.curveToRelative(-0.65f, 0.0f, -1.22f, 0.11f, -1.7f, 0.34f);
        pathBuilder7.curveToRelative(-0.48f, 0.23f, -0.88f, 0.53f, -1.2f, 0.92f);
        pathBuilder6.reflectiveCurveToRelative(-0.56f, 0.84f, -0.71f, 1.36f);
        pathBuilder7.curveToRelative(-0.15f, 0.52f, -0.24f, 1.06f, -0.24f, 1.64f);
        pathBuilder6.verticalLineToRelative(0.27f);
        pathBuilder7.curveToRelative(0.0f, 0.58f, 0.08f, 1.12f, 0.23f, 1.64f);
        pathBuilder7.curveToRelative(0.15f, 0.52f, 0.39f, 0.97f, 0.71f, 1.35f);
        pathBuilder6.reflectiveCurveToRelative(0.72f, 0.69f, 1.2f, 0.91f);
        pathBuilder7.curveToRelative(0.48f, 0.22f, 1.05f, 0.34f, 1.7f, 0.34f);
        pathBuilder7.curveToRelative(0.47f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f);
        pathBuilder7.curveToRelative(0.41f, -0.15f, 0.77f, -0.36f, 1.08f, -0.63f);
        pathBuilder7.curveToRelative(0.31f, -0.27f, 0.56f, -0.58f, 0.74f, -0.94f);
        pathBuilder7.curveToRelative(0.18f, -0.36f, 0.29f, -0.74f, 0.3f, -1.15f);
        pathBuilder6.horizontalLineToRelative(-1.79f);
        pathBuilder7.curveToRelative(-0.01f, 0.21f, -0.06f, 0.4f, -0.15f, 0.58f);
        pathBuilder7.curveToRelative(-0.09f, 0.18f, -0.21f, 0.33f, -0.36f, 0.46f);
        pathBuilder6.reflectiveCurveToRelative(-0.32f, 0.23f, -0.52f, 0.3f);
        pathBuilder7.curveToRelative(-0.19f, 0.07f, -0.39f, 0.09f, -0.6f, 0.1f);
        pathBuilder7.curveToRelative(-0.36f, -0.01f, -0.66f, -0.08f, -0.89f, -0.23f);
        pathBuilder7.curveToRelative(-0.25f, -0.16f, -0.45f, -0.37f, -0.59f, -0.62f);
        pathBuilder6.reflectiveCurveToRelative(-0.25f, -0.55f, -0.3f, -0.88f);
        pathBuilder7.curveToRelative(-0.05f, -0.33f, -0.08f, -0.67f, -0.08f, -1.0f);
        pathBuilder6.verticalLineToRelative(-0.27f);
        pathBuilder7.curveToRelative(0.0f, -0.35f, 0.03f, -0.68f, 0.08f, -1.01f);
        pathBuilder6.close();
        pathBuilder6.moveTo(12.0f, 2.0f);
        pathBuilder7.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder6.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder6.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder6.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(12.0f, 20.0f);
        pathBuilder7.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder6.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder6.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder6.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _copyright = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
