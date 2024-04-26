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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noTransfer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoTransfer", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoTransfer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoTransfer.kt */
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.NoTransfer", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.78f, 2.95f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f);
        pathBuilder.lineTo(13.83f, 11.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.lineTo(5.78f, 2.95f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-1.01f, -1.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(17.89f, 20.96f, 17.7f, 21.0f, 17.5f, 21.0f);
        pathBuilder3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveTo(8.0f, 20.33f, 7.33f, 21.0f, 6.5f, 21.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f);
        pathBuilder.verticalLineToRelative(-1.28f);
        pathBuilder.curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f);
        pathBuilder.verticalLineTo(6.83f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder4.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 15.5f);
        pathBuilder5.curveTo(9.0f, 14.67f, 8.33f, 14.0f, 7.5f, 14.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 14.67f, 6.0f, 15.5f);
        pathBuilder.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 16.33f, 9.0f, 15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.17f, 11.0f);
        pathBuilder.lineTo(6.0f, 8.83f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(8.17f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noTransfer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
