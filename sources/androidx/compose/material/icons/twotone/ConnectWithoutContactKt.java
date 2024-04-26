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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_connectWithoutContact", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectWithoutContact", "Landroidx/compose/material/icons/Icons$TwoTone;", "getConnectWithoutContact", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ConnectWithoutContact.kt */
public final class ConnectWithoutContactKt {
    private static ImageVector _connectWithoutContact;

    public static final ImageVector getConnectWithoutContact(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _connectWithoutContact;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.ConnectWithoutContact", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.horizontalLineTo(9.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder2.curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder2.curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.45f, 4.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(9.21f, 5.92f, 7.99f, 7.0f, 6.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder3.curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(8.74f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder4.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-1.49f, 0.0f, -2.71f, -1.08f, -2.95f, -2.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder5.curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.curveTo(22.0f, 18.67f, 21.33f, 18.0f, 20.5f, 18.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _connectWithoutContact = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
