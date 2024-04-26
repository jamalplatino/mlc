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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_handyman", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handyman", "Landroidx/compose/material/icons/Icons$Sharp;", "getHandyman", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Handyman.kt */
public final class HandymanKt {
    private static ImageVector _handyman;

    public static final ImageVector getHandyman(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _handyman;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Sharp.Handyman", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.37f, 12.87f);
        pathBuilder.horizontalLineToRelative(-0.99f);
        pathBuilder.lineToRelative(-2.54f, 2.54f);
        pathBuilder.verticalLineToRelative(0.99f);
        pathBuilder.lineToRelative(6.01f, 6.01f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.lineTo(16.37f, 12.87f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.34f, 10.19f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.verticalLineTo(1.71f);
        pathBuilder2.lineTo(15.22f, 1.0f);
        pathBuilder2.lineToRelative(-3.54f, 3.54f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.horizontalLineToRelative(2.83f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.06f, 1.06f);
        pathBuilder2.lineToRelative(-2.89f, 2.89f);
        pathBuilder2.lineTo(7.85f, 6.48f);
        pathBuilder2.verticalLineTo(5.06f);
        pathBuilder2.lineTo(4.83f, 2.04f);
        pathBuilder2.lineTo(2.0f, 4.87f);
        pathBuilder2.lineToRelative(3.03f, 3.03f);
        pathBuilder2.horizontalLineToRelative(1.41f);
        pathBuilder2.lineToRelative(4.13f, 4.13f);
        pathBuilder2.lineToRelative(-0.85f, 0.85f);
        pathBuilder2.horizontalLineTo(7.6f);
        pathBuilder2.lineToRelative(-6.01f, 6.01f);
        pathBuilder2.lineToRelative(3.54f, 3.54f);
        pathBuilder2.lineToRelative(6.01f, -6.01f);
        pathBuilder2.verticalLineToRelative(-2.12f);
        pathBuilder2.lineToRelative(5.15f, -5.15f);
        pathBuilder2.lineTo(17.34f, 10.19f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _handyman = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
