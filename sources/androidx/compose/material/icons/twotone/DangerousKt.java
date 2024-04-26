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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dangerous", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dangerous", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDangerous", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Dangerous.kt */
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Dangerous", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.1f, 5.0f);
        pathBuilder.lineTo(5.0f, 9.1f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.lineTo(9.1f, 19.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.lineToRelative(4.1f, -4.1f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.lineTo(14.9f, 5.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 14.83f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(12.0f, 13.41f);
        pathBuilder.lineToRelative(-2.83f, 2.83f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(7.76f, 9.17f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(12.0f, 10.59f);
        pathBuilder.lineToRelative(2.83f, -2.83f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.lineTo(16.24f, 14.83f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.73f, 3.0f);
        pathBuilder2.horizontalLineTo(8.27f);
        pathBuilder2.lineTo(3.0f, 8.27f);
        pathBuilder2.verticalLineToRelative(7.46f);
        pathBuilder2.lineTo(8.27f, 21.0f);
        pathBuilder2.horizontalLineToRelative(7.46f);
        pathBuilder2.lineTo(21.0f, 15.73f);
        pathBuilder2.verticalLineTo(8.27f);
        pathBuilder2.lineTo(15.73f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 14.9f);
        pathBuilder2.lineTo(14.9f, 19.0f);
        pathBuilder2.horizontalLineTo(9.1f);
        pathBuilder2.lineTo(5.0f, 14.9f);
        pathBuilder2.verticalLineTo(9.1f);
        pathBuilder2.lineTo(9.1f, 5.0f);
        pathBuilder2.horizontalLineToRelative(5.8f);
        pathBuilder2.lineTo(19.0f, 9.1f);
        pathBuilder2.verticalLineTo(14.9f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.83f, 7.76f);
        pathBuilder2.lineTo(12.0f, 10.59f);
        pathBuilder2.lineTo(9.17f, 7.76f);
        pathBuilder2.lineTo(7.76f, 9.17f);
        pathBuilder2.lineTo(10.59f, 12.0f);
        pathBuilder2.lineToRelative(-2.83f, 2.83f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(12.0f, 13.41f);
        pathBuilder2.lineToRelative(2.83f, 2.83f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(13.41f, 12.0f);
        pathBuilder2.lineToRelative(2.83f, -2.83f);
        pathBuilder2.lineTo(14.83f, 7.76f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dangerous = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
