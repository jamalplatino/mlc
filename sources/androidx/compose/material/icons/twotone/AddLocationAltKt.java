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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addLocationAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddLocationAlt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAddLocationAlt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddLocationAlt.kt */
public final class AddLocationAltKt {
    private static ImageVector _addLocationAlt;

    public static final ImageVector getAddLocationAlt(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _addLocationAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.AddLocationAlt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 4.8f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(1.41f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.06f, 0.39f, 0.09f, 0.79f, 0.09f, 1.2f);
        pathBuilder2.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        pathBuilder.lineTo(12.0f, 21.01f);
        pathBuilder.lineToRelative(-0.34f, -0.31f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.6f, 16.99f, 5.5f, 13.77f, 5.5f, 11.2f);
        pathBuilder3.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        pathBuilder3.curveTo(12.7f, 4.5f, 13.37f, 4.6f, 14.0f, 4.8f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 1.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.horizontalLineToRelative(3.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(-3.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineTo(6.0f);
        pathBuilder4.horizontalLineToRelative(-3.0f);
        pathBuilder4.verticalLineTo(4.0f);
        pathBuilder4.horizontalLineToRelative(3.0f);
        pathBuilder4.verticalLineTo(1.0f);
        pathBuilder4.horizontalLineTo(20.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 13.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.reflectiveCurveTo(13.1f, 13.0f, 12.0f, 13.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.0f, 3.25f);
        pathBuilder4.verticalLineToRelative(2.08f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(13.38f, 5.11f, 12.7f, 5.0f, 12.0f, 5.0f);
        pathBuilder5.curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f);
        pathBuilder5.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder5.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder5.curveToRelative(0.0f, -0.41f, -0.03f, -0.81f, -0.1f, -1.2f);
        pathBuilder4.horizontalLineToRelative(2.02f);
        pathBuilder5.curveToRelative(0.05f, 0.39f, 0.08f, 0.79f, 0.08f, 1.2f);
        pathBuilder5.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilder5.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder5.curveTo(4.0f, 6.22f, 7.8f, 3.0f, 12.0f, 3.0f);
        pathBuilder5.curveTo(12.68f, 3.0f, 13.35f, 3.08f, 14.0f, 3.25f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addLocationAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
