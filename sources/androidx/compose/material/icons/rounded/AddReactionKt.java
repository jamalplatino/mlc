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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addReaction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddReaction", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddReaction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddReaction.kt */
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.AddReaction", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveTo(23.55f, 3.0f, 24.0f, 3.45f, 24.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.52f, 8.95f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(21.83f, 9.91f, 22.0f, 10.94f, 22.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder5.curveToRelative(1.5f, 0.0f, 2.92f, 0.34f, 4.2f, 0.94f);
        pathBuilder5.curveTo(16.08f, 3.27f, 16.0f, 3.62f, 16.0f, 4.0f);
        pathBuilder5.curveToRelative(0.0f, 1.35f, 0.9f, 2.5f, 2.13f, 2.87f);
        pathBuilder5.curveTo(18.5f, 8.1f, 19.65f, 9.0f, 21.0f, 9.0f);
        pathBuilder5.curveTo(21.18f, 9.0f, 21.35f, 8.98f, 21.52f, 8.95f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 9.5f);
        pathBuilder5.curveTo(7.0f, 10.33f, 7.67f, 11.0f, 8.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 10.33f, 10.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 8.0f, 8.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 8.67f, 7.0f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.31f, 14.0f);
        pathBuilder.horizontalLineTo(7.69f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.44f, 0.75f);
        pathBuilder6.curveTo(8.2f, 16.39f, 9.97f, 17.5f, 12.0f, 17.5f);
        pathBuilder.reflectiveCurveToRelative(3.8f, -1.11f, 4.75f, -2.75f);
        PathBuilder pathBuilder7 = pathBuilder;
        pathBuilder7.curveTo(16.94f, 14.42f, 16.7f, 14.0f, 16.31f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 9.5f);
        pathBuilder7.curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.0f, 10.33f, 17.0f, 9.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addReaction = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
