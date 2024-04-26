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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbDown", "Landroidx/compose/material/icons/Icons$TwoTone;", "getThumbDown", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ThumbDown.kt */
public final class ThumbDownKt {
    private static ImageVector _thumbDown;

    public static final ImageVector getThumbDown(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _thumbDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.ThumbDown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineToRelative(-1.34f, 5.34f);
        pathBuilder.lineTo(15.0f, 15.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 3.0f);
        pathBuilder2.lineTo(6.0f, 3.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        pathBuilder2.lineToRelative(-3.02f, 7.05f);
        pathBuilder3.curveToRelative(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(6.31f);
        pathBuilder2.lineToRelative(-0.95f, 4.57f);
        pathBuilder2.lineToRelative(-0.03f, 0.32f);
        pathBuilder3.curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        pathBuilder2.lineTo(9.83f, 23.0f);
        pathBuilder2.lineToRelative(6.59f, -6.59f);
        pathBuilder3.curveToRelative(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f);
        pathBuilder2.lineTo(17.0f, 5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 15.0f);
        pathBuilder2.lineToRelative(-4.34f, 4.34f);
        pathBuilder2.lineTo(12.0f, 14.0f);
        pathBuilder2.lineTo(3.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineToRelative(3.0f, -7.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _thumbDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}