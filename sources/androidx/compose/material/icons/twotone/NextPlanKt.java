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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nextPlan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NextPlan", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNextPlan", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NextPlan.kt */
public final class NextPlanKt {
    private static ImageVector _nextPlan;

    public static final ImageVector getNextPlan(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _nextPlan;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.NextPlan", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.lineToRelative(2.26f, -2.26f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(14.35f, 10.68f, 13.01f, 10.0f, 11.5f, 10.0f);
        pathBuilder2.curveToRelative(-2.37f, 0.0f, -4.35f, 1.66f, -4.86f, 3.88f);
        pathBuilder.lineToRelative(-0.96f, -0.32f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(6.32f, 10.95f, 8.68f, 9.0f, 11.5f, 9.0f);
        pathBuilder3.curveToRelative(1.78f, 0.0f, 3.37f, 0.79f, 4.47f, 2.03f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder4.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder5.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 20.0f);
        pathBuilder5.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder4.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder4.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder4.reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(15.97f, 11.03f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveTo(14.87f, 9.79f, 13.28f, 9.0f, 11.5f, 9.0f);
        pathBuilder7.curveToRelative(-2.82f, 0.0f, -5.18f, 1.95f, -5.82f, 4.56f);
        pathBuilder6.lineToRelative(0.96f, 0.32f);
        PathBuilder pathBuilder8 = pathBuilder6;
        pathBuilder8.curveTo(7.15f, 11.66f, 9.13f, 10.0f, 11.5f, 10.0f);
        pathBuilder8.curveToRelative(1.51f, 0.0f, 2.85f, 0.68f, 3.76f, 1.74f);
        pathBuilder6.lineTo(13.0f, 14.0f);
        pathBuilder6.horizontalLineToRelative(5.0f);
        pathBuilder6.verticalLineTo(9.0f);
        pathBuilder6.lineTo(15.97f, 11.03f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nextPlan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
