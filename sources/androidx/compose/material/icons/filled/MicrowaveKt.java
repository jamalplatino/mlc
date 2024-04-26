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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_microwave", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Microwave", "Landroidx/compose/material/icons/Icons$Filled;", "getMicrowave", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Microwave.kt */
public final class MicrowaveKt {
    private static ImageVector _microwave;

    public static final ImageVector getMicrowave(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _microwave;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Microwave", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.8f, 10.61f);
        pathBuilder.lineTo(5.37f, 9.19f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.73f, 8.79f, 6.59f, 8.0f, 7.75f, 8.0f);
        pathBuilder2.curveToRelative(0.8f, 0.0f, 1.39f, 0.39f, 1.81f, 0.67f);
        pathBuilder2.curveTo(9.87f, 8.88f, 10.07f, 9.0f, 10.25f, 9.0f);
        pathBuilder2.curveToRelative(0.37f, 0.0f, 0.8f, -0.41f, 0.95f, -0.61f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder2.curveToRelative(-0.36f, 0.4f, -1.22f, 1.19f, -2.37f, 1.19f);
        pathBuilder2.curveToRelative(-0.79f, 0.0f, -1.37f, -0.38f, -1.79f, -0.66f);
        pathBuilder2.curveTo(8.13f, 10.12f, 7.94f, 10.0f, 7.75f, 10.0f);
        pathBuilder2.curveTo(7.38f, 10.0f, 6.95f, 10.41f, 6.8f, 10.61f);
        pathBuilder.close();
        pathBuilder.moveTo(7.75f, 15.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.19f, 0.0f, 0.38f, 0.12f, 0.71f, 0.34f);
        pathBuilder3.curveToRelative(0.42f, 0.28f, 1.0f, 0.66f, 1.79f, 0.66f);
        pathBuilder3.curveToRelative(1.16f, 0.0f, 2.01f, -0.79f, 2.37f, -1.19f);
        pathBuilder.lineToRelative(-1.42f, -1.42f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.15f, 0.2f, -0.59f, 0.61f, -0.95f, 0.61f);
        pathBuilder4.curveToRelative(-0.18f, 0.0f, -0.38f, -0.12f, -0.69f, -0.33f);
        pathBuilder4.curveTo(9.14f, 13.39f, 8.55f, 13.0f, 7.75f, 13.0f);
        pathBuilder4.curveToRelative(-1.16f, 0.0f, -2.02f, 0.79f, -2.38f, 1.19f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder4.curveTo(6.95f, 15.41f, 7.38f, 15.0f, 7.75f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder5.curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 16.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder6.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder6.curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder6.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder6.curveTo(18.55f, 13.0f, 19.0f, 12.55f, 19.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _microwave = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}