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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_snowmobile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowmobile", "Landroidx/compose/material/icons/Icons$Rounded;", "getSnowmobile", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Snowmobile.kt */
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Snowmobile", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.lineToRelative(1.45f, 1.3f);
        pathBuilder.lineTo(11.0f, 11.0f);
        pathBuilder.lineToRelative(-9.12f, -0.96f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(0.88f, 9.93f, 0.0f, 10.72f, 0.0f, 11.73f);
        pathBuilder2.curveToRelative(0.0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f);
        pathBuilder.lineToRelative(3.33f, 1.0f);
        pathBuilder.lineToRelative(-3.49f, 1.88f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.13f, 0.0f, 2.11f, -0.62f, 2.63f, -1.55f);
        pathBuilder4.curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f);
        pathBuilder4.curveToRelative(-0.34f, 0.0f, -0.68f, 0.16f, -0.84f, 0.47f);
        pathBuilder4.curveTo(21.72f, 17.78f, 21.38f, 18.0f, 21.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-0.17f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        pathBuilder5.curveToRelative(0.0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f);
        pathBuilder5.curveTo(14.1f, 5.09f, 13.87f, 5.0f, 13.62f, 5.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.curveTo(11.45f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 18.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(5.25f, -2.83f);
        pathBuilder.lineTo(10.0f, 16.0f);
        pathBuilder.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _snowmobile = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
