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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cake", "Landroidx/compose/material/icons/Icons$Outlined;", "getCake", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Cake.kt */
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Cake", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        pathBuilder.lineTo(12.0f, 0.0f);
        pathBuilder.lineToRelative(-1.71f, 2.97f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f);
        pathBuilder.lineToRelative(1.09f, -1.07f);
        pathBuilder.lineToRelative(1.07f, 1.07f);
        pathBuilder.curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0.0f);
        pathBuilder.lineToRelative(1.08f, -1.07f);
        pathBuilder.lineToRelative(1.07f, 1.07f);
        pathBuilder.curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.4f, 1.01f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 15.5f);
        pathBuilder.curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f);
        pathBuilder.lineToRelative(-2.13f, -2.13f);
        pathBuilder.lineToRelative(-2.14f, 2.13f);
        pathBuilder.curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0.0f);
        pathBuilder.lineTo(8.48f, 12.8f);
        pathBuilder.lineToRelative(-2.14f, 2.13f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f);
        pathBuilder.lineTo(5.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
