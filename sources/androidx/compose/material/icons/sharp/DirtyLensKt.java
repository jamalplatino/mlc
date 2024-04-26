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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dirtyLens", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirtyLens", "Landroidx/compose/material/icons/Icons$Sharp;", "getDirtyLens", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DirtyLens.kt */
public final class DirtyLensKt {
    private static ImageVector _dirtyLens;

    public static final ImageVector getDirtyLens(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _dirtyLens;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.DirtyLens", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-5.17f);
        pathBuilder.lineTo(15.0f, 3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(7.17f, 5.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.66f, 16.58f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.14f, 1.86f, -3.0f, -1.03f, -3.81f, 0.09f);
        pathBuilder2.curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f);
        pathBuilder2.curveToRelative(0.0f, 0.47f, -0.38f, 0.85f, -0.85f, 0.85f);
        pathBuilder2.curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.85f);
        pathBuilder2.curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f);
        pathBuilder2.curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f);
        pathBuilder2.curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f);
        pathBuilder2.curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f);
        pathBuilder2.curveToRelative(-0.08f, -1.0f, 1.49f, -0.74f, 1.51f, -1.49f);
        pathBuilder2.curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f);
        pathBuilder2.curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f);
        pathBuilder2.curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f);
        pathBuilder2.curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0.0f, -2.86f);
        pathBuilder2.curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f);
        pathBuilder2.curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f);
        pathBuilder2.curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f);
        pathBuilder2.curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f);
        pathBuilder2.curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f);
        pathBuilder2.curveTo(15.08f, 15.29f, 17.43f, 15.01f, 16.66f, 16.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.14f, 18.01f);
        pathBuilder2.curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.86f);
        pathBuilder.reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.86f, 0.38f, 0.86f, 0.86f);
        pathBuilder.reflectiveCurveTo(18.62f, 18.01f, 18.14f, 18.01f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dirtyLens = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
