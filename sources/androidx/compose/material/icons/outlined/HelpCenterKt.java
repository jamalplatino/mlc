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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_helpCenter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HelpCenter", "Landroidx/compose/material/icons/Icons$Outlined;", "getHelpCenter", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HelpCenter.kt */
public final class HelpCenterKt {
    private static ImageVector _helpCenter;

    public static final ImageVector getHelpCenter(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.HelpCenter", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.25f, 16.74f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f);
        pathBuilder2.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder2.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder2.curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 6.0f);
        pathBuilder.curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f);
        pathBuilder.lineToRelative(1.64f, 0.69f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f);
        pathBuilder3.curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f);
        pathBuilder3.curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f);
        pathBuilder3.curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f);
        pathBuilder.horizontalLineToRelative(1.82f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f);
        pathBuilder4.curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f);
        pathBuilder4.curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f);
        pathBuilder4.curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.lineTo(19.0f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _helpCenter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}