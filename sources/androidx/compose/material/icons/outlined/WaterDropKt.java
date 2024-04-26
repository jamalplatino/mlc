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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_waterDrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WaterDrop", "Landroidx/compose/material/icons/Icons$Outlined;", "getWaterDrop", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WaterDrop.kt */
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.WaterDrop", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        pathBuilder2.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        pathBuilder.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-3.35f, 0.0f, -6.0f, -2.57f, -6.0f, -6.2f);
        pathBuilder3.curveToRelative(0.0f, -2.34f, 1.95f, -5.44f, 6.0f, -9.14f);
        pathBuilder3.curveToRelative(4.05f, 3.7f, 6.0f, 6.79f, 6.0f, 9.14f);
        pathBuilder3.curveTo(18.0f, 17.43f, 15.35f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.83f, 14.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        pathBuilder4.curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        pathBuilder4.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        pathBuilder4.curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        pathBuilder4.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        pathBuilder4.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _waterDrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
