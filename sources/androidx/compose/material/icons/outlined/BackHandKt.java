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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_backHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BackHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getBackHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackHand.kt */
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.BackHand", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder2.curveToRelative(-0.23f, 0.0f, -0.46f, 0.03f, -0.67f, 0.09f);
        pathBuilder2.curveTo(14.46f, 0.66f, 13.56f, 0.0f, 12.5f, 0.0f);
        pathBuilder2.curveToRelative(-1.23f, 0.0f, -2.25f, 0.89f, -2.46f, 2.06f);
        pathBuilder2.curveTo(9.87f, 2.02f, 9.69f, 2.0f, 9.5f, 2.0f);
        pathBuilder2.curveTo(8.12f, 2.0f, 7.0f, 3.12f, 7.0f, 4.5f);
        pathBuilder.verticalLineToRelative(5.89f);
        pathBuilder.curveToRelative(-0.34f, -0.31f, -0.76f, -0.54f, -1.22f, -0.66f);
        pathBuilder.lineTo(5.01f, 9.52f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.83f, -0.23f, -1.7f, 0.09f, -2.19f, 0.83f);
        pathBuilder3.curveToRelative(-0.38f, 0.57f, -0.4f, 1.31f, -0.15f, 1.95f);
        pathBuilder.lineToRelative(2.56f, 6.43f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(6.49f, 21.91f, 9.57f, 24.0f, 13.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 16.0f);
        pathBuilder4.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(-2.61f, 0.0f, -4.95f, -1.59f, -5.91f, -4.01f);
        pathBuilder.lineToRelative(-2.6f, -6.54f);
        pathBuilder.lineToRelative(0.53f, 0.14f);
        pathBuilder.curveToRelative(0.46f, 0.12f, 0.83f, 0.46f, 1.0f, 0.9f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 4.22f, 10.0f, 4.5f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(2.5f);
        pathBuilder.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(16.0f, 3.72f, 16.0f, 4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(19.0f, 6.72f, 19.0f, 7.0f);
        pathBuilder.lineTo(19.0f, 16.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _backHand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
