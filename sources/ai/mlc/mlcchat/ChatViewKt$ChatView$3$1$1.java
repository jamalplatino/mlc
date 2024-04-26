package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$ChatView$3$1$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ AppViewModel.ChatState $chatState;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $lazyColumnListState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$ChatView$3$1$1(CoroutineScope coroutineScope, AppViewModel.ChatState chatState, LazyListState lazyListState) {
        super(1);
        this.$coroutineScope = coroutineScope;
        this.$chatState = chatState;
        this.$lazyColumnListState = lazyListState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        CoroutineScope coroutineScope = this.$coroutineScope;
        final LazyListState lazyListState = this.$lazyColumnListState;
        final AppViewModel.ChatState chatState = this.$chatState;
        Function1 function1 = null;
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), 3, (Object) null);
        List messages = this.$chatState.getMessages();
        Function1 function12 = AnonymousClass2.INSTANCE;
        Function1 function13 = ChatViewKt$ChatView$3$1$1$invoke$$inlined$items$default$1.INSTANCE;
        int size = messages.size();
        if (function12 != null) {
            function1 = new ChatViewKt$ChatView$3$1$1$invoke$$inlined$items$default$2(function12, messages);
        }
        lazyListScope.items(size, function1, new ChatViewKt$ChatView$3$1$1$invoke$$inlined$items$default$3(function13, messages), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new ChatViewKt$ChatView$3$1$1$invoke$$inlined$items$default$4(messages)));
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableSingletons$ChatViewKt.INSTANCE.m6getLambda3$app_release(), 3, (Object) null);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "ai.mlc.mlcchat.ChatViewKt$ChatView$3$1$1$1", f = "ChatView.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ai.mlc.mlcchat.ChatViewKt$ChatView$3$1$1$1  reason: invalid class name */
    /* compiled from: ChatView.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(lazyListState, chatState, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListState = lazyListState;
                int size = chatState.getMessages().size();
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(lazyListState, size, 0, this, 2, (Object) null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
