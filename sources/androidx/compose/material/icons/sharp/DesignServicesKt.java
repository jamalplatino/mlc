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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_designServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DesignServices", "Landroidx/compose/material/icons/Icons$Sharp;", "getDesignServices", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DesignServices.kt */
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Sharp.DesignServices", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.79f, 17.06f);
        pathBuilder.lineToRelative(-5.55f, -5.55f);
        pathBuilder.lineToRelative(1.57f, -1.57f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(-1.57f, 1.57f);
        pathBuilder.lineTo(6.94f, 2.21f);
        pathBuilder.lineTo(2.21f, 6.94f);
        pathBuilder.lineToRelative(5.55f, 5.55f);
        pathBuilder.lineTo(3.0f, 17.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(3.75f);
        pathBuilder.lineToRelative(4.76f, -4.76f);
        pathBuilder.lineToRelative(5.55f, 5.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineTo(21.79f, 17.06f);
        pathBuilder.close();
        pathBuilder.moveTo(9.18f, 11.07f);
        pathBuilder.lineTo(5.04f, 6.94f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineTo(7.02f, 7.5f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineTo(9.18f, 11.07f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 14.82f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineToRelative(-1.19f, 1.19f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder.lineTo(12.93f, 14.82f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.133f, 5.123f);
        pathBuilder2.lineToRelative(2.538f, -2.538f);
        pathBuilder2.lineToRelative(3.748f, 3.748f);
        pathBuilder2.lineToRelative(-2.538f, 2.538f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _designServices = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
