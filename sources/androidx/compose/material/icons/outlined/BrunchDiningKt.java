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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brunchDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrunchDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getBrunchDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BrunchDining.kt */
public final class BrunchDiningKt {
    private static ImageVector _brunchDining;

    public static final ImageVector getBrunchDining(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _brunchDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.BrunchDining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 21.5f);
        pathBuilder.curveTo(2.0f, 21.78f, 2.22f, 22.0f, 2.49f, 22.0f);
        pathBuilder.horizontalLineToRelative(13.02f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.49f, -0.22f, 0.49f, -0.5f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(21.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.5f, 16.0f);
        pathBuilder2.horizontalLineTo(11.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(2.5f);
        pathBuilder2.curveTo(2.22f, 16.0f, 2.0f, 16.22f, 2.0f, 16.5f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(-1.5f);
        pathBuilder2.curveTo(16.0f, 16.22f, 15.78f, 16.0f, 15.5f, 16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.47f, 15.45f);
        pathBuilder3.curveToRelative(0.99f, -1.07f, 1.53f, -2.48f, 1.53f, -3.94f);
        pathBuilder3.verticalLineTo(2.0f);
        pathBuilder3.horizontalLineToRelative(-6.0f);
        pathBuilder3.verticalLineToRelative(9.47f);
        pathBuilder3.curveToRelative(0.0f, 1.48f, 0.58f, 2.92f, 1.6f, 4.0f);
        pathBuilder3.lineToRelative(0.4f, 0.42f);
        pathBuilder3.verticalLineTo(22.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-4.03f);
        pathBuilder3.lineTo(20.47f, 15.45f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 4.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.03f, 14.07f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.65f, -0.71f, -1.03f, -1.65f, -1.03f, -2.6f);
        pathBuilder3.verticalLineTo(10.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(1.51f);
        pathBuilder4.curveTo(20.0f, 12.46f, 19.66f, 13.36f, 19.03f, 14.07f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _brunchDining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}