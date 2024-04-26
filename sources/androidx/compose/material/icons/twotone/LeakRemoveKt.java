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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leakRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakRemove", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLeakRemove", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LeakRemove.kt */
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.LeakRemove", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.35f, -0.31f, 2.63f, -0.84f, 3.77f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder2.curveTo(13.51f, 6.7f, 14.0f, 4.91f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.91f, 0.0f, -3.7f, 0.49f, -5.27f, 1.35f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder3.curveToRelative(1.15f, -0.53f, 2.43f, -0.84f, 3.78f, -0.84f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.79f, 0.0f, -1.54f, 0.13f, -2.24f, 0.37f);
        pathBuilder.lineToRelative(1.68f, 1.68f);
        pathBuilder4.curveToRelative(0.19f, -0.01f, 0.37f, -0.05f, 0.56f, -0.05f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.19f, -0.04f, 0.37f, -0.06f, 0.56f);
        pathBuilder.lineToRelative(1.68f, 1.68f);
        pathBuilder5.curveToRelative(0.25f, -0.7f, 0.38f, -1.46f, 0.38f, -2.24f);
        pathBuilder.close();
        pathBuilder.moveTo(4.41f, 2.86f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.84f, 2.84f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder6.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        pathBuilder.lineTo(8.7f, 9.97f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder7.curveToRelative(2.72f, 0.0f, 5.2f, -0.99f, 7.11f, -2.62f);
        pathBuilder.lineToRelative(2.51f, 2.51f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder8.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.7f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder9.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.41f, 2.86f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _leakRemove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
