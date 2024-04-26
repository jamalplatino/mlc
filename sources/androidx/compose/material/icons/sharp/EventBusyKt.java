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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_eventBusy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EventBusy", "Landroidx/compose/material/icons/Icons$Sharp;", "getEventBusy", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EventBusy.kt */
public final class EventBusyKt {
    private static ImageVector _eventBusy;

    public static final ImageVector getEventBusy(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _eventBusy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.EventBusy", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.31f, 17.0f);
        pathBuilder.lineToRelative(2.44f, -2.44f);
        pathBuilder.lineTo(14.19f, 17.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-2.44f, -2.44f);
        pathBuilder.lineToRelative(2.44f, -2.44f);
        pathBuilder.lineTo(14.19f, 10.0f);
        pathBuilder.lineToRelative(-2.44f, 2.44f);
        pathBuilder.lineTo(9.31f, 10.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(2.44f, 2.44f);
        pathBuilder.lineToRelative(-2.44f, 2.44f);
        pathBuilder.lineTo(9.31f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(18.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 1.0f);
        pathBuilder.lineTo(6.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.01f, 3.0f);
        pathBuilder.lineTo(3.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _eventBusy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}