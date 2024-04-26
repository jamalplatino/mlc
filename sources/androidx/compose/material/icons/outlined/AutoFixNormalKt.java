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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixNormal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixNormal", "Landroidx/compose/material/icons/Icons$Outlined;", "getAutoFixNormal", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoFixNormal.kt */
public final class AutoFixNormalKt {
    private static ImageVector _autoFixNormal;

    public static final ImageVector getAutoFixNormal(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _autoFixNormal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.AutoFixNormal", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 7.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineToRelative(2.06f, -0.94f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineToRelative(-0.94f, -2.06f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineToRelative(-2.06f, 0.94f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.71f, 9.12f);
        pathBuilder2.lineToRelative(-2.83f, -2.83f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f);
        pathBuilder3.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder2.lineTo(2.29f, 17.46f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.lineToRelative(2.83f, 2.83f);
        pathBuilder2.curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f);
        pathBuilder2.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        pathBuilder2.lineToRelative(11.17f, -11.17f);
        pathBuilder2.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.17f, 8.42f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(14.41f, 11.0f);
        pathBuilder2.lineTo(13.0f, 9.59f);
        pathBuilder2.lineTo(14.17f, 8.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.83f, 19.59f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineTo(11.59f, 11.0f);
        pathBuilder2.lineTo(13.0f, 12.41f);
        pathBuilder2.lineTo(5.83f, 19.59f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoFixNormal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
