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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noDrinks", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoDrinks", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoDrinks", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoDrinks.kt */
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NoDrinks", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.77f, 9.0f);
        pathBuilder.lineToRelative(-2.94f, 0.0f);
        pathBuilder.lineToRelative(1.55f, 1.56f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.19f, 21.19f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(8.23f, 8.23f);
        pathBuilder2.lineTo(11.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(-0.17f);
        pathBuilder2.lineToRelative(1.78f, 1.78f);
        pathBuilder2.lineTo(21.19f, 21.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 19.0f);
        pathBuilder2.verticalLineToRelative(-3.17f);
        pathBuilder2.lineTo(16.17f, 19.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.83f, 5.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(21.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-6.2f, 6.97f);
        pathBuilder2.lineToRelative(-1.42f, -1.42f);
        pathBuilder2.lineTo(14.77f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-2.94f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(6.74f);
        pathBuilder2.lineToRelative(1.78f, -2.0f);
        pathBuilder2.horizontalLineTo(7.83f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noDrinks = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}