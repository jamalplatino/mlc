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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoAwesome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoAwesome", "Landroidx/compose/material/icons/Icons$Outlined;", "getAutoAwesome", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoAwesome.kt */
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.AutoAwesome", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.lineToRelative(1.25f, -2.75f);
        pathBuilder.lineToRelative(2.75f, -1.25f);
        pathBuilder.lineToRelative(-2.75f, -1.25f);
        pathBuilder.lineToRelative(-1.25f, -2.75f);
        pathBuilder.lineToRelative(-1.25f, 2.75f);
        pathBuilder.lineToRelative(-2.75f, 1.25f);
        pathBuilder.lineToRelative(2.75f, 1.25f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 15.0f);
        pathBuilder2.lineToRelative(-1.25f, 2.75f);
        pathBuilder2.lineToRelative(-2.75f, 1.25f);
        pathBuilder2.lineToRelative(2.75f, 1.25f);
        pathBuilder2.lineToRelative(1.25f, 2.75f);
        pathBuilder2.lineToRelative(1.25f, -2.75f);
        pathBuilder2.lineToRelative(2.75f, -1.25f);
        pathBuilder2.lineToRelative(-2.75f, -1.25f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.5f, 9.5f);
        pathBuilder3.lineTo(9.0f, 4.0f);
        pathBuilder3.lineTo(6.5f, 9.5f);
        pathBuilder3.lineTo(1.0f, 12.0f);
        pathBuilder3.lineToRelative(5.5f, 2.5f);
        pathBuilder3.lineTo(9.0f, 20.0f);
        pathBuilder3.lineToRelative(2.5f, -5.5f);
        pathBuilder3.lineTo(17.0f, 12.0f);
        pathBuilder3.lineTo(11.5f, 9.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.99f, 12.99f);
        pathBuilder3.lineTo(9.0f, 15.17f);
        pathBuilder3.lineToRelative(-0.99f, -2.18f);
        pathBuilder3.lineTo(5.83f, 12.0f);
        pathBuilder3.lineToRelative(2.18f, -0.99f);
        pathBuilder3.lineTo(9.0f, 8.83f);
        pathBuilder3.lineToRelative(0.99f, 2.18f);
        pathBuilder3.lineTo(12.17f, 12.0f);
        pathBuilder3.lineTo(9.99f, 12.99f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoAwesome = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
