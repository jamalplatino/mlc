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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_touchApp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TouchApp", "Landroidx/compose/material/icons/Icons$Outlined;", "getTouchApp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TouchApp.kt */
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.TouchApp", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.19f, 12.44f);
        pathBuilder.lineToRelative(-3.24f, -1.62f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.29f, -1.0f, 2.12f, -2.56f, 2.12f, -4.32f);
        pathBuilder2.curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilder.curveToRelative(0.0f, 2.13f, 1.22f, 3.98f, 3.0f, 4.89f);
        pathBuilder.verticalLineToRelative(3.26f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-2.15f, -0.46f, -2.02f, -0.44f, -2.26f, -0.44f);
        pathBuilder3.curveToRelative(-0.53f, 0.0f, -1.03f, 0.21f, -1.41f, 0.59f);
        pathBuilder.lineTo(4.0f, 16.22f);
        pathBuilder.lineToRelative(5.09f, 5.09f);
        pathBuilder.curveTo(9.52f, 21.75f, 10.12f, 22.0f, 10.74f, 22.0f);
        pathBuilder.horizontalLineToRelative(6.3f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder.lineToRelative(0.8f, -4.71f);
        pathBuilder.curveTo(20.03f, 14.32f, 19.38f, 13.04f, 18.19f, 12.44f);
        pathBuilder.close();
        pathBuilder.moveTo(17.84f, 15.29f);
        pathBuilder.lineTo(17.04f, 20.0f);
        pathBuilder.horizontalLineToRelative(-6.3f);
        pathBuilder.curveToRelative(-0.09f, 0.0f, -0.17f, -0.04f, -0.24f, -0.1f);
        pathBuilder.lineToRelative(-3.68f, -3.68f);
        pathBuilder.lineToRelative(4.25f, 0.89f);
        pathBuilder.verticalLineTo(6.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder4.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineToRelative(3.46f, 1.73f);
        pathBuilder.curveTo(17.69f, 14.43f, 17.91f, 14.86f, 17.84f, 15.29f);
        pathBuilder.close();
        pathBuilder.moveTo(8.07f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.95f, -0.38f, 1.81f, -1.0f, 2.44f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder5.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder5.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.verticalLineToRelative(2.44f);
        pathBuilder.curveTo(8.45f, 8.31f, 8.07f, 7.45f, 8.07f, 6.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _touchApp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
