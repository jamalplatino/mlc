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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeDone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveDone", "Landroidx/compose/material/icons/Icons$Filled;", "getRemoveDone", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RemoveDone.kt */
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.RemoveDone", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.79f, 12.0f);
        pathBuilder.lineToRelative(5.58f, 5.59f);
        pathBuilder.lineTo(5.96f, 19.0f);
        pathBuilder.lineTo(0.37f, 13.41f);
        pathBuilder.lineTo(1.79f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.24f, 4.22f);
        pathBuilder.lineTo(12.9f, 14.89f);
        pathBuilder.lineToRelative(-1.28f, 1.28f);
        pathBuilder.lineTo(7.44f, 12.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(11.62f, 19.0f);
        pathBuilder.lineToRelative(2.69f, -2.69f);
        pathBuilder.lineToRelative(4.89f, 4.89f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.65f, 2.81f);
        pathBuilder.lineTo(2.24f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(17.14f, 13.49f);
        pathBuilder.lineTo(23.62f, 7.0f);
        pathBuilder.lineTo(22.2f, 5.59f);
        pathBuilder.lineToRelative(-6.48f, 6.48f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(17.96f, 7.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.65f, 3.66f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(17.96f, 7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _removeDone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
