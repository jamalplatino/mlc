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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noStroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoStroller", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoStroller", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoStroller.kt */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NoStroller", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 8.66f);
        pathBuilder.verticalLineToRelative(3.51f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(-7.9f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilder2.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(6.48f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        pathBuilder3.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilder.lineToRelative(-3.5f, 4.11f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineTo(15.0f, 8.66f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineToRelative(-1.91f, -1.91f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(17.58f, 21.46f, 16.86f, 22.0f, 16.0f, 22.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder4.curveToRelative(0.0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f);
        pathBuilder.lineTo(14.17f, 17.0f);
        pathBuilder.horizontalLineTo(7.43f);
        pathBuilder.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        pathBuilder.lineToRelative(2.69f, -3.16f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(7.86f, 7.86f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(9.11f, 9.11f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.17f, 15.0f);
        pathBuilder.lineToRelative(-1.39f, -1.39f);
        pathBuilder.lineTo(9.6f, 15.0f);
        pathBuilder.horizontalLineTo(12.17f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 5.0f);
        pathBuilder.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilder.lineTo(9.49f, 6.67f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineTo(14.3f, 4.1f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        pathBuilder5.curveTo(8.77f, 3.0f, 7.6f, 3.25f, 6.53f, 3.7f);
        pathBuilder.lineTo(8.1f, 5.27f);
        pathBuilder.curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noStroller = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
