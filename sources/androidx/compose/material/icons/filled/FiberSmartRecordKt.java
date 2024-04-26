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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberSmartRecord", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberSmartRecord", "Landroidx/compose/material/icons/Icons$Filled;", "getFiberSmartRecord", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FiberSmartRecord.kt */
public final class FiberSmartRecordKt {
    private static ImageVector _fiberSmartRecord;

    public static final ImageVector getFiberSmartRecord(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _fiberSmartRecord;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.FiberSmartRecord", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.moveToRelative(-8.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 4.26f);
        pathBuilder3.verticalLineToRelative(2.09f);
        pathBuilder3.curveToRelative(2.33f, 0.82f, 4.0f, 3.04f, 4.0f, 5.65f);
        pathBuilder3.reflectiveCurveToRelative(-1.67f, 4.83f, -4.0f, 5.65f);
        pathBuilder3.verticalLineToRelative(2.09f);
        pathBuilder3.curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f);
        pathBuilder3.reflectiveCurveToRelative(-2.55f, -6.85f, -6.0f, -7.74f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _fiberSmartRecord = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}