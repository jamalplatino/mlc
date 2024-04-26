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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbsUpDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbsUpDown", "Landroidx/compose/material/icons/Icons$TwoTone;", "getThumbsUpDown", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ThumbsUpDown.kt */
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.ThumbsUpDown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(5.82f, 5.0f);
        pathBuilder.lineToRelative(0.66f, -3.18f);
        pathBuilder.lineToRelative(0.02f, -0.23f);
        pathBuilder.curveToRelative(0.0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f);
        pathBuilder.lineTo(5.38f, 0.0f);
        pathBuilder.lineTo(0.44f, 4.94f);
        pathBuilder.curveTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(6.75f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.15f, -0.38f, 1.38f, -0.91f);
        pathBuilder.lineToRelative(2.26f, -5.29f);
        pathBuilder.curveToRelative(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 7.13f);
        pathBuilder.lineTo(7.92f, 12.0f);
        pathBuilder.lineTo(2.0f, 12.0f);
        pathBuilder.lineTo(2.0f, 6.21f);
        pathBuilder.lineToRelative(1.93f, -1.93f);
        pathBuilder.lineTo(3.36f, 7.0f);
        pathBuilder.lineTo(10.0f, 7.0f);
        pathBuilder.verticalLineToRelative(0.13f);
        pathBuilder.close();
        pathBuilder.moveTo(22.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-6.75f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -1.15f, 0.38f, -1.38f, 0.91f);
        pathBuilder.lineToRelative(-2.26f, 5.29f);
        pathBuilder.curveToRelative(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f);
        pathBuilder.lineTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.18f);
        pathBuilder.lineToRelative(-0.66f, 3.18f);
        pathBuilder.lineToRelative(-0.02f, 0.24f);
        pathBuilder.curveToRelative(0.0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f);
        pathBuilder.lineToRelative(0.79f, 0.78f);
        pathBuilder.lineToRelative(4.94f, -4.94f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 17.79f);
        pathBuilder.lineToRelative(-1.93f, 1.93f);
        pathBuilder.lineToRelative(0.57f, -2.72f);
        pathBuilder.lineTo(14.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-0.13f);
        pathBuilder.lineTo(16.08f, 12.0f);
        pathBuilder.lineTo(22.0f, 12.0f);
        pathBuilder.verticalLineToRelative(5.79f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.93f, 4.28f);
        pathBuilder2.lineTo(2.0f, 6.21f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.horizontalLineToRelative(5.92f);
        pathBuilder2.lineTo(10.0f, 7.13f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineTo(3.36f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 16.87f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.horizontalLineToRelative(6.64f);
        pathBuilder2.lineToRelative(-0.57f, 2.72f);
        pathBuilder2.lineTo(22.0f, 17.79f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.horizontalLineToRelative(-5.92f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _thumbsUpDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
