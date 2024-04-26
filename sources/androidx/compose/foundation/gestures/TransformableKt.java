package androidx.compose.foundation.gestures;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "Landroidx/compose/runtime/State;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Transformable.kt */
public final class TransformableKt {
    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r27, androidx.compose.runtime.State<java.lang.Boolean> r28, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            r0 = r30
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = (androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 2
            r11 = 0
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r13) goto L_0x0055
            if (r2 != r10) goto L_0x004c
            int r2 = r1.I$1
            float r3 = r1.F$2
            int r4 = r1.I$0
            long r5 = r1.J$0
            float r7 = r1.F$1
            float r14 = r1.F$0
            java.lang.Object r15 = r1.L$2
            kotlinx.coroutines.channels.Channel r15 = (kotlinx.coroutines.channels.Channel) r15
            java.lang.Object r10 = r1.L$1
            androidx.compose.runtime.State r10 = (androidx.compose.runtime.State) r10
            java.lang.Object r13 = r1.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00dd
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            int r2 = r1.I$1
            float r3 = r1.F$2
            int r4 = r1.I$0
            long r5 = r1.J$0
            float r7 = r1.F$1
            float r10 = r1.F$0
            java.lang.Object r13 = r1.L$2
            kotlinx.coroutines.channels.Channel r13 = (kotlinx.coroutines.channels.Channel) r13
            java.lang.Object r14 = r1.L$1
            androidx.compose.runtime.State r14 = (androidx.compose.runtime.State) r14
            java.lang.Object r15 = r1.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00b5
        L_0x0071:
            kotlin.ResultKt.throwOnFailure(r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r13 = r0.m2588getZeroF1C5BW0()
            androidx.compose.ui.platform.ViewConfiguration r0 = r27.getViewConfiguration()
            float r0 = r0.getTouchSlop()
            r3 = 0
            r4 = 0
            r6 = 2
            r7 = 0
            r10 = r27
            r1.L$0 = r10
            r15 = r28
            r1.L$1 = r15
            r5 = r29
            r1.L$2 = r5
            r1.F$0 = r11
            r1.F$1 = r9
            r1.J$0 = r13
            r1.I$0 = r12
            r1.F$2 = r0
            r1.I$1 = r12
            r2 = 1
            r1.label = r2
            r2 = r27
            r5 = r1
            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L_0x00ab
            return r8
        L_0x00ab:
            r3 = r0
            r7 = r9
            r2 = r12
            r4 = r2
            r5 = r13
            r14 = r15
            r13 = r29
            r15 = r10
            r10 = r11
        L_0x00b5:
            r25 = r14
            r14 = r10
            r10 = r25
            r26 = r15
            r15 = r13
            r13 = r26
        L_0x00bf:
            r1.L$0 = r13
            r1.L$1 = r10
            r1.L$2 = r15
            r1.F$0 = r14
            r1.F$1 = r7
            r1.J$0 = r5
            r1.I$0 = r4
            r1.F$2 = r3
            r1.I$1 = r2
            r0 = 2
            r1.label = r0
            r0 = 0
            r9 = 1
            java.lang.Object r0 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r13, r0, r1, r9, r0)
            if (r0 != r8) goto L_0x00dd
            return r8
        L_0x00dd:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r9 = r0.getChanges()
            int r11 = r9.size()
        L_0x00e7:
            if (r12 >= r11) goto L_0x00fa
            java.lang.Object r19 = r9.get(r12)
            androidx.compose.ui.input.pointer.PointerInputChange r19 = (androidx.compose.ui.input.pointer.PointerInputChange) r19
            boolean r19 = r19.isConsumed()
            if (r19 == 0) goto L_0x00f7
            r9 = 1
            goto L_0x00fb
        L_0x00f7:
            int r12 = r12 + 1
            goto L_0x00e7
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            if (r9 != 0) goto L_0x01b4
            float r20 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateZoom(r0)
            float r11 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateRotation(r0)
            r27 = r1
            r28 = r2
            long r1 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculatePan(r0)
            if (r4 != 0) goto L_0x0160
            float r7 = r7 * r20
            float r14 = r14 + r11
            long r5 = androidx.compose.ui.geometry.Offset.m2577plusMKHz9U(r5, r1)
            r12 = 0
            float r18 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroidSize(r0, r12)
            r16 = r4
            r12 = 1
            float r4 = (float) r12
            float r4 = r4 - r7
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r18
            r19 = 1078530011(0x40490fdb, float:3.1415927)
            float r19 = r19 * r14
            float r19 = r19 * r18
            r18 = 1127481344(0x43340000, float:180.0)
            float r19 = r19 / r18
            float r18 = java.lang.Math.abs(r19)
            float r19 = androidx.compose.ui.geometry.Offset.m2570getDistanceimpl(r5)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0145
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0145
            int r4 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0162
        L_0x0145:
            java.lang.Object r4 = r10.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0157
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0157
            r4 = r12
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            androidx.compose.foundation.gestures.TransformEvent$TransformStarted r12 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE
            r15.m7552trySendJP2dKIU(r12)
            r16 = 1
            goto L_0x0164
        L_0x0160:
            r16 = r4
        L_0x0162:
            r4 = r28
        L_0x0164:
            if (r16 == 0) goto L_0x01b0
            if (r4 == 0) goto L_0x016c
            r11 = 0
            r23 = 0
            goto L_0x016f
        L_0x016c:
            r23 = r11
            r11 = 0
        L_0x016f:
            int r12 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r12 != 0) goto L_0x0185
            r12 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x0185
            androidx.compose.ui.geometry.Offset$Companion r17 = androidx.compose.ui.geometry.Offset.Companion
            long r11 = r17.m2588getZeroF1C5BW0()
            boolean r11 = androidx.compose.ui.geometry.Offset.m2569equalsimpl0(r1, r11)
            if (r11 != 0) goto L_0x0193
        L_0x0185:
            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r11 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta
            r24 = 0
            r19 = r11
            r21 = r1
            r19.<init>(r20, r21, r23, r24)
            r15.m7552trySendJP2dKIU(r11)
        L_0x0193:
            java.util.List r1 = r0.getChanges()
            int r2 = r1.size()
            r11 = 0
        L_0x019c:
            if (r11 >= r2) goto L_0x01b0
            java.lang.Object r12 = r1.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r17 = androidx.compose.ui.input.pointer.PointerEventKt.positionChanged(r12)
            if (r17 == 0) goto L_0x01ad
            r12.consume()
        L_0x01ad:
            int r11 = r11 + 1
            goto L_0x019c
        L_0x01b0:
            r2 = r4
            r4 = r16
            goto L_0x01ba
        L_0x01b4:
            r27 = r1
            r28 = r2
            r16 = r4
        L_0x01ba:
            if (r9 != 0) goto L_0x01de
            java.util.List r0 = r0.getChanges()
            int r1 = r0.size()
            r9 = 0
        L_0x01c5:
            if (r9 >= r1) goto L_0x01de
            java.lang.Object r11 = r0.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x01db
            r1 = r27
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = 0
            goto L_0x00bf
        L_0x01db:
            int r9 = r9 + 1
            goto L_0x01c5
        L_0x01de:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, kotlinx.coroutines.channels.Channel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(transformableState, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TransformableKt$transformable$$inlined$debugInspectorInfo$1(transformableState, z2, z) : InspectableValueKt.getNoInspectorInfo(), new TransformableKt$transformable$2(z, z2, transformableState));
    }
}
