package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_faceRetouchingNatural", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FaceRetouchingNatural", "Landroidx/compose/material/icons/Icons$Filled;", "getFaceRetouchingNatural", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FaceRetouchingNatural.kt */
public final class FaceRetouchingNaturalKt {
    private static ImageVector _faceRetouchingNatural;

    public static final ImageVector getFaceRetouchingNatural(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _faceRetouchingNatural;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = new ImageVector.Builder("Filled.FaceRetouchingNatural", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.moveToRelative(-1.25f, 0.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.77f, 8.58f);
        pathBuilder3.lineToRelative(-0.92f, 2.01f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.09f, 0.46f, 0.15f, 0.93f, 0.15f, 1.41f);
        pathBuilder4.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder3.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        PathBuilder pathBuilder5 = pathBuilder3;
        pathBuilder5.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f);
        pathBuilder5.curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f);
        pathBuilder5.curveTo(11.58f, 8.56f, 14.37f, 10.0f, 17.5f, 10.0f);
        pathBuilder5.curveToRelative(0.45f, 0.0f, 0.89f, -0.04f, 1.33f, -0.1f);
        pathBuilder3.lineToRelative(-0.6f, -1.32f);
        pathBuilder3.lineToRelative(-0.88f, -1.93f);
        pathBuilder3.lineToRelative(-1.93f, -0.88f);
        pathBuilder3.lineToRelative(-2.79f, -1.27f);
        pathBuilder3.lineToRelative(2.79f, -1.27f);
        pathBuilder3.lineToRelative(0.71f, -0.32f);
        PathBuilder pathBuilder6 = pathBuilder3;
        pathBuilder6.curveTo(14.87f, 2.33f, 13.47f, 2.0f, 12.0f, 2.0f);
        pathBuilder6.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder3.curveToRelative(0.0f, -1.47f, -0.33f, -2.87f, -0.9f, -4.13f);
        pathBuilder3.lineToRelative(-0.33f, 0.71f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(15.0f, 13.0f);
        pathBuilder7.moveToRelative(-1.25f, 0.0f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder8.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(20.6f, 5.6f);
        pathBuilder9.lineTo(19.5f, 8.0f);
        pathBuilder9.lineToRelative(-1.1f, -2.4f);
        pathBuilder9.lineTo(16.0f, 4.5f);
        pathBuilder9.lineToRelative(2.4f, -1.1f);
        pathBuilder9.lineTo(19.5f, 1.0f);
        pathBuilder9.lineToRelative(1.1f, 2.4f);
        pathBuilder9.lineTo(23.0f, 4.5f);
        pathBuilder9.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _faceRetouchingNatural = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
