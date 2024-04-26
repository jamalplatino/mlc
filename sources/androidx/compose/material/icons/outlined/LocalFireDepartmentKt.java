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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localFireDepartment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalFireDepartment", "Landroidx/compose/material/icons/Icons$Outlined;", "getLocalFireDepartment", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LocalFireDepartment.kt */
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.LocalFireDepartment", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 6.0f);
        pathBuilder.lineToRelative(-0.44f, 0.55f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-0.42f, 0.52f, -0.98f, 0.75f, -1.54f, 0.75f);
        pathBuilder2.curveTo(13.0f, 7.3f, 12.0f, 6.52f, 12.0f, 5.3f);
        pathBuilder.verticalLineTo(2.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f);
        pathBuilder3.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveTo(20.0f, 10.04f, 18.39f, 7.38f, 16.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, -0.87f, -2.0f, -1.94f);
        pathBuilder4.curveToRelative(0.0f, -0.51f, 0.2f, -0.99f, 0.58f, -1.36f);
        pathBuilder.lineToRelative(1.42f, -1.4f);
        pathBuilder.lineToRelative(1.43f, 1.4f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveTo(13.8f, 16.07f, 14.0f, 16.55f, 14.0f, 17.06f);
        pathBuilder5.curveTo(14.0f, 18.13f, 13.1f, 19.0f, 12.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.96f, 17.5f);
        pathBuilder.lineTo(15.96f, 17.5f);
        pathBuilder.curveToRelative(0.04f, -0.36f, 0.22f, -1.89f, -1.13f, -3.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(12.0f, 11.5f);
        pathBuilder.lineToRelative(-2.83f, 2.78f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(-1.36f, 1.34f, -1.17f, 2.88f, -1.13f, 3.22f);
        pathBuilder6.curveTo(6.79f, 16.4f, 6.0f, 14.79f, 6.0f, 13.0f);
        pathBuilder6.curveToRelative(0.0f, -3.16f, 2.13f, -5.65f, 4.03f, -7.25f);
        pathBuilder6.curveToRelative(0.23f, 1.99f, 1.93f, 3.55f, 3.99f, 3.55f);
        pathBuilder6.curveToRelative(0.78f, 0.0f, 1.54f, -0.23f, 2.18f, -0.66f);
        pathBuilder6.curveTo(17.34f, 9.78f, 18.0f, 11.35f, 18.0f, 13.0f);
        pathBuilder6.curveTo(18.0f, 14.79f, 17.21f, 16.4f, 15.96f, 17.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _localFireDepartment = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
