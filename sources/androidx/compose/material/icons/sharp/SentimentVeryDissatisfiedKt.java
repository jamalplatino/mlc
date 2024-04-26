package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sentimentVeryDissatisfied", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SentimentVeryDissatisfied", "Landroidx/compose/material/icons/Icons$Sharp;", "getSentimentVeryDissatisfied", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SentimentVeryDissatisfied.kt */
public final class SentimentVeryDissatisfiedKt {
    private static ImageVector _sentimentVeryDissatisfied;

    public static final ImageVector getSentimentVeryDissatisfied(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _sentimentVeryDissatisfied;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.SentimentVeryDissatisfied", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 13.5f);
        pathBuilder.curveToRelative(-2.33f, 0.0f, -4.31f, 1.46f, -5.11f, 3.5f);
        pathBuilder.horizontalLineToRelative(10.22f);
        pathBuilder.curveToRelative(-0.8f, -2.04f, -2.78f, -3.5f, -5.11f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(7.82f, 12.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(9.94f, 12.0f);
        pathBuilder.lineTo(11.0f, 10.94f);
        pathBuilder.lineTo(9.94f, 9.88f);
        pathBuilder.lineTo(11.0f, 8.82f);
        pathBuilder.lineTo(9.94f, 7.76f);
        pathBuilder.lineTo(8.88f, 8.82f);
        pathBuilder.lineTo(7.82f, 7.76f);
        pathBuilder.lineTo(6.76f, 8.82f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.18f, 7.76f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(13.0f, 8.82f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(13.0f, 10.94f);
        pathBuilder.lineTo(14.06f, 12.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(16.18f, 12.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _sentimentVeryDissatisfied = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
