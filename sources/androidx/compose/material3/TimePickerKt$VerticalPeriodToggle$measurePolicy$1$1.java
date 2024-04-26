package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {
    public static final TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 INSTANCE = new TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1();

    TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1755measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), (Object) "Spacer")) {
                Placeable r2 = measurable.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, MathKt.roundToInt(measureScope.m5607toPx0680j_4(TimePickerTokens.INSTANCE.m2348getPeriodSelectorOutlineWidthD9Ej5fM())), 3, (Object) null));
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), (Object) "Spacer")) {
                        arrayList.add(next);
                    }
                }
                Iterable<Measurable> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                for (Measurable r4 : iterable2) {
                    arrayList2.add(r4.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, Constraints.m5569getMaxHeightimpl(j) / 2, 3, (Object) null)));
                }
                return MeasureScope.layout$default(measureScope, Constraints.m5570getMaxWidthimpl(j), Constraints.m5569getMaxHeightimpl(j), (Map) null, new TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1$measure$1((List) arrayList2, r2), 4, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
