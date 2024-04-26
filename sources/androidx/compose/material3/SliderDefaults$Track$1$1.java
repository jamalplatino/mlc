package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
final class SliderDefaults$Track$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope2, "$this$Canvas");
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m2573getYimpl(drawScope.m3428getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc()), Offset.m2573getYimpl(drawScope.m3428getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        float r18 = drawScope2.m5607toPx0680j_4(SliderKt.TickSize);
        float r8 = drawScope2.m5607toPx0680j_4(SliderKt.getTrackHeight());
        long j3 = j2;
        long j4 = j;
        DrawScope.m3397drawLineNGM6Ib0$default(drawScope, this.$inactiveTrackColor.getValue().m2831unboximpl(), j, j2, r8, StrokeCap.Companion.m3205getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        DrawScope.m3397drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor.getValue().m2831unboximpl(), OffsetKt.Offset(Offset.m2572getXimpl(j4) + ((Offset.m2572getXimpl(j3) - Offset.m2572getXimpl(j4)) * this.$sliderPositions.getActiveRange().getStart().floatValue()), Offset.m2573getYimpl(drawScope.m3428getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2572getXimpl(j4) + ((Offset.m2572getXimpl(j3) - Offset.m2572getXimpl(j4)) * this.$sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m2573getYimpl(drawScope.m3428getCenterF1C5BW0())), r8, StrokeCap.Companion.m3205getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        Map linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i = 0; i < length; i++) {
            float f = tickFractions[i];
            Boolean valueOf = Boolean.valueOf(f > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f < sliderPositions.getActiveRange().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(Offset.m2561boximpl(OffsetKt.Offset(Offset.m2572getXimpl(OffsetKt.m2595lerpWko1d7g(j4, j3, floatValue.floatValue())), Offset.m2573getYimpl(drawScope.m3428getCenterF1C5BW0()))));
            }
            long j5 = j4;
            long j6 = j3;
            DrawScope.m3402drawPointsF8ZwMP8$default(drawScope, (List) arrayList, PointMode.Companion.m3139getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2831unboximpl(), r18, StrokeCap.Companion.m3205getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
            j4 = j5;
            j3 = j6;
        }
    }
}
