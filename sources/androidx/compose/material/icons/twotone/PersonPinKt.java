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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonPin", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPersonPin", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PersonPin.kt */
public final class PersonPinKt {
    private static ImageVector _personPin;

    public static final ImageVector getPersonPin(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _personPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PersonPin", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.83f, 18.0f);
        pathBuilder.lineToRelative(0.59f, 0.59f);
        pathBuilder.lineTo(12.0f, 20.17f);
        pathBuilder.lineToRelative(1.59f, -1.59f);
        pathBuilder.lineToRelative(0.58f, -0.58f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(4.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 15.58f);
        pathBuilder2.curveTo(6.0f, 13.08f, 9.97f, 12.0f, 12.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 1.08f, 6.0f, 3.58f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-1.42f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.0f, 20.0f);
        pathBuilder3.lineToRelative(3.0f, 3.0f);
        pathBuilder3.lineToRelative(3.0f, -3.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.lineTo(21.0f, 4.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.lineTo(5.0f, 2.0f);
        pathBuilder4.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.0f, 4.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder3.horizontalLineToRelative(-4.83f);
        pathBuilder3.lineToRelative(-0.59f, 0.59f);
        pathBuilder3.lineTo(12.0f, 20.17f);
        pathBuilder3.lineToRelative(-1.59f, -1.59f);
        pathBuilder3.lineToRelative(-0.58f, -0.58f);
        pathBuilder3.lineTo(5.0f, 18.0f);
        pathBuilder3.lineTo(5.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 11.0f);
        pathBuilder4.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 7.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 15.58f);
        pathBuilder4.curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f);
        pathBuilder3.reflectiveCurveToRelative(-6.0f, 1.08f, -6.0f, 3.58f);
        pathBuilder3.lineTo(6.0f, 17.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(-1.42f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.48f, 15.0f);
        pathBuilder4.curveToRelative(0.74f, -0.51f, 2.23f, -1.0f, 3.52f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(2.78f, 0.49f, 3.52f, 1.0f);
        pathBuilder3.lineTo(8.48f, 15.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _personPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
