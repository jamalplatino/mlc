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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doDisturbOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoDisturbOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getDoDisturbOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DoDisturbOff.kt */
public final class DoDisturbOffKt {
    private static ImageVector _doDisturbOff;

    public static final ImageVector getDoDisturbOff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _doDisturbOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.DoDisturbOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.41f, -0.37f, 2.73f, -1.01f, 3.88f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder2.curveTo(21.43f, 15.79f, 22.0f, 13.96f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder2.curveToRelative(-1.96f, 0.0f, -3.79f, 0.57f, -5.33f, 1.55f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder2.curveTo(9.27f, 4.37f, 10.59f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.88f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(17.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 2.13f);
        pathBuilder.lineTo(1.0f, 3.54f);
        pathBuilder.lineToRelative(2.78f, 2.78f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.78f);
        pathBuilder.lineTo(20.46f, 23.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.41f, 2.13f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder4.curveToRelative(0.0f, -1.56f, 0.45f, -3.0f, 1.23f, -4.23f);
        pathBuilder.lineTo(8.46f, 11.0f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.46f);
        pathBuilder.lineToRelative(5.77f, 5.77f);
        pathBuilder.curveTo(15.0f, 19.55f, 13.56f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _doDisturbOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
