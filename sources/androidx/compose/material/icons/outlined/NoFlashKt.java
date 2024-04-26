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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFlash", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoFlash", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoFlash.kt */
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NoFlash", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.4f, 5.6f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.lineTo(19.0f, 11.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(20.4f, 5.6f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 11.4f);
        pathBuilder.lineToRelative(0.0f, 1.77f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f);
        pathBuilder.horizontalLineToRelative(-2.54f);
        pathBuilder.lineTo(12.58f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.75f);
        pathBuilder.lineToRelative(3.4f, 3.4f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.1f, 2.1f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineToRelative(5.66f, 5.66f);
        pathBuilder.lineTo(6.14f, 9.4f);
        pathBuilder.horizontalLineTo(3.6f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        pathBuilder.verticalLineToRelative(9.4f);
        pathBuilder2.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        pathBuilder.horizontalLineToRelative(12.8f);
        pathBuilder.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        pathBuilder.lineToRelative(2.54f, 2.54f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(9.17f, 14.0f, 10.0f, 14.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.96f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-8.6f);
        pathBuilder.horizontalLineToRelative(2.14f);
        pathBuilder.horizontalLineToRelative(0.88f);
        pathBuilder.lineToRelative(0.59f, -0.65f);
        pathBuilder.lineToRelative(0.15f, -0.16f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f);
        pathBuilder3.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder3.curveToRelative(1.68f, 0.0f, 3.07f, -1.18f, 3.42f, -2.76f);
        pathBuilder.lineToRelative(2.55f, 2.55f);
        pathBuilder.lineTo(15.96f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noFlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}