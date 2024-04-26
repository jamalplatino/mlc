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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppShortcut", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppShortcut", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppShortcut.kt */
public final class AppShortcutKt {
    private static ImageVector _appShortcut;

    public static final ImageVector getAppShortcut(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Rounded.AppShortcut", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder2.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.38f, 9.62f);
        pathBuilder3.lineToRelative(0.4f, 0.87f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilder3.lineToRelative(0.4f, -0.87f);
        pathBuilder3.lineToRelative(0.87f, -0.4f);
        pathBuilder4.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilder3.lineToRelative(-0.87f, -0.4f);
        pathBuilder3.lineToRelative(-0.4f, -0.87f);
        pathBuilder4.curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0.0f);
        pathBuilder3.lineToRelative(-0.4f, 0.87f);
        pathBuilder3.lineToRelative(-0.87f, 0.4f);
        pathBuilder4.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        pathBuilder3.lineTo(20.38f, 9.62f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.54f, 9.0f);
        pathBuilder5.lineToRelative(-0.79f, 1.75f);
        pathBuilder5.lineTo(13.0f, 11.54f);
        pathBuilder5.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder5.lineToRelative(1.75f, 0.79f);
        pathBuilder5.lineTo(15.54f, 15.0f);
        pathBuilder5.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder5.lineToRelative(0.79f, -1.75f);
        pathBuilder5.lineTo(19.0f, 12.46f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder5.lineToRelative(-1.75f, -0.79f);
        pathBuilder5.lineTo(16.46f, 9.0f);
        pathBuilder6.curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(20.77f, 13.5f);
        pathBuilder7.lineToRelative(-0.4f, 0.87f);
        pathBuilder7.lineToRelative(-0.87f, 0.4f);
        pathBuilder7.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        pathBuilder7.lineToRelative(0.87f, 0.4f);
        pathBuilder7.lineToRelative(0.4f, 0.87f);
        pathBuilder7.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilder7.lineToRelative(0.4f, -0.87f);
        pathBuilder7.lineToRelative(0.87f, -0.4f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilder7.lineToRelative(-0.87f, -0.4f);
        pathBuilder7.lineToRelative(-0.4f, -0.87f);
        pathBuilder8.curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _appShortcut = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
