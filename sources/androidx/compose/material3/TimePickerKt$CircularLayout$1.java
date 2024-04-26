package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$CircularLayout$1 implements MeasurePolicy {
    final /* synthetic */ float $radius;

    TimePickerKt$CircularLayout$1(float f) {
        this.$radius = f;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1751measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        Object obj2;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        float r14 = measureScope2.m5607toPx0680j_4(this.$radius);
        long r2 = Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        Iterable iterable = list2;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            Measurable measurable = (Measurable) next;
            if (!(LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector || LayoutIdKt.getLayoutId(measurable) == LayoutId.InnerCircle)) {
                arrayList.add(next);
            }
        }
        Iterable<Measurable> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (Measurable r6 : iterable2) {
            arrayList2.add(r6.m4520measureBRTryo0(r2));
        }
        List list3 = (List) arrayList2;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (LayoutIdKt.getLayoutId((Measurable) obj) == LayoutId.Selector) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (LayoutIdKt.getLayoutId((Measurable) obj2) == LayoutId.InnerCircle) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj2;
        return MeasureScope.layout$default(measureScope, Constraints.m5572getMinWidthimpl(j), Constraints.m5571getMinHeightimpl(j), (Map) null, new TimePickerKt$CircularLayout$1$measure$1(measurable2 != null ? measurable2.m4520measureBRTryo0(r2) : null, list3, measurable3 != null ? measurable3.m4520measureBRTryo0(r2) : null, j, r14, 6.2831855f / ((float) list3.size())), 4, (Object) null);
    }
}
