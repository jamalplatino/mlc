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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_webAssetOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WebAssetOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWebAssetOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WebAssetOff.kt */
public final class WebAssetOffKt {
    private static ImageVector _webAssetOff;

    public static final ImageVector getWebAssetOff(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _webAssetOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.WebAssetOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 17.17f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-9.17f);
        pathBuilder.lineTo(20.0f, 17.17f);
        pathBuilder.close();
        pathBuilder.moveTo(5.17f, 8.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(11.17f);
        pathBuilder.lineTo(5.17f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.83f, 4.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(1.11f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder3.curveToRelative(0.0f, 0.34f, -0.09f, 0.66f, -0.23f, 0.94f);
        pathBuilder2.lineTo(20.0f, 17.17f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.horizontalLineToRelative(-9.17f);
        pathBuilder2.lineTo(6.83f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(17.17f, 20.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder3.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder3.curveToRelative(0.0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineToRelative(19.8f, 19.8f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.17f, 18.0f);
        pathBuilder2.lineToRelative(-10.0f, -10.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.horizontalLineTo(15.17f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _webAssetOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
