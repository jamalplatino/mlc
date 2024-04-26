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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_park", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Park", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPark", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Park.kt */
public final class ParkKt {
    private static ImageVector _park;

    public static final ImageVector getPark(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _park;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Park", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.26f, 10.0f);
        pathBuilder.lineToRelative(1.9f, 0.0f);
        pathBuilder.lineToRelative(-3.15f, -4.5f);
        pathBuilder.lineToRelative(-3.13f, 4.5f);
        pathBuilder.lineToRelative(1.81f, 0.0f);
        pathBuilder.lineToRelative(-3.9f, 6.0f);
        pathBuilder.lineToRelative(10.47f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 12.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.lineTo(5.05f, 12.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.lineToRelative(-3.9f, 6.0f);
        pathBuilder2.horizontalLineToRelative(6.92f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(3.95f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineTo(21.0f);
        pathBuilder2.lineTo(17.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.79f, 16.0f);
        pathBuilder2.lineToRelative(3.9f, -6.0f);
        pathBuilder2.horizontalLineTo(8.88f);
        pathBuilder2.lineToRelative(3.13f, -4.5f);
        pathBuilder2.lineToRelative(3.15f, 4.5f);
        pathBuilder2.horizontalLineToRelative(-1.9f);
        pathBuilder2.lineToRelative(4.0f, 6.0f);
        pathBuilder2.horizontalLineTo(6.79f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _park = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
