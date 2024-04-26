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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rMobiledata", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RMobiledata", "Landroidx/compose/material/icons/Icons$Rounded;", "getRMobiledata", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RMobiledata.kt */
public final class RMobiledataKt {
    private static ImageVector _rMobiledata;

    public static final ImageVector getRMobiledata(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _rMobiledata;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.RMobiledata", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.8f, 7.2f);
        pathBuilder.lineToRelative(0.65f, 1.52f);
        pathBuilder.curveTo(8.71f, 9.33f, 8.27f, 10.0f, 7.61f, 10.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.7f, -0.22f, -0.85f, -0.56f);
        pathBuilder.lineTo(5.87f, 7.33f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveTo(4.0f, 9.59f, 3.59f, 10.0f, 3.08f, 10.0f);
        pathBuilder.horizontalLineTo(2.92f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.41f, 10.0f, 2.0f, 9.59f, 2.0f, 9.08f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.33f);
        pathBuilder2.curveTo(9.0f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(1.33f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rMobiledata = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}