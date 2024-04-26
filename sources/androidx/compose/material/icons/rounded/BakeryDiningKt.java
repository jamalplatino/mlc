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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bakeryDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BakeryDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getBakeryDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BakeryDining.kt */
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = new ImageVector.Builder("Rounded.BakeryDining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.77f, 8.55f);
        pathBuilder.lineTo(17.6f, 8.08f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.62f, -0.25f, -1.31f, 0.17f, -1.37f, 0.84f);
        pathBuilder.lineToRelative(-0.74f, 8.08f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.lineToRelative(2.6f, -6.5f);
        pathBuilder2.curveTo(19.91f, 9.73f, 19.54f, 8.85f, 18.77f, 8.55f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.4f, 8.08f);
        pathBuilder3.lineTo(5.23f, 8.55f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(4.46f, 8.85f, 4.09f, 9.73f, 4.4f, 10.5f);
        pathBuilder3.lineToRelative(2.6f, 6.5f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.lineTo(7.76f, 8.92f);
        pathBuilder4.curveTo(7.7f, 8.25f, 7.02f, 7.83f, 6.4f, 8.08f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(13.36f, 6.0f);
        pathBuilder5.horizontalLineToRelative(-2.71f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveTo(9.76f, 6.0f, 9.07f, 6.76f, 9.15f, 7.64f);
        pathBuilder5.lineTo(10.0f, 16.99f);
        pathBuilder5.horizontalLineToRelative(4.0f);
        pathBuilder5.lineToRelative(0.85f, -9.36f);
        pathBuilder6.curveTo(14.93f, 6.76f, 14.24f, 6.0f, 13.36f, 6.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(3.18f, 13.72f);
        pathBuilder7.lineToRelative(-1.0f, 1.93f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(-0.19f, 0.36f, -0.23f, 0.78f, -0.12f, 1.19f);
        pathBuilder8.curveToRelative(0.29f, 1.01f, 1.43f, 1.41f, 2.38f, 0.94f);
        pathBuilder7.lineToRelative(1.05f, -0.52f);
        pathBuilder7.lineToRelative(-1.4f, -3.49f);
        pathBuilder8.curveTo(3.93f, 13.37f, 3.38f, 13.34f, 3.18f, 13.72f);
        pathBuilder7.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(21.82f, 15.65f);
        pathBuilder9.lineToRelative(-1.0f, -1.93f);
        PathBuilder pathBuilder10 = pathBuilder9;
        pathBuilder10.curveToRelative(-0.2f, -0.38f, -0.75f, -0.35f, -0.91f, 0.04f);
        pathBuilder9.lineToRelative(-1.4f, 3.49f);
        pathBuilder9.lineToRelative(1.05f, 0.52f);
        pathBuilder10.curveToRelative(0.94f, 0.47f, 2.09f, 0.07f, 2.38f, -0.94f);
        pathBuilder10.curveTo(22.05f, 16.43f, 22.01f, 16.01f, 21.82f, 15.65f);
        pathBuilder9.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bakeryDining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
