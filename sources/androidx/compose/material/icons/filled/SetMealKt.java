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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_setMeal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SetMeal", "Landroidx/compose/material/icons/Icons$Filled;", "getSetMeal", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SetMeal.kt */
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.SetMeal", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.05f, 17.56f);
        pathBuilder.lineTo(3.08f, 18.5f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.lineToRelative(17.98f, -0.94f);
        pathBuilder.lineTo(21.05f, 17.56f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 19.48f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(19.48f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 5.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f);
        pathBuilder3.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        pathBuilder3.curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        pathBuilder4.curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _setMeal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
