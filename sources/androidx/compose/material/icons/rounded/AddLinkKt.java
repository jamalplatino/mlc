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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addLink", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddLink", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddLink", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddLink.kt */
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.AddLink", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(8.0f, 11.45f, 8.45f, 11.0f, 9.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.93f, 12.0f);
        pathBuilder.lineTo(20.93f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.62f, 0.0f, 1.07f, -0.59f, 0.93f, -1.19f);
        pathBuilder3.curveTo(21.32f, 8.62f, 19.35f, 7.0f, 17.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-3.05f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(13.43f, 7.0f, 13.0f, 7.43f, 13.0f, 7.95f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder4.curveToRelative(0.0f, 0.52f, 0.43f, 0.95f, 0.95f, 0.95f);
        pathBuilder.horizontalLineTo(17.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.45f, 0.0f, 2.67f, 1.0f, 3.01f, 2.34f);
        pathBuilder5.curveTo(20.12f, 11.68f, 20.48f, 12.0f, 20.93f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.96f, 11.38f);
        pathBuilder.curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f);
        pathBuilder.lineToRelative(2.93f, 0.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveTo(10.57f, 8.9f, 11.0f, 8.47f, 11.0f, 7.95f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder6.curveTo(11.0f, 7.43f, 10.57f, 7.0f, 10.05f, 7.0f);
        pathBuilder.lineTo(7.22f, 7.0f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f);
        pathBuilder7.curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.05f);
        PathBuilder pathBuilder8 = pathBuilder;
        pathBuilder8.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(0.0f, -0.52f, -0.43f, -0.95f, -0.95f, -0.95f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder8.curveTo(5.09f, 15.1f, 3.58f, 13.36f, 3.96f, 11.38f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.lineTo(18.0f, 12.0f);
        PathBuilder pathBuilder9 = pathBuilder;
        pathBuilder9.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder9.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder9.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder9.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder9.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder9.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder9.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder9.curveTo(19.0f, 12.45f, 18.55f, 12.0f, 18.0f, 12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addLink = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
