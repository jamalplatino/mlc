package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaWideAngleSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaWideAngleSelect", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanoramaWideAngleSelect", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PanoramaWideAngleSelect.kt */
public final class PanoramaWideAngleSelectKt {
    private static ImageVector _panoramaWideAngleSelect;

    public static final ImageVector getPanoramaWideAngleSelect(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _panoramaWideAngleSelect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.PanoramaWideAngleSelect", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.03f, 4.0f, 5.15f, 4.63f, 3.0f, 5.0f);
        pathBuilder2.curveToRelative(-0.55f, 1.97f, -1.0f, 3.92f, -1.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 3.03f, 0.45f, 5.05f, 1.0f, 7.0f);
        pathBuilder2.curveToRelative(2.15f, 0.37f, 4.98f, 1.0f, 9.0f, 1.0f);
        pathBuilder2.curveToRelative(3.97f, 0.0f, 6.85f, -0.63f, 9.0f, -1.0f);
        pathBuilder2.curveToRelative(0.57f, -2.02f, 1.0f, -3.99f, 1.0f, -7.0f);
        pathBuilder2.curveToRelative(0.0f, -3.03f, -0.45f, -5.05f, -1.0f, -7.0f);
        pathBuilder2.curveTo(18.85f, 4.63f, 16.02f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _panoramaWideAngleSelect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
