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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_followTheSigns", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FollowTheSigns", "Landroidx/compose/material/icons/Icons$Rounded;", "getFollowTheSigns", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FollowTheSigns.kt */
public final class FollowTheSignsKt {
    private static ImageVector _followTheSigns;

    public static final ImageVector getFollowTheSigns(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _followTheSigns;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.FollowTheSigns", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 5.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.75f, 8.9f);
        pathBuilder.lineTo(3.23f, 21.81f);
        pathBuilder.curveTo(3.11f, 22.43f, 3.58f, 23.0f, 4.21f, 23.0f);
        pathBuilder.horizontalLineTo(4.3f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.88f, -0.33f, 0.98f, -0.79f);
        pathBuilder.lineTo(6.85f, 15.0f);
        pathBuilder.lineTo(9.0f, 17.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.14f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineTo(8.95f, 13.4f);
        pathBuilder.lineToRelative(0.6f, -3.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.07f, 1.32f, 2.58f, 2.23f, 4.31f, 2.51f);
        pathBuilder3.curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f);
        pathBuilder3.curveToRelative(-1.49f, -0.25f, -2.75f, -1.15f, -3.51f, -2.38f);
        pathBuilder.lineTo(9.7f, 6.95f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        pathBuilder4.curveTo(7.75f, 6.0f, 7.5f, 6.05f, 7.25f, 6.15f);
        pathBuilder.lineToRelative(-4.63f, 1.9f);
        pathBuilder.curveTo(2.25f, 8.2f, 2.0f, 8.57f, 2.0f, 8.97f);
        pathBuilder.verticalLineTo(12.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineTo(5.75f, 8.9f);
        pathBuilder.moveTo(21.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder6.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.75f);
        pathBuilder.verticalLineToRelative(13.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveTo(22.0f, 2.45f, 21.55f, 2.0f, 21.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.15f, 5.85f);
        pathBuilder.lineToRelative(-1.28f, 1.29f);
        pathBuilder.curveToRelative(-0.31f, 0.32f, -0.85f, 0.09f, -0.85f, -0.35f);
        pathBuilder.verticalLineTo(6.25f);
        pathBuilder.horizontalLineToRelative(-2.76f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(2.76f);
        pathBuilder.verticalLineTo(4.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(1.28f, 1.29f);
        pathBuilder.curveTo(20.34f, 5.34f, 20.34f, 5.66f, 20.15f, 5.85f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _followTheSigns = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
