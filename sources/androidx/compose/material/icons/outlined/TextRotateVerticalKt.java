package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotateVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotateVertical", "Landroidx/compose/material/icons/Icons$Outlined;", "getTextRotateVertical", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextRotateVertical.kt */
public final class TextRotateVerticalKt {
    private static ImageVector _textRotateVertical;

    public static final ImageVector getTextRotateVertical(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _textRotateVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.TextRotateVertical", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.75f, 5.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineTo(9.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.1f);
        pathBuilder.lineToRelative(0.9f, -2.2f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineToRelative(0.9f, 2.2f);
        pathBuilder.horizontalLineToRelative(2.1f);
        pathBuilder.lineTo(15.75f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.13f, 12.0f);
        pathBuilder.lineTo(15.0f, 6.98f);
        pathBuilder.lineTo(16.87f, 12.0f);
        pathBuilder.horizontalLineToRelative(-3.74f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 20.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineTo(7.0f, 17.0f);
        pathBuilder.lineTo(7.0f, 4.0f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _textRotateVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
