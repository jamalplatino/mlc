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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spatialTracking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpatialTracking", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpatialTracking", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpatialTracking.kt */
public final class SpatialTrackingKt {
    private static ImageVector _spatialTracking;

    public static final ImageVector getSpatialTracking(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _spatialTracking;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Rounded.SpatialTracking", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 9.0f);
        pathBuilder.moveToRelative(-4.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.39f, 15.56f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f);
        pathBuilder4.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder4.curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f);
        pathBuilder3.verticalLineTo(21.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(-2.78f);
        pathBuilder4.curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.39f, 1.76f);
        pathBuilder5.lineTo(19.39f, 1.76f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-0.43f, -0.43f, -1.14f, -0.39f, -1.51f, 0.09f);
        pathBuilder6.curveToRelative(-1.5f, 1.93f, -3.35f, 6.72f, 0.0f, 11.03f);
        pathBuilder6.curveToRelative(0.37f, 0.48f, 1.08f, 0.52f, 1.5f, 0.09f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.35f, -0.35f, 0.39f, -0.91f, 0.09f, -1.3f);
        pathBuilder6.curveToRelative(-1.17f, -1.5f, -2.64f, -5.23f, 0.0f, -8.61f);
        pathBuilder6.curveTo(19.78f, 2.67f, 19.74f, 2.11f, 19.39f, 1.76f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(22.4f, 5.86f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(0.23f, -0.4f, 0.19f, -0.9f, -0.14f, -1.22f);
        pathBuilder7.lineToRelative(0.0f, 0.0f);
        pathBuilder8.curveTo(21.79f, 4.16f, 21.0f, 4.27f, 20.67f, 4.85f);
        pathBuilder8.curveToRelative(-1.15f, 2.0f, -0.57f, 4.03f, 0.01f, 5.04f);
        pathBuilder8.curveToRelative(0.33f, 0.57f, 1.11f, 0.67f, 1.58f, 0.21f);
        pathBuilder8.curveToRelative(0.33f, -0.33f, 0.36f, -0.84f, 0.13f, -1.25f);
        pathBuilder8.curveTo(22.14f, 8.41f, 21.65f, 7.16f, 22.4f, 5.86f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _spatialTracking = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
