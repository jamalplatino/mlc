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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_menuBook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MenuBook", "Landroidx/compose/material/icons/Icons$Rounded;", "getMenuBook", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MenuBook.kt */
public final class MenuBookKt {
    private static ImageVector _menuBook;

    public static final ImageVector getMenuBook(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _menuBook;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Rounded.MenuBook", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 4.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilder2.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder2.curveToRelative(-1.45f, 0.0f, -2.99f, 0.22f, -4.28f, 0.79f);
        pathBuilder2.curveTo(1.49f, 5.62f, 1.0f, 6.33f, 1.0f, 7.14f);
        pathBuilder.lineToRelative(0.0f, 11.28f);
        pathBuilder2.curveToRelative(0.0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f);
        pathBuilder2.curveTo(4.46f, 20.11f, 5.5f, 20.0f, 6.5f, 20.0f);
        pathBuilder2.curveToRelative(1.56f, 0.0f, 3.22f, 0.26f, 4.56f, 0.92f);
        pathBuilder2.curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0.0f);
        pathBuilder2.curveToRelative(1.34f, -0.67f, 3.0f, -0.92f, 4.56f, -0.92f);
        pathBuilder2.curveToRelative(1.0f, 0.0f, 2.04f, 0.11f, 3.02f, 0.36f);
        pathBuilder2.curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f);
        pathBuilder.lineToRelative(0.0f, -11.28f);
        pathBuilder2.curveToRelative(0.0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f);
        pathBuilder2.curveTo(20.49f, 4.72f, 18.95f, 4.5f, 17.5f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 17.23f);
        pathBuilder2.curveToRelative(0.0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f);
        pathBuilder2.curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f);
        pathBuilder2.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder2.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder2.curveToRelative(0.92f, 0.0f, 1.83f, 0.09f, 2.7f, 0.28f);
        pathBuilder2.curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f);
        pathBuilder.verticalLineTo(17.23f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.98f, 11.01f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder4.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder4.curveToRelative(1.54f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder4.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder4.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilder4.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder4.curveTo(14.13f, 10.99f, 14.05f, 11.01f, 13.98f, 11.01f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(13.98f, 13.67f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder6.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder6.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder6.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder6.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilder6.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder6.curveTo(14.13f, 13.66f, 14.05f, 13.67f, 13.98f, 13.67f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(13.98f, 16.33f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder8.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder8.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder8.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder8.curveToRelative(-0.05f, 0.41f, -0.42f, 0.7f, -0.83f, 0.66f);
        pathBuilder8.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder8.curveTo(14.13f, 16.32f, 14.05f, 16.33f, 13.98f, 16.33f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _menuBook = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
