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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nightlight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Nightlight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNightlight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Nightlight.kt */
public final class NightlightKt {
    private static ImageVector _nightlight;

    public static final ImageVector getNightlight(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _nightlight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Nightlight", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 12.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.curveToRelative(0.34f, 0.0f, 0.68f, 0.02f, 1.01f, 0.07f);
        pathBuilder2.curveTo(13.1f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.1f, 5.77f, 3.01f, 7.93f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(14.68f, 19.98f, 14.34f, 20.0f, 14.0f, 20.0f);
        pathBuilder3.curveTo(9.59f, 20.0f, 6.0f, 16.41f, 6.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(14.0f, 12.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, -3.7f, 2.01f, -6.92f, 5.0f, -8.65f);
        pathBuilder5.curveTo(17.53f, 2.5f, 15.82f, 2.0f, 14.0f, 2.0f);
        pathBuilder5.curveTo(8.48f, 2.0f, 4.0f, 6.48f, 4.0f, 12.0f);
        pathBuilder4.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder5.curveToRelative(1.82f, 0.0f, 3.53f, -0.5f, 5.0f, -1.35f);
        pathBuilder5.curveTo(16.01f, 18.92f, 14.0f, 15.7f, 14.0f, 12.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.01f, 19.93f);
        pathBuilder5.curveTo(14.68f, 19.98f, 14.34f, 20.0f, 14.0f, 20.0f);
        pathBuilder5.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder4.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.34f, 0.0f, 0.68f, 0.02f, 1.01f, 0.07f);
        pathBuilder6.curveTo(13.1f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f);
        pathBuilder4.reflectiveCurveTo(13.1f, 17.77f, 15.01f, 19.93f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nightlight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
