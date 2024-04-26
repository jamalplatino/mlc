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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noAccounts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoAccounts", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoAccounts", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NoAccounts.kt */
public final class NoAccountsKt {
    private static ImageVector _noAccounts;

    public static final ImageVector getNoAccounts(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _noAccounts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.NoAccounts", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.52f, 0.0f, -1.0f, 0.12f, -1.44f, 0.32f);
        pathBuilder.lineToRelative(4.62f, 4.62f);
        pathBuilder2.curveToRelative(0.2f, -0.44f, 0.32f, -0.92f, 0.32f, -1.44f);
        pathBuilder2.curveTo(15.5f, 7.57f, 13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        pathBuilder.lineToRelative(2.86f, 2.86f);
        pathBuilder3.curveToRelative(0.21f, 1.56f, 1.43f, 2.79f, 2.99f, 2.99f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder3.curveTo(13.17f, 15.05f, 12.59f, 15.0f, 12.0f, 15.0f);
        pathBuilder3.curveToRelative(-2.32f, 0.0f, -4.45f, 0.8f, -6.14f, 2.12f);
        pathBuilder3.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder3.curveToRelative(-1.74f, 0.0f, -3.34f, -0.56f, -4.65f, -1.5f);
        pathBuilder3.curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f);
        pathBuilder3.curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.31f, 16.9f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder3.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder3.curveTo(20.0f, 13.85f, 19.37f, 15.54f, 18.31f, 16.9f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.35f, 18.5f);
        pathBuilder4.curveTo(8.66f, 19.44f, 10.26f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.reflectiveCurveToRelative(3.34f, -0.56f, 4.65f, -1.5f);
        pathBuilder4.curveTo(15.34f, 17.56f, 13.74f, 17.0f, 12.0f, 17.0f);
        pathBuilder4.reflectiveCurveTo(8.66f, 17.56f, 7.35f, 18.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.18f, 10.94f);
        pathBuilder4.lineToRelative(-4.62f, -4.62f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(11.0f, 6.12f, 11.48f, 6.0f, 12.0f, 6.0f);
        pathBuilder5.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder5.curveTo(15.5f, 10.02f, 15.38f, 10.5f, 15.18f, 10.94f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _noAccounts = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
