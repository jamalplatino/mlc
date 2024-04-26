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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noAdultContent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoAdultContent", "Landroidx/compose/material/icons/Icons$Sharp;", "getNoAdultContent", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoAdultContent.kt */
public final class NoAdultContentKt {
    private static ImageVector _noAdultContent;

    public static final ImageVector getNoAdultContent(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _noAdultContent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Sharp.NoAdultContent", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.63f, -3.54f, 1.69f, -4.9f);
        pathBuilder.lineTo(7.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(7.1f, 5.69f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.46f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        pathBuilder.horizontalLineToRelative(-2.83f);
        pathBuilder.lineToRelative(3.31f, 3.31f);
        pathBuilder2.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.25f, 14.0f);
        pathBuilder3.lineToRelative(-1.5f, -2.0f);
        pathBuilder3.lineToRelative(1.5f, -2.0f);
        pathBuilder3.lineToRelative(-1.5f, 0.0f);
        pathBuilder3.lineToRelative(-0.75f, 1.0f);
        pathBuilder3.lineToRelative(-0.75f, -1.0f);
        pathBuilder3.lineToRelative(-1.5f, 0.0f);
        pathBuilder3.lineToRelative(1.5f, 2.0f);
        pathBuilder3.lineToRelative(-1.5f, 2.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(0.75f, -1.0f);
        pathBuilder3.lineToRelative(0.75f, 1.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.0f, 10.0f);
        pathBuilder4.lineToRelative(-0.75f, 1.0f);
        pathBuilder4.lineToRelative(-0.75f, -1.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(1.5f, 2.0f);
        pathBuilder4.lineToRelative(-1.5f, 2.0f);
        pathBuilder4.lineToRelative(1.5f, 0.0f);
        pathBuilder4.lineToRelative(0.75f, -1.0f);
        pathBuilder4.lineToRelative(0.75f, 1.0f);
        pathBuilder4.lineToRelative(1.5f, 0.0f);
        pathBuilder4.lineToRelative(-1.5f, -2.0f);
        pathBuilder4.lineToRelative(1.5f, -2.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(16.0f, 14.0f);
        pathBuilder5.lineToRelative(0.75f, -1.0f);
        pathBuilder5.lineToRelative(0.75f, 1.0f);
        pathBuilder5.lineToRelative(1.5f, 0.0f);
        pathBuilder5.lineToRelative(-1.5f, -2.0f);
        pathBuilder5.lineToRelative(1.5f, -2.0f);
        pathBuilder5.lineToRelative(-1.5f, 0.0f);
        pathBuilder5.lineToRelative(-0.75f, 1.0f);
        pathBuilder5.lineToRelative(-0.75f, -1.0f);
        pathBuilder5.lineToRelative(-1.5f, 0.0f);
        pathBuilder5.lineToRelative(1.5f, 2.0f);
        pathBuilder5.lineToRelative(-1.5f, 2.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noAdultContent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
