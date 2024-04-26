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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rawOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RawOn", "Landroidx/compose/material/icons/Icons$Outlined;", "getRawOn", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RawOn.kt */
public final class RawOnKt {
    private static ImageVector _rawOn;

    public static final ImageVector getRawOn(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _rawOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.RawOn", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 9.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.9f, 2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineToRelative(-0.9f, -2.1f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder2.curveTo(8.0f, 9.7f, 7.3f, 9.0f, 6.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 11.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.25f, 9.0f);
        pathBuilder3.lineToRelative(-1.5f, 6.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.lineToRelative(0.38f, -1.5f);
        pathBuilder3.horizontalLineToRelative(1.75f);
        pathBuilder3.lineToRelative(0.37f, 1.5f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.lineToRelative(-1.5f, -6.0f);
        pathBuilder3.horizontalLineTo(10.25f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.0f, 12.0f);
        pathBuilder3.lineToRelative(0.25f, -1.0f);
        pathBuilder3.horizontalLineToRelative(0.5f);
        pathBuilder3.lineTo(12.0f, 12.0f);
        pathBuilder3.horizontalLineTo(11.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(19.98f, 9.0f);
        pathBuilder4.lineToRelative(-0.74f, 3.0f);
        pathBuilder4.lineToRelative(-0.74f, -3.0f);
        pathBuilder4.lineToRelative(-1.52f, 0.0f);
        pathBuilder4.lineToRelative(-0.74f, 3.0f);
        pathBuilder4.lineToRelative(-0.74f, -3.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(1.5f, 6.0f);
        pathBuilder4.lineToRelative(1.48f, 0.0f);
        pathBuilder4.lineToRelative(0.76f, -3.04f);
        pathBuilder4.lineToRelative(0.76f, 3.04f);
        pathBuilder4.lineToRelative(1.48f, 0.0f);
        pathBuilder4.lineToRelative(1.5f, -6.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _rawOn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
