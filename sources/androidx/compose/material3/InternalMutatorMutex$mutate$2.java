package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 99}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* compiled from: InternalMutatorMutex.kt */
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super InternalMutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, continuation);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((InternalMutatorMutex$mutate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x009c=Splitter:B:20:0x009c, B:26:0x00ad=Splitter:B:26:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x002c
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r9.L$2
            androidx.compose.material3.InternalMutatorMutex r0 = (androidx.compose.material3.InternalMutatorMutex) r0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r2 = r9.L$0
            androidx.compose.material3.InternalMutatorMutex$Mutator r2 = (androidx.compose.material3.InternalMutatorMutex.Mutator) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0020 }
            goto L_0x009c
        L_0x0020:
            r10 = move-exception
            goto L_0x00ad
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002c:
            java.lang.Object r1 = r9.L$3
            androidx.compose.material3.InternalMutatorMutex r1 = (androidx.compose.material3.InternalMutatorMutex) r1
            java.lang.Object r3 = r9.L$2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r9.L$0
            androidx.compose.material3.InternalMutatorMutex$Mutator r6 = (androidx.compose.material3.InternalMutatorMutex.Mutator) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r5
            goto L_0x0087
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            androidx.compose.material3.InternalMutatorMutex$Mutator r1 = new androidx.compose.material3.InternalMutatorMutex$Mutator
            androidx.compose.foundation.MutatePriority r5 = r9.$priority
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r6 = (kotlin.coroutines.CoroutineContext.Key) r6
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10
            r1.<init>(r5, r10)
            androidx.compose.material3.InternalMutatorMutex r10 = r9.this$0
            r10.tryMutateOrCancel(r1)
            androidx.compose.material3.InternalMutatorMutex r10 = r9.this$0
            kotlinx.coroutines.sync.Mutex r10 = r10.mutex
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r9.$block
            androidx.compose.material3.InternalMutatorMutex r6 = r9.this$0
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r9.L$0 = r1
            r9.L$1 = r10
            r9.L$2 = r5
            r9.L$3 = r6
            r9.label = r3
            java.lang.Object r3 = r10.lock(r4, r7)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r3 = r5
            r8 = r6
            r6 = r1
            r1 = r8
        L_0x0087:
            r9.L$0 = r6     // Catch:{ all -> 0x00a7 }
            r9.L$1 = r10     // Catch:{ all -> 0x00a7 }
            r9.L$2 = r1     // Catch:{ all -> 0x00a7 }
            r9.L$3 = r4     // Catch:{ all -> 0x00a7 }
            r9.label = r2     // Catch:{ all -> 0x00a7 }
            java.lang.Object r2 = r3.invoke(r9)     // Catch:{ all -> 0x00a7 }
            if (r2 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r0 = r1
            r1 = r10
            r10 = r2
            r2 = r6
        L_0x009c:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00b5 }
            androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r4)     // Catch:{ all -> 0x00b5 }
            r1.unlock(r4)
            return r10
        L_0x00a7:
            r0 = move-exception
            r2 = r6
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
        L_0x00ad:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00b5 }
            androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r4)     // Catch:{ all -> 0x00b5 }
            throw r10     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r10 = move-exception
            r1.unlock(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.InternalMutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
