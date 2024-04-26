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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_update", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Update", "Landroidx/compose/material/icons/Icons$Rounded;", "getUpdate", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Update.kt */
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _update;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Update", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 8.75f);
        pathBuilder.verticalLineToRelative(3.68f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(3.12f, 1.85f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        pathBuilder2.curveToRelative(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f);
        pathBuilder.lineToRelative(-2.87f, -1.71f);
        pathBuilder.verticalLineToRelative(-3.4f);
        pathBuilder.curveTo(12.5f, 8.34f, 12.16f, 8.0f, 11.75f, 8.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 8.34f, 11.0f, 8.75f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 9.5f);
        pathBuilder.verticalLineTo(4.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-1.78f, 1.78f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f);
        pathBuilder3.curveToRelative(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f);
        pathBuilder3.curveTo(2.46f, 16.4f, 6.69f, 21.0f, 12.0f, 21.0f);
        pathBuilder3.curveToRelative(4.59f, 0.0f, 8.38f, -3.44f, 8.93f, -7.88f);
        pathBuilder3.curveToRelative(0.07f, -0.6f, -0.4f, -1.12f, -1.0f, -1.12f);
        pathBuilder3.curveToRelative(-0.5f, 0.0f, -0.92f, 0.37f, -0.98f, 0.86f);
        pathBuilder3.curveToRelative(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f);
        pathBuilder3.curveToRelative(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f);
        pathBuilder3.curveTo(4.94f, 8.2f, 8.11f, 5.0f, 12.0f, 5.0f);
        pathBuilder3.curveToRelative(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
        pathBuilder.lineToRelative(-2.09f, 2.09f);
        pathBuilder.curveTo(14.54f, 9.46f, 14.76f, 10.0f, 15.21f, 10.0f);
        pathBuilder.horizontalLineToRelative(5.29f);
        pathBuilder.curveTo(20.78f, 10.0f, 21.0f, 9.78f, 21.0f, 9.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _update = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
