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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerPhone", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpeakerPhone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpeakerPhone.kt */
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.SpeakerPhone", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.76f, 7.83f);
        pathBuilder.lineToRelative(0.02f, 0.02f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.35f, 0.35f, 0.89f, 0.38f, 1.3f, 0.09f);
        pathBuilder2.curveTo(9.91f, 7.37f, 10.92f, 7.02f, 12.0f, 7.02f);
        pathBuilder.reflectiveCurveToRelative(2.09f, 0.35f, 2.92f, 0.93f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.4f, 0.29f, 0.95f, 0.26f, 1.3f, -0.09f);
        pathBuilder.lineToRelative(0.02f, -0.02f);
        pathBuilder3.curveToRelative(0.42f, -0.42f, 0.39f, -1.14f, -0.09f, -1.49f);
        pathBuilder3.curveTo(14.98f, 5.5f, 13.55f, 5.0f, 12.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(9.02f, 5.5f, 7.86f, 6.34f);
        pathBuilder.curveTo(7.37f, 6.69f, 7.34f, 7.41f, 7.76f, 7.83f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 1.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(9.38f, 1.0f, 6.97f, 1.93f, 5.08f, 3.47f);
        pathBuilder5.curveTo(4.62f, 3.84f, 4.57f, 4.53f, 5.0f, 4.96f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f);
        pathBuilder5.curveTo(7.86f, 3.76f, 9.85f, 3.0f, 12.0f, 3.0f);
        pathBuilder4.reflectiveCurveToRelative(4.14f, 0.76f, 5.69f, 2.03f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f);
        pathBuilder6.curveTo(17.03f, 1.93f, 14.62f, 1.0f, 12.0f, 1.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(15.0f, 10.0f);
        pathBuilder7.lineToRelative(-6.0f, 0.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder7.verticalLineToRelative(10.0f);
        pathBuilder8.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder7.horizontalLineToRelative(5.99f);
        pathBuilder8.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder7.lineTo(16.0f, 11.0f);
        pathBuilder7.curveTo(16.0f, 10.45f, 15.55f, 10.0f, 15.0f, 10.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(15.0f, 20.0f);
        pathBuilder7.horizontalLineTo(9.0f);
        pathBuilder7.verticalLineToRelative(-8.0f);
        pathBuilder7.horizontalLineToRelative(6.0f);
        pathBuilder7.verticalLineTo(20.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _speakerPhone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
