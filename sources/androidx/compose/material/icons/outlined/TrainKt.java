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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_train", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Train", "Landroidx/compose/material/icons/Icons$Outlined;", "getTrain", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Train.kt */
public final class TrainKt {
    private static ImageVector _train;

    public static final ImageVector getTrain(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _train;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("Outlined.Train", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.5f, 14.5f);
        pathBuilder.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.5f, 14.5f);
        pathBuilder3.moveToRelative(-1.5f, 0.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 2.0f);
        pathBuilder5.curveToRelative(-4.0f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilder5.verticalLineToRelative(9.5f);
        pathBuilder5.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        pathBuilder5.lineTo(6.0f, 20.5f);
        pathBuilder5.verticalLineToRelative(0.5f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.lineToRelative(2.0f, -2.0f);
        pathBuilder5.horizontalLineToRelative(4.0f);
        pathBuilder5.lineToRelative(2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineToRelative(-0.5f);
        pathBuilder5.lineTo(16.5f, 19.0f);
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder5.lineTo(20.0f, 6.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.0f, -3.5f, -4.0f, -4.0f, -8.0f, -4.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 4.0f);
        pathBuilder6.curveToRelative(3.51f, 0.0f, 4.96f, 0.48f, 5.57f, 1.0f);
        pathBuilder5.lineTo(6.43f, 5.0f);
        PathBuilder pathBuilder7 = pathBuilder5;
        pathBuilder7.curveToRelative(0.61f, -0.52f, 2.06f, -1.0f, 5.57f, -1.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(6.0f, 7.0f);
        pathBuilder5.horizontalLineToRelative(5.0f);
        pathBuilder5.verticalLineToRelative(3.0f);
        pathBuilder5.lineTo(6.0f, 10.0f);
        pathBuilder5.lineTo(6.0f, 7.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 15.5f);
        pathBuilder7.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder5.horizontalLineToRelative(-9.0f);
        pathBuilder5.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder5.lineTo(6.0f, 12.0f);
        pathBuilder5.horizontalLineToRelative(12.0f);
        pathBuilder5.verticalLineToRelative(3.5f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 10.0f);
        pathBuilder5.horizontalLineToRelative(-5.0f);
        pathBuilder5.lineTo(13.0f, 7.0f);
        pathBuilder5.horizontalLineToRelative(5.0f);
        pathBuilder5.verticalLineToRelative(3.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _train = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
