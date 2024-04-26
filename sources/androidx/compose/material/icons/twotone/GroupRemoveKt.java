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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groupRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GroupRemove", "Landroidx/compose/material/icons/Icons$TwoTone;", "getGroupRemove", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: GroupRemove.kt */
public final class GroupRemoveKt {
    private static ImageVector _groupRemove;

    public static final ImageVector getGroupRemove(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _groupRemove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.GroupRemove", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 10.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(9.1f, 10.0f, 8.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 18.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(-0.99f);
        pathBuilder2.curveTo(2.2f, 16.29f, 5.3f, 15.0f, 8.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(5.8f, 1.29f, 6.0f, 2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(24.0f, 9.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-6.0f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.horizontalLineTo(24.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilder3.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder3.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.reflectiveCurveTo(10.21f, 4.0f, 8.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.0f, 10.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.reflectiveCurveTo(9.1f, 10.0f, 8.0f, 10.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.0f, 13.0f);
        pathBuilder4.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder4.curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.0f, 18.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineToRelative(-0.99f);
        pathBuilder4.curveTo(2.2f, 16.29f, 5.3f, 15.0f, 8.0f, 15.0f);
        pathBuilder3.reflectiveCurveToRelative(5.8f, 1.29f, 6.0f, 2.0f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.51f, 4.05f);
        pathBuilder4.curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f);
        pathBuilder4.curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f);
        pathBuilder3.reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.53f, 13.83f);
        pathBuilder4.curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder4.curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _groupRemove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
