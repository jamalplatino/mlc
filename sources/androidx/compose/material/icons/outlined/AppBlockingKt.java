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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appBlocking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppBlocking", "Landroidx/compose/material/icons/Icons$Outlined;", "getAppBlocking", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppBlocking.kt */
public final class AppBlockingKt {
    private static ImageVector _appBlocking;

    public static final ImageVector getAppBlocking(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _appBlocking;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.AppBlocking", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 8.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(22.0f, 9.79f, 20.21f, 8.0f, 18.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder3.curveToRelative(0.42f, 0.0f, 0.8f, 0.11f, 1.15f, 0.29f);
        pathBuilder.lineToRelative(-3.36f, 3.36f);
        pathBuilder3.curveTo(15.61f, 12.8f, 15.5f, 12.42f, 15.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.5f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.42f, 0.0f, -0.8f, -0.11f, -1.15f, -0.29f);
        pathBuilder.lineToRelative(3.36f, -3.36f);
        pathBuilder4.curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f);
        pathBuilder4.curveTo(20.5f, 13.38f, 19.38f, 14.5f, 18.0f, 14.5f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.0f, 18.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineTo(6.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineToRelative(1.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineTo(6.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.verticalLineTo(3.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder6.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder5.verticalLineToRelative(18.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineToRelative(-2.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.horizontalLineToRelative(-2.0f);
        pathBuilder5.verticalLineTo(18.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(7.0f, 3.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineToRelative(1.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineTo(3.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 21.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineTo(21.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _appBlocking = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
