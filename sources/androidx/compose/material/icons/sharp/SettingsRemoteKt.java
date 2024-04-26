package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsRemote", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsRemote", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsRemote", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SettingsRemote.kt */
public final class SettingsRemoteKt {
    private static ImageVector _settingsRemote;

    public static final ImageVector getSettingsRemote(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _settingsRemote;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.SettingsRemote", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 9.0f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.05f, 6.05f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder2.curveTo(7.26f, 3.01f, 9.51f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settingsRemote = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
