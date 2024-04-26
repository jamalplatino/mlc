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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotationDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationDown", "Landroidx/compose/material/icons/Icons$Rounded;", "getTextRotationDown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextRotationDown.kt */
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.TextRotationDown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.35f, 19.65f);
        pathBuilder.lineToRelative(1.79f, -1.79f);
        pathBuilder.curveToRelative(0.32f, -0.32f, 0.1f, -0.86f, -0.35f, -0.86f);
        pathBuilder.lineTo(7.0f, 17.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(-0.79f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder2.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.2f, 8.5f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-1.6f, 0.66f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.36f, 0.15f, -0.6f, 0.5f, -0.6f, 0.89f);
        pathBuilder3.curveToRelative(0.0f, 0.69f, 0.71f, 1.15f, 1.34f, 0.88f);
        pathBuilder.lineToRelative(8.97f, -3.88f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.05f);
        pathBuilder4.curveToRelative(0.0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.05f);
        pathBuilder.lineToRelative(-8.97f, -3.88f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.63f, -0.27f, -1.34f, 0.2f, -1.34f, 0.89f);
        pathBuilder5.curveToRelative(0.0f, 0.39f, 0.24f, 0.74f, 0.6f, 0.89f);
        pathBuilder.lineToRelative(1.6f, 0.65f);
        pathBuilder.close();
        pathBuilder.moveTo(19.02f, 11.0f);
        pathBuilder.lineTo(14.0f, 12.87f);
        pathBuilder.lineTo(14.0f, 9.13f);
        pathBuilder.lineTo(19.02f, 11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _textRotationDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
