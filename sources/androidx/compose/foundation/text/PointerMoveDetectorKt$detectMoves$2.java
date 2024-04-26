package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: PointerMoveDetector.kt */
final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Offset, Unit> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super PointerMoveDetectorKt$detectMoves$2> continuation) {
        super(2, continuation);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineContext context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            final PointerEventPass pointerEventPass = this.$pointerEventPass;
            final Function1<Offset, Unit> function1 = this.$onMove;
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(new AnonymousClass1((Continuation<? super AnonymousClass1>) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1  reason: invalid class name */
    /* compiled from: PointerMoveDetector.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(context, pointerEventPass, function1, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r9.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L_0x0052
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = r10
                r10 = r9
            L_0x0032:
                kotlin.coroutines.CoroutineContext r4 = r8
                boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                if (r4 == 0) goto L_0x00b9
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r4
                r5 = r10
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r10.L$0 = r3
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r4 = r3.awaitPointerEvent(r4, r5)
                if (r4 != r0) goto L_0x004c
                return r0
            L_0x004c:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L_0x0052:
                androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                int r5 = r10.m4269getType7fucELk()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r6 = r6.m4282getMove7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m4276equalsimpl0(r5, r6)
                if (r6 == 0) goto L_0x0065
                goto L_0x007e
            L_0x0065:
                androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r6 = r6.m4280getEnter7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m4276equalsimpl0(r5, r6)
                if (r6 == 0) goto L_0x0072
                goto L_0x007e
            L_0x0072:
                androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r6 = r6.m4281getExit7fucELk()
                boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m4276equalsimpl0(r5, r6)
                if (r5 == 0) goto L_0x00b3
            L_0x007e:
                java.util.List r10 = r10.getChanges()
                java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                long r5 = r10.m4324getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2561boximpl(r5)
                long r5 = r10.m2582unboximpl()
                T r7 = r3.element
                boolean r5 = androidx.compose.ui.geometry.Offset.m2568equalsimpl(r5, r7)
                if (r5 != 0) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                r10 = 0
            L_0x009e:
                if (r10 == 0) goto L_0x00b3
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r5
                long r6 = r10.m2582unboximpl()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2561boximpl(r6)
                r3.element = r10
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2561boximpl(r6)
                r5.invoke(r10)
            L_0x00b3:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x0032
            L_0x00b9:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
