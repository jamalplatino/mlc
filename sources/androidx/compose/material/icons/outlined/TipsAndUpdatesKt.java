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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tipsAndUpdates", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TipsAndUpdates", "Landroidx/compose/material/icons/Icons$Outlined;", "getTipsAndUpdates", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TipsAndUpdates.kt */
public final class TipsAndUpdatesKt {
    private static ImageVector _tipsAndUpdates;

    public static final ImageVector getTipsAndUpdates(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _tipsAndUpdates;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.TipsAndUpdates", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 21.1f, 7.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f);
        pathBuilder.horizontalLineTo(5.27f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f);
        pathBuilder2.curveTo(1.5f, 5.36f, 4.86f, 2.0f, 9.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(16.5f, 5.36f, 16.5f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 9.5f);
        pathBuilder.curveTo(14.5f, 6.47f, 12.03f, 4.0f, 9.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(3.5f, 6.47f, 3.5f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 2.47f, 1.49f, 3.89f, 2.35f, 4.5f);
        pathBuilder.horizontalLineToRelative(6.3f);
        pathBuilder.curveTo(13.01f, 13.39f, 14.5f, 11.97f, 14.5f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.37f, 7.37f);
        pathBuilder.lineTo(20.0f, 8.0f);
        pathBuilder.lineToRelative(1.37f, 0.63f);
        pathBuilder.lineTo(22.0f, 10.0f);
        pathBuilder.lineToRelative(0.63f, -1.37f);
        pathBuilder.lineTo(24.0f, 8.0f);
        pathBuilder.lineToRelative(-1.37f, -0.63f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.lineTo(21.37f, 7.37f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 6.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(22.0f, 3.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(19.0f, 0.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(16.0f, 3.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.lineTo(19.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _tipsAndUpdates = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}