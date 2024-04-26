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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_extension", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Extension", "Landroidx/compose/material/icons/Icons$TwoTone;", "getExtension", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Extension.kt */
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Extension", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineToRelative(0.01f, 2.12f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.76f, 9.8f, 7.0f, 11.51f, 7.0f, 13.5f);
        pathBuilder2.curveToRelative(0.0f, 1.99f, -1.25f, 3.7f, -3.0f, 4.38f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(2.12f);
        pathBuilder2.curveToRelative(0.68f, -1.75f, 2.39f, -3.0f, 4.38f, -3.0f);
        pathBuilder2.curveToRelative(1.99f, 0.0f, 3.7f, 1.25f, 4.38f, 3.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 11.0f);
        pathBuilder3.lineTo(19.0f, 7.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder4.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder3.reflectiveCurveTo(8.0f, 3.62f, 8.0f, 5.0f);
        pathBuilder3.lineTo(4.0f, 5.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder3.verticalLineToRelative(3.8f);
        pathBuilder3.horizontalLineToRelative(0.29f);
        pathBuilder4.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder3.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        pathBuilder3.lineTo(2.0f, 16.2f);
        pathBuilder3.lineTo(2.0f, 20.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(3.8f);
        pathBuilder3.verticalLineToRelative(-0.3f);
        pathBuilder4.curveToRelative(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        pathBuilder3.reflectiveCurveToRelative(2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder3.verticalLineToRelative(0.3f);
        pathBuilder3.lineTo(17.0f, 22.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineToRelative(-4.0f);
        pathBuilder4.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder3.reflectiveCurveTo(20.38f, 11.0f, 19.0f, 11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 14.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(6.0f);
        pathBuilder3.horizontalLineToRelative(-2.12f);
        pathBuilder4.curveToRelative(-0.68f, -1.75f, -2.39f, -3.0f, -4.38f, -3.0f);
        pathBuilder4.curveToRelative(-1.99f, 0.0f, -3.7f, 1.25f, -4.38f, 3.0f);
        pathBuilder3.lineTo(4.0f, 20.0f);
        pathBuilder3.verticalLineToRelative(-2.12f);
        pathBuilder4.curveToRelative(1.75f, -0.68f, 3.0f, -2.39f, 3.0f, -4.38f);
        pathBuilder4.curveToRelative(0.0f, -1.99f, -1.24f, -3.7f, -2.99f, -4.38f);
        pathBuilder3.lineTo(4.0f, 7.0f);
        pathBuilder3.horizontalLineToRelative(6.0f);
        pathBuilder3.lineTo(10.0f, 5.0f);
        pathBuilder4.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder3.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(6.0f);
        pathBuilder3.verticalLineToRelative(6.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder3.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _extension = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
