package androidx.compose.material3;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {135, 140}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehavior$longSnap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$longSnap$1(SnapFlingBehavior snapFlingBehavior, Continuation<? super SnapFlingBehavior$longSnap$1> continuation) {
        super(continuation);
        this.this$0 = snapFlingBehavior;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.longSnap((ScrollScope) null, 0.0f, this);
    }
}
