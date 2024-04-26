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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearbyError", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearbyError", "Landroidx/compose/material/icons/Icons$Rounded;", "getNearbyError", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NearbyError.kt */
public final class NearbyErrorKt {
    private static ImageVector _nearbyError;

    public static final ImageVector getNearbyError(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _nearbyError;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Rounded.NearbyError", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.29f, 8.28f);
        pathBuilder.lineToRelative(-3.01f, 3.01f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(3.01f, 3.01f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(3.01f, -3.01f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-3.01f, -3.01f);
        pathBuilder2.curveTo(12.32f, 7.89f, 11.68f, 7.89f, 11.29f, 8.28f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.59f, 2.59f);
        pathBuilder3.lineToRelative(-8.01f, 8.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder3.lineToRelative(8.01f, 8.0f);
        pathBuilder4.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder3.lineTo(18.0f, 16.82f);
        pathBuilder3.verticalLineTo(13.2f);
        pathBuilder3.lineToRelative(-6.0f, 6.0f);
        pathBuilder3.lineTo(4.79f, 12.0f);
        pathBuilder3.lineTo(12.0f, 4.79f);
        pathBuilder3.lineToRelative(6.0f, 6.0f);
        pathBuilder3.verticalLineTo(7.17f);
        pathBuilder3.lineToRelative(-4.58f, -4.58f);
        pathBuilder3.curveTo(12.64f, 1.8f, 11.37f, 1.8f, 10.59f, 2.59f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(20.0f, 11.0f);
        pathBuilder5.verticalLineToRelative(6.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder5.verticalLineToRelative(-6.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder6.curveTo(20.45f, 10.0f, 20.0f, 10.45f, 20.0f, 11.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(21.0f, 21.0f);
        pathBuilder7.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder8.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _nearbyError = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}