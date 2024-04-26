package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridSemantics.kt */
public final class LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 implements LazyLayoutSemanticState {
    final /* synthetic */ LazyStaggeredGridState $state;

    LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1(LazyStaggeredGridState lazyStaggeredGridState) {
        this.$state = lazyStaggeredGridState;
    }

    public float getCurrentPosition() {
        return ((float) this.$state.getFirstVisibleItemIndex()) + (((float) this.$state.getFirstVisibleItemScrollOffset()) / 100000.0f);
    }

    public boolean getCanScrollForward() {
        return this.$state.getCanScrollForward();
    }

    public Object animateScrollBy(float f, Continuation<? super Unit> continuation) {
        Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(this.$state, f, (AnimationSpec) null, continuation, 2, (Object) null);
        return animateScrollBy$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy$default : Unit.INSTANCE;
    }

    public Object scrollToItem(int i, Continuation<? super Unit> continuation) {
        Object scrollToItem$default = LazyStaggeredGridState.scrollToItem$default(this.$state, i, 0, continuation, 2, (Object) null);
        return scrollToItem$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem$default : Unit.INSTANCE;
    }

    public CollectionInfo collectionInfo() {
        return new CollectionInfo(-1, -1);
    }
}
