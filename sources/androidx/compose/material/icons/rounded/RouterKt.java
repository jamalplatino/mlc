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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_router", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Router", "Landroidx/compose/material/icons/Icons$Rounded;", "getRouter", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Router.kt */
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _router;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Router", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.45f, 5.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.19f, 0.19f, 0.5f, 0.21f, 0.72f, 0.04f);
        pathBuilder2.curveTo(13.3f, 4.69f, 14.65f, 4.2f, 16.0f, 4.2f);
        pathBuilder.reflectiveCurveToRelative(2.7f, 0.49f, 3.84f, 1.39f);
        pathBuilder.curveToRelative(0.21f, 0.17f, 0.52f, 0.15f, 0.72f, -0.04f);
        pathBuilder.lineToRelative(0.04f, -0.05f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.22f, -0.22f, 0.21f, -0.59f, -0.03f, -0.8f);
        pathBuilder3.curveTo(19.24f, 3.57f, 17.62f, 3.0f, 16.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.24f, 0.57f, -4.57f, 1.7f);
        pathBuilder.curveToRelative(-0.24f, 0.21f, -0.26f, 0.57f, -0.03f, 0.8f);
        pathBuilder.lineToRelative(0.05f, 0.05f);
        pathBuilder.close();
        pathBuilder.moveTo(13.15f, 6.31f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.25f, 0.2f, -0.26f, 0.58f, -0.04f, 0.8f);
        pathBuilder.lineToRelative(0.04f, 0.04f);
        pathBuilder4.curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.72f, 0.04f);
        pathBuilder4.curveToRelative(0.63f, -0.48f, 1.38f, -0.69f, 2.13f, -0.69f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.21f, 2.13f, 0.68f);
        pathBuilder.curveToRelative(0.22f, 0.17f, 0.53f, 0.16f, 0.72f, -0.04f);
        pathBuilder.lineToRelative(0.04f, -0.04f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.23f, -0.23f, 0.21f, -0.6f, -0.04f, -0.8f);
        pathBuilder5.curveToRelative(-0.83f, -0.64f, -1.84f, -1.0f, -2.85f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-2.02f, 0.36f, -2.85f, 1.01f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(5.0f, 13.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 18.0f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _router = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
