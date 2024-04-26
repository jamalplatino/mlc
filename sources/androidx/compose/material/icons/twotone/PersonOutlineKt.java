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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personOutline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonOutline", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPersonOutline", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PersonOutline.kt */
public final class PersonOutlineKt {
    private static ImageVector _personOutline;

    public static final ImageVector getPersonOutline(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _personOutline;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.PersonOutline", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.moveToRelative(-2.1f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(2.1f, 2.1f, 0.0f, true, true, 4.2f, 0.0f);
        pathBuilder2.arcToRelative(2.1f, 2.1f, 0.0f, true, true, -4.2f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 14.9f);
        pathBuilder3.curveToRelative(-2.97f, 0.0f, -6.1f, 1.46f, -6.1f, 2.1f);
        pathBuilder3.verticalLineToRelative(1.1f);
        pathBuilder3.horizontalLineToRelative(12.2f);
        pathBuilder3.verticalLineTo(17.0f);
        pathBuilder3.curveToRelative(0.0f, -0.64f, -3.13f, -2.1f, -6.1f, -2.1f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 13.0f);
        pathBuilder4.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.verticalLineToRelative(-3.0f);
        pathBuilder4.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.1f, 18.1f);
        pathBuilder4.lineTo(5.9f, 18.1f);
        pathBuilder4.lineTo(5.9f, 17.0f);
        pathBuilder4.curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        pathBuilder4.reflectiveCurveToRelative(6.1f, 1.46f, 6.1f, 2.1f);
        pathBuilder4.verticalLineToRelative(1.1f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 12.0f);
        pathBuilder4.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder4.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder4.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 5.9f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        pathBuilder5.curveToRelative(0.0f, 1.16f, -0.94f, 2.1f, -2.1f, 2.1f);
        pathBuilder4.reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f);
        pathBuilder4.curveToRelative(0.0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _personOutline = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}