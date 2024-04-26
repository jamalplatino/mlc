package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$drawSelector$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$drawSelector$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        Intrinsics.checkNotNullParameter(contentDrawScope2, "$this$drawWithContent");
        long Offset = OffsetKt.Offset(contentDrawScope2.m5607toPx0680j_4(DpOffset.m5687getXD9Ej5fM(this.$state.m1771getSelectorPosRKDOV3M$material3_release())), contentDrawScope2.m5607toPx0680j_4(DpOffset.m5689getYD9Ej5fM(this.$state.m1771getSelectorPosRKDOV3M$material3_release())));
        float f = (float) 2;
        float r16 = contentDrawScope2.m5607toPx0680j_4(TimePickerTokens.INSTANCE.m2343getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
        long r32 = this.$colors.m1734getSelectorColor0d7_KjU$material3_release();
        DrawScope drawScope = contentDrawScope2;
        float f2 = r16;
        long j = Offset;
        DrawScope.m3392drawCircleVaOC9Bg$default(drawScope, Color.Companion.m2847getBlack0d7_KjU(), f2, j, 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.Companion.m2727getClear0nO6VwU(), 56, (Object) null);
        contentDrawScope.drawContent();
        DrawScope.m3392drawCircleVaOC9Bg$default(drawScope, r32, f2, j, 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.Companion.m2755getXor0nO6VwU(), 56, (Object) null);
        float r24 = contentDrawScope2.m5607toPx0680j_4(TimePickerTokens.INSTANCE.m2344getClockDialSelectorTrackContainerWidthD9Ej5fM());
        DrawScope drawScope2 = drawScope;
        long j2 = r32;
        DrawScope.m3397drawLineNGM6Ib0$default(drawScope2, j2, SizeKt.m2651getCenteruvyYCjk(contentDrawScope.m3429getSizeNHjbRc()), Offset.m2576minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos((double) this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * r16, ((float) Math.sin((double) this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * r16)), r24, 0, (PathEffect) null, 0.0f, (ColorFilter) null, BlendMode.Companion.m2754getSrcOver0nO6VwU(), 240, (Object) null);
        DrawScope.m3392drawCircleVaOC9Bg$default(drawScope2, j2, contentDrawScope2.m5607toPx0680j_4(TimePickerTokens.INSTANCE.m2342getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, SizeKt.m2651getCenteruvyYCjk(contentDrawScope.m3429getSizeNHjbRc()), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, MenuKt.InTransitionDuration, (Object) null);
        DrawScope.m3392drawCircleVaOC9Bg$default(drawScope, this.$colors.m1730clockDialContentColorvNxB06k$material3_release(true), f2, j, 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.Companion.m2737getDstOver0nO6VwU(), 56, (Object) null);
    }
}
