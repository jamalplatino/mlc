package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
final class SliderKt$RangeSliderImpl$onDrag$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    final /* synthetic */ MutableState<Float> $endThumbWidth$delegate;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ MutableState<Float> $startThumbWidth$delegate;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth$delegate;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSliderImpl$onDrag$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float[] fArr, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableState<Integer> mutableState3, MutableState<Float> mutableState4, MutableState<Float> mutableState5, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = closedFloatingPointRange;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$totalWidth$delegate = mutableState3;
        this.$endThumbWidth$delegate = mutableState4;
        this.$startThumbWidth$delegate = mutableState5;
        this.$valueRange = closedFloatingPointRange2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, float f) {
        ClosedFloatingPointRange<Float> closedFloatingPointRange;
        float f2 = (float) 2;
        float max = Math.max(((float) SliderKt.RangeSliderImpl$lambda$31(this.$totalWidth$delegate)) - (SliderKt.RangeSliderImpl$lambda$28(this.$endThumbWidth$delegate) / f2), 0.0f);
        float min = Math.min(SliderKt.RangeSliderImpl$lambda$25(this.$startThumbWidth$delegate) / f2, max);
        if (z) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max, this.$value.getEndInclusive().floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            closedFloatingPointRange = RangesKt.rangeTo(SliderKt.snapValueToTick(RangesKt.coerceIn(this.$rawOffsetStart.getValue().floatValue(), min, floatValue), this.$tickFractions, min, max), floatValue);
        } else {
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            mutableState2.setValue(Float.valueOf(mutableState2.getValue().floatValue() + f));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max, this.$value.getStart().floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            closedFloatingPointRange = RangesKt.rangeTo(floatValue2, SliderKt.snapValueToTick(RangesKt.coerceIn(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, max), this.$tickFractions, min, max));
        }
        this.$onValueChangeState.getValue().invoke(SliderKt.RangeSliderImpl$scaleToUserValue$33(this.$valueRange, min, max, closedFloatingPointRange));
    }
}
