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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_map", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Map", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMap", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Map.kt */
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _map;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Map", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.31f);
        pathBuilder.lineToRelative(3.0f, -1.16f);
        pathBuilder.lineTo(8.0f, 5.45f);
        pathBuilder.lineTo(5.0f, 6.46f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 18.55f);
        pathBuilder.lineToRelative(3.0f, -1.01f);
        pathBuilder.lineTo(19.0f, 5.69f);
        pathBuilder.lineToRelative(-3.0f, 1.17f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.5f, 3.0f);
        pathBuilder2.lineToRelative(-0.16f, 0.03f);
        pathBuilder2.lineTo(15.0f, 5.1f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.lineTo(3.36f, 4.9f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        pathBuilder2.lineTo(3.0f, 20.5f);
        pathBuilder3.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder2.lineToRelative(0.16f, -0.03f);
        pathBuilder2.lineTo(9.0f, 18.9f);
        pathBuilder2.lineToRelative(6.0f, 2.1f);
        pathBuilder2.lineToRelative(5.64f, -1.9f);
        PathBuilder pathBuilder4 = pathBuilder2;
        pathBuilder4.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        pathBuilder2.lineTo(21.0f, 3.5f);
        pathBuilder4.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 17.15f);
        pathBuilder2.lineToRelative(-3.0f, 1.16f);
        pathBuilder2.lineTo(5.0f, 6.46f);
        pathBuilder2.lineToRelative(3.0f, -1.01f);
        pathBuilder2.verticalLineToRelative(11.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 18.53f);
        pathBuilder2.lineToRelative(-4.0f, -1.4f);
        pathBuilder2.lineTo(10.0f, 5.47f);
        pathBuilder2.lineToRelative(4.0f, 1.4f);
        pathBuilder2.verticalLineToRelative(11.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 17.54f);
        pathBuilder2.lineToRelative(-3.0f, 1.01f);
        pathBuilder2.lineTo(16.0f, 6.86f);
        pathBuilder2.lineToRelative(3.0f, -1.16f);
        pathBuilder2.verticalLineToRelative(11.84f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _map = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
