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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noPhotography", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoPhotography", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoPhotography", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoPhotography.kt */
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NoPhotography", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.9f, 6.07f);
        pathBuilder.lineTo(7.48f, 4.66f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        pathBuilder.lineTo(20.0f, 17.17f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-4.05f);
        pathBuilder.lineToRelative(-1.83f, -2.0f);
        pathBuilder.horizontalLineTo(9.88f);
        pathBuilder.lineTo(8.9f, 6.07f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 23.31f);
        pathBuilder.lineTo(18.17f, 21.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder3.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineToRelative(19.8f, 19.8f);
        pathBuilder.lineTo(20.49f, 23.31f);
        pathBuilder.close();
        pathBuilder.moveTo(9.19f, 12.02f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(9.08f, 12.33f, 9.0f, 12.65f, 9.0f, 13.0f);
        pathBuilder4.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder4.curveToRelative(0.35f, 0.0f, 0.67f, -0.08f, 0.98f, -0.19f);
        pathBuilder.lineTo(9.19f, 12.02f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.lineToRelative(-1.68f, -1.68f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.76f, 17.75f, 12.91f, 18.0f, 12.0f, 18.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder5.curveToRelative(0.0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f);
        pathBuilder.lineTo(4.17f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineTo(16.17f);
        pathBuilder.close();
        pathBuilder.moveTo(14.81f, 11.98f);
        pathBuilder.lineToRelative(2.07f, 2.07f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        pathBuilder6.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder6.curveToRelative(-0.36f, 0.0f, -0.71f, 0.04f, -1.06f, 0.12f);
        pathBuilder.lineToRelative(2.07f, 2.07f);
        pathBuilder6.curveTo(13.85f, 10.49f, 14.51f, 11.15f, 14.81f, 11.98f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noPhotography = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
