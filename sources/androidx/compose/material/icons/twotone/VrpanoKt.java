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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vrpano", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Vrpano", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVrpano", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Vrpano.kt */
public final class VrpanoKt {
    private static ImageVector _vrpano;

    public static final ImageVector getVrpano(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.Vrpano", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.38f);
        pathBuilder.verticalLineToRelative(11.25f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(2.01f, -0.59f, 4.61f, -1.13f, 8.0f, -1.13f);
        pathBuilder2.curveToRelative(3.38f, 0.0f, 5.99f, 0.54f, 8.0f, 1.13f);
        pathBuilder.verticalLineTo(6.37f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-2.01f, 0.59f, -4.62f, 1.13f, -8.0f, 1.13f);
        pathBuilder3.curveTo(9.32f, 7.5f, 6.58f, 7.11f, 4.0f, 6.38f);
        pathBuilder.close();
        pathBuilder.moveTo(18.51f, 15.4f);
        pathBuilder3.curveTo(16.52f, 15.15f, 14.3f, 15.0f, 12.0f, 15.0f);
        pathBuilder3.curveToRelative(-2.34f, 0.0f, -4.52f, 0.15f, -6.52f, 0.41f);
        pathBuilder.lineToRelative(3.69f, -4.42f);
        pathBuilder.lineToRelative(2.0f, 2.4f);
        pathBuilder.lineTo(14.0f, 10.0f);
        pathBuilder.lineTo(18.51f, 15.4f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.01f, 4.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(20.45f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f);
        pathBuilder5.curveToRelative(-5.31f, 0.0f, -8.49f, -1.49f, -9.01f, -1.49f);
        pathBuilder5.curveTo(2.46f, 4.01f, 2.0f, 4.45f, 2.0f, 5.02f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder5.curveToRelative(0.0f, 0.57f, 0.46f, 1.0f, 0.99f, 1.0f);
        pathBuilder5.curveToRelative(0.57f, 0.0f, 3.55f, -1.5f, 9.01f, -1.5f);
        pathBuilder5.curveToRelative(5.42f, 0.0f, 8.44f, 1.5f, 9.01f, 1.5f);
        pathBuilder5.curveToRelative(0.53f, 0.0f, 0.99f, -0.43f, 0.99f, -1.0f);
        pathBuilder4.verticalLineTo(5.0f);
        pathBuilder5.curveTo(22.0f, 4.43f, 21.54f, 4.0f, 21.01f, 4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.0f, 17.63f);
        pathBuilder5.curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8.0f, -1.13f);
        pathBuilder5.curveToRelative(-3.39f, 0.0f, -5.99f, 0.54f, -8.0f, 1.13f);
        pathBuilder4.verticalLineTo(6.38f);
        pathBuilder5.curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12.0f, 7.5f);
        pathBuilder5.curveToRelative(3.38f, 0.0f, 5.99f, -0.54f, 8.0f, -1.13f);
        pathBuilder4.verticalLineTo(17.63f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(9.17f, 10.99f);
        pathBuilder6.lineToRelative(-3.69f, 4.42f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveTo(7.48f, 15.15f, 9.66f, 15.0f, 12.0f, 15.0f);
        pathBuilder7.curveToRelative(2.3f, 0.0f, 4.52f, 0.15f, 6.51f, 0.4f);
        pathBuilder6.lineTo(14.0f, 10.0f);
        pathBuilder6.lineToRelative(-2.83f, 3.39f);
        pathBuilder6.lineTo(9.17f, 10.99f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _vrpano = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
