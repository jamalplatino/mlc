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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mediaBluetoothOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MediaBluetoothOn", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMediaBluetoothOn", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MediaBluetoothOn.kt */
public final class MediaBluetoothOnKt {
    private static ImageVector _mediaBluetoothOn;

    public static final ImageVector getMediaBluetoothOn(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _mediaBluetoothOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.MediaBluetoothOn", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 3.0f);
        pathBuilder.lineToRelative(0.01f, 10.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f);
        pathBuilder2.curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.43f);
        pathBuilder.lineTo(17.57f, 9.0f);
        pathBuilder.horizontalLineToRelative(-0.6f);
        pathBuilder.verticalLineToRelative(4.55f);
        pathBuilder.lineToRelative(-2.75f, -2.75f);
        pathBuilder.lineToRelative(-0.85f, 0.85f);
        pathBuilder.lineTo(16.73f, 15.0f);
        pathBuilder.lineToRelative(-3.35f, 3.35f);
        pathBuilder.lineToRelative(0.85f, 0.85f);
        pathBuilder.lineToRelative(2.75f, -2.75f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(0.6f);
        pathBuilder.lineTo(21.0f, 17.57f);
        pathBuilder.lineTo(18.42f, 15.0f);
        pathBuilder.lineTo(21.0f, 12.43f);
        pathBuilder.close();
        pathBuilder.moveTo(18.17f, 11.3f);
        pathBuilder.lineToRelative(1.13f, 1.13f);
        pathBuilder.lineToRelative(-1.13f, 1.13f);
        pathBuilder.verticalLineTo(11.3f);
        pathBuilder.close();
        pathBuilder.moveTo(19.3f, 17.57f);
        pathBuilder.lineToRelative(-1.13f, 1.13f);
        pathBuilder.verticalLineToRelative(-2.26f);
        pathBuilder.lineTo(19.3f, 17.57f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _mediaBluetoothOn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
