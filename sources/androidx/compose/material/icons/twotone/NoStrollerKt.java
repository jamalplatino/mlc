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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noStroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoStroller", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoStroller", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoStroller.kt */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NoStroller", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.1f, 5.27f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilder2.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilder.lineTo(9.49f, 6.67f);
        pathBuilder.lineTo(8.1f, 5.27f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 12.17f);
        pathBuilder.verticalLineTo(8.66f);
        pathBuilder.lineToRelative(-1.61f, 1.89f);
        pathBuilder.lineTo(15.0f, 12.17f);
        pathBuilder.close();
        pathBuilder.moveTo(12.17f, 15.0f);
        pathBuilder.lineToRelative(-1.39f, -1.39f);
        pathBuilder.lineTo(9.6f, 15.0f);
        pathBuilder.horizontalLineTo(12.17f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.0f, 20.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.0f, 8.66f);
        pathBuilder3.verticalLineToRelative(3.51f);
        pathBuilder3.lineToRelative(2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(-7.9f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilder4.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        pathBuilder3.verticalLineTo(7.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(6.48f);
        pathBuilder4.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        pathBuilder4.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilder3.lineToRelative(-3.5f, 4.11f);
        pathBuilder3.lineToRelative(1.42f, 1.42f);
        pathBuilder3.lineTo(15.0f, 8.66f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.78f, 22.61f);
        pathBuilder3.lineToRelative(-1.91f, -1.91f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(17.58f, 21.46f, 16.86f, 22.0f, 16.0f, 22.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder5.curveToRelative(0.0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f);
        pathBuilder3.lineTo(14.17f, 17.0f);
        pathBuilder3.horizontalLineTo(7.43f);
        pathBuilder3.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        pathBuilder3.lineToRelative(2.69f, -3.16f);
        pathBuilder3.lineTo(1.39f, 4.22f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineToRelative(7.86f, 7.86f);
        pathBuilder3.lineToRelative(1.42f, 1.42f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.lineToRelative(9.11f, 9.11f);
        pathBuilder3.lineTo(19.78f, 22.61f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.17f, 15.0f);
        pathBuilder3.lineToRelative(-1.39f, -1.39f);
        pathBuilder3.lineTo(9.6f, 15.0f);
        pathBuilder3.horizontalLineTo(12.17f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 5.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilder3.lineTo(9.49f, 6.67f);
        pathBuilder3.lineToRelative(1.42f, 1.42f);
        pathBuilder3.lineTo(14.3f, 4.1f);
        pathBuilder6.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        pathBuilder6.curveTo(8.77f, 3.0f, 7.6f, 3.25f, 6.53f, 3.7f);
        pathBuilder3.lineTo(8.1f, 5.27f);
        pathBuilder6.curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noStroller = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
