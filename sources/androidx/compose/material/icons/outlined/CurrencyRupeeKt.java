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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyRupee", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyRupee", "Landroidx/compose/material/icons/Icons$Outlined;", "getCurrencyRupee", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CurrencyRupee.kt */
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.CurrencyRupee", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.66f, 7.0f);
        pathBuilder.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        pathBuilder.lineTo(6.0f, 5.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-3.26f, 0.0f);
        pathBuilder.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        pathBuilder.lineTo(18.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-2.02f, 0.0f);
        pathBuilder.curveToRelative(-0.25f, 2.8f, -2.61f, 5.0f, -5.48f, 5.0f);
        pathBuilder.horizontalLineTo(9.77f);
        pathBuilder.lineToRelative(6.73f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.77f);
        pathBuilder.lineTo(7.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.lineTo(13.66f, 7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _currencyRupee = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
