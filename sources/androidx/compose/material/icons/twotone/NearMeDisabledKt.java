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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearMeDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearMeDisabled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNearMeDisabled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NearMeDisabled.kt */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NearMeDisabled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.1f, 10.44f);
        pathBuilder.lineToRelative(1.5f, -4.05f);
        pathBuilder.lineToRelative(-4.05f, 1.5f);
        pathBuilder.lineTo(16.1f, 10.44f);
        pathBuilder.close();
        pathBuilder.moveTo(14.57f, 14.57f);
        pathBuilder.lineTo(9.43f, 9.43f);
        pathBuilder.lineToRelative(-2.71f, 1.01f);
        pathBuilder.lineToRelative(4.89f, 1.95f);
        pathBuilder.lineToRelative(1.95f, 4.89f);
        pathBuilder.lineTo(14.57f, 14.57f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 6.34f);
        pathBuilder2.lineTo(21.0f, 3.0f);
        pathBuilder2.lineToRelative(-3.34f, 9.0f);
        pathBuilder2.lineToRelative(-1.56f, -1.56f);
        pathBuilder2.lineToRelative(1.5f, -4.05f);
        pathBuilder2.lineToRelative(-4.05f, 1.5f);
        pathBuilder2.lineTo(12.0f, 6.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.19f, 21.19f);
        pathBuilder2.lineToRelative(-5.07f, -5.07f);
        pathBuilder2.lineTo(14.31f, 21.0f);
        pathBuilder2.horizontalLineTo(12.9f);
        pathBuilder2.lineToRelative(-2.83f, -7.07f);
        pathBuilder2.lineTo(3.0f, 11.1f);
        pathBuilder2.verticalLineTo(9.69f);
        pathBuilder2.lineToRelative(4.88f, -1.81f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(18.38f, 18.38f);
        pathBuilder2.lineTo(21.19f, 21.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.57f, 14.57f);
        pathBuilder2.lineTo(9.43f, 9.43f);
        pathBuilder2.lineToRelative(-2.71f, 1.01f);
        pathBuilder2.lineToRelative(4.89f, 1.95f);
        pathBuilder2.lineToRelative(1.95f, 4.89f);
        pathBuilder2.lineTo(14.57f, 14.57f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nearMeDisabled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
