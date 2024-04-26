package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "ai.mlc.mlcchat.AppViewModel$ChatState$mainTerminateChat$1$2", f = "AppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: AppViewModel.kt */
final class AppViewModel$ChatState$mainTerminateChat$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    int label;
    final /* synthetic */ AppViewModel.ChatState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ChatState$mainTerminateChat$1$2(AppViewModel.ChatState chatState, Function0<Unit> function0, Continuation<? super AppViewModel$ChatState$mainTerminateChat$1$2> continuation) {
        super(2, continuation);
        this.this$0 = chatState;
        this.$callback = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppViewModel$ChatState$mainTerminateChat$1$2(this.this$0, this.$callback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppViewModel$ChatState$mainTerminateChat$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.clearHistory();
            this.this$0.switchToReady();
            this.$callback.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
