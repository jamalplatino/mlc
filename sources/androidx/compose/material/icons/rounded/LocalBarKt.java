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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localBar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalBar", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalBar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalBar.kt */
public final class LocalBarKt {
    private static ImageVector _localBar;

    public static final ImageVector getLocalBar(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _localBar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LocalBar", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.45f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.8f, -0.65f, -1.45f, -1.45f, -1.45f);
        pathBuilder.horizontalLineTo(4.45f);
        pathBuilder2.curveTo(3.65f, 3.0f, 3.0f, 3.65f, 3.0f, 4.45f);
        pathBuilder2.curveToRelative(0.0f, 0.35f, 0.13f, 0.7f, 0.37f, 0.96f);
        pathBuilder.lineTo(11.0f, 14.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(7.63f, -8.59f);
        pathBuilder.curveToRelative(0.24f, -0.26f, 0.37f, -0.61f, 0.37f, -0.96f);
        pathBuilder.close();
        pathBuilder.moveTo(7.43f, 7.0f);
        pathBuilder.lineTo(5.66f, 5.0f);
        pathBuilder.horizontalLineToRelative(12.69f);
        pathBuilder.lineToRelative(-1.78f, 2.0f);
        pathBuilder.horizontalLineTo(7.43f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localBar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}