package androidx.compose.material3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Swipeable.kt */
final class SwipeableState$latestNonEmptyAnchorsFlow$1 extends Lambda implements Function0<Map<Float, ? extends T>> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$latestNonEmptyAnchorsFlow$1(SwipeableState<T> swipeableState) {
        super(0);
        this.this$0 = swipeableState;
    }

    public final Map<Float, T> invoke() {
        return this.this$0.getAnchors$material3_release();
    }
}
