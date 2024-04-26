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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rawOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RawOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getRawOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RawOff.kt */
public final class RawOffKt {
    private static ImageVector _rawOff;

    public static final ImageVector getRawOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _rawOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.RawOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.55f, 9.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.63f, 0.23f, -0.71f, 0.55f);
        pathBuilder.lineTo(19.24f, 12.0f);
        pathBuilder.lineToRelative(-0.56f, -2.26f);
        pathBuilder.curveTo(18.58f, 9.3f, 18.19f, 9.0f, 17.74f, 9.0f);
        pathBuilder.reflectiveCurveTo(16.9f, 9.3f, 16.8f, 9.74f);
        pathBuilder.lineTo(16.24f, 12.0f);
        pathBuilder.lineToRelative(-0.6f, -2.45f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(15.56f, 9.23f, 15.27f, 9.0f, 14.93f, 9.0f);
        pathBuilder2.curveToRelative(-0.47f, 0.0f, -0.82f, 0.44f, -0.71f, 0.9f);
        pathBuilder.lineToRelative(0.5f, 1.99f);
        pathBuilder.lineToRelative(2.42f, 2.42f);
        pathBuilder.curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f);
        pathBuilder.lineToRelative(0.58f, -2.32f);
        pathBuilder.lineToRelative(0.58f, 2.32f);
        pathBuilder.curveTo(18.43f, 14.7f, 18.81f, 15.0f, 19.24f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(0.81f, -0.3f, 0.92f, -0.72f);
        pathBuilder.lineToRelative(1.09f, -4.38f);
        pathBuilder.curveTo(21.37f, 9.44f, 21.02f, 9.0f, 20.55f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(3.51f, 3.51f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder3.lineTo(6.17f, 9.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(4.31f);
        pathBuilder5.curveTo(3.0f, 14.69f, 3.31f, 15.0f, 3.69f, 15.0f);
        pathBuilder3.horizontalLineToRelative(0.11f);
        pathBuilder5.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.horizontalLineToRelative(1.1f);
        pathBuilder3.lineToRelative(0.72f, 1.59f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveTo(6.43f, 14.84f, 6.68f, 15.0f, 6.95f, 15.0f);
        pathBuilder6.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder3.lineTo(7.1f, 12.9f);
        pathBuilder3.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilder3.verticalLineToRelative(-0.67f);
        pathBuilder3.lineToRelative(1.43f, 1.43f);
        pathBuilder3.lineTo(8.98f, 14.1f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveTo(8.86f, 14.56f, 9.21f, 15.0f, 9.68f, 15.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.33f, 0.0f, 0.62f, -0.23f, 0.7f, -0.55f);
        pathBuilder3.lineToRelative(0.24f, -0.95f);
        pathBuilder3.horizontalLineToRelative(0.04f);
        pathBuilder3.lineToRelative(8.4f, 8.4f);
        PathBuilder pathBuilder8 = pathBuilder3;
        pathBuilder8.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder8.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder3.lineTo(3.51f, 3.51f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.5f, 11.5f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(11.5f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rawOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
