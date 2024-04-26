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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wallet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wallet", "Landroidx/compose/material/icons/Icons$Outlined;", "getWallet", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Wallet.kt */
public final class WalletKt {
    private static ImageVector _wallet;

    public static final ImageVector getWallet(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _wallet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Wallet", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 4.0f);
        pathBuilder.horizontalLineTo(6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(3.79f, 4.0f, 2.0f, 5.79f, 2.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder2.curveTo(22.0f, 5.79f, 20.21f, 4.0f, 18.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.14f, 13.77f);
        pathBuilder2.curveToRelative(-0.24f, 0.2f, -0.57f, 0.28f, -0.88f, 0.2f);
        pathBuilder.lineTo(4.15f, 11.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(4.45f, 10.52f, 5.16f, 10.0f, 6.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder3.curveToRelative(0.67f, 0.0f, 1.26f, 0.34f, 1.63f, 0.84f);
        pathBuilder.lineTo(16.14f, 13.77f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(0.55f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(19.41f, 8.21f, 18.73f, 8.0f, 18.0f, 8.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder4.curveTo(5.27f, 8.0f, 4.59f, 8.21f, 4.0f, 8.55f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder4.curveTo(4.0f, 6.9f, 4.9f, 6.0f, 6.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wallet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
