package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
final class SliderKt$RangeSliderImpl$2 implements MeasurePolicy {
    final /* synthetic */ MutableState<Float> $endThumbWidth$delegate;
    final /* synthetic */ Ref.ObjectRef<MutableState<Boolean>> $obtainedMeasurements;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ MutableState<Float> $startThumbWidth$delegate;
    final /* synthetic */ MutableState<Integer> $totalWidth$delegate;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    SliderKt$RangeSliderImpl$2(Ref.ObjectRef<MutableState<Boolean>> objectRef, MutableState<Float> mutableState, ClosedFloatingPointRange<Float> closedFloatingPointRange, MutableState<Float> mutableState2, float f, float f2, MutableState<Float> mutableState3, MutableState<Float> mutableState4, MutableState<Integer> mutableState5, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        this.$obtainedMeasurements = objectRef;
        this.$rawOffsetStart = mutableState;
        this.$value = closedFloatingPointRange;
        this.$rawOffsetEnd = mutableState2;
        this.$positionFractionStart = f;
        this.$positionFractionEnd = f2;
        this.$startThumbWidth$delegate = mutableState3;
        this.$endThumbWidth$delegate = mutableState4;
        this.$totalWidth$delegate = mutableState5;
        this.$valueRange = closedFloatingPointRange2;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1550measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        List<? extends Measurable> list2 = list;
        long j2 = j;
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                Placeable r14 = measurable.m4520measureBRTryo0(j2);
                for (Measurable measurable2 : iterable) {
                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                        Placeable r17 = measurable2.m4520measureBRTryo0(j2);
                        for (Measurable measurable3 : iterable) {
                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                Placeable r11 = measurable3.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(ConstraintsKt.m5587offsetNN6EwU$default(j, (-(r14.getWidth() + r17.getWidth())) / 2, 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                                int width = r11.getWidth() + ((r14.getWidth() + r17.getWidth()) / 2);
                                int max = Math.max(r11.getHeight(), Math.max(r14.getHeight(), r17.getHeight()));
                                SliderKt.RangeSliderImpl$lambda$26(this.$startThumbWidth$delegate, (float) r14.getWidth());
                                SliderKt.RangeSliderImpl$lambda$29(this.$endThumbWidth$delegate, (float) r17.getWidth());
                                SliderKt.RangeSliderImpl$lambda$32(this.$totalWidth$delegate, width);
                                if (!((Boolean) ((MutableState) this.$obtainedMeasurements.element).getValue()).booleanValue()) {
                                    float f = (float) 2;
                                    float max2 = Math.max(((float) SliderKt.RangeSliderImpl$lambda$31(this.$totalWidth$delegate)) - (SliderKt.RangeSliderImpl$lambda$28(this.$endThumbWidth$delegate) / f), 0.0f);
                                    float min = Math.min(SliderKt.RangeSliderImpl$lambda$25(this.$startThumbWidth$delegate) / f, max2);
                                    this.$rawOffsetStart.setValue(Float.valueOf(SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max2, this.$value.getStart().floatValue())));
                                    this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max2, this.$value.getEndInclusive().floatValue())));
                                    ((MutableState) this.$obtainedMeasurements.element).setValue(true);
                                }
                                return MeasureScope.layout$default(measureScope, width, max, (Map) null, new SliderKt$RangeSliderImpl$2$measure$1(r11, r14.getWidth() / 2, (max - r11.getHeight()) / 2, r14, MathKt.roundToInt(((float) r11.getWidth()) * this.$positionFractionStart), (max - r14.getHeight()) / 2, r17, MathKt.roundToInt((((float) r11.getWidth()) * this.$positionFractionEnd) + ((SliderKt.RangeSliderImpl$lambda$25(this.$startThumbWidth$delegate) - SliderKt.RangeSliderImpl$lambda$28(this.$endThumbWidth$delegate)) / ((float) 2))), (max - r17.getHeight()) / 2), 4, (Object) null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
