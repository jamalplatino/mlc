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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dry", "Landroidx/compose/material/icons/Icons$Sharp;", "getDry", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Dry.kt */
public final class DryKt {
    private static ImageVector _dry;

    public static final ImageVector getDry(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _dry;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Dry", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 12.68f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.lineToRelative(1.88f, -3.3f);
        pathBuilder.lineTo(9.12f, 5.0f);
        pathBuilder.lineTo(1.0f, 12.68f);
        pathBuilder.close();
        pathBuilder.moveTo(15.65f, 4.86f);
        pathBuilder.lineToRelative(-0.07f, -0.07f);
        pathBuilder.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder.lineTo(15.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.89f);
        pathBuilder.lineToRelative(-0.06f, 0.43f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder.lineToRelative(0.07f, 0.06f);
        pathBuilder2.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder.lineTo(14.98f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.91f);
        pathBuilder.lineToRelative(0.06f, -0.43f);
        pathBuilder.curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 4.86f);
        pathBuilder.lineToRelative(-0.07f, -0.07f);
        pathBuilder.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder.lineTo(19.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.89f);
        pathBuilder.lineToRelative(-0.06f, 0.43f);
        pathBuilder.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder.lineToRelative(0.07f, 0.06f);
        pathBuilder.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder.lineTo(18.98f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.91f);
        pathBuilder.lineToRelative(0.06f, -0.43f);
        pathBuilder.curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dry = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
