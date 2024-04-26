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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sanitizer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sanitizer", "Landroidx/compose/material/icons/Icons$Rounded;", "getSanitizer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sanitizer.kt */
public final class SanitizerKt {
    private static ImageVector _sanitizer;

    public static final ImageVector getSanitizer(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _sanitizer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Sanitizer", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 6.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.56f, 0.67f, -1.49f, 1.11f, -2.04f);
        pathBuilder2.curveToRelative(0.2f, -0.25f, 0.58f, -0.25f, 0.77f, 0.0f);
        pathBuilder2.curveToRelative(0.44f, 0.55f, 1.11f, 1.48f, 1.11f, 2.04f);
        pathBuilder2.curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 15.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder3.curveToRelative(0.0f, -1.25f, -1.41f, -3.16f, -2.11f, -4.04f);
        pathBuilder3.curveToRelative(-0.2f, -0.25f, -0.57f, -0.25f, -0.77f, 0.0f);
        pathBuilder3.curveTo(18.41f, 9.34f, 17.0f, 11.25f, 17.0f, 12.5f);
        pathBuilder3.curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveTo(13.0f, 14.45f, 12.55f, 14.0f, 12.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(8.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(7.45f, 4.0f, 7.0f, 3.55f, 7.0f, 3.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.61f, 0.0f, 1.19f, 0.11f, 1.72f, 0.31f);
        pathBuilder6.curveToRelative(0.67f, 0.25f, 0.83f, 1.13f, 0.33f, 1.64f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveTo(14.77f, 4.23f, 14.36f, 4.31f, 14.0f, 4.18f);
        pathBuilder6.curveTo(13.68f, 4.06f, 13.35f, 4.0f, 13.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sanitizer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
