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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_waterDrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WaterDrop", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWaterDrop", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WaterDrop.kt */
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.WaterDrop", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.67f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-4.05f, 3.7f, -6.0f, 6.79f, -6.0f, 9.14f);
        pathBuilder2.curveToRelative(0.0f, 3.63f, 2.65f, 6.2f, 6.0f, 6.2f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.57f, 6.0f, -6.2f);
        pathBuilder.curveTo(18.0f, 11.46f, 16.05f, 8.36f, 12.0f, 4.67f);
        pathBuilder.close();
        pathBuilder.moveTo(12.28f, 18.99f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        pathBuilder3.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        pathBuilder3.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        pathBuilder3.curveToRelative(0.41f, 2.23f, 2.28f, 2.98f, 3.64f, 2.87f);
        pathBuilder3.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        pathBuilder3.curveTo(13.0f, 18.64f, 12.68f, 18.97f, 12.28f, 18.99f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        pathBuilder5.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        pathBuilder4.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 20.0f);
        pathBuilder6.curveToRelative(-3.35f, 0.0f, -6.0f, -2.57f, -6.0f, -6.2f);
        pathBuilder6.curveToRelative(0.0f, -2.34f, 1.95f, -5.44f, 6.0f, -9.14f);
        pathBuilder6.curveToRelative(4.05f, 3.7f, 6.0f, 6.79f, 6.0f, 9.14f);
        pathBuilder6.curveTo(18.0f, 17.43f, 15.35f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.83f, 14.0f);
        pathBuilder6.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        pathBuilder6.curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        pathBuilder6.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        pathBuilder6.curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        pathBuilder6.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        pathBuilder6.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _waterDrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
