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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_people", "Landroidx/compose/ui/graphics/vector/ImageVector;", "People", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPeople", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: People.kt */
public final class PeopleKt {
    private static ImageVector _people;

    public static final ImageVector getPeople(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _people;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.People", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 8.5f);
        pathBuilder.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.34f, 17.0f);
        pathBuilder3.horizontalLineToRelative(9.32f);
        pathBuilder3.curveToRelative(-0.84f, -0.58f, -2.87f, -1.25f, -4.66f, -1.25f);
        pathBuilder3.reflectiveCurveToRelative(-3.82f, 0.67f, -4.66f, 1.25f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.0f, 12.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder4.reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f);
        pathBuilder4.reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f);
        pathBuilder4.reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 7.0f);
        pathBuilder5.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder4.reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder4.reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 13.75f);
        pathBuilder5.curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        pathBuilder4.lineTo(2.0f, 19.0f);
        pathBuilder4.horizontalLineToRelative(14.0f);
        pathBuilder4.verticalLineToRelative(-1.75f);
        pathBuilder5.curveToRelative(0.0f, -2.33f, -4.66f, -3.5f, -7.0f, -3.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(4.34f, 17.0f);
        pathBuilder5.curveToRelative(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f);
        pathBuilder4.reflectiveCurveToRelative(3.82f, 0.67f, 4.66f, 1.25f);
        pathBuilder4.lineTo(4.34f, 17.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.04f, 13.81f);
        pathBuilder5.curveToRelative(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f);
        pathBuilder4.lineTo(18.0f, 19.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineToRelative(-1.75f);
        pathBuilder5.curveToRelative(0.0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.0f, 12.0f);
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder4.reflectiveCurveTo(16.93f, 5.0f, 15.0f, 5.0f);
        pathBuilder5.curveToRelative(-0.54f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f);
        pathBuilder5.curveToRelative(0.63f, 0.89f, 1.0f, 1.98f, 1.0f, 3.15f);
        pathBuilder4.reflectiveCurveToRelative(-0.37f, 2.26f, -1.0f, 3.15f);
        pathBuilder5.curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _people = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
