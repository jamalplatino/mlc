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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "Landroidx/compose/material/icons/Icons$Filled;", "getCamera", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Camera.kt */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Camera", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.4f, 10.5f);
        pathBuilder.lineToRelative(4.77f, -8.26f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveToRelative(-2.4f, 0.0f, -4.6f, 0.85f, -6.32f, 2.25f);
        pathBuilder.lineToRelative(3.66f, 6.35f);
        pathBuilder.lineToRelative(0.06f, -0.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.54f, 9.0f);
        pathBuilder.curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6.0f, -6.34f);
        pathBuilder.lineTo(11.88f, 9.0f);
        pathBuilder.horizontalLineToRelative(9.66f);
        pathBuilder.close();
        pathBuilder.moveTo(21.8f, 10.0f);
        pathBuilder.horizontalLineToRelative(-7.49f);
        pathBuilder.lineToRelative(0.29f, 0.5f);
        pathBuilder.lineToRelative(4.76f, 8.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(21.0f, 16.97f, 22.0f, 14.61f, 22.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -0.69f, -0.07f, -1.35f, -0.2f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.54f, 12.0f);
        pathBuilder.lineToRelative(-3.9f, -6.75f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(3.01f, 7.03f, 2.0f, 9.39f, 2.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 0.69f, 0.07f, 1.35f, 0.2f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.49f);
        pathBuilder.lineToRelative(-1.15f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.46f, 15.0f);
        pathBuilder.curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6.0f, 6.34f);
        pathBuilder.lineTo(12.12f, 15.0f);
        pathBuilder.lineTo(2.46f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.73f, 15.0f);
        pathBuilder.lineToRelative(-3.9f, 6.76f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f);
        pathBuilder5.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.32f, -2.25f);
        pathBuilder.lineToRelative(-3.66f, -6.35f);
        pathBuilder.lineToRelative(-0.93f, 1.6f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _camera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
