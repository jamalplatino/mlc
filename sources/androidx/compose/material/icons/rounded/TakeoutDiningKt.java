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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_takeoutDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TakeoutDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getTakeoutDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TakeoutDining.kt */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.TakeoutDining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 6.75f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilder.lineTo(19.0f, 7.63f);
        pathBuilder.lineToRelative(0.03f, -0.56f);
        pathBuilder.lineToRelative(-3.46f, -3.48f);
        pathBuilder2.curveTo(15.19f, 3.21f, 14.68f, 3.0f, 14.15f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.3f);
        pathBuilder2.curveTo(9.32f, 3.0f, 8.81f, 3.21f, 8.43f, 3.59f);
        pathBuilder.lineTo(4.97f, 7.07f);
        pathBuilder.lineTo(5.0f, 7.57f);
        pathBuilder.lineTo(4.11f, 6.7f);
        pathBuilder2.curveTo(3.72f, 6.32f, 3.1f, 6.32f, 2.72f, 6.71f);
        pathBuilder.lineTo(2.7f, 6.73f);
        pathBuilder2.curveTo(2.32f, 7.12f, 2.32f, 7.75f, 2.72f, 8.13f);
        pathBuilder.lineTo(4.66f, 10.0f);
        pathBuilder.horizontalLineToRelative(14.69f);
        pathBuilder.lineToRelative(1.92f, -1.84f);
        pathBuilder2.curveTo(21.67f, 7.78f, 21.68f, 7.14f, 21.29f, 6.75f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(5.79f, 18.15f);
        pathBuilder3.curveTo(5.87f, 19.19f, 6.74f, 20.0f, 7.79f, 20.0f);
        pathBuilder3.horizontalLineToRelative(8.43f);
        pathBuilder3.curveToRelative(1.05f, 0.0f, 1.92f, -0.81f, 1.99f, -1.85f);
        pathBuilder3.lineToRelative(0.49f, -6.6f);
        pathBuilder3.horizontalLineTo(5.3f);
        pathBuilder3.lineTo(5.79f, 18.15f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _takeoutDining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
