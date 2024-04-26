package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$3", f = "AppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: AppViewModel.kt */
final class AppViewModel$ChatState$requestGenerate$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $runtimeStats;
    int label;
    final /* synthetic */ AppViewModel.ChatState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ChatState$requestGenerate$1$3(AppViewModel.ChatState chatState, String str, Continuation<? super AppViewModel$ChatState$requestGenerate$1$3> continuation) {
        super(2, continuation);
        this.this$0 = chatState;
        this.$runtimeStats = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppViewModel$ChatState$requestGenerate$1$3(this.this$0, this.$runtimeStats, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppViewModel$ChatState$requestGenerate$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<String> report = this.this$0.getReport();
            String str = this.$runtimeStats;
            Intrinsics.checkNotNullExpressionValue(str, "runtimeStats");
            report.setValue(str);
            if (this.this$0.modelChatState.getValue() == ModelChatState.Generating) {
                this.this$0.switchToReady();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
