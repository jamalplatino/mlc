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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tableBar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TableBar", "Landroidx/compose/material/icons/Icons$Outlined;", "getTableBar", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TableBar.kt */
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.TableBar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 7.5f);
        pathBuilder.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        pathBuilder.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(9.35f);
        pathBuilder.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        pathBuilder.lineTo(6.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.2f, -3.0f);
        pathBuilder.horizontalLineToRelative(5.6f);
        pathBuilder.lineToRelative(1.2f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-1.5f, -3.74f);
        pathBuilder.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(-4.02f);
        pathBuilder.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(4.05f, 0.0f, 6.74f, 0.86f, 7.72f, 1.5f);
        pathBuilder2.curveTo(18.74f, 8.14f, 16.05f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveTo(5.26f, 8.14f, 4.28f, 7.5f);
        pathBuilder.curveTo(5.26f, 6.86f, 7.95f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _tableBar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
