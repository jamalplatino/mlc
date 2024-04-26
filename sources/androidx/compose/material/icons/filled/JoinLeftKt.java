package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_joinLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "JoinLeft", "Landroidx/compose/material/icons/Icons$Filled;", "getJoinLeft", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: JoinLeft.kt */
public final class JoinLeftKt {
    private static ImageVector _joinLeft;

    public static final ImageVector getJoinLeft(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _joinLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Filled.JoinLeft", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(3.0f, 5.74f, 0.0f, true, false, 6.0f, 0.0f);
        pathBuilder2.arcToRelative(3.0f, 5.74f, 0.0f, true, false, -6.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.5f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.0f, -0.97f, 0.23f, -4.16f, 3.03f, -6.5f);
        pathBuilder4.curveTo(9.75f, 5.19f, 8.9f, 5.0f, 8.0f, 5.0f);
        pathBuilder4.curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f);
        pathBuilder3.reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilder4.curveToRelative(0.9f, 0.0f, 1.75f, -0.19f, 2.53f, -0.5f);
        pathBuilder4.curveTo(7.73f, 16.16f, 7.5f, 12.97f, 7.5f, 12.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(16.0f, 5.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-0.9f, 0.0f, -1.75f, 0.19f, -2.53f, 0.5f);
        pathBuilder6.curveToRelative(0.61f, 0.51f, 1.1f, 1.07f, 1.49f, 1.63f);
        pathBuilder6.curveTo(15.29f, 7.05f, 15.64f, 7.0f, 16.0f, 7.0f);
        pathBuilder6.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder5.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(-0.36f, 0.0f, -0.71f, -0.05f, -1.04f, -0.13f);
        pathBuilder7.curveToRelative(-0.39f, 0.56f, -0.88f, 1.12f, -1.49f, 1.63f);
        pathBuilder7.curveTo(14.25f, 18.81f, 15.1f, 19.0f, 16.0f, 19.0f);
        pathBuilder7.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        pathBuilder5.reflectiveCurveTo(19.86f, 5.0f, 16.0f, 5.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _joinLeft = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
