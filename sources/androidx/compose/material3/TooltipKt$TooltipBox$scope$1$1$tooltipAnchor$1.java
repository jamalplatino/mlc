package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1", f = "Tooltip.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Tooltip.kt */
final class TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Job> $onLongPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(Function0<? extends Job> function0, Continuation<? super TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1> continuation) {
        super(2, continuation);
        this.$onLongPress = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(this.$onLongPress, continuation);
        tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.L$0 = obj;
        return tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1", f = "Tooltip.kt", i = {0, 0, 0, 1, 1}, l = {217, 221, 229}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1  reason: invalid class name */
    /* compiled from: Tooltip.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(function0, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4 A[LOOP:0: B:27:0x009e->B:29:0x00a4, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x003c
                if (r1 == r4) goto L_0x002d
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x0092
            L_0x0017:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0020:
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r3 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x007d }
                goto L_0x00ae
            L_0x002d:
                long r6 = r14.J$0
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r4 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.ResultKt.throwOnFailure(r15)
                r15 = r4
                goto L_0x0065
            L_0x003c:
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                androidx.compose.ui.platform.ViewConfiguration r1 = r15.getViewConfiguration()
                long r12 = r1.getLongPressTimeoutMillis()
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r7 = 0
                r9 = r14
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r10 = 1
                r11 = 0
                r14.L$0 = r15
                r14.L$1 = r1
                r14.J$0 = r12
                r14.label = r4
                r6 = r15
                r8 = r1
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r6, r7, r8, r9, r10, r11)
                if (r4 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r6 = r12
            L_0x0065:
                androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1 r4 = new androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                r4.<init>(r1, r5)     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                r8 = r14
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                r14.L$0 = r15     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                r14.L$1 = r1     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                r14.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                java.lang.Object r15 = r15.withTimeout(r6, r4, r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x007c }
                if (r15 != r0) goto L_0x00ae
                return r0
            L_0x007c:
                r3 = r15
            L_0x007d:
                kotlin.jvm.functions.Function0<kotlinx.coroutines.Job> r15 = r3
                r15.invoke()
                r15 = r14
                kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
                r14.L$0 = r5
                r14.L$1 = r5
                r14.label = r2
                java.lang.Object r15 = r3.awaitPointerEvent(r1, r15)
                if (r15 != r0) goto L_0x0092
                return r0
            L_0x0092:
                androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                java.util.List r15 = r15.getChanges()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x009e:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x00ae
                java.lang.Object r0 = r15.next()
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                r0.consume()
                goto L_0x009e
            L_0x00ae:
                kotlin.Unit r15 = kotlin.Unit.INSTANCE
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Function0<Job> function0 = this.$onLongPress;
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), this) == coroutine_suspended) {
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
