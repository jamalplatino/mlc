package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotationAngleup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationAngleup", "Landroidx/compose/material/icons/Icons$Filled;", "getTextRotationAngleup", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextRotationAngleup.kt */
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.TextRotationAngleup", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.49f, 4.21f);
        pathBuilder.lineTo(3.43f, 5.27f);
        pathBuilder.lineTo(7.85f, 16.4f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        pathBuilder.lineToRelative(-0.92f, -2.19f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.lineToRelative(2.19f, 0.92f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        pathBuilder.lineTo(4.49f, 4.21f);
        pathBuilder.close();
        pathBuilder.moveTo(7.58f, 11.01f);
        pathBuilder.lineTo(5.36f, 6.14f);
        pathBuilder.lineToRelative(4.87f, 2.23f);
        pathBuilder.lineToRelative(-2.65f, 2.64f);
        pathBuilder.close();
        pathBuilder.moveTo(20.57f, 9.33f);
        pathBuilder.horizontalLineToRelative(-4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-8.84f, 8.84f);
        pathBuilder.lineTo(10.32f, 21.0f);
        pathBuilder.lineToRelative(8.84f, -8.84f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(20.57f, 9.33f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _textRotationAngleup = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
