package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_motorcycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Motorcycle", "Landroidx/compose/material/icons/Icons$Filled;", "getMotorcycle", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Motorcycle.kt */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Motorcycle", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 10.0f);
        pathBuilder.curveToRelative(-0.03f, 0.0f, -0.05f, 0.01f, -0.08f, 0.01f);
        pathBuilder.lineTo(13.41f, 6.0f);
        pathBuilder.lineTo(9.0f, 6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.59f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-8.1f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.01f, 10.0f, 2.0f, 12.02f, 2.0f, 14.5f);
        pathBuilder2.curveTo(2.0f, 16.99f, 4.01f, 19.0f, 6.5f, 19.0f);
        pathBuilder2.curveToRelative(2.22f, 0.0f, 4.06f, -1.62f, 4.42f, -3.73f);
        pathBuilder.lineTo(13.04f, 14.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.02f, 0.17f, -0.04f, 0.33f, -0.04f, 0.5f);
        pathBuilder3.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.5f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f);
        pathBuilder.reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.84f, 15.26f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(8.52f, 16.27f, 7.58f, 17.0f, 6.47f, 17.0f);
        pathBuilder4.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(5.09f, 12.0f, 6.47f, 12.0f);
        pathBuilder.curveToRelative(1.12f, 0.0f, 2.05f, 0.74f, 2.37f, 1.75f);
        pathBuilder.lineTo(6.0f, 13.75f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.lineToRelative(2.84f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(17.47f, 17.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _motorcycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
