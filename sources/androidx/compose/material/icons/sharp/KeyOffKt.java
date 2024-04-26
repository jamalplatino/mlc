package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getKeyOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: KeyOff.kt */
public final class KeyOffKt {
    private static ImageVector _keyOff;

    public static final ImageVector getKeyOff(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.KeyOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.91f, 14.09f);
        pathBuilder.lineTo(17.0f, 14.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(4.0f, -4.04f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-8.17f);
        pathBuilder.lineTo(16.91f, 14.09f);
        pathBuilder.close();
        pathBuilder.moveTo(3.98f, 6.81f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f);
        pathBuilder.lineToRelative(7.59f, 7.59f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(3.98f, 6.81f);
        pathBuilder.close();
        pathBuilder.moveTo(9.91f, 12.74f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(9.58f, 14.03f, 8.4f, 15.0f, 7.0f, 15.0f);
        pathBuilder3.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder3.curveToRelative(0.0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f);
        pathBuilder.lineTo(9.91f, 12.74f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _keyOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
