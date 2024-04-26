package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsVolleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsVolleyball", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsVolleyball", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsVolleyball.kt */
public final class SportsVolleyballKt {
    private static ImageVector _sportsVolleyball;

    public static final ImageVector getSportsVolleyball(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _sportsVolleyball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.SportsVolleyball", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder3.curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f);
        pathBuilder.lineTo(13.0f, 5.65f);
        pathBuilder.verticalLineTo(4.07f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 5.08f);
        pathBuilder.curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3.0f, -1.02f);
        pathBuilder.verticalLineToRelative(7.35f);
        pathBuilder.lineToRelative(-3.0f, 1.73f);
        pathBuilder.verticalLineTo(5.08f);
        pathBuilder.close();
        pathBuilder.moveTo(4.63f, 15.1f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(4.23f, 14.14f, 4.0f, 13.1f, 4.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, -2.02f, 0.76f, -3.86f, 2.0f, -5.27f);
        pathBuilder.verticalLineToRelative(7.58f);
        pathBuilder.lineTo(4.63f, 15.1f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 16.83f);
        pathBuilder.lineTo(12.0f, 13.15f);
        pathBuilder.lineToRelative(3.0f, 1.73f);
        pathBuilder.lineToRelative(-6.98f, 4.03f);
        pathBuilder.curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f);
        pathBuilder.close();
        pathBuilder.moveTo(10.42f, 19.84f);
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-0.54f, 0.0f, -1.07f, -0.06f, -1.58f, -0.16f);
        pathBuilder.lineToRelative(6.58f, -3.8f);
        pathBuilder.lineToRelative(1.36f, 0.78f);
        pathBuilder.curveTo(16.9f, 18.75f, 14.6f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.42f);
        pathBuilder.verticalLineTo(7.96f);
        pathBuilder.lineToRelative(7.0f, 4.05f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f);
        pathBuilder.lineTo(13.0f, 11.42f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsVolleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
