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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_forest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forest", "Landroidx/compose/material/icons/Icons$Rounded;", "getForest", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Forest.kt */
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.Forest", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.14f, 12.0f);
        pathBuilder.horizontalLineToRelative(-0.06f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        pathBuilder.lineTo(9.82f, 3.17f);
        pathBuilder.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        pathBuilder.lineTo(3.1f, 10.43f);
        pathBuilder.curveTo(2.64f, 11.09f, 3.11f, 12.0f, 3.92f, 12.0f);
        pathBuilder.horizontalLineTo(3.86f);
        pathBuilder.lineToRelative(-2.87f, 4.46f);
        pathBuilder.curveTo(0.56f, 17.12f, 1.04f, 18.0f, 1.83f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.17f);
        pathBuilder.curveToRelative(0.79f, 0.0f, 1.27f, -0.88f, 0.84f, -1.54f);
        pathBuilder.lineTo(14.14f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(23.01f, 16.46f);
        pathBuilder2.lineTo(20.14f, 12.0f);
        pathBuilder2.horizontalLineToRelative(-0.06f);
        pathBuilder2.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        pathBuilder2.lineToRelative(-5.08f, -7.26f);
        pathBuilder2.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        pathBuilder2.lineToRelative(-1.57f, 2.24f);
        pathBuilder2.lineToRelative(3.11f, 4.44f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(0.43f, 0.61f, 0.48f, 1.41f, 0.14f, 2.07f);
        pathBuilder3.curveToRelative(-0.08f, 0.16f, -0.18f, 0.3f, -0.3f, 0.43f);
        pathBuilder2.lineToRelative(2.29f, 3.57f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveToRelative(0.4f, 0.62f, 0.42f, 1.4f, 0.07f, 2.04f);
        pathBuilder4.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.04f);
        pathBuilder2.horizontalLineToRelative(4.28f);
        pathBuilder4.curveTo(22.96f, 18.0f, 23.44f, 17.12f, 23.01f, 16.46f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(13.0f, 20.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.horizontalLineToRelative(-4.0f);
        pathBuilder5.verticalLineTo(20.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _forest = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
