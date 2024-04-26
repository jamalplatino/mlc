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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sendTimeExtension", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SendTimeExtension", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSendTimeExtension", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SendTimeExtension.kt */
public final class SendTimeExtensionKt {
    private static ImageVector _sendTimeExtension;

    public static final ImageVector getSendTimeExtension(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _sendTimeExtension;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.SendTimeExtension", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.verticalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.01f);
        pathBuilder.verticalLineToRelative(2.13f);
        pathBuilder2.curveTo(7.17f, 8.94f, 8.0f, 11.01f, 8.0f, 12.5f);
        pathBuilder2.curveToRelative(0.0f, 1.5f, -0.83f, 3.57f, -3.0f, 4.37f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(2.13f);
        pathBuilder2.curveToRelative(0.71f, -1.93f, 2.44f, -2.8f, 3.87f, -2.97f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.verticalLineTo(8.76f);
        pathBuilder.lineToRelative(2.89f, 1.45f);
        pathBuilder.lineTo(18.0f, 12.26f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.13f, 19.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        pathBuilder3.verticalLineToRelative(-2.13f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f);
        pathBuilder4.curveToRelative(0.0f, -1.49f, -0.83f, -3.56f, -2.99f, -4.37f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineTo(11.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder3.reflectiveCurveTo(12.0f, 3.72f, 12.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(6.0f);
        pathBuilder3.verticalLineToRelative(6.26f);
        pathBuilder3.lineToRelative(2.0f, 1.0f);
        pathBuilder3.verticalLineTo(6.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder5.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder3.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        pathBuilder3.horizontalLineTo(5.01f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(3.8f);
        pathBuilder6.curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f);
        pathBuilder6.curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(3.8f);
        pathBuilder6.curveToRelative(0.0f, -2.16f, 1.37f, -2.78f, 2.2f, -2.94f);
        pathBuilder3.verticalLineToRelative(-2.03f);
        pathBuilder6.curveTo(9.57f, 16.2f, 7.85f, 17.07f, 7.13f, 19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(13.0f, 12.0f);
        pathBuilder7.lineToRelative(0.0f, 4.0f);
        pathBuilder7.lineToRelative(4.0f, 1.0f);
        pathBuilder7.lineToRelative(-4.0f, 1.0f);
        pathBuilder7.lineToRelative(0.0f, 4.0f);
        pathBuilder7.lineToRelative(10.0f, -5.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sendTimeExtension = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
