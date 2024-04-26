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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_catchingPokemon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CatchingPokemon", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCatchingPokemon", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CatchingPokemon.kt */
public final class CatchingPokemonKt {
    private static ImageVector _catchingPokemon;

    public static final ImageVector getCatchingPokemon(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _catchingPokemon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.CatchingPokemon", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f);
        pathBuilder.horizontalLineToRelative(-4.06f);
        pathBuilder2.curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f);
        pathBuilder.horizontalLineTo(4.06f);
        pathBuilder2.curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 2.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder4.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 4.0f);
        pathBuilder4.curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f);
        pathBuilder3.horizontalLineToRelative(-4.06f);
        pathBuilder4.curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f);
        pathBuilder3.reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f);
        pathBuilder3.horizontalLineTo(4.06f);
        pathBuilder4.curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 20.0f);
        pathBuilder4.curveToRelative(-4.08f, 0.0f, -7.45f, -3.05f, -7.94f, -7.0f);
        pathBuilder3.horizontalLineToRelative(4.06f);
        pathBuilder4.curveToRelative(0.44f, 1.73f, 2.01f, 3.0f, 3.87f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.43f, -1.27f, 3.87f, -3.0f);
        pathBuilder3.horizontalLineToRelative(4.06f);
        pathBuilder4.curveTo(19.45f, 16.95f, 16.08f, 20.0f, 12.0f, 20.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _catchingPokemon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
