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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pageview", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pageview", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPageview", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pageview.kt */
public final class PageviewKt {
    private static ImageVector _pageview;

    public static final ImageVector getPageview(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _pageview;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Pageview", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 7.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(2.49f, 0.0f, 4.5f, 2.01f, 4.5f, 4.5f);
        pathBuilder2.curveToRelative(0.0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f);
        pathBuilder.lineToRelative(2.44f, 2.43f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.lineToRelative(-2.44f, -2.44f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f);
        pathBuilder3.curveTo(9.01f, 16.0f, 7.0f, 13.99f, 7.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(9.01f, 7.0f, 11.5f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.49f, 16.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        pathBuilder4.lineToRelative(2.44f, 2.44f);
        pathBuilder4.lineToRelative(1.42f, -1.42f);
        pathBuilder4.lineToRelative(-2.44f, -2.43f);
        pathBuilder5.curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f);
        pathBuilder5.curveTo(16.0f, 9.01f, 13.99f, 7.0f, 11.5f, 7.0f);
        pathBuilder4.reflectiveCurveTo(7.0f, 9.01f, 7.0f, 11.5f);
        pathBuilder4.reflectiveCurveTo(9.01f, 16.0f, 11.49f, 16.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(11.5f, 9.0f);
        pathBuilder5.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder4.reflectiveCurveTo(12.88f, 14.0f, 11.5f, 14.0f);
        pathBuilder4.reflectiveCurveTo(9.0f, 12.88f, 9.0f, 11.5f);
        pathBuilder4.reflectiveCurveTo(10.12f, 9.0f, 11.5f, 9.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 4.0f);
        pathBuilder4.lineTo(4.0f, 4.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.lineTo(22.0f, 6.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 18.0f);
        pathBuilder4.lineTo(4.0f, 18.0f);
        pathBuilder4.lineTo(4.0f, 6.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.verticalLineToRelative(12.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _pageview = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
