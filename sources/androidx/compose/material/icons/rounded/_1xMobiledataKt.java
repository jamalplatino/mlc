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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__1xMobiledata", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_1xMobiledata", "Landroidx/compose/material/icons/Icons$Rounded;", "get_1xMobiledata", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: _1xMobiledata.kt */
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded._1xMobiledata", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(5.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(4.45f, 9.0f, 4.0f, 8.55f, 4.0f, 8.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveTo(4.0f, 7.45f, 4.45f, 7.0f, 5.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.83f, 11.72f);
        pathBuilder.lineToRelative(1.92f, -3.21f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(18.15f, 7.85f, 17.67f, 7.0f, 16.9f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(-0.35f, 0.0f, -0.68f, 0.18f, -0.86f, 0.49f);
        pathBuilder.lineToRelative(-1.37f, 2.28f);
        pathBuilder.lineToRelative(-1.38f, -2.29f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.11f, 7.18f, 12.79f, 7.0f, 12.44f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(-0.78f, 0.0f, -1.26f, 0.85f, -0.86f, 1.51f);
        pathBuilder.lineToRelative(1.92f, 3.21f);
        pathBuilder.lineToRelative(-2.26f, 3.77f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.4f, 0.67f, 0.08f, 1.51f, 0.86f, 1.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(0.35f, 0.0f, 0.68f, -0.18f, 0.86f, -0.49f);
        pathBuilder.lineToRelative(1.71f, -2.85f);
        pathBuilder.lineToRelative(1.71f, 2.85f);
        pathBuilder.curveToRelative(0.18f, 0.3f, 0.51f, 0.49f, 0.86f, 0.49f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.78f, 0.0f, 1.26f, -0.85f, 0.86f, -1.51f);
        pathBuilder.lineTo(15.83f, 11.72f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        __1xMobiledata = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
