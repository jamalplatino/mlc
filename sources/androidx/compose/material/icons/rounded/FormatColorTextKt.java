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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatColorText", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatColorText", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatColorText", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FormatColorText.kt */
public final class FormatColorTextKt {
    private static ImageVector _formatColorText;

    public static final ImageVector getFormatColorText(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _formatColorText;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.FormatColorText", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(21.1f, 20.0f, 20.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.11f, 17.0f);
        pathBuilder2.lineTo(7.11f, 17.0f);
        pathBuilder2.curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f);
        pathBuilder2.lineToRelative(1.01f, -2.83f);
        pathBuilder2.horizontalLineToRelative(5.65f);
        pathBuilder2.lineToRelative(0.99f, 2.82f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveTo(15.98f, 16.7f, 16.41f, 17.0f, 16.89f, 17.0f);
        pathBuilder3.curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f);
        pathBuilder2.lineTo(13.69f, 4.17f);
        pathBuilder2.curveTo(13.43f, 3.47f, 12.75f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.43f, 0.47f, -1.69f, 1.17f);
        pathBuilder2.lineTo(6.06f, 15.48f);
        pathBuilder2.curveTo(5.78f, 16.21f, 6.33f, 17.0f, 7.11f, 17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.94f, 5.6f);
        pathBuilder2.horizontalLineToRelative(0.12f);
        pathBuilder2.lineToRelative(2.03f, 5.79f);
        pathBuilder2.horizontalLineTo(9.91f);
        pathBuilder2.lineTo(11.94f, 5.6f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _formatColorText = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
