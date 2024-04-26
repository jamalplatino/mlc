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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phishing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Phishing", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhishing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Phishing.kt */
public final class PhishingKt {
    private static ImageVector _phishing;

    public static final ImageVector getPhishing(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _phishing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Phishing", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        pathBuilder.verticalLineTo(3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.18f);
        pathBuilder.curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f);
        pathBuilder.lineToRelative(0.0f, 3.01f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 2.09f, -1.52f, 3.96f, -3.6f, 4.16f);
        pathBuilder3.curveTo(9.02f, 19.21f, 7.0f, 17.34f, 7.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineTo(5.85f, 9.85f);
        pathBuilder.curveTo(5.54f, 9.54f, 5.0f, 9.76f, 5.0f, 10.21f);
        pathBuilder.lineToRelative(0.0f, 4.58f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f);
        pathBuilder4.curveTo(13.87f, 21.42f, 17.0f, 18.57f, 17.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-3.18f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(18.16f, 11.4f, 19.0f, 10.3f, 19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 10.0f);
        pathBuilder5.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(16.55f, 10.0f, 16.0f, 10.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phishing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
