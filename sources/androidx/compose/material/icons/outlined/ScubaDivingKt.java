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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scubaDiving", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScubaDiving", "Landroidx/compose/material/icons/Icons$Outlined;", "getScubaDiving", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScubaDiving.kt */
public final class ScubaDivingKt {
    private static ImageVector _scubaDiving;

    public static final ImageVector getScubaDiving(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _scubaDiving;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.ScubaDiving", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.89f, 10.11f);
        pathBuilder.lineToRelative(4.53f, -1.21f);
        pathBuilder.lineTo(12.64f, 6.0f);
        pathBuilder.lineTo(8.11f, 7.21f);
        pathBuilder.curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 5.9f);
        pathBuilder.lineTo(23.0f, 3.0f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.lineToRelative(-2.0f, 4.0f);
        pathBuilder.lineToRelative(-9.48f, 2.87f);
        pathBuilder.curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f);
        pathBuilder.lineTo(5.24f, 18.0f);
        pathBuilder.lineTo(2.4f, 21.8f);
        pathBuilder.lineTo(4.0f, 23.0f);
        pathBuilder.lineToRelative(3.0f, -4.0f);
        pathBuilder.lineToRelative(1.14f, -3.14f);
        pathBuilder.lineTo(14.0f, 14.0f);
        pathBuilder.lineToRelative(5.0f, -3.5f);
        pathBuilder.lineTo(20.5f, 5.9f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _scubaDiving = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
