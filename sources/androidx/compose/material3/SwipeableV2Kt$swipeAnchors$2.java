package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$swipeAnchors$2 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AnchorChangeHandler<T> $anchorChangeHandler;
    final /* synthetic */ Function2<T, IntSize, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleValues;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$swipeAnchors$2(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, Function2<? super T, ? super IntSize, Float> function2) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleValues = set;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$calculateAnchor = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1664invokeozmzZPI(((IntSize) obj).m5790unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m1664invokeozmzZPI(long j) {
        AnchorChangeHandler<T> anchorChangeHandler;
        Map<T, Float> anchors$material3_release = this.$state.getAnchors$material3_release();
        Map linkedHashMap = new LinkedHashMap();
        Function2<T, IntSize, Float> function2 = this.$calculateAnchor;
        for (Object next : this.$possibleValues) {
            Float invoke = function2.invoke(next, IntSize.m5778boximpl(j));
            if (invoke != null) {
                linkedHashMap.put(next, invoke);
            }
        }
        if (!Intrinsics.areEqual((Object) anchors$material3_release, (Object) linkedHashMap)) {
            T targetValue = this.$state.getTargetValue();
            if (this.$state.updateAnchors$material3_release(linkedHashMap) && (anchorChangeHandler = this.$anchorChangeHandler) != null) {
                anchorChangeHandler.onAnchorsChanged(targetValue, anchors$material3_release, linkedHashMap);
            }
        }
    }
}
