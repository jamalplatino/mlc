package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__9kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_9kPlus", "Landroidx/compose/material/icons/Icons$Outlined;", "get_9kPlus", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: _9kPlus.kt */
public final class _9kPlusKt {
    private static ImageVector __9kPlus;

    public static final ImageVector get_9kPlus(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = __9kPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined._9kPlus", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder2.curveTo(9.55f, 15.0f, 10.0f, 14.55f, 10.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 11.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 3.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder4.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 11.5f);
        pathBuilder3.horizontalLineToRelative(-1.5f);
        pathBuilder3.verticalLineTo(10.0f);
        pathBuilder3.horizontalLineToRelative(-1.0f);
        pathBuilder3.verticalLineToRelative(1.5f);
        pathBuilder3.horizontalLineTo(15.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.verticalLineTo(14.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineToRelative(-1.5f);
        pathBuilder3.horizontalLineTo(19.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder3.verticalLineTo(11.5f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.5f, 12.75f);
        pathBuilder5.lineToRelative(1.75f, 2.25f);
        pathBuilder5.lineToRelative(1.75f, 0.0f);
        pathBuilder5.lineToRelative(-2.25f, -3.0f);
        pathBuilder5.lineToRelative(2.25f, -3.0f);
        pathBuilder5.lineToRelative(-1.75f, 0.0f);
        pathBuilder5.lineToRelative(-1.75f, 2.25f);
        pathBuilder5.lineToRelative(0.0f, -2.25f);
        pathBuilder5.lineToRelative(-1.5f, 0.0f);
        pathBuilder5.lineToRelative(0.0f, 6.0f);
        pathBuilder5.lineToRelative(1.5f, 0.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        __9kPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
