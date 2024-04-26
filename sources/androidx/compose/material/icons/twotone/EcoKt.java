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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_eco", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Eco", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEco", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Eco.kt */
public final class EcoKt {
    private static ImageVector _eco;

    public static final ImageVector getEco(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _eco;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Eco", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.46f, 9.46f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(5.68f, 11.25f, 5.55f, 14.04f, 7.03f, 16.0f);
        pathBuilder2.curveToRelative(1.53f, -2.54f, 3.73f, -4.64f, 6.37f, -6.0f);
        pathBuilder2.curveToRelative(-2.26f, 1.91f, -3.95f, 4.44f, -4.88f, 7.32f);
        pathBuilder2.curveTo(9.27f, 17.75f, 10.11f, 18.0f, 11.0f, 18.0f);
        pathBuilder2.curveToRelative(1.34f, 0.0f, 2.59f, -0.52f, 3.54f, -1.46f);
        pathBuilder2.curveToRelative(1.74f, -1.74f, 2.81f, -6.57f, 3.26f, -10.33f);
        pathBuilder2.curveTo(14.04f, 6.65f, 9.21f, 7.72f, 7.46f, 9.46f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.05f, 8.05f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.0f, 9.9f);
        pathBuilder4.curveTo(7.42f, 19.32f, 9.21f, 20.0f, 11.0f, 20.0f);
        pathBuilder3.reflectiveCurveToRelative(3.58f, -0.68f, 4.95f, -2.05f);
        pathBuilder3.curveTo(19.43f, 14.47f, 20.0f, 4.0f, 20.0f, 4.0f);
        pathBuilder3.reflectiveCurveTo(9.53f, 4.57f, 6.05f, 8.05f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.54f, 16.54f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(13.59f, 17.48f, 12.34f, 18.0f, 11.0f, 18.0f);
        pathBuilder5.curveToRelative(-0.89f, 0.0f, -1.73f, -0.25f, -2.48f, -0.68f);
        pathBuilder5.curveToRelative(0.92f, -2.88f, 2.62f, -5.41f, 4.88f, -7.32f);
        pathBuilder5.curveToRelative(-2.63f, 1.36f, -4.84f, 3.46f, -6.37f, 6.0f);
        pathBuilder5.curveToRelative(-1.48f, -1.96f, -1.35f, -4.75f, 0.44f, -6.54f);
        pathBuilder5.curveTo(9.21f, 7.72f, 14.04f, 6.65f, 17.8f, 6.2f);
        pathBuilder5.curveTo(17.35f, 9.96f, 16.28f, 14.79f, 14.54f, 16.54f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _eco = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
