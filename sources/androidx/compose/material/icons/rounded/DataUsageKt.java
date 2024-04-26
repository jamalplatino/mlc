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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dataUsage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DataUsage", "Landroidx/compose/material/icons/Icons$Rounded;", "getDataUsage", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DataUsage.kt */
public final class DataUsageKt {
    private static ImageVector _dataUsage;

    public static final ImageVector getDataUsage(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _dataUsage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.DataUsage", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.87f);
        pathBuilder.verticalLineToRelative(0.02f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.67f, 0.45f, 1.23f, 1.08f, 1.43f);
        pathBuilder2.curveTo(16.93f, 6.21f, 19.0f, 8.86f, 19.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.52f, -0.06f, 1.01f, -0.17f, 1.49f);
        pathBuilder2.curveToRelative(-0.14f, 0.64f, 0.12f, 1.3f, 0.69f, 1.64f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.86f, 0.5f, 1.98f, 0.05f, 2.21f, -0.91f);
        pathBuilder3.curveToRelative(0.17f, -0.72f, 0.26f, -1.47f, 0.26f, -2.23f);
        pathBuilder3.curveToRelative(0.0f, -4.5f, -2.98f, -8.32f, -7.08f, -9.57f);
        pathBuilder3.curveToRelative(-0.95f, -0.29f, -1.92f, 0.44f, -1.92f, 1.44f);
        pathBuilder.close();
        pathBuilder.moveTo(10.94f, 18.92f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-2.99f, -0.43f, -5.42f, -2.86f, -5.86f, -5.84f);
        pathBuilder4.curveToRelative(-0.54f, -3.6f, 1.66f, -6.77f, 4.83f, -7.76f);
        pathBuilder4.curveToRelative(0.64f, -0.19f, 1.09f, -0.76f, 1.09f, -1.43f);
        pathBuilder.verticalLineToRelative(-0.02f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, -1.0f, -0.97f, -1.73f, -1.93f, -1.44f);
        pathBuilder5.curveToRelative(-4.51f, 1.38f, -7.66f, 5.86f, -6.98f, 10.96f);
        pathBuilder5.curveToRelative(0.59f, 4.38f, 4.13f, 7.92f, 8.51f, 8.51f);
        pathBuilder5.curveToRelative(3.14f, 0.42f, 6.04f, -0.61f, 8.13f, -2.53f);
        pathBuilder5.curveToRelative(0.74f, -0.68f, 0.61f, -1.89f, -0.26f, -2.39f);
        pathBuilder5.curveToRelative(-0.58f, -0.34f, -1.3f, -0.23f, -1.8f, 0.22f);
        pathBuilder5.curveToRelative(-1.47f, 1.34f, -3.51f, 2.05f, -5.73f, 1.72f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dataUsage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
