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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_importContacts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImportContacts", "Landroidx/compose/material/icons/Icons$Rounded;", "getImportContacts", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImportContacts.kt */
public final class ImportContactsKt {
    private static ImageVector _importContacts;

    public static final ImageVector getImportContacts(Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _importContacts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Rounded.ImportContacts", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 4.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilder2.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder2.curveToRelative(-1.45f, 0.0f, -2.99f, 0.22f, -4.28f, 0.79f);
        pathBuilder2.curveTo(1.49f, 5.62f, 1.0f, 6.33f, 1.0f, 7.14f);
        pathBuilder.verticalLineToRelative(11.28f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f);
        pathBuilder3.curveToRelative(0.98f, -0.25f, 2.02f, -0.36f, 3.02f, -0.36f);
        pathBuilder3.curveToRelative(1.56f, 0.0f, 3.22f, 0.26f, 4.56f, 0.92f);
        pathBuilder3.curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0.0f);
        pathBuilder3.curveToRelative(1.34f, -0.67f, 3.0f, -0.92f, 4.56f, -0.92f);
        pathBuilder3.curveToRelative(1.0f, 0.0f, 2.04f, 0.11f, 3.02f, 0.36f);
        pathBuilder3.curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f);
        pathBuilder.verticalLineTo(7.14f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(0.0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f);
        pathBuilder4.curveToRelative(-1.28f, -0.57f, -2.82f, -0.79f, -4.27f, -0.79f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 17.23f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(0.0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f);
        pathBuilder5.curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f);
        pathBuilder5.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilder.verticalLineTo(8.0f);
        PathBuilder pathBuilder6 = pathBuilder;
        pathBuilder6.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder6.curveToRelative(0.92f, 0.0f, 1.83f, 0.09f, 2.7f, 0.28f);
        pathBuilder6.curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f);
        pathBuilder.verticalLineToRelative(9.47f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _importContacts = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
