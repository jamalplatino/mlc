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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_contactSupport", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactSupport", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContactSupport", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ContactSupport.kt */
public final class ContactSupportKt {
    private static ImageVector _contactSupport;

    public static final ImageVector getContactSupport(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.ContactSupport", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.5f, 3.0f);
        pathBuilder.curveTo(7.36f, 3.0f, 4.0f, 6.36f, 4.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(7.36f, 18.0f, 11.5f, 18.0f);
        pathBuilder.lineTo(13.0f, 18.0f);
        pathBuilder.verticalLineToRelative(2.3f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(3.64f, -2.3f, 6.0f, -6.08f, 6.0f, -9.8f);
        pathBuilder2.curveTo(19.0f, 6.36f, 15.64f, 3.0f, 11.5f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 16.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.5f, 1.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(6.26f, 1.0f, 2.0f, 5.26f, 2.0f, 10.5f);
        pathBuilder5.curveToRelative(0.0f, 5.07f, 3.99f, 9.23f, 9.0f, 9.49f);
        pathBuilder4.verticalLineToRelative(3.6f);
        pathBuilder4.lineToRelative(1.43f, -0.69f);
        pathBuilder5.curveTo(17.56f, 20.43f, 21.0f, 15.45f, 21.0f, 10.5f);
        pathBuilder5.curveTo(21.0f, 5.26f, 16.74f, 1.0f, 11.5f, 1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 20.3f);
        pathBuilder4.lineTo(13.0f, 18.0f);
        pathBuilder4.horizontalLineToRelative(-1.5f);
        pathBuilder5.curveTo(7.36f, 18.0f, 4.0f, 14.64f, 4.0f, 10.5f);
        pathBuilder4.reflectiveCurveTo(7.36f, 3.0f, 11.5f, 3.0f);
        pathBuilder4.reflectiveCurveTo(19.0f, 6.36f, 19.0f, 10.5f);
        pathBuilder5.curveToRelative(0.0f, 3.73f, -2.36f, 7.51f, -6.0f, 9.8f);
        pathBuilder4.close();
        pathBuilder4.moveTo(10.5f, 14.5f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(11.5f, 4.0f);
        pathBuilder5.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder5.curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder5.curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        pathBuilder5.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _contactSupport = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
