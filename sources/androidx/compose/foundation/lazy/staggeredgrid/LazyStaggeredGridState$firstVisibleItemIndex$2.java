package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$firstVisibleItemIndex$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$firstVisibleItemIndex$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    public final Integer invoke() {
        Comparable comparable;
        int[] indices = this.this$0.getScrollPosition$foundation_release().getIndices();
        int i = 0;
        if (indices.length == 0) {
            comparable = null;
        } else {
            int i2 = indices[0];
            if (i2 == -1) {
                i2 = 0;
            }
            Comparable valueOf = Integer.valueOf(i2);
            IntIterator it = new IntRange(1, ArraysKt.getLastIndex(indices)).iterator();
            while (it.hasNext()) {
                int i3 = indices[it.nextInt()];
                if (i3 == -1) {
                    i3 = 0;
                }
                Comparable valueOf2 = Integer.valueOf(i3);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            comparable = valueOf;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }
}
