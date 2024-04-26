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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_liquor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Liquor", "Landroidx/compose/material/icons/Icons$Rounded;", "getLiquor", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Liquor.kt */
public final class LiquorKt {
    private static ImageVector _liquor;

    public static final ImageVector getLiquor(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _liquor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Liquor", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 14.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-3.18f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.64f, 8.54f);
        pathBuilder4.lineToRelative(-0.96f, -0.32f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(19.27f, 8.08f, 19.0f, 7.7f, 19.0f, 7.27f);
        pathBuilder4.verticalLineTo(3.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.horizontalLineToRelative(-3.0f);
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder4.verticalLineToRelative(4.28f);
        pathBuilder5.curveToRelative(0.0f, 0.43f, -0.27f, 0.81f, -0.68f, 0.95f);
        pathBuilder4.lineToRelative(-0.96f, 0.32f);
        pathBuilder5.curveTo(11.55f, 8.83f, 11.0f, 9.59f, 11.0f, 10.45f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(7.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.verticalLineToRelative(-9.56f);
        pathBuilder5.curveTo(22.0f, 9.58f, 21.45f, 8.82f, 20.64f, 8.54f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.0f, 4.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.verticalLineToRelative(1.0f);
        pathBuilder4.horizontalLineToRelative(-1.0f);
        pathBuilder4.verticalLineTo(4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 10.44f);
        pathBuilder4.lineToRelative(0.95f, -0.32f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveTo(15.18f, 9.72f, 16.0f, 8.57f, 16.0f, 7.28f);
        pathBuilder4.verticalLineTo(7.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.verticalLineToRelative(0.28f);
        pathBuilder6.curveToRelative(0.0f, 1.29f, 0.82f, 2.44f, 2.05f, 2.85f);
        pathBuilder4.lineTo(20.0f, 10.44f);
        pathBuilder4.verticalLineTo(12.0f);
        pathBuilder4.horizontalLineToRelative(-7.0f);
        pathBuilder4.verticalLineTo(10.44f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 20.0f);
        pathBuilder4.horizontalLineToRelative(-7.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(7.0f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _liquor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
