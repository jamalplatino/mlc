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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_backHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BackHand", "Landroidx/compose/material/icons/Icons$Filled;", "getBackHand", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackHand.kt */
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.BackHand", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 24.0f);
        pathBuilder.curveToRelative(-3.26f, 0.0f, -6.19f, -1.99f, -7.4f, -5.02f);
        pathBuilder.lineToRelative(-3.03f, -7.61f);
        pathBuilder.curveTo(2.26f, 10.58f, 3.0f, 9.79f, 3.81f, 10.05f);
        pathBuilder.lineToRelative(0.79f, 0.26f);
        pathBuilder.curveToRelative(0.56f, 0.18f, 1.02f, 0.61f, 1.24f, 1.16f);
        pathBuilder.lineTo(7.25f, 15.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(3.25f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.0f, 2.56f, 8.56f, 2.0f, 9.25f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(1.25f);
        pathBuilder2.curveTo(11.5f, 0.56f, 12.06f, 0.0f, 12.75f, 0.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 0.56f, 14.0f, 1.25f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(2.75f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder3.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(5.75f);
        pathBuilder3.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(21.0f, 5.06f, 21.0f, 5.75f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.curveTo(21.0f, 20.42f, 17.42f, 24.0f, 13.0f, 24.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _backHand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
