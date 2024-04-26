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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_eco", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Eco", "Landroidx/compose/material/icons/Icons$Rounded;", "getEco", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Eco.kt */
public final class EcoKt {
    private static ImageVector _eco;

    public static final ImageVector getEco(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _eco;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.Eco", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.95f, 5.97f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.05f, -1.04f, -0.89f, -1.88f, -1.92f, -1.92f);
        pathBuilder2.curveTo(17.33f, 4.02f, 16.66f, 4.0f, 16.01f, 4.0f);
        pathBuilder2.curveTo(10.98f, 4.0f, 7.49f, 4.97f, 5.55f, 6.91f);
        pathBuilder2.curveToRelative(-3.68f, 3.68f, -3.15f, 8.9f, 0.09f, 11.9f);
        pathBuilder2.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.0f);
        pathBuilder2.curveToRelative(1.51f, -4.22f, 4.52f, -7.16f, 7.67f, -8.8f);
        pathBuilder2.curveToRelative(-0.21f, 0.18f, -4.7f, 3.58f, -5.51f, 10.25f);
        pathBuilder2.curveToRelative(1.05f, 0.48f, 2.2f, 0.75f, 3.36f, 0.75f);
        pathBuilder2.curveToRelative(2.05f, 0.0f, 4.16f, -0.8f, 5.92f, -2.55f);
        pathBuilder2.curveTo(19.28f, 16.26f, 20.23f, 12.1f, 19.95f, 5.97f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _eco = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
