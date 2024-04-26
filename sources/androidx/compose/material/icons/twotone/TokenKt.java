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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_token", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Token", "Landroidx/compose/material/icons/Icons$TwoTone;", "getToken", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Token.kt */
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _token;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Token", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.29f);
        pathBuilder.lineToRelative(5.91f, 3.28f);
        pathBuilder.lineTo(14.9f, 9.24f);
        pathBuilder.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder.lineTo(6.09f, 7.57f);
        pathBuilder.lineTo(12.0f, 4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.16f);
        pathBuilder.lineToRelative(-6.0f, -3.33f);
        pathBuilder.verticalLineTo(9.26f);
        pathBuilder.lineToRelative(3.13f, 1.74f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder.verticalLineTo(19.16f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.16f);
        pathBuilder.verticalLineToRelative(-3.28f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder3.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder.lineTo(19.0f, 9.26f);
        pathBuilder.lineToRelative(0.0f, 6.57f);
        pathBuilder.lineTo(13.0f, 19.16f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.0f, 7.0f);
        pathBuilder4.lineToRelative(-9.0f, -5.0f);
        pathBuilder4.lineTo(3.0f, 7.0f);
        pathBuilder4.verticalLineToRelative(10.0f);
        pathBuilder4.lineToRelative(9.0f, 5.0f);
        pathBuilder4.lineToRelative(9.0f, -5.0f);
        pathBuilder4.lineTo(21.0f, 7.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 4.29f);
        pathBuilder4.lineToRelative(5.91f, 3.28f);
        pathBuilder4.lineTo(14.9f, 9.24f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder4.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder4.lineTo(6.09f, 7.57f);
        pathBuilder4.lineTo(12.0f, 4.29f);
        pathBuilder4.close();
        pathBuilder4.moveTo(11.0f, 19.16f);
        pathBuilder4.lineToRelative(-6.0f, -3.33f);
        pathBuilder4.verticalLineTo(9.26f);
        pathBuilder4.lineToRelative(3.13f, 1.74f);
        pathBuilder5.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder4.verticalLineTo(19.16f);
        pathBuilder4.close();
        pathBuilder4.moveTo(10.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder4.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 19.16f);
        pathBuilder4.verticalLineToRelative(-3.28f);
        pathBuilder5.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder5.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder4.lineTo(19.0f, 9.26f);
        pathBuilder4.lineToRelative(0.0f, 6.57f);
        pathBuilder4.lineTo(13.0f, 19.16f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _token = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}