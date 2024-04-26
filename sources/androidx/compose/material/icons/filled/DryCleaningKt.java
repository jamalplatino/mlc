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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dryCleaning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DryCleaning", "Landroidx/compose/material/icons/Icons$Filled;", "getDryCleaning", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DryCleaning.kt */
public final class DryCleaningKt {
    private static ImageVector _dryCleaning;

    public static final ImageVector getDryCleaning(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _dryCleaning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.DryCleaning", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.56f, 11.36f);
        pathBuilder.lineTo(13.0f, 8.44f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f);
        pathBuilder2.curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f);
        pathBuilder2.curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11.0f, 7.82f);
        pathBuilder.verticalLineToRelative(0.63f);
        pathBuilder.lineToRelative(-6.56f, 2.92f);
        pathBuilder.curveTo(3.56f, 11.75f, 3.0f, 12.62f, 3.0f, 13.57f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveTo(3.0f, 14.92f, 4.08f, 16.0f, 5.42f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(1.58f);
        pathBuilder.curveToRelative(1.34f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveTo(21.0f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f);
        pathBuilder.close();
        pathBuilder.moveTo(18.58f, 14.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.42f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(5.19f, 14.0f, 5.0f, 13.81f, 5.0f, 13.57f);
        pathBuilder3.curveToRelative(0.0f, -0.17f, 0.1f, -0.32f, 0.25f, -0.38f);
        pathBuilder.lineToRelative(6.75f, -3.0f);
        pathBuilder.lineToRelative(6.75f, 3.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(18.9f, 13.26f, 19.0f, 13.41f, 19.0f, 13.58f);
        pathBuilder4.curveTo(19.0f, 13.81f, 18.81f, 14.0f, 18.58f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dryCleaning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}