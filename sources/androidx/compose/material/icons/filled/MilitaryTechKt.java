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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_militaryTech", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MilitaryTech", "Landroidx/compose/material/icons/Icons$Filled;", "getMilitaryTech", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MilitaryTech.kt */
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.MilitaryTech", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.43f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(8.43f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(4.18f, 2.51f);
        pathBuilder.lineToRelative(-0.99f, 2.34f);
        pathBuilder.lineToRelative(-3.41f, 0.29f);
        pathBuilder.lineToRelative(2.59f, 2.24f);
        pathBuilder.lineTo(9.07f, 22.0f);
        pathBuilder.lineTo(12.0f, 20.23f);
        pathBuilder.lineTo(14.93f, 22.0f);
        pathBuilder.lineToRelative(-0.78f, -3.33f);
        pathBuilder.lineToRelative(2.59f, -2.24f);
        pathBuilder.lineToRelative(-3.41f, -0.29f);
        pathBuilder.lineToRelative(-0.99f, -2.34f);
        pathBuilder.lineToRelative(4.18f, -2.51f);
        pathBuilder.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.23f);
        pathBuilder.lineToRelative(-1.0f, 0.6f);
        pathBuilder.lineToRelative(-1.0f, -0.6f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(12.23f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _militaryTech = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
