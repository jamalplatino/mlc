package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellTower", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCellTower", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CellTower.kt */
public final class CellTowerKt {
    private static ImageVector _cellTower;

    public static final ImageVector getCellTower(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = new ImageVector.Builder("TwoTone.CellTower", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.3f, 14.7f);
        pathBuilder.lineToRelative(1.2f, -1.2f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.0f, -1.0f, -1.5f, -2.3f, -1.5f, -3.5f);
        pathBuilder2.curveToRelative(0.0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f);
        pathBuilder.lineTo(7.3f, 5.3f);
        pathBuilder.curveToRelative(-1.3f, 1.3f, -2.0f, 3.0f, -2.0f, 4.7f);
        pathBuilder.reflectiveCurveTo(6.0f, 13.4f, 7.3f, 14.7f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.1f, 2.9f);
        pathBuilder3.lineToRelative(-1.2f, 1.2f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f);
        pathBuilder4.curveToRelative(0.0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f);
        pathBuilder3.lineToRelative(1.2f, 1.2f);
        pathBuilder4.curveToRelative(2.0f, -2.0f, 2.9f, -4.5f, 2.9f, -7.1f);
        pathBuilder4.curveTo(22.0f, 7.4f, 21.0f, 4.9f, 19.1f, 2.9f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(6.1f, 4.1f);
        pathBuilder5.lineTo(4.9f, 2.9f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveTo(3.0f, 4.9f, 2.0f, 7.4f, 2.0f, 10.0f);
        pathBuilder6.curveToRelative(0.0f, 2.6f, 1.0f, 5.1f, 2.9f, 7.1f);
        pathBuilder5.lineToRelative(1.2f, -1.2f);
        pathBuilder6.curveToRelative(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f);
        pathBuilder6.curveTo(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(16.7f, 14.7f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(1.3f, -1.3f, 2.0f, -3.0f, 2.0f, -4.7f);
        pathBuilder8.curveToRelative(-0.1f, -1.7f, -0.7f, -3.4f, -2.0f, -4.7f);
        pathBuilder7.lineToRelative(-1.2f, 1.2f);
        pathBuilder8.curveToRelative(1.0f, 1.0f, 1.5f, 2.3f, 1.5f, 3.5f);
        pathBuilder8.curveToRelative(0.0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f);
        pathBuilder7.lineTo(16.7f, 14.7f);
        pathBuilder7.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(14.5f, 10.0f);
        pathBuilder9.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder9.reflectiveCurveTo(9.5f, 8.62f, 9.5f, 10.0f);
        pathBuilder9.curveToRelative(0.0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f);
        pathBuilder9.lineTo(7.0f, 22.0f);
        pathBuilder9.horizontalLineToRelative(2.0f);
        pathBuilder9.lineToRelative(0.67f, -2.0f);
        pathBuilder9.horizontalLineToRelative(4.67f);
        pathBuilder9.lineTo(15.0f, 22.0f);
        pathBuilder9.horizontalLineToRelative(2.0f);
        pathBuilder9.lineToRelative(-3.37f, -10.12f);
        pathBuilder9.curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        pathBuilder9.close();
        pathBuilder9.moveTo(10.33f, 18.0f);
        pathBuilder9.lineTo(12.0f, 13.0f);
        pathBuilder9.lineToRelative(1.67f, 5.0f);
        pathBuilder9.horizontalLineTo(10.33f);
        pathBuilder9.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cellTower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
