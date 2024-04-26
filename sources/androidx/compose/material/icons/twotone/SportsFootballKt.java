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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsFootball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsFootball", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSportsFootball", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SportsFootball.kt */
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = r1;
        ImageVector.Builder builder5 = r1;
        ImageVector.Builder builder6 = new ImageVector.Builder("TwoTone.SportsFootball", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.26f, 5.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.35f, 0.0f, -0.8f, 0.01f, -1.33f, 0.06f);
        pathBuilder.lineToRelative(4.03f, 4.03f);
        pathBuilder2.curveToRelative(0.14f, -1.63f, 0.01f, -3.07f, -0.17f, -3.86f);
        pathBuilder2.curveTo(18.28f, 5.12f, 17.4f, 5.0f, 16.26f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder5, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(5.21f, 18.77f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(5.72f, 18.88f, 6.6f, 19.0f, 7.74f, 19.0f);
        pathBuilder4.curveToRelative(0.34f, 0.0f, 0.79f, -0.01f, 1.3f, -0.05f);
        pathBuilder3.lineToRelative(-4.01f, -4.01f);
        pathBuilder4.curveTo(4.91f, 16.56f, 5.03f, 17.98f, 5.21f, 18.77f);
        pathBuilder3.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder4, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(7.87f, 7.87f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(-1.28f, 1.28f, -2.03f, 2.97f, -2.45f, 4.65f);
        pathBuilder5.lineToRelative(6.04f, 6.04f);
        pathBuilder6.curveToRelative(1.6f, -0.39f, 3.33f, -1.11f, 4.66f, -2.44f);
        pathBuilder6.curveToRelative(1.28f, -1.28f, 2.03f, -2.95f, 2.44f, -4.63f);
        pathBuilder5.lineToRelative(-6.05f, -6.05f);
        pathBuilder6.curveTo(10.92f, 5.83f, 9.2f, 6.55f, 7.87f, 7.87f);
        pathBuilder5.close();
        pathBuilder5.moveTo(15.5f, 9.9f);
        pathBuilder5.lineToRelative(-5.6f, 5.6f);
        pathBuilder5.lineToRelative(-1.4f, -1.4f);
        pathBuilder5.lineToRelative(5.6f, -5.6f);
        pathBuilder5.lineTo(15.5f, 9.9f);
        pathBuilder5.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder5.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r73 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r74 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(20.31f, 3.69f);
        PathBuilder pathBuilder8 = pathBuilder7;
        pathBuilder8.curveTo(19.99f, 3.36f, 18.37f, 3.0f, 16.26f, 3.0f);
        pathBuilder8.curveToRelative(-3.03f, 0.0f, -7.09f, 0.75f, -9.8f, 3.46f);
        pathBuilder8.curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f);
        pathBuilder8.curveTo(4.01f, 20.64f, 5.63f, 21.0f, 7.74f, 21.0f);
        pathBuilder8.curveToRelative(3.03f, 0.0f, 7.09f, -0.75f, 9.8f, -3.46f);
        pathBuilder8.curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f);
        pathBuilder7.close();
        pathBuilder7.moveTo(7.74f, 19.0f);
        pathBuilder8.curveToRelative(-1.14f, 0.0f, -2.02f, -0.12f, -2.53f, -0.23f);
        pathBuilder8.curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f);
        pathBuilder7.lineToRelative(4.01f, 4.01f);
        pathBuilder8.curveTo(8.53f, 18.99f, 8.08f, 19.0f, 7.74f, 19.0f);
        pathBuilder7.close();
        pathBuilder7.moveTo(16.13f, 16.13f);
        pathBuilder8.curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f);
        pathBuilder7.lineToRelative(-6.04f, -6.04f);
        pathBuilder8.curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f);
        pathBuilder8.curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f);
        pathBuilder7.lineToRelative(6.05f, 6.05f);
        pathBuilder8.curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f);
        pathBuilder7.close();
        pathBuilder7.moveTo(18.96f, 9.09f);
        pathBuilder7.lineToRelative(-4.03f, -4.03f);
        pathBuilder8.curveTo(15.45f, 5.01f, 15.91f, 5.0f, 16.26f, 5.0f);
        pathBuilder8.curveToRelative(1.14f, 0.0f, 2.02f, 0.12f, 2.53f, 0.23f);
        pathBuilder8.curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f);
        pathBuilder7.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder7.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r73, r74, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r90 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r91 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(8.5f, 14.1f);
        pathBuilder9.lineToRelative(5.6f, -5.6f);
        pathBuilder9.lineToRelative(1.4f, 1.4f);
        pathBuilder9.lineToRelative(-5.6f, 5.6f);
        pathBuilder9.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder9.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r90, r91, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sportsFootball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}