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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lockReset", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LockReset", "Landroidx/compose/material/icons/Icons$Outlined;", "getLockReset", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LockReset.kt */
public final class LockResetKt {
    private static ImageVector _lockReset;

    public static final ImageVector getLockReset(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _lockReset;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.LockReset", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 0.06f, 0.01f, 0.12f, 0.01f, 0.19f);
        pathBuilder.lineToRelative(-1.84f, -1.84f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(5.0f, 16.0f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.82f, 1.82f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.01f, 12.11f, 6.0f, 12.06f, 6.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        pathBuilder.curveToRelative(-1.9f, 0.0f, -3.62f, -0.76f, -4.88f, -1.99f);
        pathBuilder.lineTo(6.7f, 18.42f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(8.32f, 20.01f, 10.55f, 21.0f, 13.0f, 21.0f);
        pathBuilder4.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveTo(17.97f, 3.0f, 13.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 11.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(16.0f, 11.45f, 15.55f, 11.0f, 15.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _lockReset = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
