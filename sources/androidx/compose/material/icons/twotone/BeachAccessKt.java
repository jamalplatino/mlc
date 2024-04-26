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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_beachAccess", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BeachAccess", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBeachAccess", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BeachAccess.kt */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.BeachAccess", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.6f, 7.6f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.47f, 2.34f, 0.03f, 4.78f, 1.39f, 6.83f);
        pathBuilder.lineToRelative(5.45f, -5.45f);
        pathBuilder2.curveToRelative(-1.53f, -1.02f, -3.28f, -1.56f, -5.08f, -1.56f);
        pathBuilder2.curveToRelative(-0.6f, 0.0f, -1.19f, 0.06f, -1.76f, 0.18f);
        pathBuilder.close();
        pathBuilder.moveTo(13.12f, 5.0f);
        pathBuilder2.curveToRelative(-0.93f, 0.0f, -1.82f, 0.16f, -2.67f, 0.46f);
        pathBuilder2.curveToRelative(1.91f, 0.19f, 3.79f, 0.89f, 5.44f, 2.07f);
        pathBuilder.lineToRelative(1.39f, -1.39f);
        pathBuilder2.curveTo(16.03f, 5.4f, 14.61f, 5.0f, 13.12f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 13.12f);
        pathBuilder2.curveToRelative(0.0f, 1.49f, 0.4f, 2.91f, 1.14f, 4.15f);
        pathBuilder.lineToRelative(1.39f, -1.39f);
        pathBuilder2.curveToRelative(-1.18f, -1.65f, -1.88f, -3.52f, -2.07f, -5.44f);
        pathBuilder2.curveToRelative(-0.3f, 0.86f, -0.46f, 1.76f, -0.46f, 2.68f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.126f, 14.56f);
        pathBuilder3.lineToRelative(1.428f, -1.428f);
        pathBuilder3.lineToRelative(6.442f, 6.442f);
        pathBuilder3.lineToRelative(-1.43f, 1.428f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.12f, 3.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-2.58f, 0.0f, -5.16f, 0.98f, -7.14f, 2.95f);
        pathBuilder3.lineToRelative(-0.01f, 0.01f);
        pathBuilder4.curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0.0f, 14.31f);
        pathBuilder3.lineToRelative(14.3f, -14.31f);
        pathBuilder4.curveTo(18.3f, 3.99f, 15.71f, 3.0f, 13.12f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.14f, 17.27f);
        pathBuilder4.curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f);
        pathBuilder4.curveToRelative(0.0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f);
        pathBuilder4.curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f);
        pathBuilder3.lineToRelative(-1.39f, 1.38f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.98f, 14.43f);
        pathBuilder4.curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f);
        pathBuilder4.curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f);
        pathBuilder4.curveToRelative(1.8f, 0.0f, 3.55f, 0.55f, 5.08f, 1.56f);
        pathBuilder3.lineToRelative(-5.45f, 5.45f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.45f, 5.46f);
        pathBuilder4.curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f);
        pathBuilder4.curveToRelative(1.49f, 0.0f, 2.91f, 0.4f, 4.15f, 1.14f);
        pathBuilder3.lineToRelative(-1.39f, 1.39f);
        pathBuilder4.curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _beachAccess = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
