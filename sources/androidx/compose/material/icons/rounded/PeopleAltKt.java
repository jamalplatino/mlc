package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_peopleAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PeopleAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getPeopleAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PeopleAlt.kt */
public final class PeopleAltKt {
    private static ImageVector _peopleAlt;

    public static final ImageVector getPeopleAlt(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _peopleAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Rounded.PeopleAlt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.67f, 13.13f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(18.04f, 14.06f, 19.0f, 15.32f, 19.0f, 17.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder2.curveTo(23.0f, 14.82f, 19.43f, 13.53f, 16.67f, 13.13f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.0f, 8.0f);
        pathBuilder3.moveToRelative(-4.0f, 0.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder4.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.0f, 12.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder6.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder6.curveToRelative(-0.47f, 0.0f, -0.91f, 0.1f, -1.33f, 0.24f);
        pathBuilder6.curveTo(14.5f, 5.27f, 15.0f, 6.58f, 15.0f, 8.0f);
        pathBuilder5.reflectiveCurveToRelative(-0.5f, 2.73f, -1.33f, 3.76f);
        pathBuilder5.curveTo(14.09f, 11.9f, 14.53f, 12.0f, 15.0f, 12.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(9.0f, 13.0f);
        pathBuilder7.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder7.verticalLineToRelative(2.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder7.horizontalLineToRelative(14.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder7.verticalLineToRelative(-2.0f);
        pathBuilder8.curveTo(17.0f, 14.34f, 11.67f, 13.0f, 9.0f, 13.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), PathFillType.Companion.m3114getEvenOddRgk1Os(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _peopleAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
