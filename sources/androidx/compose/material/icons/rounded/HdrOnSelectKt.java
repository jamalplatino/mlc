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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOnSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOnSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrOnSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HdrOnSelect.kt */
public final class HdrOnSelectKt {
    private static ImageVector _hdrOnSelect;

    public static final ImageVector getHdrOnSelect(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _hdrOnSelect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.HdrOnSelect", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 18.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.31f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f);
        pathBuilder.horizontalLineToRelative(0.11f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.72f, 1.59f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder.lineTo(17.1f, 19.9f);
        pathBuilder.curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 18.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(1.5f, 16.34f, 1.16f, 16.0f, 0.75f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(0.34f, 16.0f, 0.0f, 16.34f, 0.0f, 16.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(0.0f, 21.66f, 0.34f, 22.0f, 0.75f, 22.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(19.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(3.5f, 21.66f, 3.84f, 22.0f, 4.25f, 22.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder5.curveTo(4.66f, 22.0f, 5.0f, 21.66f, 5.0f, 21.25f);
        pathBuilder.verticalLineToRelative(-4.5f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(5.0f, 16.34f, 4.66f, 16.0f, 4.25f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 16.0f);
        pathBuilder.horizontalLineTo(7.5f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder7.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder7.curveTo(11.5f, 16.67f, 10.82f, 16.0f, 10.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(20.5f);
        pathBuilder.close();
        pathBuilder.moveTo(23.25f, 20.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(1.25f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-1.25f);
        pathBuilder8.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder8.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder8.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveTo(24.0f, 19.66f, 23.66f, 20.0f, 23.25f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(9.79f, 4.0f, 12.0f, 4.0f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(15.31f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hdrOnSelect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
