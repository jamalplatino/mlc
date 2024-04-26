package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_transcribe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Transcribe", "Landroidx/compose/material/icons/Icons$Sharp;", "getTranscribe", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Transcribe.kt */
public final class TranscribeKt {
    private static ImageVector _transcribe;

    public static final ImageVector getTranscribe(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _transcribe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Transcribe", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.93f, 16.0f);
        pathBuilder.lineToRelative(1.63f, -1.63f);
        pathBuilder.curveToRelative(-2.77f, -3.02f, -2.77f, -7.56f, 0.0f, -10.74f);
        pathBuilder.lineTo(17.93f, 2.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(14.03f, 5.89f, 14.02f, 11.95f, 17.93f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.92f, 10.95f);
        pathBuilder2.curveToRelative(-0.84f, -1.18f, -0.84f, -2.71f, 0.0f, -3.89f);
        pathBuilder.lineToRelative(-1.68f, -1.69f);
        pathBuilder.curveToRelative(-2.02f, 2.02f, -2.02f, 5.07f, 0.0f, 7.27f);
        pathBuilder.lineTo(22.92f, 10.95f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 13.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f);
        pathBuilder.curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.39f, 15.56f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f);
        pathBuilder4.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder4.curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder.curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _transcribe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
