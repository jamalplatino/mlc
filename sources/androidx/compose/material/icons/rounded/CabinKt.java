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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cabin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cabin", "Landroidx/compose/material/icons/Icons$Rounded;", "getCabin", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Cabin.kt */
public final class CabinKt {
    private static ImageVector _cabin;

    public static final ImageVector getCabin(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _cabin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Cabin", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.37f, 3.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f);
        pathBuilder2.curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f);
        pathBuilder2.curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f);
        pathBuilder2.curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f);
        pathBuilder2.curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f);
        pathBuilder2.curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f);
        pathBuilder2.curveTo(4.53f, 5.0f, 4.01f, 4.2f, 4.37f, 3.55f);
        pathBuilder.close();
        pathBuilder.moveTo(22.39f, 12.19f);
        pathBuilder.curveToRelative(-0.34f, 0.44f, -0.96f, 0.52f, -1.4f, 0.19f);
        pathBuilder.lineTo(20.0f, 11.62f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.38f);
        pathBuilder.lineToRelative(-0.99f, 0.76f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.44f, 0.34f, -1.07f, 0.25f, -1.4f, -0.19f);
        pathBuilder3.curveToRelative(-0.33f, -0.44f, -0.25f, -1.07f, 0.19f, -1.4f);
        pathBuilder.lineTo(4.0f, 9.11f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.58f);
        pathBuilder.lineToRelative(5.39f, -4.12f);
        pathBuilder.curveToRelative(0.36f, -0.27f, 0.86f, -0.27f, 1.21f, 0.0f);
        pathBuilder.lineToRelative(9.6f, 7.33f);
        pathBuilder.curveTo(22.64f, 11.13f, 22.73f, 11.76f, 22.39f, 12.19f);
        pathBuilder.close();
        pathBuilder.moveTo(10.06f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.89f);
        pathBuilder.lineTo(12.0f, 5.52f);
        pathBuilder.lineTo(10.06f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 10.1f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-0.9f);
        pathBuilder.lineTo(16.56f, 9.0f);
        pathBuilder.horizontalLineTo(7.44f);
        pathBuilder.lineTo(6.0f, 10.1f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cabin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
