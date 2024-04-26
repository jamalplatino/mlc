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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getHdrOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: HdrOff.kt */
public final class HdrOffKt {
    private static ImageVector _hdrOff;

    public static final ImageVector getHdrOff(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _hdrOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.HdrOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.9f, 2.0f);
        pathBuilder.lineTo(21.0f, 15.0f);
        pathBuilder.lineToRelative(-0.9f, -2.1f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.verticalLineToRelative(4.86f);
        pathBuilder.lineTo(17.14f, 15.0f);
        pathBuilder.horizontalLineToRelative(0.36f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.5f);
        pathBuilder.verticalLineToRelative(0.36f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineTo(14.5f, 10.5f);
        pathBuilder.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-1.86f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineTo(13.0f, 10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(2.51f, 2.49f);
        pathBuilder.lineTo(1.45f, 3.55f);
        pathBuilder.lineTo(6.9f, 9.0f);
        pathBuilder.horizontalLineToRelative(-0.4f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(4.5f, 9.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(6.5f, 15.0f);
        pathBuilder.lineTo(8.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-4.9f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineTo(9.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(3.4f);
        pathBuilder.lineToRelative(7.6f, 7.6f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _hdrOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
