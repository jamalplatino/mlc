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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsMotorsports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsMotorsports", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsMotorsports", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsMotorsports.kt */
public final class SportsMotorsportsKt {
    private static ImageVector _sportsMotorsports;

    public static final ImageVector getSportsMotorsports(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.SportsMotorsports", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.96f, 11.22f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(21.57f, 7.01f, 17.76f, 4.0f, 13.56f, 4.0f);
        pathBuilder2.curveToRelative(-0.19f, 0.0f, -0.38f, 0.01f, -0.57f, 0.02f);
        pathBuilder2.curveTo(2.0f, 4.74f, 2.0f, 17.2f, 2.0f, 17.2f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        pathBuilder.close();
        pathBuilder.moveTo(5.26f, 11.56f);
        pathBuilder.curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f);
        pathBuilder.lineToRelative(3.62f, 1.53f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f);
        pathBuilder3.curveToRelative(0.0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f);
        pathBuilder.horizontalLineTo(4.72f);
        pathBuilder.curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f);
        pathBuilder.close();
        pathBuilder.moveTo(18.44f, 16.04f);
        pathBuilder.curveTo(17.3f, 17.29f, 15.68f, 18.0f, 14.0f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-0.8f);
        pathBuilder.curveToRelative(0.0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f);
        pathBuilder.horizontalLineToRelative(6.15f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.99f, 0.0f, 3.61f, -1.62f, 3.61f, -3.61f);
        pathBuilder4.curveToRelative(0.0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f);
        pathBuilder.lineTo(9.3f, 7.01f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f);
        pathBuilder5.curveTo(13.27f, 6.0f, 13.42f, 6.0f, 13.56f, 6.0f);
        pathBuilder5.curveToRelative(3.31f, 0.0f, 6.13f, 2.37f, 6.41f, 5.41f);
        pathBuilder5.curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsMotorsports = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
