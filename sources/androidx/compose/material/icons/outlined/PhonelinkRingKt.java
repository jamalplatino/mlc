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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkRing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkRing", "Landroidx/compose/material/icons/Icons$Outlined;", "getPhonelinkRing", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhonelinkRing.kt */
public final class PhonelinkRingKt {
    private static ImageVector _phonelinkRing;

    public static final ImageVector getPhonelinkRing(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _phonelinkRing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.PhonelinkRing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.1f, 7.7f);
        pathBuilder.lineToRelative(-1.0f, 1.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.8f, 1.8f, 1.8f, 4.6f, 0.0f, 6.5f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder2.curveToRelative(2.5f, -2.3f, 2.5f, -6.1f, 0.0f, -8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 9.8f);
        pathBuilder.lineToRelative(-1.0f, 1.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.5f, 0.7f, 0.5f, 1.6f, 0.0f, 2.3f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder3.curveToRelative(1.2f, -1.2f, 1.2f, -3.0f, 0.0f, -4.3f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 1.0f);
        pathBuilder.lineTo(4.0f, 1.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(16.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phonelinkRing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
