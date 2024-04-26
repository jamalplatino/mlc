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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_euro", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Euro", "Landroidx/compose/material/icons/Icons$Rounded;", "getEuro", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Euro.kt */
public final class EuroKt {
    private static ImageVector _euro;

    public static final ImageVector getEuro(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _euro;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Euro", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 18.5f);
        pathBuilder.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        pathBuilder.horizontalLineToRelative(5.14f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.33f, -0.66f, -0.15f, -1.45f, -0.89f, -1.45f);
        pathBuilder.horizontalLineToRelative(-5.8f);
        pathBuilder.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveTo(15.61f, 9.78f, 15.13f, 9.0f, 14.38f, 9.0f);
        pathBuilder.horizontalLineTo(9.24f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        pathBuilder4.curveToRelative(1.25f, 0.0f, 2.42f, 0.36f, 3.42f, 0.97f);
        pathBuilder4.curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f);
        pathBuilder4.curveTo(18.36f, 3.5f, 16.73f, 3.0f, 15.0f, 3.0f);
        pathBuilder4.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        pathBuilder.horizontalLineToRelative(-2.9f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(3.24f, 9.0f, 2.89f, 9.21f, 2.72f, 9.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveTo(2.39f, 10.22f, 2.87f, 11.0f, 3.62f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.44f);
        pathBuilder.curveTo(6.02f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        pathBuilder.horizontalLineTo(3.62f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.38f, 0.0f, -0.73f, 0.21f, -0.89f, 0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveTo(2.39f, 14.22f, 2.87f, 15.0f, 3.62f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.9f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        pathBuilder7.curveToRelative(1.74f, 0.0f, 3.36f, -0.49f, 4.74f, -1.35f);
        pathBuilder7.curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f);
        pathBuilder7.curveTo(17.42f, 18.15f, 16.26f, 18.5f, 15.0f, 18.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _euro = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
