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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vrpano", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Vrpano", "Landroidx/compose/material/icons/Icons$Filled;", "getVrpano", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Vrpano.kt */
public final class VrpanoKt {
    private static ImageVector _vrpano;

    public static final ImageVector getVrpano(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Vrpano", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.69f, 4.05f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12.0f, 5.5f);
        pathBuilder2.curveToRelative(-3.89f, 0.0f, -6.95f, -0.84f, -8.69f, -1.43f);
        pathBuilder2.curveTo(2.67f, 3.85f, 2.0f, 4.33f, 2.0f, 5.02f);
        pathBuilder.verticalLineTo(19.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f);
        pathBuilder3.curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12.0f, 18.5f);
        pathBuilder3.curveToRelative(3.87f, 0.0f, 6.66f, 0.76f, 8.69f, 1.45f);
        pathBuilder3.curveTo(21.34f, 20.16f, 22.0f, 19.68f, 22.0f, 19.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(22.0f, 4.32f, 21.34f, 3.84f, 20.69f, 4.05f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-2.34f, 0.0f, -4.52f, 0.15f, -6.52f, 0.41f);
        pathBuilder.lineToRelative(3.69f, -4.42f);
        pathBuilder.lineToRelative(2.0f, 2.4f);
        pathBuilder.lineTo(14.0f, 10.0f);
        pathBuilder.lineToRelative(4.51f, 5.4f);
        pathBuilder.curveTo(16.52f, 15.15f, 14.3f, 15.0f, 12.0f, 15.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _vrpano = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}