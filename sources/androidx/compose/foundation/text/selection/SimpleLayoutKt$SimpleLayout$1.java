package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SimpleLayout.kt */
final class SimpleLayoutKt$SimpleLayout$1 implements MeasurePolicy {
    public static final SimpleLayoutKt$SimpleLayout$1 INSTANCE = new SimpleLayoutKt$SimpleLayout$1();

    SimpleLayoutKt$SimpleLayout$1() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1061measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) list.get(i2)).m4520measureBRTryo0(j));
        }
        List list2 = arrayList;
        int size2 = list2.size();
        Integer num = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) list2.get(i3)).getWidth()));
        }
        int intValue = num.intValue();
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            i = Integer.valueOf(Math.max(i.intValue(), ((Placeable) list2.get(i4)).getHeight()));
        }
        return MeasureScope.layout$default(measureScope, intValue, i.intValue(), (Map) null, new SimpleLayoutKt$SimpleLayout$1$measure$1(list2), 4, (Object) null);
    }
}
