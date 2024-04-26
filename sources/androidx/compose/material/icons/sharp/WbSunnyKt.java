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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbSunny", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbSunny", "Landroidx/compose/material/icons/Icons$Sharp;", "getWbSunny", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WbSunny.kt */
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.WbSunny", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.76f, 4.84f);
        pathBuilder.lineToRelative(-1.8f, -1.79f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 10.5f);
        pathBuilder.lineTo(1.0f, 10.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 0.55f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(11.0f, 3.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(13.0f, 0.55f);
        pathBuilder.close();
        pathBuilder.moveTo(20.45f, 4.46f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.79f, 1.79f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.79f, -1.79f);
        pathBuilder.close();
        pathBuilder.moveTo(17.24f, 18.16f);
        pathBuilder.lineToRelative(1.79f, 1.8f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.8f, -1.79f);
        pathBuilder.lineToRelative(-1.4f, 1.4f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 10.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 22.45f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(13.0f, 19.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.95f);
        pathBuilder.close();
        pathBuilder.moveTo(3.55f, 18.54f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.79f, -1.8f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.79f, 1.8f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _wbSunny = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}