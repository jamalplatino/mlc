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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noEncryption", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoEncryption", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoEncryption", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoEncryption.kt */
public final class NoEncryptionKt {
    private static ImageVector _noEncryption;

    public static final ImageVector getNoEncryption(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _noEncryption;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NoEncryption", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(10.78f);
        pathBuilder.lineToRelative(-10.0f, -10.0f);
        pathBuilder.lineTo(6.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.44f, 10.0f);
        pathBuilder.lineTo(18.0f, 15.56f);
        pathBuilder.lineTo(18.0f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.9f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        pathBuilder2.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-4.66f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.horizontalLineTo(18.0f);
        pathBuilder2.verticalLineToRelative(5.56f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.verticalLineTo(10.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder3.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder3.curveToRelative(-2.32f, 0.0f, -4.26f, 1.59f, -4.82f, 3.74f);
        pathBuilder2.lineTo(8.9f, 6.46f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.41f, 4.81f);
        pathBuilder2.lineTo(3.0f, 6.22f);
        pathBuilder2.lineToRelative(2.04f, 2.04f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveTo(4.42f, 8.6f, 4.0f, 9.25f, 4.0f, 10.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(12.78f);
        pathBuilder2.lineToRelative(1.0f, 1.0f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(4.41f, 4.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 20.0f);
        pathBuilder2.verticalLineTo(10.0f);
        pathBuilder2.horizontalLineToRelative(0.78f);
        pathBuilder2.lineToRelative(10.0f, 10.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noEncryption = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
