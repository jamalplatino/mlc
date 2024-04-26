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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixNormal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixNormal", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoFixNormal", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoFixNormal.kt */
public final class AutoFixNormalKt {
    private static ImageVector _autoFixNormal;

    public static final ImageVector getAutoFixNormal(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _autoFixNormal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.AutoFixNormal", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.415f, 18.167f);
        pathBuilder.lineToRelative(7.17f, -7.17f);
        pathBuilder.lineToRelative(1.414f, 1.414f);
        pathBuilder.lineToRelative(-7.17f, 7.17f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 7.0f);
        pathBuilder2.lineToRelative(0.94f, -2.06f);
        pathBuilder2.lineToRelative(2.06f, -0.94f);
        pathBuilder2.lineToRelative(-2.06f, -0.94f);
        pathBuilder2.lineToRelative(-0.94f, -2.06f);
        pathBuilder2.lineToRelative(-0.94f, 2.06f);
        pathBuilder2.lineToRelative(-2.06f, 0.94f);
        pathBuilder2.lineToRelative(2.06f, 0.94f);
        pathBuilder2.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.71f, 9.12f);
        pathBuilder3.lineToRelative(-2.83f, -2.83f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f);
        pathBuilder4.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder3.lineTo(2.29f, 17.46f);
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder3.lineToRelative(2.83f, 2.83f);
        pathBuilder3.curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f);
        pathBuilder3.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        pathBuilder3.lineToRelative(11.17f, -11.17f);
        pathBuilder3.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.83f, 19.59f);
        pathBuilder3.lineToRelative(-1.41f, -1.41f);
        pathBuilder3.lineTo(11.59f, 11.0f);
        pathBuilder3.lineTo(13.0f, 12.41f);
        pathBuilder3.lineTo(5.83f, 19.59f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.41f, 11.0f);
        pathBuilder3.lineTo(13.0f, 9.59f);
        pathBuilder3.lineToRelative(1.17f, -1.17f);
        pathBuilder3.lineToRelative(1.41f, 1.41f);
        pathBuilder3.lineTo(14.41f, 11.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoFixNormal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
