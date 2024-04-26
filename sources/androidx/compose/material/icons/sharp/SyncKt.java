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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sync", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sync", "Landroidx/compose/material/icons/Icons$Sharp;", "getSync", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Sync.kt */
public final class SyncKt {
    private static ImageVector _sync;

    public static final ImageVector getSync(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _sync;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Sync", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
        pathBuilder.lineTo(5.24f, 7.74f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sync = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
