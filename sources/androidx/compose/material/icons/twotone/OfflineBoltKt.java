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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_offlineBolt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OfflineBolt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getOfflineBolt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: OfflineBolt.kt */
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.OfflineBolt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.02f);
        pathBuilder.curveTo(7.6f, 4.02f, 4.02f, 7.6f, 4.02f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.6f, 19.98f, 12.0f, 19.98f);
        pathBuilder.reflectiveCurveToRelative(7.98f, -3.58f, 7.98f, -7.98f);
        pathBuilder.reflectiveCurveTo(16.4f, 4.02f, 12.0f, 4.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.39f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.horizontalLineTo(8.25f);
        pathBuilder.lineToRelative(4.5f, -8.5f);
        pathBuilder.verticalLineToRelative(5.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(11.39f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.02f);
        pathBuilder2.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilder2.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilder2.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilder2.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 19.98f);
        pathBuilder2.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        pathBuilder2.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        pathBuilder2.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        pathBuilder2.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.75f, 5.0f);
        pathBuilder2.lineToRelative(-4.5f, 8.5f);
        pathBuilder2.horizontalLineToRelative(3.14f);
        pathBuilder2.lineTo(11.39f, 19.0f);
        pathBuilder2.lineToRelative(4.36f, -8.5f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.lineTo(12.75f, 5.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _offlineBolt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
