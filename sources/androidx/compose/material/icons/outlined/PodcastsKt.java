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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_podcasts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Podcasts", "Landroidx/compose/material/icons/Icons$Outlined;", "getPodcasts", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Podcasts.kt */
public final class PodcastsKt {
    private static ImageVector _podcasts;

    public static final ImageVector getPodcasts(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _podcasts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Podcasts", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-8.28f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder3.curveToRelative(0.0f, 1.74f, 0.75f, 3.31f, 1.94f, 4.4f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder3.curveTo(8.53f, 14.25f, 8.0f, 13.19f, 8.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 1.19f, -0.53f, 2.25f, -1.36f, 2.98f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder4.curveTo(17.25f, 15.31f, 18.0f, 13.74f, 18.0f, 12.0f);
        pathBuilder4.curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 2.85f, 1.2f, 5.41f, 3.11f, 7.24f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder5.curveTo(4.98f, 16.36f, 4.0f, 14.29f, 4.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, 2.29f, -0.98f, 4.36f, -2.53f, 5.82f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder6.curveTo(20.8f, 17.41f, 22.0f, 14.85f, 22.0f, 12.0f);
        pathBuilder6.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _podcasts = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
