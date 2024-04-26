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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_youtubeSearchedFor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "YoutubeSearchedFor", "Landroidx/compose/material/icons/Icons$Rounded;", "getYoutubeSearchedFor", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: YoutubeSearchedFor.kt */
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.YoutubeSearchedFor", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.01f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.8f);
        pathBuilder.lineToRelative(-0.27f, -0.27f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.15f, -1.34f, 1.76f, -3.14f, 1.51f, -5.09f);
        pathBuilder2.curveTo(17.11f, 6.0f, 15.1f, 3.78f, 12.5f, 3.18f);
        pathBuilder2.curveTo(8.26f, 2.2f, 4.51f, 5.53f, 4.51f, 9.5f);
        pathBuilder.horizontalLineToRelative(-2.1f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.68f, 0.59f, -0.31f, 0.89f);
        pathBuilder.lineToRelative(3.4f, 2.75f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.01f);
        pathBuilder.lineToRelative(2.9f, -2.79f);
        pathBuilder.curveToRelative(0.32f, -0.31f, 0.1f, -0.86f, -0.35f, -0.86f);
        pathBuilder.horizontalLineTo(6.51f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -2.49f, 2.0f, -4.48f, 4.46f, -4.5f);
        pathBuilder3.curveToRelative(2.44f, -0.02f, 4.54f, 2.05f, 4.54f, 4.49f);
        pathBuilder3.curveToRelative(0.0f, 2.48f, -2.02f, 4.51f, -4.5f, 4.51f);
        pathBuilder3.curveToRelative(-0.45f, 0.0f, -0.89f, -0.07f, -1.3f, -0.19f);
        pathBuilder3.curveToRelative(-0.34f, -0.1f, -0.71f, 0.0f, -0.96f, 0.26f);
        pathBuilder3.curveToRelative(-0.53f, 0.53f, -0.32f, 1.45f, 0.39f, 1.66f);
        pathBuilder3.curveToRelative(0.59f, 0.17f, 1.22f, 0.27f, 1.87f, 0.27f);
        pathBuilder3.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        pathBuilder.lineToRelative(0.27f, 0.27f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(4.27f, 4.25f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.41f, 0.41f, 1.07f, 0.41f, 1.48f, 0.0f);
        pathBuilder4.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        pathBuilder.lineTo(17.01f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _youtubeSearchedFor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
