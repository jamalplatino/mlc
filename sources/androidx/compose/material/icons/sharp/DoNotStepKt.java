package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotStep", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotStep", "Landroidx/compose/material/icons/Icons$Sharp;", "getDoNotStep", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DoNotStep.kt */
public final class DoNotStepKt {
    private static ImageVector _doNotStep;

    public static final ImageVector getDoNotStep(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.DoNotStep", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(8.24f, 8.24f);
        pathBuilder.lineToRelative(-0.69f, 0.72f);
        pathBuilder.lineTo(6.87f, 11.1f);
        pathBuilder.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        pathBuilder.lineToRelative(1.75f, 1.75f);
        pathBuilder.lineToRelative(-0.69f, 0.72f);
        pathBuilder.lineToRelative(-1.63f, -1.63f);
        pathBuilder.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        pathBuilder.lineToRelative(1.63f, 1.63f);
        pathBuilder.lineToRelative(-0.7f, 0.72f);
        pathBuilder.lineToRelative(-1.74f, -1.74f);
        pathBuilder.curveTo(2.83f, 15.43f, 1.34f, 15.82f, 1.0f, 15.92f);
        pathBuilder.lineTo(1.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder.lineToRelative(3.33f, -3.33f);
        pathBuilder.lineToRelative(5.94f, 5.94f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(18.51f, 15.68f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(4.48f, -4.48f);
        pathBuilder.lineTo(23.0f, 11.2f);
        pathBuilder.lineTo(18.51f, 15.68f);
        pathBuilder.close();
        pathBuilder.moveTo(20.88f, 9.08f);
        pathBuilder.lineToRelative(-4.48f, 4.48f);
        pathBuilder.lineTo(9.3f, 6.47f);
        pathBuilder.lineTo(13.8f, 2.0f);
        pathBuilder.lineTo(20.88f, 9.08f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _doNotStep = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
