package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_compassCalibration", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CompassCalibration", "Landroidx/compose/material/icons/Icons$Rounded;", "getCompassCalibration", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CompassCalibration.kt */
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.CompassCalibration", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.moveToRelative(-4.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 3.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(8.49f, 3.0f, 5.28f, 4.29f, 2.8f, 6.41f);
        pathBuilder4.curveToRelative(-0.44f, 0.38f, -0.48f, 1.06f, -0.06f, 1.48f);
        pathBuilder3.lineToRelative(3.6f, 3.6f);
        pathBuilder4.curveToRelative(0.36f, 0.36f, 0.92f, 0.39f, 1.32f, 0.08f);
        pathBuilder4.curveToRelative(1.2f, -0.94f, 2.71f, -1.5f, 4.34f, -1.5f);
        pathBuilder4.curveToRelative(1.64f, 0.0f, 3.14f, 0.56f, 4.34f, 1.49f);
        pathBuilder4.curveToRelative(0.4f, 0.31f, 0.96f, 0.28f, 1.31f, -0.08f);
        pathBuilder3.lineToRelative(3.6f, -3.6f);
        pathBuilder4.curveToRelative(0.42f, -0.42f, 0.38f, -1.1f, -0.07f, -1.48f);
        pathBuilder4.curveTo(18.72f, 4.28f, 15.51f, 3.0f, 12.0f, 3.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _compassCalibration = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}