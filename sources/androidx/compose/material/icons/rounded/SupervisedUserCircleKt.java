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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_supervisedUserCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SupervisedUserCircle", "Landroidx/compose/material/icons/Icons$Rounded;", "getSupervisedUserCircle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SupervisedUserCircle.kt */
public final class SupervisedUserCircleKt {
    private static ImageVector _supervisedUserCircle;

    public static final ImageVector getSupervisedUserCircle(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _supervisedUserCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.SupervisedUserCircle", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.61f, 8.34f);
        pathBuilder.curveToRelative(1.07f, 0.0f, 1.93f, 0.86f, 1.93f, 1.93f);
        pathBuilder.reflectiveCurveToRelative(-0.86f, 1.93f, -1.93f, 1.93f);
        pathBuilder.reflectiveCurveToRelative(-1.93f, -0.86f, -1.93f, -1.93f);
        pathBuilder.curveToRelative(-0.01f, -1.07f, 0.86f, -1.93f, 1.93f, -1.93f);
        pathBuilder.close();
        pathBuilder.moveTo(9.61f, 6.76f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.36f, 1.06f, 2.36f, 2.36f);
        pathBuilder.reflectiveCurveToRelative(-1.06f, 2.36f, -2.36f, 2.36f);
        pathBuilder.reflectiveCurveToRelative(-2.36f, -1.06f, -2.36f, -2.36f);
        pathBuilder.curveToRelative(0.0f, -1.31f, 1.05f, -2.36f, 2.36f, -2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(9.61f, 15.89f);
        pathBuilder.verticalLineToRelative(3.75f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.4f, -0.75f, -4.3f, -2.6f, -5.14f, -4.96f);
        pathBuilder2.curveToRelative(1.05f, -1.12f, 3.67f, -1.69f, 5.14f, -1.69f);
        pathBuilder2.curveToRelative(0.53f, 0.0f, 1.2f, 0.08f, 1.9f, 0.22f);
        pathBuilder2.curveToRelative(-1.64f, 0.87f, -1.9f, 2.02f, -1.9f, 2.68f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.53f, -0.01f, -0.79f, -0.04f);
        pathBuilder.verticalLineToRelative(-4.07f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -1.42f, 2.94f, -2.13f, 4.4f, -2.13f);
        pathBuilder3.curveToRelative(1.07f, 0.0f, 2.92f, 0.39f, 3.84f, 1.15f);
        pathBuilder3.curveTo(18.28f, 17.88f, 15.39f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _supervisedUserCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}