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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothDrive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothDrive", "Landroidx/compose/material/icons/Icons$Rounded;", "getBluetoothDrive", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BluetoothDrive.kt */
public final class BluetoothDriveKt {
    private static ImageVector _bluetoothDrive;

    public static final ImageVector getBluetoothDrive(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _bluetoothDrive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.BluetoothDrive", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.85f, 6.0f);
        pathBuilder.lineToRelative(1.8f, -1.8f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(19.5f, 1.36f);
        pathBuilder.curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f);
        pathBuilder.verticalLineToRelative(3.08f);
        pathBuilder.lineTo(16.7f, 2.85f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        pathBuilder2.curveToRelative(-0.19f, 0.19f, -0.19f, 0.51f, 0.0f, 0.7f);
        pathBuilder.lineTo(18.44f, 6.0f);
        pathBuilder.lineTo(16.0f, 8.44f);
        pathBuilder.curveToRelative(-0.19f, 0.19f, -0.19f, 0.5f, 0.0f, 0.7f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.0f);
        pathBuilder.lineToRelative(1.95f, -1.95f);
        pathBuilder.verticalLineToRelative(3.09f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.14f, -2.15f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(19.85f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 2.91f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.verticalLineTo(2.91f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 9.08f);
        pathBuilder.verticalLineTo(7.2f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineTo(19.65f, 9.08f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 10.0f);
        pathBuilder3.horizontalLineTo(4.81f);
        pathBuilder3.lineToRelative(1.04f, -3.0f);
        pathBuilder3.horizontalLineTo(15.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineTo(5.5f);
        pathBuilder3.curveTo(4.84f, 5.0f, 4.29f, 5.42f, 4.08f, 6.01f);
        pathBuilder3.lineTo(2.0f, 12.0f);
        pathBuilder3.verticalLineToRelative(7.5f);
        pathBuilder3.curveTo(2.0f, 20.33f, 2.67f, 21.0f, 3.5f, 21.0f);
        pathBuilder3.reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineToRelative(0.5f);
        pathBuilder3.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder3.verticalLineTo(12.0f);
        pathBuilder3.horizontalLineToRelative(-3.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(15.9f, 12.0f, 15.0f, 11.1f, 15.0f, 10.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.5f, 16.0f);
        pathBuilder4.curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f);
        pathBuilder3.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        pathBuilder3.reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f);
        pathBuilder3.reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.5f, 16.0f);
        pathBuilder3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder3.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _bluetoothDrive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}