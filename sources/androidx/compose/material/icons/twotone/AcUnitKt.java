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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_acUnit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AcUnit", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAcUnit", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AcUnit.kt */
public final class AcUnitKt {
    private static ImageVector _acUnit;

    public static final ImageVector getAcUnit(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _acUnit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("TwoTone.AcUnit", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, -3.24f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineTo(15.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(4.66f, -4.66f);
        pathBuilder.lineToRelative(-1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 6.17f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineTo(7.76f, 2.93f);
        pathBuilder.lineTo(6.34f, 4.34f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(4.34f, 6.34f);
        pathBuilder.lineTo(2.93f, 7.76f);
        pathBuilder.lineTo(6.17f, 11.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(4.17f);
        pathBuilder.lineToRelative(-3.24f, 3.24f);
        pathBuilder.lineToRelative(1.41f, 1.42f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-4.66f, 4.66f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.lineTo(11.0f, 17.83f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, 3.24f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(4.66f, 4.66f);
        pathBuilder.lineToRelative(1.41f, -1.42f);
        pathBuilder.lineTo(17.83f, 13.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _acUnit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}