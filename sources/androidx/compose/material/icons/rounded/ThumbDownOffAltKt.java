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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbDownOffAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbDownOffAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getThumbDownOffAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ThumbDownOffAlt.kt */
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.ThumbDownOffAlt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.99f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(5.2f, 3.0f, 4.48f, 3.48f, 4.17f, 4.21f);
        pathBuilder.lineToRelative(-3.26f, 7.61f);
        pathBuilder.curveTo(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f);
        pathBuilder.horizontalLineToRelative(5.65f);
        pathBuilder.lineToRelative(-0.95f, 4.58f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f);
        pathBuilder2.curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.77f, -0.15f, 1.06f, -0.44f);
        pathBuilder.lineToRelative(5.53f, -5.54f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder3.curveTo(16.99f, 3.9f, 16.09f, 3.0f, 14.99f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.66f, 19.33f);
        pathBuilder.lineToRelative(0.61f, -2.92f);
        pathBuilder.lineToRelative(0.5f, -2.41f);
        pathBuilder.horizontalLineTo(9.31f);
        pathBuilder.horizontalLineTo(3.66f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.47f, 0.0f, -0.72f, -0.28f, -0.83f, -0.45f);
        pathBuilder4.curveToRelative(-0.11f, -0.17f, -0.27f, -0.51f, -0.08f, -0.95f);
        pathBuilder.lineTo(6.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(8.99f);
        pathBuilder.lineToRelative(0.0f, 9.99f);
        pathBuilder.lineTo(10.66f, 19.33f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(21.0f, 3.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder5.verticalLineToRelative(8.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _thumbDownOffAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
