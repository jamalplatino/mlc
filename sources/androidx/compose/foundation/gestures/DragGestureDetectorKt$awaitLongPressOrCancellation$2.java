package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {811, 828}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x007c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a8 A[EDGE_INSN: B:65:0x00a8->B:28:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc A[EDGE_INSN: B:67:0x00dc->B:38:0x00dc ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r6) goto L_0x002c
            if (r2 != r3) goto L_0x0023
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r18
            r5 = r0
            goto L_0x00be
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002c:
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r18)
            r9 = r18
            r8 = r7
            r7 = r0
            goto L_0x005f
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            r8 = r0
            r7 = r2
            r2 = 0
        L_0x0044:
            if (r2 != 0) goto L_0x0158
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r10 = r8
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            r8.L$0 = r7
            r8.L$1 = r4
            r8.I$0 = r2
            r8.label = r6
            java.lang.Object r9 = r7.awaitPointerEvent(r9, r10)
            if (r9 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r16 = r8
            r8 = r7
            r7 = r16
        L_0x005f:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r10 = r9.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x006a:
            if (r12 >= r11) goto L_0x007c
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            boolean r13 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r13 != 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            int r12 = r12 + 1
            goto L_0x006a
        L_0x007c:
            r2 = r6
        L_0x007d:
            java.util.List r10 = r9.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x0086:
            if (r12 >= r11) goto L_0x00a8
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            boolean r14 = r13.isConsumed()
            if (r14 != 0) goto L_0x00a7
            long r14 = r8.m4240getSizeYbymL2g()
            long r4 = r8.m4239getExtendedTouchPaddingNHjbRc()
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.m4272isOutOfBoundsjwHxaWs(r13, r14, r4)
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            int r12 = r12 + 1
            r4 = 0
            goto L_0x0086
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.L$0 = r8
            r7.L$1 = r9
            r7.I$0 = r2
            r7.label = r3
            java.lang.Object r4 = r8.awaitPointerEvent(r4, r5)
            if (r4 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r5 = r7
            r7 = r9
        L_0x00be:
            androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.ui.input.pointer.PointerEvent) r4
            java.util.List r4 = r4.getChanges()
            int r9 = r4.size()
            r10 = 0
        L_0x00c9:
            if (r10 >= r9) goto L_0x00dc
            java.lang.Object r11 = r4.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.isConsumed()
            if (r11 == 0) goto L_0x00d9
            r2 = r6
            goto L_0x00dc
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x00c9
        L_0x00dc:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$currentDown
            T r4 = r4.element
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            long r9 = r4.m4323getIdJ3iCeTQ()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m289isPointerUpDmW0f2w(r7, r9)
            if (r4 == 0) goto L_0x011e
            java.util.List r4 = r7.getChanges()
            int r7 = r4.size()
            r9 = 0
        L_0x00f5:
            if (r9 >= r7) goto L_0x0108
            java.lang.Object r10 = r4.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x0105
            goto L_0x0109
        L_0x0105:
            int r9 = r9 + 1
            goto L_0x00f5
        L_0x0108:
            r10 = 0
        L_0x0109:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 == 0) goto L_0x011a
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$currentDown
            r4.element = r10
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$longPress
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r7 = r5.$currentDown
            T r7 = r7.element
            r4.element = r7
            goto L_0x0152
        L_0x011a:
            r2 = r6
            r7 = r8
            r4 = 0
            goto L_0x0155
        L_0x011e:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$longPress
            java.util.List r7 = r7.getChanges()
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r9 = r5.$currentDown
            int r10 = r7.size()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x014f
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            long r13 = r13.m4323getIdJ3iCeTQ()
            T r15 = r9.element
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            r18 = r7
            long r6 = r15.m4323getIdJ3iCeTQ()
            boolean r6 = androidx.compose.ui.input.pointer.PointerId.m4309equalsimpl0(r13, r6)
            if (r6 == 0) goto L_0x0149
            goto L_0x0150
        L_0x0149:
            int r11 = r11 + 1
            r7 = r18
            r6 = 1
            goto L_0x012b
        L_0x014f:
            r12 = 0
        L_0x0150:
            r4.element = r12
        L_0x0152:
            r7 = r8
            r4 = 0
            r6 = 1
        L_0x0155:
            r8 = r5
            goto L_0x0044
        L_0x0158:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
