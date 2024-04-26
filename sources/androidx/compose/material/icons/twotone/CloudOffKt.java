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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cloudOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CloudOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCloudOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CloudOff.kt */
public final class CloudOffKt {
    private static ImageVector _cloudOff;

    public static final ImageVector getCloudOff(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _cloudOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.CloudOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 15.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder2.curveTo(17.5f, 8.46f, 15.04f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(-0.77f, 0.0f, -1.49f, 0.17f, -2.16f, 0.46f);
        pathBuilder.lineTo(20.79f, 17.4f);
        pathBuilder2.curveToRelative(0.73f, -0.55f, 1.21f, -1.41f, 1.21f, -2.4f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(9.73f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.35f, 10.04f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        pathBuilder4.curveToRelative(-1.33f, 0.0f, -2.57f, 0.36f, -3.65f, 0.97f);
        pathBuilder3.lineToRelative(1.49f, 1.49f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(10.51f, 6.17f, 11.23f, 6.0f, 12.0f, 6.0f);
        pathBuilder5.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        pathBuilder3.verticalLineToRelative(0.5f);
        pathBuilder3.horizontalLineTo(19.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder6.curveToRelative(0.0f, 0.99f, -0.48f, 1.85f, -1.21f, 2.4f);
        pathBuilder3.lineToRelative(1.41f, 1.41f);
        pathBuilder6.curveToRelative(1.09f, -0.92f, 1.8f, -2.27f, 1.8f, -3.81f);
        pathBuilder6.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        pathBuilder3.close();
        pathBuilder3.moveTo(3.0f, 5.27f);
        pathBuilder3.lineToRelative(2.77f, 2.77f);
        pathBuilder3.horizontalLineToRelative(-0.42f);
        PathBuilder pathBuilder7 = pathBuilder3;
        pathBuilder7.curveTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        pathBuilder7.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(11.73f);
        pathBuilder3.lineToRelative(2.0f, 2.0f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(4.41f, 3.86f);
        pathBuilder3.lineTo(3.0f, 5.27f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.73f, 10.0f);
        pathBuilder3.lineToRelative(8.0f, 8.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder3.horizontalLineToRelative(1.73f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cloudOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
