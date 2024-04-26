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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_checkroom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Checkroom", "Landroidx/compose/material/icons/Icons$Rounded;", "getCheckroom", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Checkroom.kt */
public final class CheckroomKt {
    private static ImageVector _checkroom;

    public static final ImageVector getCheckroom(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _checkroom;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Checkroom", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.6f, 18.2f);
        pathBuilder.lineTo(13.0f, 11.75f);
        pathBuilder.verticalLineToRelative(-0.91f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f);
        pathBuilder2.curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f);
        pathBuilder2.curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f);
        pathBuilder2.curveTo(8.5f, 6.74f, 8.98f, 7.5f, 9.71f, 7.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f);
        pathBuilder2.curveTo(10.84f, 6.38f, 11.37f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.curveToRelative(0.0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f);
        pathBuilder2.curveTo(11.43f, 8.99f, 11.0f, 9.45f, 11.0f, 9.99f);
        pathBuilder.lineToRelative(0.0f, 1.76f);
        pathBuilder.lineTo(2.4f, 18.2f);
        pathBuilder.curveTo(1.63f, 18.78f, 2.04f, 20.0f, 3.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveTo(21.96f, 20.0f, 22.37f, 18.78f, 21.6f, 18.2f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 18.0f);
        pathBuilder.lineToRelative(6.0f, -4.5f);
        pathBuilder.lineToRelative(6.0f, 4.5f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _checkroom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}