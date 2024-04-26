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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkSetup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkSetup", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhonelinkSetup", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PhonelinkSetup.kt */
public final class PhonelinkSetupKt {
    private static ImageVector _phonelinkSetup;

    public static final ImageVector getPhonelinkSetup(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _phonelinkSetup;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.PhonelinkSetup", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(9.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(9.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 15.5f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.lineToRelative(1.01f, 0.39f);
        pathBuilder3.curveToRelative(0.23f, 0.09f, 0.49f, 0.0f, 0.61f, -0.22f);
        pathBuilder.lineToRelative(0.84f, -1.46f);
        pathBuilder3.curveToRelative(0.12f, -0.21f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilder.lineToRelative(-0.85f, -0.68f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder3.curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f);
        pathBuilder.reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.lineToRelative(0.85f, -0.68f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.19f, -0.15f, 0.24f, -0.43f, 0.12f, -0.64f);
        pathBuilder.lineToRelative(-0.84f, -1.46f);
        pathBuilder4.curveToRelative(-0.12f, -0.21f, -0.38f, -0.31f, -0.61f, -0.22f);
        pathBuilder.lineToRelative(-1.01f, 0.39f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.curveToRelative(-0.25f, -0.17f, -0.51f, -0.34f, -0.8f, -0.46f);
        pathBuilder.lineToRelative(-0.17f, -1.08f);
        pathBuilder.curveTo(9.3f, 7.18f, 9.09f, 7.0f, 8.84f, 7.0f);
        pathBuilder.lineTo(7.16f, 7.0f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilder.lineTo(6.5f, 8.5f);
        pathBuilder.curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.lineToRelative(-1.02f, -0.39f);
        pathBuilder.curveToRelative(-0.23f, -0.09f, -0.49f, 0.0f, -0.61f, 0.22f);
        pathBuilder.lineToRelative(-0.84f, 1.46f);
        pathBuilder.curveToRelative(-0.12f, 0.21f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilder.lineToRelative(0.85f, 0.68f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveToRelative(-0.02f, 0.15f, -0.05f, 0.31f, -0.05f, 0.47f);
        pathBuilder.reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f);
        pathBuilder.lineToRelative(-0.02f, -0.03f);
        pathBuilder.lineToRelative(-0.85f, 0.68f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.24f, 0.43f, -0.12f, 0.64f);
        pathBuilder.lineToRelative(0.84f, 1.46f);
        pathBuilder.curveToRelative(0.12f, 0.21f, 0.38f, 0.31f, 0.61f, 0.22f);
        pathBuilder.lineToRelative(1.01f, -0.39f);
        pathBuilder.lineToRelative(-0.01f, -0.04f);
        pathBuilder.curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f);
        pathBuilder.lineToRelative(0.17f, 1.07f);
        pathBuilder.curveToRelative(0.03f, 0.25f, 0.24f, 0.43f, 0.49f, 0.43f);
        pathBuilder.horizontalLineToRelative(1.68f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        pathBuilder.lineToRelative(0.17f, -1.08f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _phonelinkSetup = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
