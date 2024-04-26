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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sick", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSick", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sick.kt */
public final class SickKt {
    private static ImageVector _sick;

    public static final ImageVector getSick(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.Sick", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.32f, 10.56f);
        pathBuilder.lineTo(8.38f, 9.5f);
        pathBuilder.lineTo(7.32f, 8.44f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(10.5f, 9.5f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineTo(7.32f, 10.56f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.03f, 0.0f, 0.05f, 0.01f, 0.08f, 0.01f);
        pathBuilder2.curveTo(5.77f, 6.07f, 8.64f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(2.19f, 0.0f, 4.16f, 0.88f, 5.61f, 2.3f);
        pathBuilder2.curveToRelative(0.15f, -0.6f, 0.45f, -1.29f, 0.81f, -1.96f);
        pathBuilder2.curveTo(16.68f, 2.88f, 14.44f, 2.0f, 11.99f, 2.0f);
        pathBuilder2.curveToRelative(-4.88f, 0.0f, -8.94f, 3.51f, -9.81f, 8.14f);
        pathBuilder2.curveTo(2.74f, 9.44f, 3.59f, 9.0f, 4.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 10.5f);
        pathBuilder2.curveToRelative(-0.42f, 0.0f, -0.82f, -0.09f, -1.19f, -0.22f);
        pathBuilder2.curveTo(19.93f, 10.83f, 20.0f, 11.41f, 20.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(-3.36f, 0.0f, -6.23f, -2.07f, -7.42f, -5.01f);
        pathBuilder2.curveTo(4.55f, 14.99f, 4.53f, 15.0f, 4.5f, 15.0f);
        pathBuilder2.curveToRelative(-0.52f, 0.0f, -1.04f, -0.14f, -1.5f, -0.4f);
        pathBuilder2.curveToRelative(-0.32f, -0.18f, -0.59f, -0.42f, -0.82f, -0.7f);
        pathBuilder2.curveToRelative(0.89f, 4.61f, 4.93f, 8.1f, 9.8f, 8.1f);
        pathBuilder2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f);
        pathBuilder2.curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.0f, -2.0f, 2.9f, -2.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveTo(23.0f, 5.9f, 21.0f, 3.0f, 21.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.62f, 7.38f);
        pathBuilder.lineTo(13.5f, 9.5f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(15.62f, 9.5f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(15.62f, 7.38f);
        pathBuilder.close();
        pathBuilder.moveTo(8.56f, 17.0f);
        pathBuilder.curveToRelative(0.69f, -1.19f, 1.97f, -2.0f, 3.44f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.75f, 0.81f, 3.44f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.68f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.12f, -3.5f);
        pathBuilder4.curveToRelative(-0.87f, 0.0f, -1.7f, 0.2f, -2.43f, 0.57f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(5.99f, 12.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, -0.52f, -0.26f, -1.02f, -0.74f, -1.29f);
        pathBuilder5.curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f);
        pathBuilder5.curveToRelative(-0.41f, 0.72f, -0.17f, 1.63f, 0.55f, 2.05f);
        pathBuilder5.curveToRelative(0.48f, 0.28f, 1.05f, 0.25f, 1.49f, 0.0f);
        pathBuilder.lineToRelative(2.97f, 1.72f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.64f, 15.56f, 7.18f, 16.24f, 6.88f, 17.0f);
        pathBuilder.horizontalLineTo(8.56f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
