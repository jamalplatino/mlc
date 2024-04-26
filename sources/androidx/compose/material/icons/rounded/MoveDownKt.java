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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_moveDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MoveDown", "Landroidx/compose/material/icons/Icons$Rounded;", "getMoveDown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MoveDown.kt */
public final class MoveDownKt {
    private static ImageVector _moveDown;

    public static final ImageVector getMoveDown(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _moveDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Rounded.MoveDown", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.01f, 10.72f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.14f, 2.57f, 1.66f, 4.73f, 4.07f, 5.18f);
        pathBuilder.lineToRelative(-0.79f, -0.79f);
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.59f, 2.59f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(7.71f, 20.3f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.lineToRelative(0.0f, -0.06f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-3.64f, -0.43f, -6.43f, -3.65f, -6.15f, -7.47f);
        pathBuilder4.curveTo(1.29f, 6.78f, 4.55f, 4.0f, 8.26f, 4.0f);
        pathBuilder.lineTo(10.0f, 4.0f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(8.22f, 6.0f);
        pathBuilder5.curveTo(5.52f, 6.0f, 3.15f, 8.04f, 3.01f, 10.72f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(15.0f, 11.0f);
        pathBuilder6.horizontalLineToRelative(5.0f);
        PathBuilder pathBuilder7 = pathBuilder6;
        pathBuilder7.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder6.verticalLineTo(6.0f);
        pathBuilder7.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder6.horizontalLineToRelative(-5.0f);
        pathBuilder7.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder6.verticalLineToRelative(3.0f);
        pathBuilder7.curveTo(13.0f, 10.1f, 13.9f, 11.0f, 15.0f, 11.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(20.0f, 9.0f);
        pathBuilder6.horizontalLineToRelative(-5.0f);
        pathBuilder6.verticalLineTo(6.0f);
        pathBuilder6.horizontalLineToRelative(5.0f);
        pathBuilder6.verticalLineTo(9.0f);
        pathBuilder6.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(20.0f, 20.0f);
        pathBuilder8.horizontalLineToRelative(-5.0f);
        PathBuilder pathBuilder9 = pathBuilder8;
        pathBuilder9.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder8.verticalLineToRelative(-3.0f);
        pathBuilder9.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder8.horizontalLineToRelative(5.0f);
        pathBuilder9.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder8.verticalLineToRelative(3.0f);
        pathBuilder9.curveTo(22.0f, 19.1f, 21.1f, 20.0f, 20.0f, 20.0f);
        pathBuilder8.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder8.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _moveDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
