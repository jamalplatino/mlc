package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoreText.kt */
final class CoreTextKt$InlineChildren$1$2 implements MeasurePolicy {
    public static final CoreTextKt$InlineChildren$1$2 INSTANCE = new CoreTextKt$InlineChildren$1$2();

    CoreTextKt$InlineChildren$1$2() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m878measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "children");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).m4520measureBRTryo0(j));
        }
        return MeasureScope.layout$default(measureScope, Constraints.m5570getMaxWidthimpl(j), Constraints.m5569getMaxHeightimpl(j), (Map) null, new CoreTextKt$InlineChildren$1$2$measure$1(arrayList), 4, (Object) null);
    }
}
