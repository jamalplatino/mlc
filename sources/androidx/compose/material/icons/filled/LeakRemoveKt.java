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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leakRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakRemove", "Landroidx/compose/material/icons/Icons$Filled;", "getLeakRemove", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LeakRemove.kt */
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.LeakRemove", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.37f, -0.04f, 0.72f, -0.12f, 1.06f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.curveTo(9.81f, 4.84f, 10.0f, 3.94f, 10.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.84f, 2.84f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        pathBuilder.lineTo(8.7f, 9.97f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(2.71f, 0.0f, 5.19f, -0.99f, 7.11f, -2.62f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.69f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder5.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineTo(21.0f, 19.73f);
        pathBuilder.lineTo(4.27f, 3.0f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, 1.5f, -0.37f, 2.91f, -1.02f, 4.16f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder6.curveTo(13.42f, 6.98f, 14.0f, 5.06f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.94f, 16.12f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(0.34f, -0.08f, 0.69f, -0.12f, 1.06f, -0.12f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder7.curveToRelative(-0.94f, 0.0f, -1.84f, 0.19f, -2.66f, 0.52f);
        pathBuilder.lineToRelative(1.6f, 1.6f);
        pathBuilder.close();
        pathBuilder.moveTo(15.38f, 11.56f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveTo(18.09f, 12.37f, 19.5f, 12.0f, 21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder8.curveToRelative(-2.06f, 0.0f, -3.98f, 0.58f, -5.62f, 1.56f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _leakRemove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
