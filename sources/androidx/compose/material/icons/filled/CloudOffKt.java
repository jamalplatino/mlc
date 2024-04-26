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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cloudOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CloudOff", "Landroidx/compose/material/icons/Icons$Filled;", "getCloudOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CloudOff.kt */
public final class CloudOffKt {
    private static ImageVector _cloudOff;

    public static final ImageVector getCloudOff(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _cloudOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.CloudOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.35f, 10.04f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.48f, 0.0f, -2.85f, 0.43f, -4.01f, 1.17f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(10.21f, 6.23f, 11.08f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.horizontalLineTo(19.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder4.curveToRelative(0.0f, 1.13f, -0.64f, 2.11f, -1.56f, 2.62f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(23.16f, 18.16f, 24.0f, 16.68f, 24.0f, 15.0f);
        pathBuilder5.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 5.27f);
        pathBuilder.lineToRelative(2.75f, 2.74f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(2.56f, 8.15f, 0.0f, 10.77f, 0.0f, 14.0f);
        pathBuilder6.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(11.73f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(21.0f, 20.73f);
        pathBuilder.lineTo(4.27f, 4.0f);
        pathBuilder.lineTo(3.0f, 5.27f);
        pathBuilder.close();
        pathBuilder.moveTo(7.73f, 10.0f);
        pathBuilder.lineToRelative(8.0f, 8.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(1.73f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cloudOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
