package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {176, 890, 940, 193}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGestures$5(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super DragGestureDetectorKt$detectDragGestures$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0123 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0159 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x00a4
            if (r2 == r8) goto L_0x009a
            if (r2 == r5) goto L_0x0064
            if (r2 == r4) goto L_0x0028
            if (r2 != r3) goto L_0x001f
            kotlin.ResultKt.throwOnFailure(r24)
            r6 = r0
            r0 = r24
            goto L_0x02b4
        L_0x001f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0028:
            float r2 = r0.F$2
            float r10 = r0.F$1
            float r11 = r0.F$0
            int r12 = r0.I$0
            java.lang.Object r13 = r0.L$6
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            java.lang.Object r14 = r0.L$5
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            java.lang.Object r15 = r0.L$4
            androidx.compose.foundation.gestures.PointerDirectionConfig r15 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r15
            java.lang.Object r6 = r0.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            java.lang.Object r7 = r0.L$2
            kotlin.jvm.internal.Ref$LongRef r7 = (kotlin.jvm.internal.Ref.LongRef) r7
            java.lang.Object r3 = r0.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            kotlin.ResultKt.throwOnFailure(r24)
            r8 = 3
            r20 = r11
            r11 = r0
            r0 = r12
            r12 = r20
            r21 = r4
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r21
            r22 = r10
            r10 = r7
            r7 = r22
            goto L_0x0219
        L_0x0064:
            float r2 = r0.F$2
            float r3 = r0.F$1
            float r4 = r0.F$0
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$5
            kotlin.jvm.internal.Ref$LongRef r7 = (kotlin.jvm.internal.Ref.LongRef) r7
            java.lang.Object r10 = r0.L$4
            androidx.compose.foundation.gestures.PointerDirectionConfig r10 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r10
            java.lang.Object r11 = r0.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            java.lang.Object r12 = r0.L$2
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            java.lang.Object r13 = r0.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            java.lang.Object r14 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            kotlin.ResultKt.throwOnFailure(r24)
            r15 = r6
            r5 = r8
            r6 = r13
            r8 = r24
            r13 = r10
            r10 = r12
            r12 = r4
            r4 = r2
            r2 = r11
            r11 = r0
            r20 = r7
            r7 = r3
            r3 = r14
            r14 = r20
            goto L_0x0124
        L_0x009a:
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.ResultKt.throwOnFailure(r24)
            r3 = r24
            goto L_0x00be
        L_0x00a4:
            kotlin.ResultKt.throwOnFailure(r24)
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            r11 = 0
            r12 = 0
            r13 = r0
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
            r14 = 2
            r15 = 0
            r0.L$0 = r2
            r0.label = r8
            r10 = r2
            java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r10, r11, r12, r13, r14, r15)
            if (r3 != r1) goto L_0x00be
            return r1
        L_0x00be:
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            androidx.compose.ui.geometry.Offset$Companion r6 = androidx.compose.ui.geometry.Offset.Companion
            long r6 = r6.m2588getZeroF1C5BW0()
            r4.element = r6
            r6 = r0
        L_0x00ce:
            long r10 = r3.m4323getIdJ3iCeTQ()
            int r7 = r3.m4327getTypeT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHorizontalPointerDirectionConfig()
            androidx.compose.ui.input.pointer.PointerEvent r13 = r2.getCurrentEvent()
            boolean r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m289isPointerUpDmW0f2w(r13, r10)
            if (r13 == 0) goto L_0x00e8
            r0 = r9
        L_0x00e5:
            r8 = 3
            goto L_0x0261
        L_0x00e8:
            androidx.compose.ui.platform.ViewConfiguration r13 = r2.getViewConfiguration()
            float r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m290pointerSlopE8SPZFQ(r13, r7)
            kotlin.jvm.internal.Ref$LongRef r13 = new kotlin.jvm.internal.Ref$LongRef
            r13.<init>()
            r13.element = r10
            r10 = r4
            r11 = r6
            r14 = r13
            r4 = 0
            r15 = 0
            r6 = r3
            r13 = r12
            r3 = r2
            r12 = r7
            r7 = 0
        L_0x0101:
            r8 = r11
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r11.L$0 = r3
            r11.L$1 = r6
            r11.L$2 = r10
            r11.L$3 = r2
            r11.L$4 = r13
            r11.L$5 = r14
            r11.L$6 = r9
            r11.I$0 = r15
            r11.F$0 = r12
            r11.F$1 = r7
            r11.F$2 = r4
            r11.label = r5
            r5 = 1
            java.lang.Object r8 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r2, r9, r8, r5, r9)
            if (r8 != r1) goto L_0x0124
            return r1
        L_0x0124:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r5 = r8.getChanges()
            int r9 = r5.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r9) goto L_0x0159
            java.lang.Object r16 = r5.get(r0)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.ui.input.pointer.PointerInputChange) r17
            r24 = r1
            r18 = r2
            long r1 = r17.m4323getIdJ3iCeTQ()
            r19 = r9
            r17 = r10
            long r9 = r14.element
            boolean r1 = androidx.compose.ui.input.pointer.PointerId.m4309equalsimpl0(r1, r9)
            if (r1 == 0) goto L_0x014e
            goto L_0x0161
        L_0x014e:
            int r0 = r0 + 1
            r1 = r24
            r10 = r17
            r2 = r18
            r9 = r19
            goto L_0x012f
        L_0x0159:
            r24 = r1
            r18 = r2
            r17 = r10
            r16 = 0
        L_0x0161:
            r0 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            if (r0 != 0) goto L_0x0171
        L_0x0167:
            r1 = r24
            r2 = r3
            r3 = r6
            r6 = r11
            r4 = r17
            r0 = 0
            goto L_0x00e5
        L_0x0171:
            boolean r1 = r0.isConsumed()
            if (r1 == 0) goto L_0x0178
            goto L_0x0167
        L_0x0178:
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r0)
            if (r1 == 0) goto L_0x01b2
            java.util.List r0 = r8.getChanges()
            int r1 = r0.size()
            r2 = 0
        L_0x0187:
            if (r2 >= r1) goto L_0x019a
            java.lang.Object r5 = r0.get(r2)
            r8 = r5
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.getPressed()
            if (r8 == 0) goto L_0x0197
            goto L_0x019b
        L_0x0197:
            int r2 = r2 + 1
            goto L_0x0187
        L_0x019a:
            r5 = 0
        L_0x019b:
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            if (r5 != 0) goto L_0x01a0
            goto L_0x0167
        L_0x01a0:
            long r0 = r5.m4323getIdJ3iCeTQ()
            r14.element = r0
            r0 = r23
            r1 = r24
            r10 = r17
            r2 = r18
            r5 = 2
        L_0x01af:
            r9 = 0
            goto L_0x0101
        L_0x01b2:
            long r1 = r0.m4324getPositionF1C5BW0()
            long r8 = r0.m4325getPreviousPositionF1C5BW0()
            float r5 = r13.m316mainAxisDeltak4lQ0M(r1)
            float r10 = r13.m316mainAxisDeltak4lQ0M(r8)
            float r5 = r5 - r10
            float r1 = r13.m315crossAxisDeltak4lQ0M(r1)
            float r2 = r13.m315crossAxisDeltak4lQ0M(r8)
            float r1 = r1 - r2
            float r10 = r7 + r5
            float r2 = r4 + r1
            if (r15 == 0) goto L_0x01d7
            float r1 = java.lang.Math.abs(r10)
            goto L_0x01df
        L_0x01d7:
            long r4 = r13.m317offsetFromChangesdBAh8RU(r10, r2)
            float r1 = androidx.compose.ui.geometry.Offset.m2570getDistanceimpl(r4)
        L_0x01df:
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x022d
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r4 = r11
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r11.L$0 = r3
            r11.L$1 = r6
            r5 = r17
            r11.L$2 = r5
            r7 = r18
            r11.L$3 = r7
            r11.L$4 = r13
            r11.L$5 = r14
            r11.L$6 = r0
            r11.I$0 = r15
            r11.F$0 = r12
            r11.F$1 = r10
            r11.F$2 = r2
            r8 = 3
            r11.label = r8
            java.lang.Object r1 = r7.awaitPointerEvent(r1, r4)
            r4 = r24
            if (r1 != r4) goto L_0x020e
            return r4
        L_0x020e:
            r1 = r4
            r4 = r2
            r2 = r7
            r7 = r10
            r10 = r5
            r20 = r13
            r13 = r0
            r0 = r15
            r15 = r20
        L_0x0219:
            boolean r5 = r13.isConsumed()
            if (r5 == 0) goto L_0x0225
            r2 = r3
            r3 = r6
            r4 = r10
            r6 = r11
            r0 = 0
            goto L_0x0261
        L_0x0225:
            r13 = r15
            r5 = 2
            r9 = 0
            r15 = r0
            r0 = r23
            goto L_0x0101
        L_0x022d:
            r4 = r24
            r5 = r17
            r7 = r18
            r8 = 3
            if (r15 == 0) goto L_0x0241
            float r1 = java.lang.Math.signum(r10)
            float r1 = r1 * r12
            float r10 = r10 - r1
            long r1 = r13.m317offsetFromChangesdBAh8RU(r10, r2)
            goto L_0x0251
        L_0x0241:
            long r9 = r13.m317offsetFromChangesdBAh8RU(r10, r2)
            long r1 = androidx.compose.ui.geometry.Offset.m2567divtuRUvjQ(r9, r1)
            long r1 = androidx.compose.ui.geometry.Offset.m2579timestuRUvjQ(r1, r12)
            long r1 = androidx.compose.ui.geometry.Offset.m2576minusMKHz9U(r9, r1)
        L_0x0251:
            r0.consume()
            r5.element = r1
            boolean r1 = r0.isConsumed()
            if (r1 == 0) goto L_0x02ca
            r2 = r3
            r1 = r4
            r4 = r5
            r3 = r6
            r6 = r11
        L_0x0261:
            if (r0 == 0) goto L_0x0271
            boolean r5 = r0.isConsumed()
            if (r5 == 0) goto L_0x026a
            goto L_0x0271
        L_0x026a:
            r0 = r23
            r5 = 2
            r8 = 1
            r9 = 0
            goto L_0x00ce
        L_0x0271:
            if (r0 == 0) goto L_0x02c7
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r3 = r6.$onDragStart
            long r7 = r0.m4324getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2561boximpl(r7)
            r3.invoke(r5)
            kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r3 = r6.$onDrag
            long r4 = r4.element
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m2561boximpl(r4)
            r3.invoke(r0, r4)
            long r3 = r0.m4323getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2
            kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r6.$onDrag
            r0.<init>(r5)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r5 = r6
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.L$3 = r9
            r6.L$4 = r9
            r6.L$5 = r9
            r6.L$6 = r9
            r10 = 4
            r6.label = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m287dragjO51t88(r2, r3, r0, r5)
            if (r0 != r1) goto L_0x02b4
            return r1
        L_0x02b4:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02c2
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.$onDragCancel
            r0.invoke()
            goto L_0x02c7
        L_0x02c2:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.$onDragEnd
            r0.invoke()
        L_0x02c7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02ca:
            r0 = r23
            r1 = r4
            r10 = r5
            r2 = r7
            r4 = 0
            r5 = 2
            r7 = 0
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
