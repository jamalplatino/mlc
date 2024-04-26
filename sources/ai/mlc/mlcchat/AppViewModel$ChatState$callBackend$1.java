package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "ai.mlc.mlcchat.AppViewModel$ChatState$callBackend$1", f = "AppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: AppViewModel.kt */
final class AppViewModel$ChatState$callBackend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Exception $e;
    int label;
    final /* synthetic */ AppViewModel.ChatState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ChatState$callBackend$1(Exception exc, AppViewModel.ChatState chatState, Continuation<? super AppViewModel$ChatState$callBackend$1> continuation) {
        super(2, continuation);
        this.$e = exc;
        this.this$0 = chatState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppViewModel$ChatState$callBackend$1(this.$e, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppViewModel$ChatState$callBackend$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String stackTraceToString = ExceptionsKt.stackTraceToString(this.$e);
            this.this$0.appendMessage(MessageRole.Bot, "MLCChat failed\n\nStack trace:\n" + stackTraceToString + "\n\nError message:\n" + this.$e.getLocalizedMessage());
            this.this$0.switchToFailed();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
