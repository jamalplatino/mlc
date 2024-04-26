package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addBusiness", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddBusiness", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddBusiness", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddBusiness.kt */
public final class AddBusinessKt {
    private static ImageVector _addBusiness;

    public static final ImageVector getAddBusiness(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _addBusiness;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.AddBusiness", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder2.curveTo(2.45f, 4.0f, 2.0f, 4.45f, 2.0f, 5.0f);
        pathBuilder2.curveTo(2.0f, 5.55f, 2.45f, 6.0f, 3.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 17.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.horizontalLineToRelative(0.18f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.63f, 0.0f, 1.1f, -0.58f, 0.98f, -1.2f);
        pathBuilder3.lineToRelative(-1.0f, -5.0f);
        pathBuilder4.curveTo(17.07f, 7.34f, 16.66f, 7.0f, 16.18f, 7.0f);
        pathBuilder3.horizontalLineTo(2.82f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(2.34f, 7.0f, 1.93f, 7.34f, 1.84f, 7.8f);
        pathBuilder3.lineToRelative(-1.0f, 5.0f);
        pathBuilder5.curveTo(0.72f, 13.42f, 1.19f, 14.0f, 1.82f, 14.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineToRelative(5.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(7.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-5.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineTo(17.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 18.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.verticalLineToRelative(-4.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(22.0f, 18.0f);
        pathBuilder6.horizontalLineToRelative(-2.0f);
        pathBuilder6.verticalLineToRelative(-2.0f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder6.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder6.verticalLineToRelative(2.0f);
        pathBuilder6.horizontalLineToRelative(-2.0f);
        pathBuilder7.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineToRelative(2.0f);
        pathBuilder7.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder6.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder6.verticalLineToRelative(-2.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder7.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder7.curveTo(23.0f, 18.45f, 22.55f, 18.0f, 22.0f, 18.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addBusiness = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
