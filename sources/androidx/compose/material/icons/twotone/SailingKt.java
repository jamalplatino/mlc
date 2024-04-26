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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sailing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sailing", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSailing", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sailing.kt */
public final class SailingKt {
    private static ImageVector _sailing;

    public static final ImageVector getSailing(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _sailing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Sailing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.5f);
        pathBuilder.horizontalLineTo(6.83f);
        pathBuilder.lineTo(9.0f, 8.38f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.38f, 5.24f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.42f, 1.52f, 2.88f, 3.72f, 3.41f, 6.26f);
        pathBuilder.horizontalLineToRelative(-3.68f);
        pathBuilder2.curveToRelative(0.21f, -1.1f, 0.39f, -2.46f, 0.39f, -4.0f);
        pathBuilder2.curveTo(15.5f, 6.71f, 15.45f, 5.95f, 15.38f, 5.24f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.0f, 13.5f);
        pathBuilder3.verticalLineTo(2.0f);
        pathBuilder3.lineTo(3.0f, 13.5f);
        pathBuilder3.horizontalLineTo(11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 11.5f);
        pathBuilder3.horizontalLineTo(6.83f);
        pathBuilder3.lineTo(9.0f, 8.38f);
        pathBuilder3.verticalLineTo(11.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.0f, 13.5f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(21.0f, 6.5f, 14.5f, 1.0f, 12.5f, 1.0f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, 1.0f, 3.0f, 1.0f, 6.5f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, 6.0f, -1.0f, 6.0f);
        pathBuilder3.horizontalLineTo(21.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.38f, 5.24f);
        pathBuilder4.curveToRelative(1.42f, 1.52f, 2.88f, 3.72f, 3.41f, 6.26f);
        pathBuilder3.horizontalLineToRelative(-3.68f);
        pathBuilder4.curveToRelative(0.21f, -1.1f, 0.39f, -2.46f, 0.39f, -4.0f);
        pathBuilder4.curveTo(15.5f, 6.71f, 15.45f, 5.95f, 15.38f, 5.24f);
        pathBuilder3.close();
        pathBuilder3.moveTo(22.0f, 15.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder4.curveToRelative(0.31f, 1.53f, 1.16f, 2.84f, 2.33f, 3.73f);
        pathBuilder4.curveTo(4.98f, 18.46f, 5.55f, 18.01f, 6.0f, 17.5f);
        pathBuilder4.curveTo(6.73f, 18.34f, 7.8f, 19.0f, 9.0f, 19.0f);
        pathBuilder3.reflectiveCurveToRelative(2.27f, -0.66f, 3.0f, -1.5f);
        pathBuilder4.curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3.0f, 1.5f);
        pathBuilder3.reflectiveCurveToRelative(2.26f, -0.66f, 3.0f, -1.5f);
        pathBuilder4.curveToRelative(0.45f, 0.51f, 1.02f, 0.96f, 1.67f, 1.23f);
        pathBuilder4.curveTo(20.84f, 17.84f, 21.69f, 16.53f, 22.0f, 15.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(22.0f, 23.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(-1.0f);
        pathBuilder4.curveToRelative(-1.04f, 0.0f, -2.08f, -0.35f, -3.0f, -1.0f);
        pathBuilder4.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder4.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder4.curveToRelative(-0.91f, 0.65f, -1.96f, 1.0f, -3.0f, 1.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.lineToRelative(0.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(1.03f, 0.0f, 2.05f, -0.25f, 3.0f, -0.75f);
        pathBuilder4.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder4.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilder3.horizontalLineTo(22.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sailing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
