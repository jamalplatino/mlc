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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tvOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TvOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getTvOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TvOff.kt */
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.TvOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.verticalLineToRelative(10.88f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-9.58f);
        pathBuilder.lineToRelative(3.29f, -3.3f);
        pathBuilder.lineTo(16.0f, 1.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-0.7f, 0.7f);
        pathBuilder.lineTo(10.58f, 5.0f);
        pathBuilder.horizontalLineTo(8.12f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 2.13f);
        pathBuilder.lineToRelative(-0.14f, 0.14f);
        pathBuilder.lineTo(1.0f, 3.54f);
        pathBuilder.lineToRelative(1.53f, 1.53f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(17.46f);
        pathBuilder.lineToRelative(1.99f, 1.99f);
        pathBuilder.lineToRelative(1.26f, -1.26f);
        pathBuilder.lineToRelative(0.15f, -0.15f);
        pathBuilder.lineTo(2.41f, 2.13f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.46f);
        pathBuilder.lineToRelative(12.0f, 12.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _tvOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}