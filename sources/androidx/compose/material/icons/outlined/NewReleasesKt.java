package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_newReleases", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NewReleases", "Landroidx/compose/material/icons/Icons$Outlined;", "getNewReleases", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NewReleases.kt */
public final class NewReleasesKt {
    private static ImageVector _newReleases;

    public static final ImageVector getNewReleases(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.NewReleases", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 12.0f);
        pathBuilder.lineToRelative(-2.44f, -2.78f);
        pathBuilder.lineToRelative(0.34f, -3.68f);
        pathBuilder.lineToRelative(-3.61f, -0.82f);
        pathBuilder.lineToRelative(-1.89f, -3.18f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.lineTo(8.6f, 1.54f);
        pathBuilder.lineTo(6.71f, 4.72f);
        pathBuilder.lineToRelative(-3.61f, 0.81f);
        pathBuilder.lineToRelative(0.34f, 3.68f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(2.44f, 2.78f);
        pathBuilder.lineToRelative(-0.34f, 3.69f);
        pathBuilder.lineToRelative(3.61f, 0.82f);
        pathBuilder.lineToRelative(1.89f, 3.18f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.4f, 1.46f);
        pathBuilder.lineToRelative(1.89f, -3.18f);
        pathBuilder.lineToRelative(3.61f, -0.82f);
        pathBuilder.lineToRelative(-0.34f, -3.68f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.49f, 14.11f);
        pathBuilder.lineToRelative(0.26f, 2.79f);
        pathBuilder.lineToRelative(-2.74f, 0.62f);
        pathBuilder.lineToRelative(-1.43f, 2.41f);
        pathBuilder.lineTo(12.0f, 18.82f);
        pathBuilder.lineToRelative(-2.58f, 1.11f);
        pathBuilder.lineToRelative(-1.43f, -2.41f);
        pathBuilder.lineToRelative(-2.74f, -0.62f);
        pathBuilder.lineToRelative(0.26f, -2.8f);
        pathBuilder.lineTo(3.66f, 12.0f);
        pathBuilder.lineToRelative(1.85f, -2.12f);
        pathBuilder.lineToRelative(-0.26f, -2.78f);
        pathBuilder.lineToRelative(2.74f, -0.61f);
        pathBuilder.lineToRelative(1.43f, -2.41f);
        pathBuilder.lineTo(12.0f, 5.18f);
        pathBuilder.lineToRelative(2.58f, -1.11f);
        pathBuilder.lineToRelative(1.43f, 2.41f);
        pathBuilder.lineToRelative(2.74f, 0.62f);
        pathBuilder.lineToRelative(-0.26f, 2.79f);
        pathBuilder.lineTo(20.34f, 12.0f);
        pathBuilder.lineToRelative(-1.85f, 2.11f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _newReleases = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
