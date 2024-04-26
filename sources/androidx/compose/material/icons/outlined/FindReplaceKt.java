package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_findReplace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FindReplace", "Landroidx/compose/material/icons/Icons$Outlined;", "getFindReplace", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FindReplace.kt */
public final class FindReplaceKt {
    private static ImageVector _findReplace;

    public static final ImageVector getFindReplace(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _findReplace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.FindReplace", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        pathBuilder.lineTo(12.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(-2.05f, 2.05f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        pathBuilder2.curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        pathBuilder.lineTo(6.1f, 10.0f);
        pathBuilder.curveToRelative(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.64f, 15.14f);
        pathBuilder.curveToRelative(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f);
        pathBuilder.lineTo(15.9f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilder3.curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.lineTo(4.0f, 12.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(2.05f, -2.05f);
        pathBuilder3.curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        pathBuilder3.curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        pathBuilder.lineTo(20.0f, 21.49f);
        pathBuilder.lineTo(21.49f, 20.0f);
        pathBuilder.lineToRelative(-4.85f, -4.86f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _findReplace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
