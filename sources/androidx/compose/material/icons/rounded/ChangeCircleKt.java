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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_changeCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChangeCircle", "Landroidx/compose/material/icons/Icons$Rounded;", "getChangeCircle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChangeCircle.kt */
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ChangeCircle", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.91f, 18.15f);
        pathBuilder3.curveToRelative(-0.31f, 0.31f, -0.85f, 0.09f, -0.85f, -0.35f);
        pathBuilder.verticalLineToRelative(-0.8f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        pathBuilder4.curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f);
        pathBuilder4.curveToRelative(-1.43f, -1.43f, -1.81f, -3.52f, -1.14f, -5.3f);
        pathBuilder4.curveToRelative(0.19f, -0.51f, 0.86f, -0.64f, 1.24f, -0.25f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.22f, 0.22f, 0.27f, 0.54f, 0.17f, 0.82f);
        pathBuilder5.curveToRelative(-0.46f, 1.24f, -0.2f, 2.68f, 0.8f, 3.68f);
        pathBuilder5.curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f);
        pathBuilder.verticalLineToRelative(-0.94f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder6.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineTo(12.91f, 18.15f);
        pathBuilder.close();
        pathBuilder.moveTo(15.44f, 14.02f);
        pathBuilder.lineTo(15.44f, 14.02f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.22f, -0.22f, -0.27f, -0.54f, -0.17f, -0.82f);
        pathBuilder7.curveToRelative(0.46f, -1.24f, 0.2f, -2.68f, -0.8f, -3.68f);
        pathBuilder7.curveToRelative(-0.7f, -0.7f, -1.62f, -1.04f, -2.53f, -1.02f);
        pathBuilder7.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(0.94f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilder.lineTo(9.46f, 8.18f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(1.62f, -1.62f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.85f, -0.09f, 0.85f, 0.35f);
        pathBuilder.verticalLineToRelative(0.81f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f);
        pathBuilder8.curveToRelative(1.43f, 1.43f, 1.81f, 3.52f, 1.14f, 5.3f);
        pathBuilder8.curveTo(16.48f, 14.28f, 15.82f, 14.41f, 15.44f, 14.02f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _changeCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
