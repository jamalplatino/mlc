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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_yard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Yard", "Landroidx/compose/material/icons/Icons$Filled;", "getYard", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Yard.kt */
public final class YardKt {
    private static ImageVector _yard;

    public static final ImageVector getYard(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _yard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.Yard", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder2.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 8.22f);
        pathBuilder2.curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f);
        pathBuilder2.curveToRelative(0.33f, 0.0f, 0.64f, 0.1f, 0.89f, 0.28f);
        pathBuilder.lineToRelative(-0.01f, -0.12f);
        pathBuilder2.curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f);
        pathBuilder.reflectiveCurveToRelative(1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder.lineToRelative(-0.01f, 0.12f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.26f, -0.18f, 0.56f, -0.28f, 0.89f, -0.28f);
        pathBuilder3.curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder3.curveToRelative(0.0f, 0.62f, -0.37f, 1.16f, -0.89f, 1.4f);
        pathBuilder3.curveTo(15.63f, 9.87f, 16.0f, 10.41f, 16.0f, 11.03f);
        pathBuilder3.curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder3.curveToRelative(-0.33f, 0.0f, -0.64f, -0.11f, -0.89f, -0.28f);
        pathBuilder.lineToRelative(0.01f, 0.12f);
        pathBuilder3.curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder.reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f);
        pathBuilder.lineToRelative(0.01f, -0.12f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.26f, 0.18f, -0.56f, 0.28f, -0.89f, 0.28f);
        pathBuilder4.curveTo(8.7f, 12.59f, 8.0f, 11.89f, 8.0f, 11.03f);
        pathBuilder4.curveToRelative(0.0f, -0.62f, 0.37f, -1.16f, 0.89f, -1.4f);
        pathBuilder4.curveTo(8.37f, 9.38f, 8.0f, 8.84f, 8.0f, 8.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder4.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder4.curveTo(9.31f, 13.0f, 12.0f, 15.69f, 12.0f, 19.0f);
        pathBuilder4.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder4.curveTo(18.0f, 16.31f, 15.31f, 19.0f, 12.0f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 9.62f);
        pathBuilder5.moveToRelative(-1.56f, 0.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.arcToRelative(1.56f, 1.56f, 0.0f, true, true, 3.12f, 0.0f);
        pathBuilder6.arcToRelative(1.56f, 1.56f, 0.0f, true, true, -3.12f, 0.0f);
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _yard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
