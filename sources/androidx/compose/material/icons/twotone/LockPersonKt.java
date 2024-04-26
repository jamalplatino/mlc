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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lockPerson", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LockPerson", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLockPerson", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LockPerson.kt */
public final class LockPersonKt {
    private static ImageVector _lockPerson;

    public static final ImageVector getLockPerson(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _lockPerson;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.LockPerson", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 10.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(5.29f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(11.1f, 19.37f, 11.0f, 18.7f, 11.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.0f, 20.0f);
        pathBuilder3.verticalLineTo(10.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        pathBuilder3.verticalLineTo(10.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-1.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder4.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder3.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(10.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(6.26f);
        pathBuilder5.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 6.0f);
        pathBuilder5.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(18.0f, 13.0f);
        pathBuilder6.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder6.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder6.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.0f, 15.0f);
        pathBuilder6.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder6.reflectiveCurveTo(18.83f, 18.0f, 18.0f, 18.0f);
        pathBuilder6.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder6.reflectiveCurveTo(17.17f, 15.0f, 18.0f, 15.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.0f, 21.0f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(-1.03f, 0.0f, -1.94f, -0.52f, -2.48f, -1.32f);
        pathBuilder7.curveTo(16.25f, 19.26f, 17.09f, 19.0f, 18.0f, 19.0f);
        pathBuilder6.reflectiveCurveToRelative(1.75f, 0.26f, 2.48f, 0.68f);
        pathBuilder6.curveTo(19.94f, 20.48f, 19.03f, 21.0f, 18.0f, 21.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _lockPerson = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
