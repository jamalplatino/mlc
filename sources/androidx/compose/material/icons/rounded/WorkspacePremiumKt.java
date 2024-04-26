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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_workspacePremium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WorkspacePremium", "Landroidx/compose/material/icons/Icons$Rounded;", "getWorkspacePremium", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkspacePremium.kt */
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.WorkspacePremium", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.92f, 12.75f);
        pathBuilder.lineTo(12.0f, 11.93f);
        pathBuilder.lineToRelative(1.07f, 0.81f);
        pathBuilder.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilder.lineToRelative(-0.42f, -1.36f);
        pathBuilder.lineToRelative(1.2f, -0.95f);
        pathBuilder.curveTo(15.0f, 9.6f, 14.79f, 9.0f, 14.31f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.43f, -1.34f);
        pathBuilder.curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0.0f);
        pathBuilder.lineTo(11.09f, 9.0f);
        pathBuilder.horizontalLineTo(9.68f);
        pathBuilder.curveTo(9.21f, 9.0f, 9.0f, 9.6f, 9.37f, 9.89f);
        pathBuilder.lineToRelative(1.19f, 0.95f);
        pathBuilder.lineToRelative(-0.42f, 1.36f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(10.0f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 21.61f);
        pathBuilder2.curveToRelative(0.0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(4.68f, 1.56f);
        pathBuilder.curveTo(17.33f, 22.78f, 18.0f, 22.3f, 18.0f, 21.61f);
        pathBuilder.verticalLineToRelative(-6.33f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(1.24f, -1.41f, 2.0f, -3.25f, 2.0f, -5.28f);
        pathBuilder3.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        pathBuilder.verticalLineTo(21.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder4.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _workspacePremium = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
