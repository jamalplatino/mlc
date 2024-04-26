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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DoNotTouch.kt */
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.DoNotTouch", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 15.17f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(-2.17f);
        pathBuilder.lineTo(18.0f, 15.17f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 11.83f);
        pathBuilder.lineToRelative(8.14f, 8.14f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        pathBuilder.lineTo(6.87f, 16.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(9.0f, 11.83f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(2.81f, 2.81f);
        pathBuilder3.lineTo(1.39f, 4.22f);
        pathBuilder3.lineTo(7.0f, 9.83f);
        pathBuilder3.lineToRelative(0.0f, 4.3f);
        pathBuilder3.lineToRelative(-2.6f, -1.48f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilder4.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilder3.lineTo(2.0f, 13.88f);
        pathBuilder3.lineToRelative(6.8f, 7.18f);
        pathBuilder4.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilder3.horizontalLineTo(17.0f);
        pathBuilder4.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.66f, -0.52f);
        pathBuilder3.lineToRelative(1.12f, 1.12f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(2.81f, 2.81f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.0f, 20.0f);
        pathBuilder3.horizontalLineToRelative(-6.0f);
        pathBuilder4.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        pathBuilder3.lineTo(6.87f, 16.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.lineToRelative(0.0f, -4.17f);
        pathBuilder3.lineToRelative(8.14f, 8.14f);
        pathBuilder4.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.83f, 11.0f);
        pathBuilder3.horizontalLineTo(14.0f);
        pathBuilder3.verticalLineTo(3.25f);
        pathBuilder4.curveTo(14.0f, 2.56f, 14.56f, 2.0f, 15.25f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder3.verticalLineTo(11.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineTo(5.25f);
        pathBuilder4.curveTo(17.5f, 4.56f, 18.06f, 4.0f, 18.75f, 4.0f);
        pathBuilder3.reflectiveCurveTo(20.0f, 4.56f, 20.0f, 5.25f);
        pathBuilder3.verticalLineToRelative(11.92f);
        pathBuilder3.lineToRelative(-2.0f, -2.0f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.horizontalLineToRelative(-2.17f);
        pathBuilder3.lineTo(13.83f, 11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.0f, 10.17f);
        pathBuilder3.verticalLineTo(2.25f);
        pathBuilder4.curveTo(13.0f, 1.56f, 12.44f, 1.0f, 11.75f, 1.0f);
        pathBuilder3.reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f);
        pathBuilder3.verticalLineToRelative(5.42f);
        pathBuilder3.lineTo(13.0f, 10.17f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.5f, 6.67f);
        pathBuilder3.verticalLineTo(4.25f);
        pathBuilder4.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder4.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.lineTo(9.5f, 6.67f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _doNotTouch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
