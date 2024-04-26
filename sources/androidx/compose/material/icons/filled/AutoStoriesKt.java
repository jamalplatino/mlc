package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoStories", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoStories", "Landroidx/compose/material/icons/Icons$Filled;", "getAutoStories", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutoStories.kt */
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.AutoStories", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 1.0f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.lineToRelative(5.0f, -4.5f);
        pathBuilder.lineTo(19.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 6.0f);
        pathBuilder.verticalLineToRelative(14.65f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        pathBuilder2.curveToRelative(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
        pathBuilder2.curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 19.5f);
        pathBuilder.lineTo(23.0f, 6.0f);
        pathBuilder.curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f);
        pathBuilder.verticalLineToRelative(13.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        pathBuilder3.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder4.curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        pathBuilder4.curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        pathBuilder4.curveToRelative(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-1.1f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _autoStories = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
