package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
/* compiled from: TransformGestureDetector.kt */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super TransformGestureDetectorKt$detectTransformGestures$2> continuation) {
        super(2, continuation);
        this.$panZoomLock = z;
        this.$onGesture = function4;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r7) goto L_0x0035
            if (r2 != r4) goto L_0x002c
            int r2 = r0.I$1
            float r8 = r0.F$2
            int r9 = r0.I$0
            long r10 = r0.J$0
            float r12 = r0.F$1
            float r13 = r0.F$0
            java.lang.Object r14 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            kotlin.ResultKt.throwOnFailure(r25)
            r3 = r25
            r15 = r0
            goto L_0x00a7
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            int r2 = r0.I$1
            float r8 = r0.F$2
            int r9 = r0.I$0
            long r10 = r0.J$0
            float r12 = r0.F$1
            float r13 = r0.F$0
            java.lang.Object r14 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x008b
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r25)
            java.lang.Object r2 = r0.L$0
            r14 = r2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.Companion
            long r12 = r2.m2588getZeroF1C5BW0()
            androidx.compose.ui.platform.ViewConfiguration r2 = r14.getViewConfiguration()
            float r2 = r2.getTouchSlop()
            r9 = 0
            r10 = 0
            r11 = r0
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            r15 = 2
            r16 = 0
            r0.L$0 = r14
            r0.F$0 = r5
            r0.F$1 = r3
            r0.J$0 = r12
            r0.I$0 = r6
            r0.F$2 = r2
            r0.I$1 = r6
            r0.label = r7
            r8 = r14
            r17 = r12
            r12 = r15
            r13 = r16
            java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r8, r9, r10, r11, r12, r13)
            if (r8 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r8 = r2
            r12 = r3
            r13 = r5
            r2 = r6
            r9 = r2
            r10 = r17
        L_0x008b:
            r15 = r0
        L_0x008c:
            r3 = r15
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r15.L$0 = r14
            r15.F$0 = r13
            r15.F$1 = r12
            r15.J$0 = r10
            r15.I$0 = r9
            r15.F$2 = r8
            r15.I$1 = r2
            r15.label = r4
            r4 = 0
            java.lang.Object r3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r14, r4, r3, r7, r4)
            if (r3 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            androidx.compose.ui.input.pointer.PointerEvent r3 = (androidx.compose.ui.input.pointer.PointerEvent) r3
            java.util.List r4 = r3.getChanges()
            int r5 = r4.size()
            r7 = r6
        L_0x00b2:
            if (r7 >= r5) goto L_0x00c5
            java.lang.Object r20 = r4.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r20 = (androidx.compose.ui.input.pointer.PointerInputChange) r20
            boolean r20 = r20.isConsumed()
            if (r20 == 0) goto L_0x00c2
            r4 = 1
            goto L_0x00c6
        L_0x00c2:
            int r7 = r7 + 1
            goto L_0x00b2
        L_0x00c5:
            r4 = r6
        L_0x00c6:
            if (r4 != 0) goto L_0x0176
            float r5 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateZoom(r3)
            float r7 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateRotation(r3)
            r25 = r7
            long r6 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculatePan(r3)
            if (r9 != 0) goto L_0x011b
            float r12 = r12 * r5
            float r13 = r13 + r25
            long r10 = androidx.compose.ui.geometry.Offset.m2577plusMKHz9U(r10, r6)
            r0 = 0
            float r21 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroidSize(r3, r0)
            r19 = r1
            r0 = 1
            float r1 = (float) r0
            float r1 = r1 - r12
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r21
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r22 * r13
            float r22 = r22 * r21
            r21 = 1127481344(0x43340000, float:180.0)
            float r22 = r22 / r21
            float r21 = java.lang.Math.abs(r22)
            float r22 = androidx.compose.ui.geometry.Offset.m2570getDistanceimpl(r10)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x010e
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x010e
            int r1 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x011e
        L_0x010e:
            boolean r1 = r15.$panZoomLock
            if (r1 == 0) goto L_0x0118
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0118
            r2 = r0
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r9 = r0
            goto L_0x011e
        L_0x011b:
            r19 = r1
            r0 = 1
        L_0x011e:
            if (r9 == 0) goto L_0x0178
            r1 = 0
            long r20 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroid(r3, r1)
            if (r2 == 0) goto L_0x012a
            r18 = 0
            goto L_0x012c
        L_0x012a:
            r18 = r25
        L_0x012c:
            r22 = 0
            int r23 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r23 != 0) goto L_0x0144
            int r23 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r23 != 0) goto L_0x0144
            androidx.compose.ui.geometry.Offset$Companion r23 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r23.m2588getZeroF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m2569equalsimpl0(r6, r0)
            if (r0 != 0) goto L_0x0159
        L_0x0144:
            kotlin.jvm.functions.Function4<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Float, java.lang.Float, kotlin.Unit> r0 = r15.$onGesture
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2561boximpl(r20)
            androidx.compose.ui.geometry.Offset r6 = androidx.compose.ui.geometry.Offset.m2561boximpl(r6)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r18)
            r0.invoke(r1, r6, r5, r7)
        L_0x0159:
            java.util.List r0 = r3.getChanges()
            int r1 = r0.size()
            r5 = 0
        L_0x0162:
            if (r5 >= r1) goto L_0x017c
            java.lang.Object r6 = r0.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.positionChanged(r6)
            if (r7 == 0) goto L_0x0173
            r6.consume()
        L_0x0173:
            int r5 = r5 + 1
            goto L_0x0162
        L_0x0176:
            r19 = r1
        L_0x0178:
            r16 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
        L_0x017c:
            if (r4 != 0) goto L_0x01a3
            java.util.List r0 = r3.getChanges()
            int r1 = r0.size()
            r3 = 0
        L_0x0187:
            if (r3 >= r1) goto L_0x01a3
            java.lang.Object r4 = r0.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L_0x01a0
            r0 = r24
            r1 = r19
            r5 = r22
            r4 = 2
            r6 = 0
            r7 = 1
            goto L_0x008c
        L_0x01a0:
            int r3 = r3 + 1
            goto L_0x0187
        L_0x01a3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
