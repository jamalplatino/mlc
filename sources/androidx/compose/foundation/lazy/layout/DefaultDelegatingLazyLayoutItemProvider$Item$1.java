package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyLayoutItemProvider.kt */
final class DefaultDelegatingLazyLayoutItemProvider$Item$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ DefaultDelegatingLazyLayoutItemProvider $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultDelegatingLazyLayoutItemProvider$Item$1(DefaultDelegatingLazyLayoutItemProvider defaultDelegatingLazyLayoutItemProvider, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = defaultDelegatingLazyLayoutItemProvider;
        this.$index = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.Item(this.$index, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
