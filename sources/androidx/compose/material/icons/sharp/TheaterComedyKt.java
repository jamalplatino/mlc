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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_theaterComedy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TheaterComedy", "Landroidx/compose/material/icons/Icons$Sharp;", "getTheaterComedy", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TheaterComedy.kt */
public final class TheaterComedyKt {
    private static ImageVector _theaterComedy;

    public static final ImageVector getTheaterComedy(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _theaterComedy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Sharp.TheaterComedy", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 2.0f);
        pathBuilder.verticalLineToRelative(5.5f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.verticalLineToRelative(3.31f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(14.55f, 9.8f, 15.64f, 9.0f, 16.99f, 9.0f);
        pathBuilder2.curveToRelative(1.38f, 0.0f, 2.5f, 0.84f, 2.5f, 1.88f);
        pathBuilder.horizontalLineTo(14.5f);
        pathBuilder.verticalLineToRelative(3.56f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(15.26f, 14.8f, 16.11f, 15.0f, 17.0f, 15.0f);
        pathBuilder3.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 7.5f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(15.55f, 7.5f, 15.0f, 7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 7.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(19.55f, 7.5f, 19.0f, 7.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(1.0f, 16.0f);
        pathBuilder4.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder4.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder4.verticalLineTo(9.0f);
        pathBuilder4.horizontalLineTo(1.0f);
        pathBuilder4.verticalLineTo(16.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.0f, 17.88f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-1.38f, 0.0f, -2.5f, -0.84f, -2.5f, -1.88f);
        pathBuilder4.horizontalLineToRelative(5.0f);
        pathBuilder5.curveTo(9.5f, 17.04f, 8.38f, 17.88f, 7.0f, 17.88f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 12.5f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveTo(8.45f, 12.5f, 9.0f, 12.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(5.0f, 12.5f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveTo(4.45f, 12.5f, 5.0f, 12.5f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _theaterComedy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
