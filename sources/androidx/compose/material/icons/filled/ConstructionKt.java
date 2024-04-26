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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_construction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Construction", "Landroidx/compose/material/icons/Icons$Filled;", "getConstruction", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Construction.kt */
public final class ConstructionKt {
    private static ImageVector _construction;

    public static final ImageVector getConstruction(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _construction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.Construction", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.783f, 15.172f);
        pathBuilder.lineToRelative(2.121f, -2.121f);
        pathBuilder.lineToRelative(5.996f, 5.996f);
        pathBuilder.lineToRelative(-2.121f, 2.121f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.5f, 10.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder3.curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f);
        pathBuilder2.lineToRelative(-2.7f, 2.7f);
        pathBuilder2.lineTo(16.4f, 6.11f);
        pathBuilder2.lineToRelative(2.7f, -2.7f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveTo(18.62f, 3.16f, 18.08f, 3.0f, 17.5f, 3.0f);
        pathBuilder4.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        pathBuilder4.curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f);
        pathBuilder2.lineToRelative(-1.85f, 1.85f);
        pathBuilder2.lineToRelative(-1.78f, -1.78f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineTo(9.88f, 5.61f);
        pathBuilder2.lineTo(12.0f, 3.49f);
        pathBuilder2.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        pathBuilder2.lineTo(4.22f, 7.03f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.horizontalLineTo(2.81f);
        pathBuilder2.lineTo(2.1f, 9.15f);
        pathBuilder2.lineToRelative(3.54f, 3.54f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.verticalLineTo(9.15f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.78f, 1.78f);
        pathBuilder2.lineToRelative(-7.41f, 7.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.lineTo(16.34f, 9.79f);
        pathBuilder2.curveTo(16.7f, 9.92f, 17.09f, 10.0f, 17.5f, 10.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _construction = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
