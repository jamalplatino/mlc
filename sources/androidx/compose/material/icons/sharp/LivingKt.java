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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_living", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Living", "Landroidx/compose/material/icons/Icons$Sharp;", "getLiving", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Living.kt */
public final class LivingKt {
    private static ImageVector _living;

    public static final ImageVector getLiving(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _living;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Sharp.Living", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 12.0f);
        pathBuilder.lineToRelative(0.0f, 2.5f);
        pathBuilder.lineToRelative(-7.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -2.5f);
        pathBuilder.lineToRelative(-0.98f, 0.0f);
        pathBuilder.lineToRelative(-1.02f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 4.5f);
        pathBuilder.lineToRelative(11.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -4.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 10.0f);
        pathBuilder2.lineToRelative(0.0f, 3.0f);
        pathBuilder2.lineToRelative(4.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -3.0f);
        pathBuilder2.lineToRelative(2.25f, -0.01f);
        pathBuilder2.lineToRelative(0.0f, -2.49f);
        pathBuilder2.lineToRelative(-8.5f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.49f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 2.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineToRelative(20.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.verticalLineTo(2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 9.99f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        pathBuilder3.verticalLineToRelative(-8.0f);
        pathBuilder3.lineToRelative(1.25f, -0.01f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineToRelative(11.5f);
        pathBuilder3.verticalLineToRelative(3.99f);
        pathBuilder3.horizontalLineTo(19.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _living = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
