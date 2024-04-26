package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_searchOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SearchOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getSearchOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchOff.kt */
public final class SearchOffKt {
    private static ImageVector _searchOff;

    public static final ImageVector getSearchOff(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _searchOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Rounded.SearchOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.79f);
        pathBuilder.lineToRelative(-0.28f, -0.27f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        pathBuilder2.curveToRelative(-0.47f, -2.78f, -2.79f, -4.99f, -5.58f, -5.34f);
        pathBuilder2.curveTo(6.54f, 2.58f, 3.3f, 5.38f, 3.03f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder2.curveToRelative(0.24f, -2.12f, 1.92f, -3.8f, 4.06f, -3.98f);
        pathBuilder2.curveTo(11.65f, 4.8f, 14.0f, 6.95f, 14.0f, 9.5f);
        pathBuilder2.curveToRelative(0.0f, 2.49f, -2.01f, 4.5f, -4.5f, 4.5f);
        pathBuilder2.curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        pathBuilder.lineToRelative(0.0f, 2.02f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.01f);
        pathBuilder2.curveToRelative(1.8f, 0.13f, 3.47f, -0.47f, 4.72f, -1.55f);
        pathBuilder.lineTo(14.0f, 14.71f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(4.25f, 4.25f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        pathBuilder.lineTo(15.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(6.12f, 11.17f);
        pathBuilder4.lineTo(4.0f, 13.29f);
        pathBuilder4.lineToRelative(-2.12f, -2.12f);
        PathBuilder pathBuilder5 = pathBuilder4;
        pathBuilder5.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder4.lineTo(3.29f, 14.0f);
        pathBuilder4.lineToRelative(-2.12f, 2.12f);
        PathBuilder pathBuilder6 = pathBuilder4;
        pathBuilder6.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder4.lineTo(4.0f, 14.71f);
        pathBuilder4.lineToRelative(2.12f, 2.12f);
        pathBuilder6.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder6.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder4.lineTo(4.71f, 14.0f);
        pathBuilder4.lineToRelative(2.12f, -2.12f);
        PathBuilder pathBuilder7 = pathBuilder4;
        pathBuilder7.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder7.curveTo(6.63f, 10.98f, 6.32f, 10.98f, 6.12f, 11.17f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _searchOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
