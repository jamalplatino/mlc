package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TooltipSync$show$6", f = "Tooltip.kt", i = {}, l = {655}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Tooltip.kt */
final class TooltipSync$show$6 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $cleanUp;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $runBlock;
    final /* synthetic */ TooltipState $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TooltipSync$show$6(TooltipState tooltipState, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function0<Unit> function0, Continuation<? super TooltipSync$show$6> continuation) {
        super(1, continuation);
        this.$state = tooltipState;
        this.$runBlock = function1;
        this.$cleanUp = function0;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TooltipSync$show$6(this.$state, this.$runBlock, this.$cleanUp, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TooltipSync$show$6) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TooltipSync.INSTANCE.setMutexOwner(this.$state);
            Function1<Continuation<? super Unit>, Object> function1 = this.$runBlock;
            this.label = 1;
            if (function1.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                TooltipSync.INSTANCE.setMutexOwner((TooltipState) null);
                this.$cleanUp.invoke();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TooltipSync.INSTANCE.setMutexOwner((TooltipState) null);
        this.$cleanUp.invoke();
        return Unit.INSTANCE;
    }
}
