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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personAddDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonAddDisabled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPersonAddDisabled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PersonAddDisabled.kt */
public final class PersonAddDisabledKt {
    private static ImageVector _personAddDisabled;

    public static final ImageVector getPersonAddDisabled(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _personAddDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PersonAddDisabled", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(5.87f);
        pathBuilder.lineTo(13.0f, 16.13f);
        pathBuilder.lineToRelative(-1.1f, 0.3f);
        pathBuilder.curveTo(9.89f, 16.99f, 9.08f, 17.76f, 9.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(-0.99f, 0.0f, -1.81f, 0.72f, -1.97f, 1.67f);
        pathBuilder.lineToRelative(2.31f, 2.31f);
        pathBuilder.curveTo(16.27f, 9.82f, 17.0f, 8.99f, 17.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.48f, 11.95f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f);
        pathBuilder4.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f);
        pathBuilder3.lineToRelative(3.43f, 3.43f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.0f, 6.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder5.curveToRelative(0.0f, 0.99f, -0.73f, 1.82f, -1.67f, 1.97f);
        pathBuilder3.lineToRelative(-2.31f, -2.31f);
        pathBuilder3.curveTo(13.19f, 6.72f, 14.01f, 6.0f, 15.0f, 6.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.69f, 14.16f);
        pathBuilder3.lineTo(22.53f, 20.0f);
        pathBuilder3.lineTo(23.0f, 20.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f);
        pathBuilder3.close();
        pathBuilder3.moveTo(0.0f, 3.12f);
        pathBuilder3.lineToRelative(4.0f, 4.0f);
        pathBuilder3.lineTo(4.0f, 10.0f);
        pathBuilder3.lineTo(1.0f, 10.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.horizontalLineToRelative(2.88f);
        pathBuilder3.lineToRelative(2.51f, 2.51f);
        pathBuilder3.curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(9.88f);
        pathBuilder3.lineToRelative(4.0f, 4.0f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(1.41f, 1.71f);
        pathBuilder3.lineTo(0.0f, 3.12f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.01f, 16.13f);
        pathBuilder3.lineTo(14.88f, 18.0f);
        pathBuilder3.lineTo(9.0f, 18.0f);
        pathBuilder3.curveToRelative(0.08f, -0.24f, 0.88f, -1.01f, 2.91f, -1.57f);
        pathBuilder3.lineToRelative(1.1f, -0.3f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.0f, 9.12f);
        pathBuilder3.lineToRelative(0.88f, 0.88f);
        pathBuilder3.lineTo(6.0f, 10.0f);
        pathBuilder3.verticalLineToRelative(-0.88f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _personAddDisabled = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
