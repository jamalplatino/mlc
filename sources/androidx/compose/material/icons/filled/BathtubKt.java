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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bathtub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Bathtub", "Landroidx/compose/material/icons/Icons$Filled;", "getBathtub", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Bathtub.kt */
public final class BathtubKt {
    private static ImageVector _bathtub;

    public static final ImageVector getBathtub(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _bathtub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.Bathtub", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 13.0f);
        pathBuilder3.verticalLineTo(4.83f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(20.0f, 3.27f, 18.73f, 2.0f, 17.17f, 2.0f);
        pathBuilder4.curveToRelative(-0.75f, 0.0f, -1.47f, 0.3f, -2.0f, 0.83f);
        pathBuilder3.lineToRelative(-1.25f, 1.25f);
        pathBuilder4.curveTo(13.76f, 4.03f, 13.59f, 4.0f, 13.41f, 4.0f);
        pathBuilder4.curveToRelative(-0.4f, 0.0f, -0.77f, 0.12f, -1.08f, 0.32f);
        pathBuilder3.lineToRelative(2.76f, 2.76f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.2f, -0.31f, 0.32f, -0.68f, 0.32f, -1.08f);
        pathBuilder5.curveToRelative(0.0f, -0.18f, -0.03f, -0.34f, -0.07f, -0.51f);
        pathBuilder3.lineToRelative(1.25f, -1.25f);
        pathBuilder5.curveTo(16.74f, 4.09f, 16.95f, 4.0f, 17.17f, 4.0f);
        pathBuilder5.curveTo(17.63f, 4.0f, 18.0f, 4.37f, 18.0f, 4.83f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.horizontalLineToRelative(-6.85f);
        pathBuilder3.curveToRelative(-0.3f, -0.21f, -0.57f, -0.45f, -0.82f, -0.72f);
        pathBuilder3.lineToRelative(-1.4f, -1.55f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        pathBuilder6.curveTo(7.93f, 10.08f, 7.59f, 10.0f, 7.24f, 10.0f);
        pathBuilder6.curveTo(6.0f, 10.01f, 5.0f, 11.01f, 5.0f, 12.25f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineToRelative(6.0f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        PathBuilder pathBuilder8 = pathBuilder3;
        pathBuilder8.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder8.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineToRelative(-6.0f);
        pathBuilder3.horizontalLineTo(20.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bathtub = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}