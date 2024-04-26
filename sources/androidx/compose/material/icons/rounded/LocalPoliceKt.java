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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localPolice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPolice", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalPolice", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalPolice.kt */
public final class LocalPoliceKt {
    private static ImageVector _localPolice;

    public static final ImageVector getLocalPolice(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _localPolice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.LocalPolice", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 12.59f);
        pathBuilder.lineToRelative(0.63f, 2.73f);
        pathBuilder.curveToRelative(0.1f, 0.43f, -0.37f, 0.77f, -0.75f, 0.54f);
        pathBuilder.lineTo(12.0f, 14.42f);
        pathBuilder.lineToRelative(-2.39f, 1.44f);
        pathBuilder.curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f);
        pathBuilder.lineTo(9.5f, 12.6f);
        pathBuilder.lineToRelative(-2.1f, -1.81f);
        pathBuilder.curveTo(7.06f, 10.5f, 7.24f, 9.95f, 7.68f, 9.91f);
        pathBuilder.lineToRelative(2.78f, -0.24f);
        pathBuilder.lineToRelative(1.08f, -2.56f);
        pathBuilder.curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0.0f);
        pathBuilder.lineToRelative(1.08f, 2.55f);
        pathBuilder.lineToRelative(2.78f, 0.24f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f);
        pathBuilder.lineTo(14.5f, 12.59f);
        pathBuilder.close();
        pathBuilder.moveTo(4.19f, 4.47f);
        pathBuilder2.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        pathBuilder.verticalLineTo(11.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilder3.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        pathBuilder.verticalLineTo(6.3f);
        pathBuilder.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        pathBuilder.lineToRelative(-7.0f, -3.11f);
        pathBuilder.curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        pathBuilder.lineTo(4.19f, 4.47f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localPolice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
