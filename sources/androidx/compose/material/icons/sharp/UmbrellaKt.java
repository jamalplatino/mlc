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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Umbrella", "Landroidx/compose/material/icons/Icons$Sharp;", "getUmbrella", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Umbrella.kt */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Umbrella", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 6.92f);
        pathBuilder.lineTo(13.0f, 5.77f);
        pathBuilder.verticalLineTo(3.88f);
        pathBuilder.verticalLineTo(3.4f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.4f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f);
        pathBuilder3.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilder.verticalLineToRelative(0.48f);
        pathBuilder.verticalLineToRelative(1.89f);
        pathBuilder.lineTo(9.5f, 6.92f);
        pathBuilder.lineTo(6.0f, 6.07f);
        pathBuilder.lineToRelative(5.05f, 15.25f);
        pathBuilder.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilder.lineTo(18.0f, 6.07f);
        pathBuilder.lineTo(14.5f, 6.92f);
        pathBuilder.close();
        pathBuilder.moveTo(13.28f, 8.5f);
        pathBuilder.lineToRelative(0.76f, 0.58f);
        pathBuilder.lineToRelative(0.92f, -0.23f);
        pathBuilder.lineTo(13.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineTo(13.28f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.96f, 9.09f);
        pathBuilder.lineToRelative(0.76f, -0.58f);
        pathBuilder.lineTo(11.0f, 8.29f);
        pathBuilder.verticalLineToRelative(6.51f);
        pathBuilder.lineTo(9.03f, 8.86f);
        pathBuilder.lineTo(9.96f, 9.09f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _umbrella = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
