package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {746, 766, 767}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* compiled from: Recomposer.kt */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 3
            r4 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r7) goto L_0x002c
            if (r2 == r4) goto L_0x0022
            if (r2 != r3) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x019c
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0022:
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.ResultKt.throwOnFailure(r22)
            r10 = r1
            goto L_0x018e
        L_0x002c:
            java.lang.Object r2 = r1.L$2
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r8 = r1.L$1
            androidx.compose.runtime.ProduceFrameSignal r8 = (androidx.compose.runtime.ProduceFrameSignal) r8
            java.lang.Object r9 = r1.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            kotlin.ResultKt.throwOnFailure(r22)
            r14 = r1
            r15 = r9
            goto L_0x00b5
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r1.L$0
            r8 = r2
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            java.lang.Object r2 = r1.L$1
            androidx.compose.runtime.MonotonicFrameClock r2 = (androidx.compose.runtime.MonotonicFrameClock) r2
            kotlin.coroutines.CoroutineContext r9 = r1.$recomposeCoroutineContext
            kotlinx.coroutines.Job$Key r10 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r10)
            if (r9 != 0) goto L_0x0059
            r9 = r7
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            kotlin.coroutines.CoroutineContext r10 = r1.$recomposeCoroutineContext
            if (r9 == 0) goto L_0x019f
            kotlin.coroutines.CoroutineContext r9 = r8.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r10 = r1.$recomposeCoroutineContext
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r10)
            kotlin.coroutines.CoroutineContext r10 = r8.getCoroutineContext()
            kotlinx.coroutines.Job r10 = kotlinx.coroutines.JobKt.getJob(r10)
            kotlinx.coroutines.CompletableJob r10 = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) r10)
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r10)
            kotlinx.coroutines.CoroutineScope r14 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r9)
            androidx.compose.runtime.ProduceFrameSignal r15 = new androidx.compose.runtime.ProduceFrameSignal
            r15.<init>()
            r9 = 0
            r10 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 r11 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
            androidx.compose.runtime.Recomposer r12 = r1.this$0
            r11.<init>(r12, r2, r15, r6)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r12 = 3
            r13 = 0
            kotlinx.coroutines.Job r2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r8, r9, r10, r11, r12, r13)
            r10 = r1
            r9 = r14
            r8 = r15
        L_0x0097:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.getShouldKeepRecomposing()
            if (r11 == 0) goto L_0x0174
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r12 = r10
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            r10.L$0 = r9
            r10.L$1 = r8
            r10.L$2 = r2
            r10.label = r7
            java.lang.Object r11 = r11.awaitWorkAvailable(r12)
            if (r11 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            r15 = r9
            r14 = r10
        L_0x00b5:
            androidx.compose.runtime.Recomposer r9 = r14.this$0
            java.lang.Object r16 = r9.stateLock
            androidx.compose.runtime.Recomposer r13 = r14.this$0
            monitor-enter(r16)
            java.util.Set r9 = r13.snapshotInvalidations     // Catch:{ all -> 0x0171 }
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x0171 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0171 }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x00ef
            java.util.List r10 = r13.knownCompositions     // Catch:{ all -> 0x0171 }
            int r11 = r10.size()     // Catch:{ all -> 0x0171 }
            r12 = 0
        L_0x00d5:
            if (r12 >= r11) goto L_0x00e5
            java.lang.Object r17 = r10.get(r12)     // Catch:{ all -> 0x0171 }
            r5 = r17
            androidx.compose.runtime.ControlledComposition r5 = (androidx.compose.runtime.ControlledComposition) r5     // Catch:{ all -> 0x0171 }
            r5.recordModificationsOf(r9)     // Catch:{ all -> 0x0171 }
            int r12 = r12 + 1
            goto L_0x00d5
        L_0x00e5:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0171 }
            r5.<init>()     // Catch:{ all -> 0x0171 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x0171 }
            r13.snapshotInvalidations = r5     // Catch:{ all -> 0x0171 }
        L_0x00ef:
            java.util.List r5 = r13.compositionInvalidations     // Catch:{ all -> 0x0171 }
            int r12 = r5.size()     // Catch:{ all -> 0x0171 }
            r11 = 0
        L_0x00f8:
            if (r11 >= r12) goto L_0x0134
            java.lang.Object r9 = r5.get(r11)     // Catch:{ all -> 0x0171 }
            androidx.compose.runtime.ControlledComposition r9 = (androidx.compose.runtime.ControlledComposition) r9     // Catch:{ all -> 0x0171 }
            int r10 = r13.concurrentCompositionsOutstanding     // Catch:{ all -> 0x0171 }
            int r10 = r10 + r7
            r13.concurrentCompositionsOutstanding = r10     // Catch:{ all -> 0x0171 }
            kotlin.coroutines.CoroutineContext r10 = androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(r9)     // Catch:{ all -> 0x0171 }
            r17 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 r7 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1     // Catch:{ all -> 0x0171 }
            r7.<init>(r13, r9, r6)     // Catch:{ all -> 0x0171 }
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch:{ all -> 0x0171 }
            r18 = 2
            r19 = 0
            r9 = r15
            r20 = r11
            r11 = r17
            r17 = r12
            r12 = r7
            r7 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0171 }
            int r11 = r20 + 1
            r13 = r7
            r12 = r17
            r14 = r18
            r7 = 1
            goto L_0x00f8
        L_0x0134:
            r7 = r13
            r18 = r14
            java.util.List r5 = r7.compositionInvalidations     // Catch:{ all -> 0x0171 }
            r5.clear()     // Catch:{ all -> 0x0171 }
            kotlinx.coroutines.CancellableContinuation r5 = r7.deriveStateLocked()     // Catch:{ all -> 0x0171 }
            if (r5 != 0) goto L_0x0164
            boolean r5 = r7.getHasConcurrentFrameWorkLocked()     // Catch:{ all -> 0x0171 }
            if (r5 == 0) goto L_0x014f
            kotlin.coroutines.Continuation r5 = r8.requestFrameLocked()     // Catch:{ all -> 0x0171 }
            goto L_0x0150
        L_0x014f:
            r5 = r6
        L_0x0150:
            monitor-exit(r16)
            if (r5 == 0) goto L_0x015e
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            java.lang.Object r7 = kotlin.Result.m6005constructorimpl(r7)
            r5.resumeWith(r7)
        L_0x015e:
            r9 = r15
            r10 = r18
            r7 = 1
            goto L_0x0097
        L_0x0164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0171 }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0171 }
            r0.<init>(r2)     // Catch:{ all -> 0x0171 }
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x0174:
            kotlin.coroutines.CoroutineContext r5 = r9.getCoroutineContext()
            kotlinx.coroutines.Job r5 = kotlinx.coroutines.JobKt.getJob(r5)
            r7 = r10
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r10.L$0 = r2
            r10.L$1 = r6
            r10.L$2 = r6
            r10.label = r4
            java.lang.Object r4 = kotlinx.coroutines.JobKt.cancelAndJoin(r5, r7)
            if (r4 != r0) goto L_0x018e
            return r0
        L_0x018e:
            r4 = r10
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r10.L$0 = r6
            r10.label = r3
            java.lang.Object r2 = kotlinx.coroutines.JobKt.cancelAndJoin(r2, r4)
            if (r2 != r0) goto L_0x019c
            return r0
        L_0x019c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x019f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "recomposeCoroutineContext may not contain a Job; found "
            r0.<init>(r2)
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r2 = r10.get(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
