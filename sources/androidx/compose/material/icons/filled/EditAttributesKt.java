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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editAttributes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditAttributes", "Landroidx/compose/material/icons/Icons$Filled;", "getEditAttributes", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EditAttributes.kt */
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.EditAttributes", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 7.0f);
        pathBuilder.horizontalLineTo(6.37f);
        pathBuilder.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 14.46f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.lineToRelative(0.7f, -0.7f);
        pathBuilder.lineToRelative(1.87f, 1.87f);
        pathBuilder.lineToRelative(3.52f, -3.52f);
        pathBuilder.lineToRelative(0.7f, 0.7f);
        pathBuilder.lineToRelative(-4.22f, 4.22f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _editAttributes = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
