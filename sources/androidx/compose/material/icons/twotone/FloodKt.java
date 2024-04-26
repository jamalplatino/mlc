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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flood", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFlood", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Flood.kt */
public final class FloodKt {
    private static ImageVector _flood;

    public static final ImageVector getFlood(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.Flood", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.66f, 15.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.01f, 0.0f, 1.3f, -0.65f, 2.42f, -0.9f);
        pathBuilder.lineToRelative(-0.91f, -3.39f);
        pathBuilder.lineToRelative(3.86f, -1.04f);
        pathBuilder.lineToRelative(1.42f, 5.31f);
        pathBuilder2.curveToRelative(1.03f, -0.07f, 1.3f, -0.85f, 2.85f, -0.96f);
        pathBuilder.lineTo(16.16f, 6.5f);
        pathBuilder.lineToRelative(-5.74f, -2.09f);
        pathBuilder.lineTo(6.5f, 9.09f);
        pathBuilder.lineToRelative(1.7f, 6.36f);
        pathBuilder.curveTo(8.33f, 15.48f, 8.48f, 15.5f, 8.66f, 15.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.67f, 19.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder4.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder4.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder4.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder4.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.11f, -1.0f, 3.34f, -1.0f);
        pathBuilder4.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder4.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder4.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder4.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        pathBuilder4.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder4.curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(8.68f, 17.5f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder6.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder6.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder6.curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.31f, 1.0f);
        pathBuilder5.verticalLineToRelative(-2.0f);
        pathBuilder6.curveToRelative(-0.63f, 0.0f, -1.0f, -0.28f, -1.48f, -0.55f);
        pathBuilder5.lineToRelative(-2.02f, -7.53f);
        pathBuilder5.lineToRelative(2.09f, 0.85f);
        pathBuilder5.lineToRelative(0.74f, -1.86f);
        pathBuilder5.lineTo(9.78f, 2.0f);
        pathBuilder5.lineTo(2.0f, 11.61f);
        pathBuilder5.lineToRelative(1.57f, 1.23f);
        pathBuilder5.lineToRelative(1.39f, -1.78f);
        pathBuilder5.lineToRelative(0.93f, 3.48f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        pathBuilder7.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder7.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilder7.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        pathBuilder5.close();
        pathBuilder5.moveTo(10.42f, 4.41f);
        pathBuilder5.lineToRelative(5.74f, 2.09f);
        pathBuilder5.lineToRelative(2.15f, 8.02f);
        pathBuilder5.curveToRelative(-1.54f, 0.11f, -1.82f, 0.89f, -2.85f, 0.96f);
        pathBuilder5.lineToRelative(-1.42f, -5.31f);
        pathBuilder5.lineToRelative(-3.86f, 1.04f);
        pathBuilder5.lineToRelative(0.91f, 3.39f);
        PathBuilder pathBuilder8 = pathBuilder5;
        pathBuilder8.curveToRelative(-1.12f, 0.25f, -1.41f, 0.9f, -2.42f, 0.9f);
        pathBuilder8.curveToRelative(-0.18f, 0.0f, -0.33f, -0.02f, -0.45f, -0.05f);
        pathBuilder5.lineTo(6.5f, 9.09f);
        pathBuilder5.lineTo(10.42f, 4.41f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _flood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
