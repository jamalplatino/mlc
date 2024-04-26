package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "index", "", "lane", "span", "key", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasureContext$measuredItemProvider$1 implements MeasuredItemFactory {
    final /* synthetic */ LazyStaggeredGridMeasureContext this$0;

    LazyStaggeredGridMeasureContext$measuredItemProvider$1(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        this.this$0 = lazyStaggeredGridMeasureContext;
    }

    public final LazyStaggeredGridMeasuredItem createItem(int i, int i2, int i3, Object obj, List<? extends Placeable> list) {
        Intrinsics.checkNotNullParameter(obj, "key");
        Intrinsics.checkNotNullParameter(list, "placeables");
        return new LazyStaggeredGridMeasuredItem(i, obj, list, this.this$0.isVertical(), this.this$0.getMainAxisSpacing(), i2, i3);
    }
}
