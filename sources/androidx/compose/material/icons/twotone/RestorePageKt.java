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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restorePage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestorePage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRestorePage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RestorePage.kt */
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.RestorePage", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(18.0f, 8.83f);
        pathBuilder.lineTo(13.17f, 4.0f);
        pathBuilder.lineTo(6.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.72f, 13.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f);
        pathBuilder2.curveToRelative(-1.84f, 0.0f, -3.43f, -1.12f, -4.12f, -2.7f);
        pathBuilder.horizontalLineToRelative(1.54f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.57f, 0.81f, 1.51f, 1.35f, 2.58f, 1.35f);
        pathBuilder3.curveToRelative(1.74f, 0.0f, 3.15f, -1.41f, 3.15f, -3.15f);
        pathBuilder.reflectiveCurveToRelative(-1.41f, -3.15f, -3.15f, -3.15f);
        pathBuilder3.curveToRelative(-1.21f, 0.0f, -2.27f, 0.7f, -2.79f, 1.71f);
        pathBuilder.lineTo(10.88f, 13.0f);
        pathBuilder.horizontalLineToRelative(-3.6f);
        pathBuilder.lineTo(7.28f, 9.4f);
        pathBuilder.lineToRelative(1.17f, 1.17f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.8f, -1.24f, 2.19f, -2.07f, 3.78f, -2.07f);
        pathBuilder4.curveToRelative(2.48f, 0.0f, 4.49f, 2.02f, 4.49f, 4.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.0f, 2.0f);
        pathBuilder5.lineTo(6.0f, 2.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder5.lineTo(4.0f, 20.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder5.lineTo(18.0f, 22.0f);
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.lineTo(20.0f, 8.0f);
        pathBuilder5.lineToRelative(-6.0f, -6.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 20.0f);
        pathBuilder5.lineTo(6.0f, 20.0f);
        pathBuilder5.lineTo(6.0f, 4.0f);
        pathBuilder5.horizontalLineToRelative(7.17f);
        pathBuilder5.lineTo(18.0f, 8.83f);
        pathBuilder5.lineTo(18.0f, 20.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(8.45f, 10.57f);
        pathBuilder5.lineTo(7.28f, 9.4f);
        pathBuilder5.lineTo(7.28f, 13.0f);
        pathBuilder5.horizontalLineToRelative(3.6f);
        pathBuilder5.lineToRelative(-1.44f, -1.44f);
        pathBuilder6.curveToRelative(0.52f, -1.01f, 1.58f, -1.71f, 2.79f, -1.71f);
        pathBuilder6.curveToRelative(1.74f, 0.0f, 3.15f, 1.41f, 3.15f, 3.15f);
        pathBuilder5.reflectiveCurveToRelative(-1.41f, 3.15f, -3.15f, 3.15f);
        pathBuilder6.curveToRelative(-1.07f, 0.0f, -2.02f, -0.54f, -2.58f, -1.35f);
        pathBuilder5.lineTo(8.1f, 14.8f);
        pathBuilder6.curveToRelative(0.69f, 1.58f, 2.28f, 2.7f, 4.12f, 2.7f);
        pathBuilder6.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder5.reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f);
        pathBuilder6.curveToRelative(-1.59f, 0.0f, -2.97f, 0.83f, -3.77f, 2.07f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _restorePage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
