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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerPhone", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSpeakerPhone", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpeakerPhone.kt */
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.SpeakerPhone", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 1.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveTo(8.98f, 1.0f, 6.24f, 2.23f, 4.25f, 4.21f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder3.curveTo(7.28f, 4.0f, 9.53f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(4.72f, 1.0f, 6.34f, 2.62f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.curveTo(17.76f, 2.23f, 15.02f, 1.0f, 12.0f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 7.07f);
        pathBuilder2.lineTo(8.43f, 8.5f);
        pathBuilder2.curveToRelative(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f);
        pathBuilder2.reflectiveCurveToRelative(2.66f, 0.57f, 3.57f, 1.48f);
        pathBuilder2.lineTo(17.0f, 7.07f);
        pathBuilder2.curveTo(15.72f, 5.79f, 13.95f, 5.0f, 12.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.72f, 0.79f, -5.0f, 2.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.86f, 10.01f);
        pathBuilder2.lineTo(9.14f, 10.0f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveTo(8.51f, 10.0f, 8.0f, 10.51f, 8.0f, 11.14f);
        pathBuilder2.verticalLineToRelative(9.71f);
        pathBuilder4.curveToRelative(0.0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f);
        pathBuilder2.horizontalLineToRelative(5.71f);
        pathBuilder4.curveToRelative(0.63f, 0.0f, 1.14f, -0.51f, 1.14f, -1.14f);
        pathBuilder2.verticalLineToRelative(-9.71f);
        pathBuilder4.curveToRelative(0.01f, -0.63f, -0.5f, -1.13f, -1.13f, -1.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 20.0f);
        pathBuilder2.lineTo(9.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _speakerPhone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
