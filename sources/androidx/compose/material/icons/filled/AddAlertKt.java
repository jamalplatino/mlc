package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getAddAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddAlert.kt */
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.AddAlert", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.01f, 21.01f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        pathBuilder.reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f);
        pathBuilder.horizontalLineToRelative(-3.98f);
        pathBuilder.close();
        pathBuilder.moveTo(18.88f, 16.82f);
        pathBuilder.lineTo(18.88f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -3.25f, -2.25f, -5.97f, -5.29f, -6.69f);
        pathBuilder.verticalLineToRelative(-0.72f);
        pathBuilder.curveTo(13.59f, 2.71f, 12.88f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-1.59f, 0.71f, -1.59f, 1.59f);
        pathBuilder.verticalLineToRelative(0.72f);
        pathBuilder.curveTo(7.37f, 5.03f, 5.12f, 7.75f, 5.12f, 11.0f);
        pathBuilder.verticalLineToRelative(5.82f);
        pathBuilder.lineTo(3.0f, 18.94f);
        pathBuilder.lineTo(3.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-1.06f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 13.01f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.lineTo(8.0f, 13.01f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.01f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addAlert = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
