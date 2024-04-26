package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_extension", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Extension", "Landroidx/compose/material/icons/Icons$Sharp;", "getExtension", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Extension.kt */
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Extension", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.36f, 11.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(3.64f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        pathBuilder2.curveTo(9.26f, 0.86f, 8.0f, 2.03f, 8.0f, 3.5f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(2.01f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.horizontalLineTo(3.4f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.31f, 0.0f, 2.5f, 0.88f, 2.75f, 2.16f);
        pathBuilder3.curveToRelative(0.33f, 1.72f, -0.98f, 3.24f, -2.65f, 3.24f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.verticalLineToRelative(-1.4f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -1.31f, 0.88f, -2.5f, 2.16f, -2.75f);
        pathBuilder4.curveToRelative(1.72f, -0.33f, 3.24f, 0.98f, 3.24f, 2.65f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f);
        pathBuilder5.curveToRelative(-0.13f, -1.3f, -1.33f, -2.24f, -2.63f, -2.24f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _extension = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}