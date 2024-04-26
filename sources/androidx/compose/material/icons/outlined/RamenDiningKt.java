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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ramenDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RamenDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getRamenDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RamenDining.kt */
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.RamenDining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.66f, 14.0f);
        pathBuilder.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        pathBuilder.lineTo(14.0f, 18.89f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-1.11f);
        pathBuilder.lineToRelative(-1.27f, -0.5f);
        pathBuilder.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        pathBuilder.horizontalLineTo(19.66f);
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 3.99f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        pathBuilder.horizontalLineTo(10.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineTo(10.5f);
        pathBuilder.verticalLineTo(4.78f);
        pathBuilder.lineTo(22.0f, 3.51f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.lineTo(22.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 6.5f);
        pathBuilder.verticalLineTo(5.06f);
        pathBuilder.lineToRelative(1.0f, -0.11f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(8.0f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 6.5f);
        pathBuilder.verticalLineTo(5.34f);
        pathBuilder.lineToRelative(1.0f, -0.11f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.lineTo(5.5f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.lineTo(5.5f, 12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _ramenDining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
