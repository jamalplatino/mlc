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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Rounded;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DoNotTouch.kt */
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.DoNotTouch", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.verticalLineTo(2.25f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        pathBuilder2.curveTo(12.44f, 1.0f, 13.0f, 1.56f, 13.0f, 2.25f);
        pathBuilder.verticalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.32f);
        pathBuilder2.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilder2.curveToRelative(-0.75f, -0.08f, -1.38f, 0.51f, -1.38f, 1.24f);
        pathBuilder.verticalLineToRelative(5.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(0.0f, -7.18f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilder4.curveTo(14.63f, 1.93f, 14.0f, 2.52f, 14.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.92f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.lineTo(20.0f, 5.32f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 4.25f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder5.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.0f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.65f, -0.52f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.lineToRelative(0.44f, 0.44f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(3.51f, 3.51f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.92f, 4.92f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.verticalLineToRelative(4.3f);
        pathBuilder.lineToRelative(-2.6f, -1.48f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilder8.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilder.lineTo(2.0f, 13.88f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(6.8f, 7.18f);
        pathBuilder.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilder.lineTo(17.0f, 22.0f);
        pathBuilder.lineTo(17.0f, 22.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _doNotTouch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
