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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerNotesOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerNotesOff", "Landroidx/compose/material/icons/Icons$Filled;", "getSpeakerNotesOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpeakerNotesOff.kt */
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.SpeakerNotesOff", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.54f, 11.0f);
        pathBuilder.lineToRelative(-0.54f, -0.54f);
        pathBuilder.lineTo(7.54f, 8.0f);
        pathBuilder.lineTo(6.0f, 6.46f);
        pathBuilder.lineTo(2.38f, 2.84f);
        pathBuilder.lineTo(1.27f, 1.73f);
        pathBuilder.lineTo(0.0f, 3.0f);
        pathBuilder.lineToRelative(2.01f, 2.01f);
        pathBuilder.lineTo(2.0f, 22.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineToRelative(5.73f, 5.73f);
        pathBuilder.lineTo(22.0f, 22.46f);
        pathBuilder.lineTo(17.54f, 18.0f);
        pathBuilder.lineToRelative(-7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 14.0f);
        pathBuilder.lineTo(6.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 11.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(6.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.lineTo(4.08f, 2.0f);
        pathBuilder.lineTo(10.0f, 7.92f);
        pathBuilder.lineTo(10.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-7.92f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.92f);
        pathBuilder.lineToRelative(6.99f, 6.99f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _speakerNotesOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
