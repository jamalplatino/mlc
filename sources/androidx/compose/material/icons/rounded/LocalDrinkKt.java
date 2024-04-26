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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localDrink", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalDrink", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalDrink", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalDrink.kt */
public final class LocalDrinkKt {
    private static ImageVector _localDrink;

    public static final ImageVector getLocalDrink(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _localDrink;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LocalDrink", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.23f, 2.0f);
        pathBuilder.curveTo(4.04f, 2.0f, 3.11f, 3.04f, 3.24f, 4.22f);
        pathBuilder.lineToRelative(1.77f, 16.01f);
        pathBuilder.curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f);
        pathBuilder.lineToRelative(1.77f, -16.01f);
        pathBuilder.curveToRelative(0.13f, -1.18f, -0.8f, -2.22f, -1.99f, -2.22f);
        pathBuilder.lineTo(5.23f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.55f, 1.81f, -3.95f, 2.62f, -4.94f);
        pathBuilder2.curveToRelative(0.2f, -0.25f, 0.57f, -0.25f, 0.77f, 0.0f);
        pathBuilder2.curveToRelative(0.81f, 1.0f, 2.62f, 3.39f, 2.62f, 4.94f);
        pathBuilder2.curveToRelative(-0.01f, 1.66f, -1.35f, 3.0f, -3.01f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.33f, 8.0f);
        pathBuilder.lineTo(5.67f, 8.0f);
        pathBuilder.lineToRelative(-0.32f, -2.89f);
        pathBuilder.curveToRelative(-0.06f, -0.59f, 0.4f, -1.11f, 1.0f, -1.11f);
        pathBuilder.horizontalLineToRelative(11.3f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.06f, 0.52f, 0.99f, 1.11f);
        pathBuilder.lineTo(18.33f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localDrink = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}