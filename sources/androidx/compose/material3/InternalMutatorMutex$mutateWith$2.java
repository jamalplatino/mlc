package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 138}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* compiled from: InternalMutatorMutex.kt */
final class InternalMutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t, Continuation<? super InternalMutatorMutex$mutateWith$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = function2;
        this.$receiver = t;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((InternalMutatorMutex$mutateWith$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x00a4=Splitter:B:20:0x00a4, B:26:0x00b5=Splitter:B:26:0x00b5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0043
            if (r1 == r3) goto L_0x002c
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r10.L$2
            androidx.compose.material3.InternalMutatorMutex r0 = (androidx.compose.material3.InternalMutatorMutex) r0
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r2 = r10.L$0
            androidx.compose.material3.InternalMutatorMutex$Mutator r2 = (androidx.compose.material3.InternalMutatorMutex.Mutator) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0020 }
            goto L_0x00a4
        L_0x0020:
            r11 = move-exception
            goto L_0x00b5
        L_0x0023:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002c:
            java.lang.Object r1 = r10.L$4
            androidx.compose.material3.InternalMutatorMutex r1 = (androidx.compose.material3.InternalMutatorMutex) r1
            java.lang.Object r3 = r10.L$3
            java.lang.Object r5 = r10.L$2
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = r10.L$1
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r10.L$0
            androidx.compose.material3.InternalMutatorMutex$Mutator r7 = (androidx.compose.material3.InternalMutatorMutex.Mutator) r7
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r6
            goto L_0x008d
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            androidx.compose.material3.InternalMutatorMutex$Mutator r1 = new androidx.compose.material3.InternalMutatorMutex$Mutator
            androidx.compose.foundation.MutatePriority r5 = r10.$priority
            kotlin.coroutines.CoroutineContext r11 = r11.getCoroutineContext()
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r6 = (kotlin.coroutines.CoroutineContext.Key) r6
            kotlin.coroutines.CoroutineContext$Element r11 = r11.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11
            r1.<init>(r5, r11)
            androidx.compose.material3.InternalMutatorMutex r11 = r10.this$0
            r11.tryMutateOrCancel(r1)
            androidx.compose.material3.InternalMutatorMutex r11 = r10.this$0
            kotlinx.coroutines.sync.Mutex r11 = r11.mutex
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r10.$block
            T r6 = r10.$receiver
            androidx.compose.material3.InternalMutatorMutex r7 = r10.this$0
            r8 = r10
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r10.L$0 = r1
            r10.L$1 = r11
            r10.L$2 = r5
            r10.L$3 = r6
            r10.L$4 = r7
            r10.label = r3
            java.lang.Object r3 = r11.lock(r4, r8)
            if (r3 != r0) goto L_0x0089
            return r0
        L_0x0089:
            r3 = r6
            r9 = r7
            r7 = r1
            r1 = r9
        L_0x008d:
            r10.L$0 = r7     // Catch:{ all -> 0x00af }
            r10.L$1 = r11     // Catch:{ all -> 0x00af }
            r10.L$2 = r1     // Catch:{ all -> 0x00af }
            r10.L$3 = r4     // Catch:{ all -> 0x00af }
            r10.L$4 = r4     // Catch:{ all -> 0x00af }
            r10.label = r2     // Catch:{ all -> 0x00af }
            java.lang.Object r2 = r5.invoke(r3, r10)     // Catch:{ all -> 0x00af }
            if (r2 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            r0 = r1
            r1 = r11
            r11 = r2
            r2 = r7
        L_0x00a4:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00bd }
            androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r4)     // Catch:{ all -> 0x00bd }
            r1.unlock(r4)
            return r11
        L_0x00af:
            r0 = move-exception
            r2 = r7
            r9 = r1
            r1 = r11
            r11 = r0
            r0 = r9
        L_0x00b5:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00bd }
            androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r4)     // Catch:{ all -> 0x00bd }
            throw r11     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r11 = move-exception
            r1.unlock(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.InternalMutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
