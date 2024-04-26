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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_voicemail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Voicemail", "Landroidx/compose/material/icons/Icons$Sharp;", "getVoicemail", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Voicemail.kt */
public final class VoicemailKt {
    private static ImageVector _voicemail;

    public static final ImageVector getVoicemail(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _voicemail;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Voicemail", Dp.m5626constructorimpl(24.0f), Dp.m5626constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m3204getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m3214getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveTo(15.46f, 6.0f, 13.0f, 8.46f, 13.0f, 11.5f);
        pathBuilder2.curveToRelative(0.0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f);
        pathBuilder.lineTo(9.74f, 15.0f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f);
        pathBuilder3.curveTo(11.0f, 8.46f, 8.54f, 6.0f, 5.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(0.0f, 8.46f, 0.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(2.46f, 17.0f, 5.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveTo(21.54f, 6.0f, 18.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 15.0f);
        pathBuilder.curveTo(3.57f, 15.0f, 2.0f, 13.43f, 2.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(3.57f, 8.0f, 5.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 9.57f, 9.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(7.43f, 15.0f, 5.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 15.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(16.57f, 8.0f, 18.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 9.57f, 22.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(20.43f, 15.0f, 18.5f, 15.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3530addPathoIyEayM$default(builder, pathBuilder.getNodes(), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m2847getBlack0d7_KjU(), (DefaultConstructorMarker) null), 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _voicemail = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
