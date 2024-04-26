package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearbyError", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearbyError", "Landroidx/compose/material/icons/Icons$Sharp;", "getNearbyError", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NearbyError.kt */
public final class NearbyErrorKt {
    private static ImageVector _nearbyError;

    public static final ImageVector getNearbyError(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _nearbyError;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.NearbyError", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.58f);
        pathBuilder.lineTo(16.42f, 12.0f);
        pathBuilder.lineTo(12.0f, 16.42f);
        pathBuilder.lineTo(7.58f, 12.0f);
        pathBuilder.lineTo(12.0f, 7.58f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.2f);
        pathBuilder.lineTo(4.8f, 12.0f);
        pathBuilder.lineTo(12.0f, 4.8f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.verticalLineTo(7.17f);
        pathBuilder.lineToRelative(-5.99f, -5.99f);
        pathBuilder.lineTo(1.18f, 12.01f);
        pathBuilder.lineToRelative(10.83f, 10.83f);
        pathBuilder.lineTo(18.0f, 16.83f);
        pathBuilder.verticalLineTo(13.2f);
        pathBuilder.lineTo(12.0f, 19.2f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.0f);
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nearbyError = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
