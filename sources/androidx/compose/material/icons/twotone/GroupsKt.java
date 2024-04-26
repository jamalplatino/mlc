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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groups", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Groups", "Landroidx/compose/material/icons/Icons$TwoTone;", "getGroups", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Groups.kt */
public final class GroupsKt {
    private static ImageVector _groups;

    public static final ImageVector getGroups(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _groups;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Groups", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.07f, 16.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f);
        pathBuilder2.curveToRelative(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f);
        pathBuilder.reflectiveCurveToRelative(2.05f, 0.18f, 3.02f, 0.56f);
        pathBuilder2.curveToRelative(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f);
        pathBuilder.horizontalLineTo(8.07f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(11.45f, 8.0f, 12.0f, 8.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 13.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.13f, 14.1f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        pathBuilder5.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder5.curveTo(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.lineToRelative(4.5f, 0.0f);
        pathBuilder3.verticalLineToRelative(-1.61f);
        pathBuilder3.curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 13.0f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder6.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder6.curveTo(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(24.0f, 16.43f);
        pathBuilder6.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        pathBuilder6.curveTo(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        pathBuilder6.curveToRelative(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        pathBuilder6.curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.lineToRelative(4.5f, 0.0f);
        pathBuilder3.verticalLineTo(16.43f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.24f, 13.65f);
        pathBuilder6.curveToRelative(-1.17f, -0.52f, -2.61f, -0.9f, -4.24f, -0.9f);
        pathBuilder6.curveToRelative(-1.63f, 0.0f, -3.07f, 0.39f, -4.24f, 0.9f);
        pathBuilder6.curveTo(6.68f, 14.13f, 6.0f, 15.21f, 6.0f, 16.39f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(-1.61f);
        pathBuilder6.curveTo(18.0f, 15.21f, 17.32f, 14.13f, 16.24f, 13.65f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.07f, 16.0f);
        pathBuilder6.curveToRelative(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f);
        pathBuilder6.curveToRelative(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f);
        pathBuilder3.reflectiveCurveToRelative(2.05f, 0.18f, 3.02f, 0.56f);
        pathBuilder6.curveToRelative(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f);
        pathBuilder3.horizontalLineTo(8.07f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 8.0f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveTo(11.45f, 8.0f, 12.0f, 8.0f);
        pathBuilder3.moveTo(12.0f, 6.0f);
        pathBuilder6.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder6.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder6.curveTo(15.0f, 7.34f, 13.66f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.lineTo(12.0f, 6.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _groups = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
