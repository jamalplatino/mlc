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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_password", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Password", "Landroidx/compose/material/icons/Icons$Outlined;", "getPassword", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Password.kt */
public final class PasswordKt {
    private static ImageVector _password;

    public static final ImageVector getPassword(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _password;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Password", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.15f, 12.95f);
        pathBuilder.lineTo(4.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineTo(5.3f, 10.72f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineTo(5.3f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(4.85f, 7.0f);
        pathBuilder.lineTo(4.0f, 8.47f);
        pathBuilder.lineTo(3.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineTo(2.7f, 9.22f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineTo(1.85f, 12.2f);
        pathBuilder.lineTo(3.15f, 12.95f);
        pathBuilder.close();
        pathBuilder.moveTo(9.85f, 12.2f);
        pathBuilder.lineToRelative(1.3f, 0.75f);
        pathBuilder.lineTo(12.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineToRelative(-0.85f, -1.48f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(-1.7f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(12.85f, 7.0f);
        pathBuilder.lineTo(12.0f, 8.47f);
        pathBuilder.lineTo(11.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineToRelative(0.85f, 1.47f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineTo(9.85f, 12.2f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 9.22f);
        pathBuilder.horizontalLineToRelative(-1.7f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(20.85f, 7.0f);
        pathBuilder.lineTo(20.0f, 8.47f);
        pathBuilder.lineTo(19.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineToRelative(0.85f, 1.47f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineToRelative(-0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, 0.75f);
        pathBuilder.lineTo(20.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineToRelative(-0.85f, -1.48f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.verticalLineTo(9.22f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _password = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
