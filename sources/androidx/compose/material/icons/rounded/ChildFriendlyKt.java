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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_childFriendly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChildFriendly", "Landroidx/compose/material/icons/Icons$Rounded;", "getChildFriendly", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChildFriendly.kt */
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ChildFriendly", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.08f);
        pathBuilder.lineTo(13.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -4.03f, -2.98f, -7.37f, -6.86f, -7.92f);
        pathBuilder2.curveToRelative(-0.6f, -0.09f, -1.14f, 0.39f, -1.14f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.32f, 15.89f);
        pathBuilder.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        pathBuilder.lineTo(6.44f, 11.0f);
        pathBuilder.lineToRelative(-0.68f, -1.43f);
        pathBuilder.curveTo(5.6f, 9.22f, 5.24f, 9.0f, 4.86f, 9.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.22f);
        pathBuilder.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-1.33f, 0.71f, -2.14f, 2.27f, -1.74f, 3.94f);
        pathBuilder3.curveToRelative(0.3f, 1.26f, 1.34f, 2.27f, 2.6f, 2.55f);
        pathBuilder3.curveToRelative(2.1f, 0.46f, 3.98f, -0.96f, 4.25f, -2.91f);
        pathBuilder.horizontalLineToRelative(2.08f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.27f, 1.94f, 2.14f, 3.36f, 4.22f, 2.92f);
        pathBuilder4.curveToRelative(1.27f, -0.27f, 2.31f, -1.27f, 2.63f, -2.53f);
        pathBuilder4.curveToRelative(0.35f, -1.39f, -0.14f, -2.68f, -1.06f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 20.0f);
        pathBuilder4.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.83f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _childFriendly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
