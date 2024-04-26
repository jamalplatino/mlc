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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_videoSettings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VideoSettings", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVideoSettings", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VideoSettings.kt */
public final class VideoSettingsKt {
    private static ImageVector _videoSettings;

    public static final ImageVector getVideoSettings(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _videoSettings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.VideoSettings", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder2.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 12.0f);
        pathBuilder3.lineToRelative(-6.0f, -4.0f);
        pathBuilder3.lineToRelative(0.0f, 8.0f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(22.71f, 18.43f);
        pathBuilder4.curveToRelative(0.03f, -0.29f, 0.04f, -0.58f, 0.01f, -0.86f);
        pathBuilder4.lineToRelative(1.07f, -0.85f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.1f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f);
        pathBuilder4.lineToRelative(-1.03f, -1.79f);
        pathBuilder5.curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f);
        pathBuilder4.lineTo(21.23f, 15.0f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f);
        pathBuilder4.lineToRelative(-0.2f, -1.36f);
        pathBuilder6.curveTo(20.26f, 13.09f, 20.16f, 13.0f, 20.03f, 13.0f);
        pathBuilder4.horizontalLineToRelative(-2.07f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f);
        pathBuilder4.lineToRelative(-0.2f, 1.36f);
        pathBuilder7.curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f);
        pathBuilder4.lineToRelative(-1.28f, -0.5f);
        pathBuilder7.curveToRelative(-0.12f, -0.05f, -0.25f, 0.0f, -0.31f, 0.11f);
        pathBuilder4.lineToRelative(-1.03f, 1.79f);
        pathBuilder7.curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f);
        pathBuilder4.lineToRelative(1.07f, 0.86f);
        pathBuilder4.curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f);
        pathBuilder4.lineToRelative(-1.07f, 0.85f);
        PathBuilder pathBuilder8 = pathBuilder4;
        pathBuilder8.curveToRelative(-0.1f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f);
        pathBuilder4.lineToRelative(1.03f, 1.79f);
        pathBuilder8.curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f);
        pathBuilder4.lineToRelative(1.27f, -0.5f);
        pathBuilder8.curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f);
        pathBuilder4.lineToRelative(0.2f, 1.36f);
        pathBuilder8.curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f);
        pathBuilder4.horizontalLineToRelative(2.07f);
        PathBuilder pathBuilder9 = pathBuilder4;
        pathBuilder9.curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f);
        pathBuilder4.lineToRelative(0.2f, -1.36f);
        pathBuilder9.curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f);
        pathBuilder4.lineToRelative(1.28f, 0.5f);
        PathBuilder pathBuilder10 = pathBuilder4;
        pathBuilder10.curveToRelative(0.12f, 0.05f, 0.25f, 0.0f, 0.31f, -0.11f);
        pathBuilder4.lineToRelative(1.03f, -1.79f);
        pathBuilder10.curveToRelative(0.06f, -0.11f, 0.04f, -0.24f, -0.06f, -0.32f);
        pathBuilder4.lineTo(22.71f, 18.43f);
        pathBuilder4.close();
        pathBuilder4.moveTo(19.0f, 19.5f);
        pathBuilder10.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder4.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder4.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder4.reflectiveCurveTo(19.83f, 19.5f, 19.0f, 19.5f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _videoSettings = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
