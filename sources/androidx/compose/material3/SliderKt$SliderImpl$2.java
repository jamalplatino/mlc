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
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$2 implements MeasurePolicy {
    final /* synthetic */ float $positionFraction;
    final /* synthetic */ MutableState<Float> $thumbWidth;
    final /* synthetic */ MutableState<Integer> $totalWidth;

    SliderKt$SliderImpl$2(MutableState<Float> mutableState, MutableState<Integer> mutableState2, float f) {
        this.$thumbWidth = mutableState;
        this.$totalWidth = mutableState2;
        this.$positionFraction = f;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1551measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                Placeable r2 = measurable.m4520measureBRTryo0(j);
                for (Measurable measurable2 : iterable) {
                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                        Placeable r7 = measurable2.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(ConstraintsKt.m5587offsetNN6EwU$default(j, -r2.getWidth(), 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                        int width = r7.getWidth() + r2.getWidth();
                        int max = Math.max(r7.getHeight(), r2.getHeight());
                        this.$thumbWidth.setValue(Float.valueOf((float) r2.getWidth()));
                        this.$totalWidth.setValue(Integer.valueOf(width));
                        return MeasureScope.layout$default(measureScope, width, max, (Map) null, new SliderKt$SliderImpl$2$measure$1(r7, r2.getWidth() / 2, (max - r7.getHeight()) / 2, r2, MathKt.roundToInt(((float) r7.getWidth()) * this.$positionFraction), (max - r2.getHeight()) / 2), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j2 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
