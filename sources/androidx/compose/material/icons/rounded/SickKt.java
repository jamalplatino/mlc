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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sick", "Landroidx/compose/material/icons/Icons$Rounded;", "getSick", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sick.kt */
public final class SickKt {
    private static ImageVector _sick;

    public static final ImageVector getSick(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Sick", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f);
        pathBuilder2.curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0.0f);
        pathBuilder2.curveTo(22.01f, 4.56f, 23.0f, 6.22f, 23.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.86f, 10.38f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(21.94f, 10.91f, 22.0f, 11.45f, 22.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.01f, 10.0f);
        pathBuilder3.curveTo(6.47f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder3.curveTo(2.0f, 6.48f, 6.47f, 2.0f, 11.99f, 2.0f);
        pathBuilder3.curveToRelative(2.45f, 0.0f, 4.69f, 0.88f, 6.43f, 2.34f);
        pathBuilder3.curveTo(17.91f, 5.29f, 17.5f, 6.27f, 17.5f, 7.0f);
        pathBuilder3.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder3.curveTo(21.3f, 10.5f, 21.58f, 10.45f, 21.86f, 10.38f);
        pathBuilder.close();
        pathBuilder.moveTo(14.03f, 10.03f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder4.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineTo(15.62f, 9.5f);
        pathBuilder.lineToRelative(0.53f, -0.53f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, -0.29f, -1.06f, 0.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.74f, 9.26f, 13.74f, 9.74f, 14.03f, 10.03f);
        pathBuilder.close();
        pathBuilder.moveTo(8.38f, 9.5f);
        pathBuilder.lineToRelative(-0.53f, 0.53f);
        pathBuilder5.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder5.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder5.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineTo(8.91f, 7.91f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineTo(8.38f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.47f, 15.8f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-1.0f, -1.39f, -2.62f, -2.3f, -4.47f, -2.3f);
        pathBuilder6.curveToRelative(-0.87f, 0.0f, -1.69f, 0.2f, -2.43f, 0.56f);
        pathBuilder.lineTo(5.99f, 12.0f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.0f, -0.52f, -0.26f, -1.02f, -0.74f, -1.29f);
        pathBuilder7.curveToRelative(-0.8f, -0.46f, -1.84f, -0.11f, -2.17f, 0.8f);
        pathBuilder7.curveToRelative(-0.21f, 0.57f, -0.03f, 1.25f, 0.44f, 1.64f);
        pathBuilder7.curveToRelative(0.52f, 0.44f, 1.2f, 0.45f, 1.72f, 0.16f);
        pathBuilder.lineToRelative(2.97f, 1.72f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(-0.25f, 0.24f, -0.48f, 0.5f, -0.68f, 0.78f);
        pathBuilder8.curveTo(7.17f, 16.3f, 7.53f, 17.0f, 8.15f, 17.0f);
        pathBuilder8.curveToRelative(0.23f, 0.0f, 0.46f, -0.1f, 0.6f, -0.3f);
        pathBuilder8.curveTo(9.47f, 15.68f, 10.65f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(2.53f, 0.68f, 3.25f, 1.7f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(0.14f, 0.19f, 0.36f, 0.3f, 0.6f, 0.3f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder9.curveTo(16.47f, 17.0f, 16.83f, 16.3f, 16.47f, 15.8f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
