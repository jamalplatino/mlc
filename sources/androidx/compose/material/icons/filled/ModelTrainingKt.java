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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_modelTraining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ModelTraining", "Landroidx/compose/material/icons/Icons$Filled;", "getModelTraining", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModelTraining.kt */
public final class ModelTrainingKt {
    private static ImageVector _modelTraining;

    public static final ImageVector getModelTraining(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _modelTraining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.ModelTraining", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 13.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(19.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 1.68f, -0.59f, 3.21f, -1.58f, 4.42f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder3.curveTo(20.18f, 17.27f, 21.0f, 15.23f, 21.0f, 13.0f);
        pathBuilder3.curveToRelative(0.0f, -2.74f, -1.23f, -5.19f, -3.16f, -6.84f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder3.curveTo(17.99f, 8.86f, 19.0f, 10.82f, 19.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 5.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder4.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder4.curveToRelative(0.0f, 2.23f, 0.82f, 4.27f, 2.16f, 5.84f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder4.curveTo(5.59f, 16.21f, 5.0f, 14.68f, 5.0f, 13.0f);
        pathBuilder4.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(16.0f, 5.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _modelTraining = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
