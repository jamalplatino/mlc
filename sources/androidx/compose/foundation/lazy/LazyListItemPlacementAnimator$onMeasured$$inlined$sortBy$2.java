package androidx.compose.foundation.lazy;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Comparisons.kt */
public final class LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2<T> implements Comparator {
    final /* synthetic */ LazyListItemPlacementAnimator this$0;

    public LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.this$0 = lazyListItemPlacementAnimator;
    }

    public final int compare(T t, T t2) {
        return ComparisonsKt.compareValues((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t2).getKey()));
    }
}