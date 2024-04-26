package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scrollable.kt */
final class ScrollingLogic$dispatchScroll$performScroll$1 extends Lambda implements Function1<Offset, Offset> {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = scrollScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2561boximpl(m370invokeMKHz9U(((Offset) obj).m2582unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m370invokeMKHz9U(long j) {
        NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
        long r7 = value.m4210dispatchPreScrollOzD1aCk(j, this.$source);
        long r12 = Offset.m2576minusMKHz9U(j, r7);
        ScrollingLogic scrollingLogic = this.this$0;
        long r9 = scrollingLogic.m363reverseIfNeededMKHz9U(scrollingLogic.m368toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(scrollingLogic.m367toFloatk4lQ0M(scrollingLogic.m363reverseIfNeededMKHz9U(r12)))));
        return Offset.m2577plusMKHz9U(Offset.m2577plusMKHz9U(r7, r9), value.m4208dispatchPostScrollDzOQY0M(r9, Offset.m2576minusMKHz9U(r12, r9), this.$source));
    }
}
