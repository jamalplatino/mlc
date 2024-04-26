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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_beachAccess", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BeachAccess", "Landroidx/compose/material/icons/Icons$Rounded;", "getBeachAccess", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BeachAccess.kt */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.BeachAccess", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.13f, 14.56f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineToRelative(5.73f, 5.73f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.43f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.43f, 0.0f);
        pathBuilder.lineToRelative(-5.73f, -5.73f);
        pathBuilder.close();
        pathBuilder.moveTo(17.42f, 8.83f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.89f, -0.89f, 0.77f, -2.43f, -0.31f, -3.08f);
        pathBuilder3.curveToRelative(-3.89f, -2.38f, -9.03f, -1.89f, -12.4f, 1.47f);
        pathBuilder3.curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f);
        pathBuilder.close();
        pathBuilder.moveTo(5.95f, 5.98f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-3.36f, 3.37f, -3.85f, 8.51f, -1.48f, 12.4f);
        pathBuilder4.curveToRelative(0.66f, 1.08f, 2.19f, 1.21f, 3.08f, 0.31f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder4.curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f);
        pathBuilder.close();
        pathBuilder.moveTo(5.97f, 5.96f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f);
        pathBuilder.lineToRelative(5.73f, -5.73f);
        pathBuilder5.curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _beachAccess = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
