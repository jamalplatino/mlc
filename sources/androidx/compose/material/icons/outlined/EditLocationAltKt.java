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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editLocationAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditLocationAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getEditLocationAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EditLocationAlt.kt */
public final class EditLocationAltKt {
    private static ImageVector _editLocationAlt;

    public static final ImageVector getEditLocationAlt(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _editLocationAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.EditLocationAlt", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.12f);
        pathBuilder.lineToRelative(6.16f, -6.16f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineTo(11.0f, 8.88f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.71f, 2.0f);
        pathBuilder.lineTo(20.0f, 1.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.72f, 0.72f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(0.72f, -0.72f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.9f, 9.05f);
        pathBuilder2.curveTo(17.96f, 9.41f, 18.0f, 9.79f, 18.0f, 10.2f);
        pathBuilder2.curveToRelative(0.0f, 1.71f, -1.08f, 4.64f, -6.0f, 9.14f);
        pathBuilder2.curveToRelative(-4.92f, -4.49f, -6.0f, -7.43f, -6.0f, -9.14f);
        pathBuilder2.curveTo(6.0f, 6.17f, 9.09f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(0.32f, 0.0f, 0.65f, 0.03f, 0.97f, 0.08f);
        pathBuilder.lineToRelative(1.65f, -1.65f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        pathBuilder3.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        pathBuilder3.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        pathBuilder3.curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f);
        pathBuilder.lineTo(17.9f, 9.05f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _editLocationAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
