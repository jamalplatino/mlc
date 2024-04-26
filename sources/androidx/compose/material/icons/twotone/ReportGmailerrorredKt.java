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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reportGmailerrorred", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportGmailerrorred", "Landroidx/compose/material/icons/Icons$TwoTone;", "getReportGmailerrorred", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReportGmailerrorred.kt */
public final class ReportGmailerrorredKt {
    private static ImageVector _reportGmailerrorred;

    public static final ImageVector getReportGmailerrorred(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _reportGmailerrorred;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.ReportGmailerrorred", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.73f, 3.0f);
        pathBuilder.horizontalLineTo(8.27f);
        pathBuilder.lineTo(3.0f, 8.27f);
        pathBuilder.verticalLineToRelative(7.46f);
        pathBuilder.lineTo(8.27f, 21.0f);
        pathBuilder.horizontalLineToRelative(7.46f);
        pathBuilder.lineTo(21.0f, 15.73f);
        pathBuilder.verticalLineTo(8.27f);
        pathBuilder.lineTo(15.73f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 14.9f);
        pathBuilder.lineTo(14.9f, 19.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineTo(5.0f, 14.9f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.lineTo(9.1f, 5.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.lineTo(19.0f, 9.1f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder3, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 16.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder2.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r56 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r57 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(7.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder4.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _reportGmailerrorred = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}