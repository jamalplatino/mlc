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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cleanHands", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CleanHands", "Landroidx/compose/material/icons/Icons$Rounded;", "getCleanHands", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CleanHands.kt */
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.CleanHands", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.99f, 7.0f);
        pathBuilder.lineToRelative(1.37f, -0.63f);
        pathBuilder.lineTo(16.99f, 5.0f);
        pathBuilder.lineToRelative(0.63f, 1.37f);
        pathBuilder.lineTo(18.99f, 7.0f);
        pathBuilder.lineToRelative(-1.37f, 0.63f);
        pathBuilder.lineTo(16.99f, 9.0f);
        pathBuilder.lineToRelative(-0.63f, -1.37f);
        pathBuilder.lineTo(14.99f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 14.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.78f, -0.99f, -2.44f, -1.58f, -3.36f);
        pathBuilder2.curveToRelative(-0.2f, -0.31f, -0.64f, -0.31f, -0.84f, 0.0f);
        pathBuilder2.curveTo(18.99f, 9.56f, 18.0f, 11.22f, 18.0f, 12.0f);
        pathBuilder2.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.24f, 9.5f);
        pathBuilder.lineTo(15.0f, 11.65f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.35f, 0.0f, 0.68f, 0.06f, 1.0f, 0.18f);
        pathBuilder3.curveToRelative(0.37f, 0.13f, 0.78f, 0.05f, 1.05f, -0.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.51f, -0.51f, 0.34f, -1.39f, -0.33f, -1.64f);
        pathBuilder3.curveTo(14.19f, 2.11f, 13.61f, 2.0f, 13.0f, 2.0f);
        pathBuilder.horizontalLineTo(8.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(2.11f);
        pathBuilder.curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f);
        pathBuilder.horizontalLineTo(9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 11.0f);
        pathBuilder.lineTo(3.0f, 11.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.curveTo(5.0f, 11.9f, 4.1f, 11.0f, 3.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.99f, 17.0f);
        pathBuilder.horizontalLineToRelative(-6.83f);
        pathBuilder.curveToRelative(-0.11f, 0.0f, -0.22f, -0.02f, -0.33f, -0.06f);
        pathBuilder.lineToRelative(-1.47f, -0.51f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.26f, -0.09f, -0.39f, -0.37f, -0.3f, -0.63f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.3f);
        pathBuilder.lineToRelative(1.12f, 0.43f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f);
        pathBuilder.horizontalLineToRelative(2.63f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder7.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        pathBuilder.lineTo(9.3f, 11.13f);
        pathBuilder.curveTo(9.08f, 11.04f, 8.84f, 11.0f, 8.6f, 11.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(9.02f);
        pathBuilder.lineToRelative(6.37f, 1.81f);
        pathBuilder.curveToRelative(0.41f, 0.12f, 0.85f, 0.1f, 1.25f, -0.05f);
        pathBuilder.lineTo(22.0f, 19.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(22.0f, 17.89f, 21.1f, 17.0f, 19.99f, 17.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cleanHands = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
