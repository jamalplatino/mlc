package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {134, 138, 160}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0<? extends T> function0, Continuation<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlinx.coroutines.flow.FlowCollector} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e A[Catch:{ all -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0072
            if (r2 == r6) goto L_0x0058
            if (r2 == r5) goto L_0x0034
            if (r2 != r4) goto L_0x002b
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r7 = (androidx.compose.runtime.snapshots.ObserverHandle) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.Channel r8 = (kotlinx.coroutines.channels.Channel) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            goto L_0x006e
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0034:
            int r2 = r1.I$0
            java.lang.Object r7 = r1.L$5
            java.lang.Object r8 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r8 = (androidx.compose.runtime.snapshots.ObserverHandle) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.Channel r9 = (kotlinx.coroutines.channels.Channel) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r1.L$1
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x0054 }
            r13 = r17
            r14 = r1
            goto L_0x00f2
        L_0x0054:
            r0 = move-exception
            r7 = r8
            goto L_0x016c
        L_0x0058:
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r7 = (androidx.compose.runtime.snapshots.ObserverHandle) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.Channel r8 = (kotlinx.coroutines.channels.Channel) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
        L_0x006e:
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x016b }
            goto L_0x00cf
        L_0x0072:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r1.L$0
            r11 = r2
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r10 = r2
            java.util.Set r10 = (java.util.Set) r10
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 r2 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
            r2.<init>(r10)
            r9 = r2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            kotlinx.coroutines.channels.Channel r8 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r2, r8, r8, r7, r8)
            androidx.compose.runtime.snapshots.Snapshot$Companion r2 = androidx.compose.runtime.snapshots.Snapshot.Companion
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 r7 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
            r7.<init>(r8)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            androidx.compose.runtime.snapshots.ObserverHandle r7 = r2.registerApplyObserver(r7)
            androidx.compose.runtime.snapshots.Snapshot$Companion r2 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch:{ all -> 0x016b }
            androidx.compose.runtime.snapshots.Snapshot r2 = r2.takeSnapshot(r9)     // Catch:{ all -> 0x016b }
            kotlin.jvm.functions.Function0<T> r12 = r1.$block     // Catch:{ all -> 0x016b }
            androidx.compose.runtime.snapshots.Snapshot r13 = r2.makeCurrent()     // Catch:{ all -> 0x0166 }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x0160 }
            r2.restoreCurrent(r13)     // Catch:{ all -> 0x0166 }
            r2.dispose()     // Catch:{ all -> 0x016b }
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch:{ all -> 0x016b }
            r1.L$0 = r11     // Catch:{ all -> 0x016b }
            r1.L$1 = r10     // Catch:{ all -> 0x016b }
            r1.L$2 = r9     // Catch:{ all -> 0x016b }
            r1.L$3 = r8     // Catch:{ all -> 0x016b }
            r1.L$4 = r7     // Catch:{ all -> 0x016b }
            r1.L$5 = r12     // Catch:{ all -> 0x016b }
            r1.label = r6     // Catch:{ all -> 0x016b }
            java.lang.Object r2 = r11.emit(r12, r2)     // Catch:{ all -> 0x016b }
            if (r2 != r0) goto L_0x00ce
            return r0
        L_0x00ce:
            r2 = r12
        L_0x00cf:
            r12 = r1
        L_0x00d0:
            r13 = r12
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch:{ all -> 0x016b }
            r12.L$0 = r11     // Catch:{ all -> 0x016b }
            r12.L$1 = r10     // Catch:{ all -> 0x016b }
            r12.L$2 = r9     // Catch:{ all -> 0x016b }
            r12.L$3 = r8     // Catch:{ all -> 0x016b }
            r12.L$4 = r7     // Catch:{ all -> 0x016b }
            r12.L$5 = r2     // Catch:{ all -> 0x016b }
            r12.I$0 = r3     // Catch:{ all -> 0x016b }
            r12.label = r5     // Catch:{ all -> 0x016b }
            java.lang.Object r13 = r8.receive(r13)     // Catch:{ all -> 0x016b }
            if (r13 != r0) goto L_0x00ea
            return r0
        L_0x00ea:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r3
        L_0x00f2:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0054 }
        L_0x00f4:
            if (r2 != 0) goto L_0x00ff
            boolean r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(r11, r13)     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r2 = r3
            goto L_0x0100
        L_0x00ff:
            r2 = r6
        L_0x0100:
            java.lang.Object r13 = r9.m7550tryReceivePtdJZtk()     // Catch:{ all -> 0x0054 }
            java.lang.Object r13 = kotlinx.coroutines.channels.ChannelResult.m7535getOrNullimpl(r13)     // Catch:{ all -> 0x0054 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0054 }
            if (r13 != 0) goto L_0x00f4
            if (r2 == 0) goto L_0x0157
            r11.clear()     // Catch:{ all -> 0x0054 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r2 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch:{ all -> 0x0054 }
            androidx.compose.runtime.snapshots.Snapshot r2 = r2.takeSnapshot(r10)     // Catch:{ all -> 0x0054 }
            kotlin.jvm.functions.Function0<T> r13 = r14.$block     // Catch:{ all -> 0x0054 }
            androidx.compose.runtime.snapshots.Snapshot r15 = r2.makeCurrent()     // Catch:{ all -> 0x0152 }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x014c }
            r2.restoreCurrent(r15)     // Catch:{ all -> 0x0152 }
            r2.dispose()     // Catch:{ all -> 0x0054 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r7)     // Catch:{ all -> 0x0054 }
            if (r2 != 0) goto L_0x0157
            r2 = r14
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch:{ all -> 0x0054 }
            r14.L$0 = r12     // Catch:{ all -> 0x0054 }
            r14.L$1 = r11     // Catch:{ all -> 0x0054 }
            r14.L$2 = r10     // Catch:{ all -> 0x0054 }
            r14.L$3 = r9     // Catch:{ all -> 0x0054 }
            r14.L$4 = r8     // Catch:{ all -> 0x0054 }
            r14.L$5 = r13     // Catch:{ all -> 0x0054 }
            r14.label = r4     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r12.emit(r13, r2)     // Catch:{ all -> 0x0054 }
            if (r2 != r0) goto L_0x0145
            return r0
        L_0x0145:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r2 = r13
            goto L_0x015d
        L_0x014c:
            r0 = move-exception
            r3 = r0
            r2.restoreCurrent(r15)     // Catch:{ all -> 0x0152 }
            throw r3     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            r2.dispose()     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0157:
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x015d:
            r12 = r14
            goto L_0x00d0
        L_0x0160:
            r0 = move-exception
            r3 = r0
            r2.restoreCurrent(r13)     // Catch:{ all -> 0x0166 }
            throw r3     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            r2.dispose()     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016b:
            r0 = move-exception
        L_0x016c:
            r7.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
