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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_psychology", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Psychology", "Landroidx/compose/material/icons/Icons$Rounded;", "getPsychology", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Psychology.kt */
public final class PsychologyKt {
    private static ImageVector _psychology;

    public static final ImageVector getPsychology(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _psychology;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.Psychology", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 8.57f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.43f, 0.64f, -1.43f, 1.43f);
        pathBuilder.reflectiveCurveToRelative(0.64f, 1.43f, 1.43f, 1.43f);
        pathBuilder.reflectiveCurveToRelative(1.43f, -0.64f, 1.43f, -1.43f);
        pathBuilder.reflectiveCurveTo(13.79f, 8.57f, 13.0f, 8.57f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.21f, 3.0f);
        pathBuilder2.curveToRelative(-3.84f, -0.11f, -7.0f, 2.87f, -7.19f, 6.64f);
        pathBuilder2.lineTo(4.1f, 12.2f);
        pathBuilder2.curveTo(3.85f, 12.53f, 4.09f, 13.0f, 4.5f, 13.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-3.68f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(2.44f, -1.16f, 4.1f, -3.68f, 4.0f, -6.58f);
        pathBuilder3.curveTo(19.86f, 6.12f, 16.82f, 3.11f, 13.21f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, 0.13f, -0.01f, 0.26f, -0.02f, 0.39f);
        pathBuilder2.lineToRelative(0.83f, 0.66f);
        pathBuilder2.curveToRelative(0.08f, 0.06f, 0.1f, 0.16f, 0.05f, 0.25f);
        pathBuilder2.lineToRelative(-0.8f, 1.39f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveToRelative(-0.05f, 0.09f, -0.16f, 0.12f, -0.24f, 0.09f);
        pathBuilder2.lineToRelative(-0.99f, -0.4f);
        pathBuilder4.curveToRelative(-0.21f, 0.16f, -0.43f, 0.29f, -0.67f, 0.39f);
        pathBuilder2.lineTo(14.0f, 13.83f);
        pathBuilder2.curveToRelative(-0.01f, 0.1f, -0.1f, 0.17f, -0.2f, 0.17f);
        pathBuilder2.horizontalLineToRelative(-1.6f);
        pathBuilder2.curveToRelative(-0.1f, 0.0f, -0.18f, -0.07f, -0.2f, -0.17f);
        pathBuilder2.lineToRelative(-0.15f, -1.06f);
        PathBuilder pathBuilder5 = pathBuilder2;
        pathBuilder5.curveToRelative(-0.25f, -0.1f, -0.47f, -0.23f, -0.68f, -0.39f);
        pathBuilder2.lineToRelative(-0.99f, 0.4f);
        pathBuilder5.curveToRelative(-0.09f, 0.03f, -0.2f, 0.0f, -0.25f, -0.09f);
        pathBuilder2.lineToRelative(-0.8f, -1.39f);
        pathBuilder2.curveToRelative(-0.05f, -0.08f, -0.03f, -0.19f, 0.05f, -0.25f);
        pathBuilder2.lineToRelative(0.84f, -0.66f);
        PathBuilder pathBuilder6 = pathBuilder2;
        pathBuilder6.curveTo(10.01f, 10.26f, 10.0f, 10.13f, 10.0f, 10.0f);
        pathBuilder6.curveToRelative(0.0f, -0.13f, 0.02f, -0.27f, 0.04f, -0.39f);
        pathBuilder2.lineTo(9.19f, 8.95f);
        pathBuilder2.curveToRelative(-0.08f, -0.06f, -0.1f, -0.16f, -0.05f, -0.26f);
        pathBuilder2.lineToRelative(0.8f, -1.38f);
        PathBuilder pathBuilder7 = pathBuilder2;
        pathBuilder7.curveToRelative(0.05f, -0.09f, 0.15f, -0.12f, 0.24f, -0.09f);
        pathBuilder2.lineToRelative(1.0f, 0.4f);
        pathBuilder7.curveToRelative(0.2f, -0.15f, 0.43f, -0.29f, 0.67f, -0.39f);
        pathBuilder2.lineToRelative(0.15f, -1.06f);
        pathBuilder7.curveTo(12.02f, 6.07f, 12.1f, 6.0f, 12.2f, 6.0f);
        pathBuilder2.horizontalLineToRelative(1.6f);
        pathBuilder2.curveToRelative(0.1f, 0.0f, 0.18f, 0.07f, 0.2f, 0.17f);
        pathBuilder2.lineToRelative(0.15f, 1.06f);
        PathBuilder pathBuilder8 = pathBuilder2;
        pathBuilder8.curveToRelative(0.24f, 0.1f, 0.46f, 0.23f, 0.67f, 0.39f);
        pathBuilder2.lineToRelative(1.0f, -0.4f);
        pathBuilder8.curveToRelative(0.09f, -0.03f, 0.2f, 0.0f, 0.24f, 0.09f);
        pathBuilder2.lineToRelative(0.8f, 1.38f);
        pathBuilder2.curveToRelative(0.05f, 0.09f, 0.03f, 0.2f, -0.05f, 0.26f);
        pathBuilder2.lineToRelative(-0.85f, 0.66f);
        pathBuilder2.curveTo(15.99f, 9.73f, 16.0f, 9.86f, 16.0f, 10.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _psychology = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
