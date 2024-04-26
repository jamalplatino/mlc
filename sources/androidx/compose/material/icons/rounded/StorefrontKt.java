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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_storefront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Storefront", "Landroidx/compose/material/icons/Icons$Rounded;", "getStorefront", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Storefront.kt */
public final class StorefrontKt {
    private static ImageVector _storefront;

    public static final ImageVector getStorefront(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _storefront;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Storefront", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.9f, 7.89f);
        pathBuilder.lineToRelative(-1.05f, -3.37f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.22f, -0.9f, -1.0f, -1.52f, -1.91f, -1.52f);
        pathBuilder.horizontalLineTo(5.05f);
        pathBuilder2.curveToRelative(-0.9f, 0.0f, -1.69f, 0.63f, -1.9f, 1.52f);
        pathBuilder.lineTo(2.1f, 7.89f);
        pathBuilder.curveTo(1.64f, 9.86f, 2.95f, 11.0f, 3.0f, 11.06f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-7.94f);
        pathBuilder.curveTo(22.12f, 9.94f, 22.09f, 8.65f, 21.9f, 7.89f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.96f);
        pathBuilder.lineToRelative(0.54f, 3.52f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(15.59f, 9.23f, 15.11f, 10.0f, 14.22f, 10.0f);
        pathBuilder3.curveTo(13.55f, 10.0f, 13.0f, 9.41f, 13.0f, 8.69f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.44f, 8.86f);
        pathBuilder3.curveTo(6.36f, 9.51f, 5.84f, 10.0f, 5.23f, 10.0f);
        pathBuilder3.curveTo(4.3f, 10.0f, 3.88f, 9.03f, 4.04f, 8.36f);
        pathBuilder.lineTo(5.05f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.97f);
        pathBuilder.lineTo(6.44f, 8.86f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.69f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(11.0f, 9.41f, 10.45f, 10.0f, 9.71f, 10.0f);
        pathBuilder4.curveToRelative(-0.75f, 0.0f, -1.3f, -0.7f, -1.22f, -1.48f);
        pathBuilder.lineTo(9.04f, 5.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(8.69f);
        pathBuilder.close();
        pathBuilder.moveTo(18.77f, 10.0f);
        pathBuilder.curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f);
        pathBuilder.lineTo(16.98f, 5.0f);
        pathBuilder.lineToRelative(1.93f, -0.01f);
        pathBuilder.lineToRelative(1.05f, 3.37f);
        pathBuilder.curveTo(20.12f, 9.03f, 19.71f, 10.0f, 18.77f, 10.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _storefront = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
