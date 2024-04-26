package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberPin", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFiberPin", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FiberPin.kt */
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.FiberPin", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.horizontalLineToRelative(1.75f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.74f, 0.0f, 1.31f, -0.57f, 1.31f, -1.31f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder2.curveToRelative(0.0f, -0.74f, -0.57f, -1.31f, -1.31f, -1.31f);
        pathBuilder.lineTo(5.0f, 9.37f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.close();
        pathBuilder.moveTo(6.31f, 10.69f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.verticalLineToRelative(0.88f);
        pathBuilder.lineTo(6.31f, 11.57f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.close();
        pathBuilder.moveTo(11.34f, 9.38f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.horizontalLineToRelative(-1.31f);
        pathBuilder.close();
        pathBuilder.moveTo(14.62f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.verticalLineToRelative(-3.06f);
        pathBuilder.lineToRelative(2.23f, 3.06f);
        pathBuilder.lineTo(19.0f, 14.62f);
        pathBuilder.lineTo(19.0f, 9.38f);
        pathBuilder.horizontalLineToRelative(-1.09f);
        pathBuilder.verticalLineToRelative(3.06f);
        pathBuilder.lineToRelative(-2.19f, -3.06f);
        pathBuilder.horizontalLineToRelative(-1.1f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(12.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 4.0f);
        pathBuilder4.lineTo(4.0f, 4.0f);
        pathBuilder4.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder4.lineTo(2.0f, 18.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder5.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder4.lineTo(22.0f, 6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 18.0f);
        pathBuilder4.lineTo(4.0f, 18.0f);
        pathBuilder4.lineTo(4.0f, 6.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fiberPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
