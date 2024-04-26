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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localPizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPizza", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLocalPizza", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalPizza.kt */
public final class LocalPizzaKt {
    private static ImageVector _localPizza;

    public static final ImageVector getLocalPizza(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _localPizza;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.LocalPizza", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.51f, 6.36f);
        pathBuilder.lineTo(12.0f, 17.92f);
        pathBuilder.lineToRelative(6.49f, -11.55f);
        pathBuilder.curveTo(16.68f, 4.85f, 14.38f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.68f, 0.85f, -6.49f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(8.17f, 5.5f, 9.0f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(9.82f, 8.5f, 9.0f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.83f, -0.68f, 1.5f, -1.5f, 1.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f);
        pathBuilder3.lineTo(12.0f, 22.0f);
        pathBuilder3.lineToRelative(8.99f, -16.0f);
        pathBuilder4.curveTo(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 17.92f);
        pathBuilder3.lineTo(5.51f, 6.36f);
        pathBuilder4.curveTo(7.32f, 4.85f, 9.62f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f);
        pathBuilder3.lineTo(12.0f, 17.92f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 5.5f);
        pathBuilder4.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder3.reflectiveCurveTo(8.17f, 8.5f, 9.0f, 8.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveTo(9.82f, 5.5f, 9.0f, 5.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.5f, 13.0f);
        pathBuilder4.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder4.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localPizza = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
