package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenLockRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenLockRotation", "Landroidx/compose/material/icons/Icons$Sharp;", "getScreenLockRotation", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScreenLockRotation.kt */
public final class ScreenLockRotationKt {
    private static ImageVector _screenLockRotation;

    public static final ImageVector getScreenLockRotation(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _screenLockRotation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.ScreenLockRotation", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.52f, 21.48f);
        pathBuilder.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilder.lineTo(0.05f, 13.0f);
        pathBuilder.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilder.lineToRelative(0.66f, -0.03f);
        pathBuilder.lineToRelative(-3.81f, -3.82f);
        pathBuilder.lineToRelative(-1.33f, 1.33f);
        pathBuilder.close();
        pathBuilder.moveTo(20.05f, 4.0f);
        pathBuilder.verticalLineToRelative(-0.36f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        pathBuilder2.curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f);
        pathBuilder.lineTo(15.05f, 4.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.lineTo(21.05f, 4.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.25f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.4f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        pathBuilder.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        pathBuilder.lineTo(19.25f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.73f, 11.2f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(2.22f, 2.22f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineTo(3.56f, 9.17f);
        pathBuilder.lineToRelative(5.66f, -5.66f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(9.22f, 0.69f);
        pathBuilder.lineTo(0.74f, 9.17f);
        pathBuilder.lineToRelative(14.14f, 14.14f);
        pathBuilder.lineToRelative(8.48f, -8.48f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _screenLockRotation = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
