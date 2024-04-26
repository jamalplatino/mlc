package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$firstVisibleItemScrollOffset$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$firstVisibleItemScrollOffset$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    public final Integer invoke() {
        int[] offsets = this.this$0.getScrollPosition$foundation_release().getOffsets();
        LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
        int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
        int[] indices = lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices();
        int length = offsets.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            if (indices[i3] == firstVisibleItemIndex) {
                i2 = Math.min(i2, offsets[i3]);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i = i2;
        }
        return Integer.valueOf(i);
    }
}
