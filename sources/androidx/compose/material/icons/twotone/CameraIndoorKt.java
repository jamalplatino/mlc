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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cameraIndoor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CameraIndoor", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCameraIndoor", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraIndoor.kt */
public final class CameraIndoorKt {
    private static ImageVector _cameraIndoor;

    public static final ImageVector getCameraIndoor(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _cameraIndoor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.CameraIndoor", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 10.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.lineToRelative(-6.0f, -4.5f);
        pathBuilder.lineTo(6.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineToRelative(2.0f, -1.06f);
        pathBuilder.verticalLineToRelative(4.12f);
        pathBuilder.lineTo(14.0f, 15.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder3.curveTo(13.55f, 11.0f, 14.0f, 11.45f, 14.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.0f, 12.0f);
        pathBuilder4.verticalLineToRelative(4.0f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder4.verticalLineToRelative(-1.0f);
        pathBuilder4.lineToRelative(2.0f, 1.06f);
        pathBuilder4.verticalLineToRelative(-4.12f);
        pathBuilder4.lineTo(14.0f, 13.0f);
        pathBuilder4.verticalLineToRelative(-1.0f);
        pathBuilder5.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder4.horizontalLineTo(9.0f);
        pathBuilder5.curveTo(8.45f, 11.0f, 8.0f, 11.45f, 8.0f, 12.0f);
        pathBuilder4.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(12.0f, 3.0f);
        pathBuilder6.lineTo(4.0f, 9.0f);
        pathBuilder6.verticalLineToRelative(12.0f);
        pathBuilder6.horizontalLineToRelative(16.0f);
        pathBuilder6.verticalLineTo(9.0f);
        pathBuilder6.lineTo(12.0f, 3.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(18.0f, 19.0f);
        pathBuilder6.horizontalLineTo(6.0f);
        pathBuilder6.verticalLineToRelative(-9.0f);
        pathBuilder6.lineToRelative(6.0f, -4.5f);
        pathBuilder6.lineToRelative(6.0f, 4.5f);
        pathBuilder6.verticalLineTo(19.0f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder6.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _cameraIndoor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
