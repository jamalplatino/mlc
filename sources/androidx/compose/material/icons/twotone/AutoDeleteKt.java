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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoDelete", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoDelete", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoDelete", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoDelete.kt */
public final class AutoDeleteKt {
    private static ImageVector _autoDelete;

    public static final ImageVector getAutoDelete(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _autoDelete;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("TwoTone.AutoDelete", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(5.08f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(9.03f, 16.67f, 9.0f, 16.34f, 9.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, -2.38f, 1.19f, -4.47f, 3.0f, -5.74f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 2.0f);
        pathBuilder3.lineToRelative(-3.5f, 0.0f);
        pathBuilder3.lineToRelative(-1.0f, -1.0f);
        pathBuilder3.lineToRelative(-5.0f, 0.0f);
        pathBuilder3.lineToRelative(-1.0f, 1.0f);
        pathBuilder3.lineToRelative(-3.5f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 2.0f);
        pathBuilder3.lineToRelative(14.0f, 0.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 9.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f);
        pathBuilder4.verticalLineTo(5.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(5.68f);
        pathBuilder5.curveToRelative(1.12f, 2.36f, 3.53f, 4.0f, 6.32f, 4.0f);
        pathBuilder5.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder5.curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 16.0f);
        pathBuilder5.curveToRelative(0.0f, 0.34f, 0.03f, 0.67f, 0.08f, 1.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineTo(7.0f);
        pathBuilder4.horizontalLineToRelative(8.0f);
        pathBuilder4.verticalLineToRelative(3.26f);
        pathBuilder5.curveTo(10.19f, 11.53f, 9.0f, 13.62f, 9.0f, 16.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.0f, 21.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder4.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder4.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder4.reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.5f, 12.0f);
        pathBuilder6.lineToRelative(-1.5f, 0.0f);
        pathBuilder6.lineToRelative(0.0f, 5.0f);
        pathBuilder6.lineToRelative(3.6f, 2.1f);
        pathBuilder6.lineToRelative(0.8f, -1.2f);
        pathBuilder6.lineToRelative(-2.9f, -1.7f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoDelete = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
