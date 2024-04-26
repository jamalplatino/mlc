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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditLocation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEditLocation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EditLocation.kt */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.EditLocation", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.11f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.83f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(8.74f);
        pathBuilder.verticalLineTo(7.91f);
        pathBuilder.lineToRelative(0.59f, -0.59f);
        pathBuilder.lineTo(11.91f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.61f, 4.05f, 6.0f, 6.6f, 6.0f, 10.2f);
        pathBuilder2.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder2.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder2.curveToRelative(0.0f, -0.03f, 0.0f, -0.06f, 0.0f, -0.08f);
        pathBuilder.lineToRelative(-3.3f, 3.3f);
        pathBuilder.lineTo(14.11f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.17f, 4.91f);
        pathBuilder3.lineTo(17.1f, 3.84f);
        pathBuilder3.lineToRelative(-5.55f, 5.55f);
        pathBuilder3.verticalLineToRelative(1.08f);
        pathBuilder3.horizontalLineToRelative(1.08f);
        pathBuilder3.lineTo(18.17f, 4.91f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 2.74f);
        pathBuilder3.lineToRelative(1.29f, -1.29f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.58f, -0.59f, 1.52f, -0.59f, 2.11f, -0.01f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, 0.01f, 0.01f, 0.01f, 0.01f);
        pathBuilder3.lineToRelative(1.15f, 1.15f);
        pathBuilder3.curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder3.lineTo(19.88f, 5.4f);
        pathBuilder3.lineToRelative(-0.02f, 0.02f);
        pathBuilder3.lineTo(19.28f, 6.0f);
        pathBuilder3.lineToRelative(-6.0f, 6.0f);
        pathBuilder3.horizontalLineTo(10.0f);
        pathBuilder3.verticalLineTo(8.74f);
        pathBuilder3.lineTo(16.0f, 2.74f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.72f, 2.19f);
        pathBuilder3.lineToRelative(-0.55f, 0.55f);
        pathBuilder3.lineTo(11.9f, 4.01f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(8.6f, 4.06f, 6.0f, 6.61f, 6.0f, 10.21f);
        pathBuilder5.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder5.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder3.verticalLineToRelative(-0.1f);
        pathBuilder3.lineToRelative(1.8f, -1.8f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f);
        pathBuilder6.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilder6.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder6.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        pathBuilder6.curveTo(12.58f, 2.01f, 13.16f, 2.07f, 13.72f, 2.19f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(18.17f, 4.91f);
        pathBuilder7.lineToRelative(-1.07f, -1.07f);
        pathBuilder7.lineToRelative(-5.55f, 5.55f);
        pathBuilder7.lineToRelative(0.0f, 1.08f);
        pathBuilder7.lineToRelative(1.08f, 0.0f);
        pathBuilder7.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _editLocation = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
