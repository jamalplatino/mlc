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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fastfood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fastfood", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFastfood", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Fastfood.kt */
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.Fastfood", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 21.98f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.56f, 0.45f, 1.01f, 1.01f, 1.01f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder2.curveToRelative(0.56f, 0.0f, 1.01f, -0.45f, 1.01f, -1.01f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(0.98f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.5f, 10.99f);
        pathBuilder3.curveToRelative(-1.42f, 0.0f, -3.77f, 0.46f, -4.88f, 2.01f);
        pathBuilder3.horizontalLineToRelative(9.77f);
        pathBuilder3.curveToRelative(-1.12f, -1.55f, -3.47f, -2.01f, -4.89f, -2.01f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.5f, 8.99f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f);
        pathBuilder4.horizontalLineToRelative(15.0f);
        pathBuilder5.curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f);
        pathBuilder4.close();
        pathBuilder4.moveTo(3.62f, 13.0f);
        pathBuilder4.curveToRelative(1.11f, -1.55f, 3.47f, -2.01f, 4.88f, -2.01f);
        pathBuilder4.reflectiveCurveToRelative(3.77f, 0.46f, 4.88f, 2.01f);
        pathBuilder4.horizontalLineTo(3.62f);
        pathBuilder4.close();
        pathBuilder4.moveTo(1.0f, 17.0f);
        pathBuilder4.horizontalLineToRelative(15.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineTo(1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.0f, 5.0f);
        pathBuilder4.verticalLineTo(1.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(4.0f);
        pathBuilder4.horizontalLineToRelative(-5.0f);
        pathBuilder4.lineToRelative(0.23f, 2.0f);
        pathBuilder4.horizontalLineToRelative(9.56f);
        pathBuilder4.lineToRelative(-1.4f, 14.0f);
        pathBuilder4.horizontalLineTo(18.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(1.72f);
        pathBuilder4.curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f);
        pathBuilder4.lineTo(23.0f, 5.0f);
        pathBuilder4.horizontalLineToRelative(-5.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fastfood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
