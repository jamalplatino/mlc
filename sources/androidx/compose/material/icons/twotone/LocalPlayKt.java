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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localPlay", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPlay", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLocalPlay", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalPlay.kt */
public final class LocalPlayKt {
    private static ImageVector _localPlay;

    public static final ImageVector getLocalPlay(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _localPlay;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.LocalPlay", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.01f, 8.54f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.2f, 9.23f, 6.0f, 10.52f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.81f, 2.77f, -2.0f, 3.46f);
        pathBuilder.lineTo(4.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder2.curveToRelative(-1.19f, -0.69f, -2.0f, -1.99f, -2.0f, -3.46f);
        pathBuilder.reflectiveCurveToRelative(0.81f, -2.77f, 2.0f, -3.46f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.lineToRelative(0.01f, 2.54f);
        pathBuilder.close();
        pathBuilder.moveTo(10.73f, 10.22f);
        pathBuilder.lineTo(12.0f, 7.0f);
        pathBuilder.lineToRelative(1.26f, 3.23f);
        pathBuilder.lineToRelative(3.47f, 0.2f);
        pathBuilder.lineToRelative(-2.69f, 2.2f);
        pathBuilder.lineToRelative(0.89f, 3.37f);
        pathBuilder.lineTo(12.0f, 14.12f);
        pathBuilder.lineTo(9.07f, 16.0f);
        pathBuilder.lineToRelative(0.88f, -3.37f);
        pathBuilder.lineToRelative(-2.69f, -2.2f);
        pathBuilder.lineToRelative(3.47f, -0.21f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 4.0f);
        pathBuilder3.lineTo(4.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineToRelative(-4.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.lineTo(22.0f, 6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 8.54f);
        pathBuilder4.curveToRelative(-1.19f, 0.69f, -2.0f, 1.99f, -2.0f, 3.46f);
        pathBuilder3.reflectiveCurveToRelative(0.81f, 2.77f, 2.0f, 3.46f);
        pathBuilder3.lineTo(20.0f, 18.0f);
        pathBuilder3.lineTo(4.0f, 18.0f);
        pathBuilder3.verticalLineToRelative(-2.54f);
        pathBuilder4.curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f);
        pathBuilder4.curveToRelative(0.0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f);
        pathBuilder3.lineTo(4.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(2.54f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.07f, 16.0f);
        pathBuilder3.lineTo(12.0f, 14.12f);
        pathBuilder3.lineTo(14.93f, 16.0f);
        pathBuilder3.lineToRelative(-0.89f, -3.36f);
        pathBuilder3.lineToRelative(2.69f, -2.2f);
        pathBuilder3.lineToRelative(-3.47f, -0.21f);
        pathBuilder3.lineTo(12.0f, 7.0f);
        pathBuilder3.lineToRelative(-1.27f, 3.22f);
        pathBuilder3.lineToRelative(-3.47f, 0.21f);
        pathBuilder3.lineToRelative(2.69f, 2.2f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localPlay = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
