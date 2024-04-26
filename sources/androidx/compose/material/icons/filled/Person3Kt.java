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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_person3", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Person3", "Landroidx/compose/material/icons/Icons$Filled;", "getPerson3", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Person3.kt */
public final class Person3Kt {
    private static ImageVector _person3;

    public static final ImageVector getPerson3(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _person3;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.Person3", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.39f, 14.56f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder2.curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder2.curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.0f, 12.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.17f, 0.0f, 3.83f, 0.0f, 4.0f, 0.0f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder4.curveToRelative(0.0f, -0.73f, -0.27f, -1.4f, -0.71f, -1.92f);
        pathBuilder4.curveTo(16.42f, 6.75f, 16.5f, 6.38f, 16.5f, 6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.25f, -0.77f, -2.32f, -1.86f, -2.77f);
        pathBuilder4.curveTo(14.0f, 2.48f, 13.06f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, 0.48f, -2.64f, 1.23f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveTo(8.27f, 3.68f, 7.5f, 4.75f, 7.5f, 6.0f);
        pathBuilder5.curveToRelative(0.0f, 0.38f, 0.08f, 0.75f, 0.21f, 1.08f);
        pathBuilder5.curveTo(7.27f, 7.6f, 7.0f, 8.27f, 7.0f, 9.0f);
        pathBuilder5.curveTo(7.0f, 10.66f, 8.34f, 12.0f, 10.0f, 12.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _person3 = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
