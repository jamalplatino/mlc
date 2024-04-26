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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyPound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyPound", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCurrencyPound", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CurrencyPound.kt */
public final class CurrencyPoundKt {
    private static ImageVector _currencyPound;

    public static final ImageVector getCurrencyPound(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _currencyPound;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.CurrencyPound", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 21.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.62f, -1.17f, 4.0f, -3.0f);
        pathBuilder.lineToRelative(-1.75f, -0.88f);
        pathBuilder.curveTo(16.0f, 18.21f, 15.33f, 19.0f, 14.0f, 19.0f);
        pathBuilder.lineToRelative(-4.9f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f);
        pathBuilder.lineTo(14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-4.18f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f);
        pathBuilder3.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder3.curveToRelative(1.5f, 0.0f, 2.79f, 0.95f, 3.28f, 2.28f);
        pathBuilder.lineTo(16.63f, 6.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.13f, -3.5f);
        pathBuilder4.curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f);
        pathBuilder4.curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.47f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f);
        pathBuilder5.curveToRelative(0.0f, 2.7f, -2.6f, 4.0f, -2.6f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _currencyPound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
