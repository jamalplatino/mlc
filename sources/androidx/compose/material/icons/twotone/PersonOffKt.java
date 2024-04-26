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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPersonOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PersonOff.kt */
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.PersonOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.17f, 18.0f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.06f, 0.0f, -0.11f, 0.0f, -0.17f, 0.0f);
        pathBuilder2.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilder2.curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(15.17f);
        pathBuilder.close();
        pathBuilder.moveTo(10.13f, 7.3f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(10.41f, 6.54f, 11.14f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.curveToRelative(0.0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 17.17f);
        pathBuilder4.lineToRelative(-3.37f, -3.38f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(0.64f, 0.22f, 1.23f, 0.48f, 1.77f, 0.76f);
        pathBuilder5.curveTo(19.37f, 15.06f, 19.98f, 16.07f, 20.0f, 17.17f);
        pathBuilder4.close();
        pathBuilder4.moveTo(21.19f, 21.19f);
        pathBuilder4.lineToRelative(-1.41f, 1.41f);
        pathBuilder4.lineTo(17.17f, 20.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineToRelative(-2.78f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilder6.curveToRelative(1.29f, -0.66f, 2.87f, -1.22f, 4.67f, -1.45f);
        pathBuilder4.lineTo(1.39f, 4.22f);
        pathBuilder4.lineToRelative(1.41f, -1.41f);
        pathBuilder4.lineTo(21.19f, 21.19f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.17f, 18.0f);
        pathBuilder4.lineToRelative(-3.0f, -3.0f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(-0.06f, 0.0f, -0.11f, 0.0f, -0.17f, 0.0f);
        pathBuilder7.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilder7.curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f);
        pathBuilder4.verticalLineTo(18.0f);
        pathBuilder4.horizontalLineTo(15.17f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 6.0f);
        pathBuilder7.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder7.curveToRelative(0.0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f);
        pathBuilder4.lineToRelative(1.48f, 1.48f);
        pathBuilder7.curveTo(15.28f, 10.64f, 16.0f, 9.4f, 16.0f, 8.0f);
        pathBuilder7.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder7.curveToRelative(-1.4f, 0.0f, -2.64f, 0.72f, -3.35f, 1.82f);
        pathBuilder4.lineToRelative(1.48f, 1.48f);
        pathBuilder7.curveTo(10.41f, 6.54f, 11.14f, 6.0f, 12.0f, 6.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _personOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
