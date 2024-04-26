package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "itemIndex", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasureResult.kt */
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i > ((LazyStaggeredGridItemInfo) CollectionsKt.last(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), CollectionsKt.binarySearch$default((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, (Function1) new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i), 3, (Object) null));
    }
}
