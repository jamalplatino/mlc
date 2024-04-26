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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberNew", "Landroidx/compose/material/icons/Icons$Sharp;", "getFiberNew", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FiberNew.kt */
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.FiberNew", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 4.0f);
        pathBuilder.lineTo(2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 15.0f);
        pathBuilder.lineTo(7.3f, 15.0f);
        pathBuilder.lineToRelative(-2.55f, -3.5f);
        pathBuilder.lineTo(4.75f, 15.0f);
        pathBuilder.lineTo(3.5f, 15.0f);
        pathBuilder.lineTo(3.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.lineToRelative(2.5f, 3.5f);
        pathBuilder.lineTo(7.25f, 9.0f);
        pathBuilder.lineTo(8.5f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 10.26f);
        pathBuilder.lineTo(11.0f, 10.26f);
        pathBuilder.verticalLineToRelative(1.12f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.lineTo(11.0f, 12.64f);
        pathBuilder.verticalLineToRelative(1.11f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.lineTo(13.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(9.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.lineTo(14.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(4.51f);
        pathBuilder.horizontalLineToRelative(1.13f);
        pathBuilder.lineTo(16.88f, 9.99f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(3.51f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.lineTo(19.25f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fiberNew = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
