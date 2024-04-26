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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedroomBaby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomBaby", "Landroidx/compose/material/icons/Icons$Outlined;", "getBedroomBaby", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BedroomBaby.kt */
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.BedroomBaby", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.94f, 14.04f);
        pathBuilder.curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f);
        pathBuilder.lineTo(16.0f, 13.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(-5.62f);
        pathBuilder.lineTo(9.65f, 7.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.lineToRelative(1.0f, 0.76f);
        pathBuilder.lineTo(5.5f, 9.5f);
        pathBuilder.lineToRelative(0.95f, 1.0f);
        pathBuilder.lineTo(8.0f, 9.51f);
        pathBuilder.verticalLineToRelative(3.99f);
        pathBuilder.lineToRelative(-0.84f, 1.46f);
        pathBuilder.curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f);
        pathBuilder.lineTo(5.0f, 15.1f);
        pathBuilder.curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7.0f, 2.9f);
        pathBuilder.reflectiveCurveToRelative(5.13f, -1.03f, 7.0f, -2.9f);
        pathBuilder.lineTo(17.94f, 14.04f);
        pathBuilder.close();
        pathBuilder.moveTo(8.45f, 15.71f);
        pathBuilder.lineToRelative(0.03f, -0.06f);
        pathBuilder.lineToRelative(0.81f, -1.41f);
        pathBuilder.curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0.0f);
        pathBuilder.lineToRelative(0.81f, 1.41f);
        pathBuilder.lineToRelative(0.03f, 0.06f);
        pathBuilder.curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f);
        pathBuilder.reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder2.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bedroomBaby = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
