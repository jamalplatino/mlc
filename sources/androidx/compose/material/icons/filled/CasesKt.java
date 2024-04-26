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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cases", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cases", "Landroidx/compose/material/icons/Icons$Filled;", "getCases", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Cases.kt */
public final class CasesKt {
    private static ImageVector _cases;

    public static final ImageVector getCases(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _cases;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Cases", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 6.0f);
        pathBuilder.lineTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 6.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.98f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 9.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.53f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 1.0f, 0.54f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineTo(11.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.lineTo(5.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cases = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
