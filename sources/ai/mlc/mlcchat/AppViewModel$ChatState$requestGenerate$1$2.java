package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$ChatState$requestGenerate$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppViewModel.ChatState this$0;
    final /* synthetic */ AppViewModel this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ChatState$requestGenerate$1$2(AppViewModel.ChatState chatState, AppViewModel appViewModel) {
        super(0);
        this.this$0 = chatState;
        this.this$1 = appViewModel;
    }

    public final void invoke() {
        this.this$0.backend.decode();
        final String message = this.this$0.backend.getMessage();
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$1);
        final AppViewModel.ChatState chatState = this.this$0;
        Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), 3, (Object) null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$2$1", f = "AppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$2$1  reason: invalid class name */
    /* compiled from: AppViewModel.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(chatState, message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AppViewModel.ChatState chatState = chatState;
                MessageRole messageRole = MessageRole.Bot;
                String str = message;
                Intrinsics.checkNotNullExpressionValue(str, "newText");
                chatState.updateMessage(messageRole, str);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
