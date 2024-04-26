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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_editRoad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditRoad", "Landroidx/compose/material/icons/Icons$Rounded;", "getEditRoad", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EditRoad.kt */
public final class EditRoadKt {
    private static ImageVector _editRoad;

    public static final ImageVector getEditRoad(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _editRoad;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = r1;
        ImageVector.Builder builder7 = new ImageVector.Builder("Rounded.EditRoad", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 4.0f);
        pathBuilder.lineTo(17.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(6.9f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder2.curveTo(18.0f, 4.45f, 17.55f, 4.0f, 17.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder6, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(5.0f, 20.0f);
        pathBuilder3.lineTo(5.0f, 20.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder4.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder4.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder4.curveTo(4.0f, 19.55f, 4.45f, 20.0f, 5.0f, 20.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(11.0f, 8.0f);
        pathBuilder5.lineTo(11.0f, 8.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder6.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder6.curveTo(10.0f, 7.55f, 10.45f, 8.0f, 11.0f, 8.0f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(11.0f, 14.0f);
        pathBuilder7.lineTo(11.0f, 14.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder7.verticalLineToRelative(-2.0f);
        pathBuilder8.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder7.horizontalLineToRelative(0.0f);
        pathBuilder8.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder7.verticalLineToRelative(2.0f);
        pathBuilder8.curveTo(10.0f, 13.55f, 10.45f, 14.0f, 11.0f, 14.0f);
        pathBuilder7.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(11.0f, 20.0f);
        pathBuilder9.lineTo(11.0f, 20.0f);
        PathBuilder pathBuilder10 = pathBuilder9;
        pathBuilder10.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder9.verticalLineToRelative(-2.0f);
        pathBuilder10.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder9.horizontalLineToRelative(0.0f);
        pathBuilder10.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder9.verticalLineToRelative(2.0f);
        pathBuilder10.curveTo(10.0f, 19.55f, 10.45f, 20.0f, 11.0f, 20.0f);
        pathBuilder9.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r107 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r108 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder11 = new PathBuilder();
        pathBuilder11.moveTo(22.56f, 12.59f);
        pathBuilder11.lineToRelative(-1.15f, -1.15f);
        pathBuilder11.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        pathBuilder11.lineTo(14.0f, 16.73f);
        pathBuilder11.verticalLineToRelative(2.77f);
        pathBuilder11.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder11.horizontalLineToRelative(2.77f);
        pathBuilder11.lineToRelative(5.29f, -5.29f);
        pathBuilder11.curveTo(23.15f, 14.12f, 23.15f, 13.17f, 22.56f, 12.59f);
        pathBuilder11.close();
        pathBuilder11.moveTo(16.58f, 18.45f);
        pathBuilder11.horizontalLineToRelative(-1.03f);
        pathBuilder11.verticalLineToRelative(-1.03f);
        pathBuilder11.lineTo(19.0f, 13.97f);
        pathBuilder11.lineTo(20.03f, 15.0f);
        pathBuilder11.lineTo(16.58f, 18.45f);
        pathBuilder11.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder11.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r107, r108, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _editRoad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}