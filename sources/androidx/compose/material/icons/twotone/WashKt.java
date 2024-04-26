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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wash", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWash", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Wash.kt */
public final class WashKt {
    private static ImageVector _wash;

    public static final ImageVector getWash(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _wash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Wash", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 21.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilder.lineTo(7.0f, 9.87f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineToRelative(3.0f, 0.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 6.5f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.4f, 0.43f, -1.22f, 1.0f, -2.05f);
        pathBuilder2.curveToRelative(0.57f, 0.83f, 1.0f, 1.65f, 1.0f, 2.05f);
        pathBuilder2.curveTo(19.5f, 6.05f, 19.05f, 6.5f, 18.5f, 6.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.75f, 16.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder3.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder3.horizontalLineTo(12.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(6.75f);
        pathBuilder4.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder4.curveToRelative(0.0f, -0.67f, -0.53f, -1.2f, -1.18f, -1.24f);
        pathBuilder3.lineTo(8.87f, 10.0f);
        pathBuilder3.lineToRelative(1.48f, -2.6f);
        pathBuilder4.curveToRelative(0.09f, -0.17f, 0.14f, -0.34f, 0.14f, -0.54f);
        pathBuilder4.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder3.lineTo(9.12f, 5.0f);
        pathBuilder3.lineToRelative(-7.18f, 6.8f);
        pathBuilder4.curveTo(1.34f, 12.36f, 1.0f, 13.15f, 1.0f, 13.97f);
        pathBuilder3.verticalLineTo(20.0f);
        pathBuilder4.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.horizontalLineToRelative(13.75f);
        pathBuilder4.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder3.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder3.horizontalLineTo(12.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(7.75f);
        pathBuilder4.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder3.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        pathBuilder3.horizontalLineTo(12.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineTo(20.75f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 21.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-6.0f);
        pathBuilder4.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilder3.lineTo(7.0f, 9.87f);
        pathBuilder3.verticalLineTo(12.0f);
        pathBuilder3.lineToRelative(3.0f, 0.0f);
        pathBuilder3.verticalLineTo(21.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.5f, 9.0f);
        pathBuilder4.curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f);
        pathBuilder4.curveTo(15.0f, 6.66f, 13.5f, 5.0f, 13.5f, 5.0f);
        pathBuilder3.reflectiveCurveTo(12.0f, 6.66f, 12.0f, 7.5f);
        pathBuilder4.curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.5f, 1.0f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, -2.5f, 2.83f, -2.5f, 4.5f);
        pathBuilder4.curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f);
        pathBuilder3.reflectiveCurveTo(21.0f, 6.88f, 21.0f, 5.5f);
        pathBuilder4.curveTo(21.0f, 3.83f, 18.5f, 1.0f, 18.5f, 1.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.5f, 6.5f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.curveToRelative(0.0f, -0.4f, 0.43f, -1.22f, 1.0f, -2.05f);
        pathBuilder4.curveToRelative(0.57f, 0.83f, 1.0f, 1.65f, 1.0f, 2.05f);
        pathBuilder4.curveTo(19.5f, 6.05f, 19.05f, 6.5f, 18.5f, 6.5f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
