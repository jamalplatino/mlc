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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_takeoutDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TakeoutDining", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTakeoutDining", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TakeoutDining.kt */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.TakeoutDining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.83f, 5.0f);
        pathBuilder.lineToRelative(-2.8f, 2.73f);
        pathBuilder.lineToRelative(0.09f, 1.27f);
        pathBuilder.lineToRelative(9.75f, 0.0f);
        pathBuilder.lineToRelative(0.09f, -1.27f);
        pathBuilder.lineToRelative(-2.8f, -2.73f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.79f, 18.0f);
        pathBuilder2.lineToRelative(8.44f, 0.0f);
        pathBuilder2.lineToRelative(0.51f, -7.0f);
        pathBuilder2.lineToRelative(-9.46f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.59f, 6.05f);
        pathBuilder3.lineTo(19.0f, 7.63f);
        pathBuilder3.lineToRelative(0.03f, -0.56f);
        pathBuilder3.lineTo(14.98f, 3.0f);
        pathBuilder3.horizontalLineTo(9.02f);
        pathBuilder3.lineTo(4.97f, 7.07f);
        pathBuilder3.lineTo(5.0f, 7.57f);
        pathBuilder3.lineTo(3.41f, 6.01f);
        pathBuilder3.lineTo(2.0f, 7.44f);
        pathBuilder3.lineToRelative(3.23f, 3.11f);
        pathBuilder3.lineTo(5.93f, 20.0f);
        pathBuilder3.horizontalLineToRelative(12.14f);
        pathBuilder3.lineToRelative(0.7f, -9.44f);
        pathBuilder3.lineTo(22.0f, 7.46f);
        pathBuilder3.lineTo(20.59f, 6.05f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.23f, 18.0f);
        pathBuilder3.horizontalLineTo(7.79f);
        pathBuilder3.lineToRelative(-0.51f, -7.0f);
        pathBuilder3.horizontalLineToRelative(9.46f);
        pathBuilder3.lineTo(16.23f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.87f, 9.0f);
        pathBuilder3.horizontalLineTo(7.12f);
        pathBuilder3.lineTo(7.03f, 7.73f);
        pathBuilder3.lineTo(9.83f, 5.0f);
        pathBuilder3.horizontalLineToRelative(4.33f);
        pathBuilder3.lineToRelative(2.8f, 2.73f);
        pathBuilder3.lineTo(16.87f, 9.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _takeoutDining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
