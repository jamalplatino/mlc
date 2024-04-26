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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_grade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Grade", "Landroidx/compose/material/icons/Icons$Outlined;", "getGrade", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Grade.kt */
public final class GradeKt {
    private static ImageVector _grade;

    public static final ImageVector getGrade(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _grade;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Grade", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.13f);
        pathBuilder.lineToRelative(0.97f, 2.29f);
        pathBuilder.lineToRelative(0.47f, 1.11f);
        pathBuilder.lineToRelative(1.2f, 0.1f);
        pathBuilder.lineToRelative(2.47f, 0.21f);
        pathBuilder.lineToRelative(-1.88f, 1.63f);
        pathBuilder.lineToRelative(-0.91f, 0.79f);
        pathBuilder.lineToRelative(0.27f, 1.18f);
        pathBuilder.lineToRelative(0.56f, 2.41f);
        pathBuilder.lineToRelative(-2.12f, -1.28f);
        pathBuilder.lineToRelative(-1.03f, -0.64f);
        pathBuilder.lineToRelative(-1.03f, 0.62f);
        pathBuilder.lineToRelative(-2.12f, 1.28f);
        pathBuilder.lineToRelative(0.56f, -2.41f);
        pathBuilder.lineToRelative(0.27f, -1.18f);
        pathBuilder.lineToRelative(-0.91f, -0.79f);
        pathBuilder.lineToRelative(-1.88f, -1.63f);
        pathBuilder.lineToRelative(2.47f, -0.21f);
        pathBuilder.lineToRelative(1.2f, -0.1f);
        pathBuilder.lineToRelative(0.47f, -1.11f);
        pathBuilder.lineToRelative(0.97f, -2.27f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineTo(2.0f, 9.24f);
        pathBuilder.lineToRelative(5.46f, 4.73f);
        pathBuilder.lineTo(5.82f, 21.0f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.lineTo(18.18f, 21.0f);
        pathBuilder.lineToRelative(-1.64f, -7.03f);
        pathBuilder.lineTo(22.0f, 9.24f);
        pathBuilder.lineToRelative(-7.19f, -0.61f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _grade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
