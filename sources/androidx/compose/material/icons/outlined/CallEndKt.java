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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_callEnd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CallEnd", "Landroidx/compose/material/icons/Icons$Outlined;", "getCallEnd", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CallEnd.kt */
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.CallEnd", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.59f, 10.52f);
        pathBuilder.curveToRelative(1.05f, 0.51f, 2.04f, 1.15f, 2.96f, 1.91f);
        pathBuilder.lineToRelative(-1.07f, 1.07f);
        pathBuilder.curveToRelative(-0.58f, -0.47f, -1.21f, -0.89f, -1.88f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.moveToRelative(-13.2f, 0.0f);
        pathBuilder.verticalLineToRelative(1.7f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.65f, 0.37f, -1.28f, 0.79f, -1.87f, 1.27f);
        pathBuilder.lineToRelative(-1.07f, -1.07f);
        pathBuilder2.curveToRelative(0.91f, -0.75f, 1.9f, -1.38f, 2.94f, -1.9f);
        pathBuilder.moveTo(12.0f, 7.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(7.46f, 7.0f, 3.34f, 8.78f, 0.29f, 11.67f);
        pathBuilder3.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.7f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder4.curveToRelative(0.27f, 0.0f, 0.52f, -0.1f, 0.7f, -0.28f);
        pathBuilder4.curveToRelative(0.79f, -0.73f, 1.68f, -1.36f, 2.66f, -1.85f);
        pathBuilder4.curveToRelative(0.33f, -0.16f, 0.56f, -0.51f, 0.56f, -0.9f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveTo(8.85f, 9.25f, 10.4f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(3.15f, 0.25f, 4.59f, 0.73f);
        pathBuilder.verticalLineToRelative(3.1f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.4f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder5.curveToRelative(0.98f, 0.49f, 1.88f, 1.11f, 2.67f, 1.85f);
        pathBuilder5.curveToRelative(0.18f, 0.17f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder5.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder.lineToRelative(2.48f, -2.48f);
        pathBuilder.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(-0.11f, -0.53f, -0.29f, -0.71f);
        pathBuilder.curveTo(20.66f, 8.78f, 16.54f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _callEnd = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
