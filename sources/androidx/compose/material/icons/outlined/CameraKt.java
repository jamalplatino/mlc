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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "Landroidx/compose/material/icons/Icons$Outlined;", "getCamera", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Camera.kt */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Camera", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.25f, 2.26f);
        pathBuilder.lineToRelative(-0.08f, -0.04f);
        pathBuilder.lineToRelative(-0.01f, 0.02f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        pathBuilder.close();
        pathBuilder.moveTo(19.41f, 9.0f);
        pathBuilder.horizontalLineToRelative(-7.99f);
        pathBuilder.lineToRelative(2.71f, -4.7f);
        pathBuilder.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(13.1f, 4.08f);
        pathBuilder.lineTo(10.27f, 9.0f);
        pathBuilder.lineToRelative(-1.15f, 2.0f);
        pathBuilder.lineTo(6.4f, 6.3f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(5.7f, 7.09f);
        pathBuilder.lineTo(8.54f, 12.0f);
        pathBuilder.lineToRelative(1.15f, 2.0f);
        pathBuilder.lineTo(4.26f, 14.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        pathBuilder.close();
        pathBuilder.moveTo(4.59f, 15.0f);
        pathBuilder.horizontalLineToRelative(7.98f);
        pathBuilder.lineToRelative(-2.71f, 4.7f);
        pathBuilder.curveToRelative(-2.4f, -0.67f, -4.34f, -2.42f, -5.27f, -4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(10.9f, 19.91f);
        pathBuilder.lineTo(14.89f, 13.0f);
        pathBuilder.lineToRelative(2.72f, 4.7f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        pathBuilder5.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        pathBuilder.close();
        pathBuilder.moveTo(18.3f, 16.91f);
        pathBuilder.lineToRelative(-4.0f, -6.91f);
        pathBuilder.horizontalLineToRelative(5.43f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        pathBuilder6.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _camera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
