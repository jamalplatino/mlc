package androidx.compose.material.icons.filled;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addToDrive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddToDrive", "Landroidx/compose/material/icons/Icons$Filled;", "getAddToDrive", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AddToDrive.kt */
public final class AddToDriveKt {
    private static ImageVector _addToDrive;

    public static final ImageVector getAddToDrive(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _addToDrive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.AddToDrive", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.03f, 21.5f);
        pathBuilder.horizontalLineTo(5.66f);
        pathBuilder.curveToRelative(-0.72f, 0.0f, -1.38f, -0.38f, -1.73f, -1.0f);
        pathBuilder.lineTo(1.57f, 16.4f);
        pathBuilder.curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2.0f);
        pathBuilder.lineTo(7.92f, 3.49f);
        pathBuilder.curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f);
        pathBuilder.horizontalLineToRelative(4.7f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.37f, 0.38f, 1.73f, 0.99f);
        pathBuilder.lineToRelative(4.48f, 7.71f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(20.06f, 11.07f, 19.54f, 11.0f, 19.0f, 11.0f);
        pathBuilder2.curveToRelative(-0.28f, 0.0f, -0.56f, 0.02f, -0.84f, 0.06f);
        pathBuilder.lineTo(14.35f, 4.5f);
        pathBuilder.horizontalLineToRelative(-4.7f);
        pathBuilder.lineTo(3.31f, 15.41f);
        pathBuilder.lineToRelative(2.35f, 4.09f);
        pathBuilder.horizontalLineToRelative(7.89f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.34f, 15.0f);
        pathBuilder3.curveTo(13.12f, 15.63f, 13.0f, 16.3f, 13.0f, 17.0f);
        pathBuilder.horizontalLineTo(7.25f);
        pathBuilder.lineToRelative(-0.73f, -1.27f);
        pathBuilder.lineToRelative(4.58f, -7.98f);
        pathBuilder.horizontalLineToRelative(1.8f);
        pathBuilder.lineToRelative(2.53f, 4.42f);
        pathBuilder.curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f);
        pathBuilder.lineToRelative(-2.0f, -3.49f);
        pathBuilder.lineTo(9.25f, 15.0f);
        pathBuilder.horizontalLineTo(13.34f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _addToDrive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
