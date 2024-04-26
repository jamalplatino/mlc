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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_roomPreferences", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RoomPreferences", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRoomPreferences", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RoomPreferences.kt */
public final class RoomPreferencesKt {
    private static ImageVector _roomPreferences;

    public static final ImageVector getRoomPreferences(Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _roomPreferences;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.RoomPreferences", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 12.11f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(11.1f, 18.37f, 11.0f, 17.7f, 11.0f, 17.0f);
        pathBuilder2.curveTo(11.0f, 15.09f, 11.76f, 13.37f, 13.0f, 12.11f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector.Builder.m3530addPathoIyEayM$default(builder2, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int r39 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r40 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 13.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 19.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(6.0f);
        pathBuilder3.verticalLineToRelative(7.11f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(0.57f, -0.59f, 1.25f, -1.07f, 2.0f, -1.42f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder3.verticalLineTo(3.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        pathBuilder3.verticalLineToRelative(16.0f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(9.26f);
        pathBuilder4.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        pathBuilder3.horizontalLineTo(7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.69f, 17.63f);
        pathBuilder3.lineToRelative(1.14f, 1.0f);
        pathBuilder3.lineToRelative(-1.0f, 1.73f);
        pathBuilder3.lineToRelative(-1.45f, -0.49f);
        pathBuilder4.curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f);
        pathBuilder3.lineTo(19.0f, 22.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.lineToRelative(-0.3f, -1.49f);
        pathBuilder4.curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f);
        pathBuilder3.lineToRelative(-1.45f, 0.49f);
        pathBuilder3.lineToRelative(-1.0f, -1.73f);
        pathBuilder3.lineToRelative(1.14f, -1.0f);
        pathBuilder4.curveToRelative(-0.08f, -0.5f, -0.08f, -0.76f, 0.0f, -1.26f);
        pathBuilder3.lineToRelative(-1.14f, -1.0f);
        pathBuilder3.lineToRelative(1.0f, -1.73f);
        pathBuilder3.lineToRelative(1.45f, 0.49f);
        pathBuilder4.curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f);
        pathBuilder3.lineTo(17.0f, 12.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.lineToRelative(0.3f, 1.49f);
        pathBuilder4.curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f);
        pathBuilder3.lineToRelative(1.45f, -0.49f);
        pathBuilder3.lineToRelative(1.0f, 1.73f);
        pathBuilder3.lineToRelative(-1.14f, 1.0f);
        pathBuilder4.curveTo(21.77f, 16.87f, 21.77f, 17.13f, 21.69f, 17.63f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 17.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.reflectiveCurveTo(20.0f, 18.1f, 20.0f, 17.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder3.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _roomPreferences = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
