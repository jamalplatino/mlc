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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noPhotography", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoPhotography", "Landroidx/compose/material/icons/Icons$Sharp;", "getNoPhotography", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoPhotography.kt */
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.NoPhotography", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.94f, 8.12f);
        pathBuilder.lineTo(7.48f, 4.66f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(14.17f);
        pathBuilder.lineToRelative(-5.12f, -5.12f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder2.curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 23.31f);
        pathBuilder.lineTo(18.17f, 21.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(0.17f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineTo(21.0f, 21.0f);
        pathBuilder.lineToRelative(0.9f, 0.9f);
        pathBuilder.lineTo(20.49f, 23.31f);
        pathBuilder.close();
        pathBuilder.moveTo(14.49f, 17.32f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f);
        pathBuilder3.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder3.curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        pathBuilder3.curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f);
        pathBuilder3.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noPhotography = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
