package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SearchBarKt$DockedSearchBar$3", f = "SearchBar.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: SearchBar.kt */
final class SearchBarKt$DockedSearchBar$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ FocusManager $focusManager;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$DockedSearchBar$3(boolean z, FocusManager focusManager, Continuation<? super SearchBarKt$DockedSearchBar$3> continuation) {
        super(2, continuation);
        this.$active = z;
        this.$focusManager = focusManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchBarKt$DockedSearchBar$3(this.$active, this.$focusManager, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchBarKt$DockedSearchBar$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$active) {
                this.label = 1;
                if (DelayKt.delay(100, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FocusManager.clearFocus$default(this.$focusManager, false, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
