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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_interests", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Interests", "Landroidx/compose/material/icons/Icons$Rounded;", "getInterests", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Interests.kt */
public final class InterestsKt {
    private static ImageVector _interests;

    public static final ImageVector getInterests(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _interests;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Interests", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.02f, 13.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder2.curveTo(13.45f, 13.0f, 13.0f, 13.45f, 13.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.13f, 3.57f);
        pathBuilder.lineToRelative(-3.3f, 5.94f);
        pathBuilder.curveTo(2.46f, 10.18f, 2.94f, 11.0f, 3.7f, 11.0f);
        pathBuilder.horizontalLineToRelative(6.6f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f);
        pathBuilder.lineToRelative(-3.3f, -5.94f);
        pathBuilder.curveTo(7.49f, 2.89f, 6.51f, 2.89f, 6.13f, 3.57f);
        pathBuilder.close();
        pathBuilder.moveTo(19.25f, 2.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f);
        pathBuilder3.curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f);
        pathBuilder3.curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f);
        pathBuilder3.curveToRelative(0.0f, 1.83f, 2.03f, 3.17f, 4.35f, 5.18f);
        pathBuilder3.curveToRelative(0.37f, 0.32f, 0.92f, 0.32f, 1.3f, 0.0f);
        pathBuilder3.curveTo(19.97f, 8.42f, 22.0f, 7.08f, 22.0f, 5.25f);
        pathBuilder3.curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _interests = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
