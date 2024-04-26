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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_biotech", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Biotech", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBiotech", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Biotech.kt */
public final class BiotechKt {
    private static ImageVector _biotech;

    public static final ImageVector getBiotech(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _biotech;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.Biotech", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.925f, 4.861f);
        pathBuilder.lineToRelative(0.94f, -0.342f);
        pathBuilder.lineToRelative(1.71f, 4.699f);
        pathBuilder.lineToRelative(-0.94f, 0.342f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.5f, 8.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.0f, 19.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.horizontalLineToRelative(-4.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(3.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.horizontalLineToRelative(-8.0f);
        pathBuilder5.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder5.curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.47f, -2.57f);
        pathBuilder5.curveToRelative(0.41f, 0.59f, 1.06f, 1.0f, 1.83f, 1.06f);
        pathBuilder5.curveToRelative(0.7f, 0.06f, 1.36f, -0.19f, 1.85f, -0.62f);
        pathBuilder4.lineToRelative(0.59f, 1.61f);
        pathBuilder4.lineToRelative(0.94f, -0.34f);
        pathBuilder4.lineToRelative(0.34f, 0.94f);
        pathBuilder4.lineToRelative(1.88f, -0.68f);
        pathBuilder4.lineToRelative(-0.34f, -0.94f);
        pathBuilder4.lineToRelative(0.94f, -0.34f);
        pathBuilder4.lineTo(13.76f, 2.6f);
        pathBuilder4.lineToRelative(-0.94f, 0.34f);
        pathBuilder4.lineTo(12.48f, 2.0f);
        pathBuilder4.lineTo(10.6f, 2.68f);
        pathBuilder4.lineToRelative(0.34f, 0.94f);
        pathBuilder4.lineTo(10.0f, 3.97f);
        pathBuilder4.lineToRelative(0.56f, 1.55f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveTo(9.39f, 5.48f, 8.37f, 6.27f, 8.08f, 7.38f);
        pathBuilder6.curveTo(6.27f, 8.14f, 5.0f, 9.92f, 5.0f, 12.0f);
        pathBuilder6.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineTo(7.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.86f, 4.52f);
        pathBuilder4.lineToRelative(1.71f, 4.7f);
        pathBuilder4.lineToRelative(-0.94f, 0.34f);
        pathBuilder4.lineToRelative(-1.71f, -4.7f);
        pathBuilder4.lineTo(12.86f, 4.52f);
        pathBuilder4.close();
        pathBuilder4.moveTo(10.5f, 7.0f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder7.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder7.curveTo(9.5f, 7.45f, 9.95f, 7.0f, 10.5f, 7.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _biotech = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
