package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a!\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001ad\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t*\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00030\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aS\u0010\u0017\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aé\u0001\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112>\b\u0002\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u001100¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2\b\b\u0002\u0010\u001d\u001a\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00102\u001aÏ\u0001\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2>\b\u0002\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2\b\b\u0002\u0010\u001d\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00103\u001aA\u00104\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a!\u0010:\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a!\u0010:\u001a\u00020\u0004*\u0002002\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010<\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "Landroidx/compose/runtime/State;", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Draggable.kt */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onDelta");
        return new DefaultDraggableState(function1);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> function1, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(function1, "onDelta");
        composer.startReplaceableGroup(-183245213);
        ComposerKt.sourceInformation(composer, "C(rememberDraggableState)139@5983L29,140@6024L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3, int i, Object obj) {
        int i2 = i;
        return draggable(modifier, draggableState, orientation, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : mutableInteractionSource, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? new DraggableKt$draggable$1((Continuation<? super DraggableKt$draggable$1>) null) : function3, (i2 & 64) != 0 ? new DraggableKt$draggable$2((Continuation<? super DraggableKt$draggable$2>) null) : function32, (i2 & 128) != 0 ? false : z3);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z3) {
        Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function33 = function32;
        Modifier modifier2 = modifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        DraggableState draggableState2 = draggableState;
        Intrinsics.checkNotNullParameter(draggableState, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function34 = function3;
        Intrinsics.checkNotNullParameter(function34, "onDragStarted");
        Intrinsics.checkNotNullParameter(function33, "onDragStopped");
        boolean z4 = z2;
        return draggable(modifier, draggableState, DraggableKt$draggable$3.INSTANCE, orientation, z, mutableInteractionSource, new DraggableKt$draggable$4(z2), function34, new DraggableKt$draggable$5(function33, orientation, (Continuation<? super DraggableKt$draggable$5>) null), z3);
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Function1 function1, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, Function0 function0, Function3 function3, Function3 function32, boolean z2, int i, Object obj) {
        int i2 = i;
        return draggable(modifier, draggableState, function1, orientation, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : mutableInteractionSource, function0, (i2 & 64) != 0 ? new DraggableKt$draggable$6((Continuation<? super DraggableKt$draggable$6>) null) : function3, (i2 & 128) != 0 ? new DraggableKt$draggable$7((Continuation<? super DraggableKt$draggable$7>) null) : function32, (i2 & 256) != 0 ? false : z2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f1 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<java.lang.Boolean>> r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> r25) {
        /*
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L_0x001d
        L_0x0018:
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            r2.<init>(r1)
        L_0x001d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x00ce
            if (r4 == r10) goto L_0x00ac
            if (r4 == r7) goto L_0x009b
            if (r4 == r6) goto L_0x0072
            if (r4 != r5) goto L_0x0069
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r7 = r2.F$0
            int r12 = r2.I$0
            java.lang.Object r13 = r2.L$5
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            java.lang.Object r14 = r2.L$4
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            java.lang.Object r15 = r2.L$3
            androidx.compose.foundation.gestures.PointerDirectionConfig r15 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r15
            java.lang.Object r9 = r2.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r5 = r2.L$1
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = r2.L$0
            kotlin.jvm.internal.Ref$LongRef r6 = (kotlin.jvm.internal.Ref.LongRef) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r10 = r12
            r0 = r15
            r11 = 4
            r12 = r5
            r5 = r14
            r18 = r3
            r3 = r2
            r2 = r7
            r7 = r9
            r9 = r6
            r6 = r4
            r4 = r18
            goto L_0x02a3
        L_0x0069:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0072:
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r5 = r2.F$0
            int r6 = r2.I$0
            java.lang.Object r7 = r2.L$4
            kotlin.jvm.internal.Ref$LongRef r7 = (kotlin.jvm.internal.Ref.LongRef) r7
            java.lang.Object r9 = r2.L$3
            androidx.compose.foundation.gestures.PointerDirectionConfig r9 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r9
            java.lang.Object r12 = r2.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r2.L$1
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            java.lang.Object r14 = r2.L$0
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            kotlin.ResultKt.throwOnFailure(r1)
            r15 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r14
            r14 = 3
            goto L_0x01c5
        L_0x009b:
            java.lang.Object r0 = r2.L$2
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$1
            androidx.compose.ui.input.pointer.util.VelocityTracker r4 = (androidx.compose.ui.input.pointer.util.VelocityTracker) r4
            java.lang.Object r5 = r2.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0152
        L_0x00ac:
            java.lang.Object r0 = r2.L$4
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$3
            androidx.compose.ui.input.pointer.util.VelocityTracker r4 = (androidx.compose.ui.input.pointer.util.VelocityTracker) r4
            java.lang.Object r5 = r2.L$2
            androidx.compose.runtime.State r5 = (androidx.compose.runtime.State) r5
            java.lang.Object r6 = r2.L$1
            androidx.compose.runtime.State r6 = (androidx.compose.runtime.State) r6
            java.lang.Object r9 = r2.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r18 = r9
            r9 = r0
            r0 = r18
            r19 = r6
            r6 = r4
            r4 = r19
            goto L_0x00ee
        L_0x00ce:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r2.L$0 = r0
            r4 = r21
            r2.L$1 = r4
            r5 = r22
            r2.L$2 = r5
            r6 = r23
            r2.L$3 = r6
            r9 = r24
            r2.L$4 = r9
            r2.label = r10
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r0, r8, r1, r2)
            if (r1 != r3) goto L_0x00ee
            return r3
        L_0x00ee:
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r4.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0104
            goto L_0x02f2
        L_0x0104:
            java.lang.Object r4 = r5.getValue()
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x012c
            r1.consume()
            androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(r6, r1)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r2 = r0.m2588getZeroF1C5BW0()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2561boximpl(r2)
            kotlin.Pair r11 = kotlin.TuplesKt.to(r1, r0)
            goto L_0x02f2
        L_0x012c:
            r1 = 0
            r4 = 0
            r5 = 2
            r12 = 0
            r2.L$0 = r0
            r2.L$1 = r6
            r2.L$2 = r9
            r2.L$3 = r11
            r2.L$4 = r11
            r2.label = r7
            r20 = r0
            r21 = r1
            r22 = r4
            r23 = r2
            r24 = r5
            r25 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r20, r21, r22, r23, r24, r25)
            if (r1 != r3) goto L_0x014f
            return r3
        L_0x014f:
            r5 = r0
            r4 = r6
            r0 = r9
        L_0x0152:
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(r4, r1)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r12 = r7.m2588getZeroF1C5BW0()
            r6.element = r12
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1 r7 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            r7.<init>(r4, r6)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            long r12 = r1.m4323getIdJ3iCeTQ()
            int r1 = r1.m4327getTypeT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.toPointerDirectionConfig(r0)
            androidx.compose.ui.input.pointer.PointerEvent r4 = r5.getCurrentEvent()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m289isPointerUpDmW0f2w(r4, r12)
            if (r4 == 0) goto L_0x0184
            r13 = r11
            goto L_0x02e4
        L_0x0184:
            androidx.compose.ui.platform.ViewConfiguration r4 = r5.getViewConfiguration()
            float r1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m290pointerSlopE8SPZFQ(r4, r1)
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            r4.element = r12
            r9 = r6
            r12 = r7
            r13 = r10
            r6 = 0
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = 0
        L_0x019d:
            r3.L$0 = r9
            r3.L$1 = r12
            r3.L$2 = r7
            r3.L$3 = r0
            r3.L$4 = r5
            r3.L$5 = r11
            r3.I$0 = r13
            r3.F$0 = r2
            r3.F$1 = r6
            r3.F$2 = r1
            r14 = 3
            r3.label = r14
            java.lang.Object r15 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r7, r11, r3, r10, r11)
            if (r15 != r4) goto L_0x01bb
            return r4
        L_0x01bb:
            r18 = r2
            r2 = r1
            r1 = r15
            r15 = r13
            r13 = r12
            r12 = r7
            r7 = r5
            r5 = r18
        L_0x01c5:
            androidx.compose.ui.input.pointer.PointerEvent r1 = (androidx.compose.ui.input.pointer.PointerEvent) r1
            java.util.List r8 = r1.getChanges()
            int r10 = r8.size()
            r11 = 0
        L_0x01d0:
            if (r11 >= r10) goto L_0x01f7
            java.lang.Object r16 = r8.get(r11)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.ui.input.pointer.PointerInputChange) r17
            r21 = r15
            long r14 = r17.m4323getIdJ3iCeTQ()
            r17 = r12
            r22 = r13
            long r12 = r7.element
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.m4309equalsimpl0(r14, r12)
            if (r12 == 0) goto L_0x01ed
            goto L_0x01ff
        L_0x01ed:
            int r11 = r11 + 1
            r15 = r21
            r13 = r22
            r12 = r17
            r14 = 3
            goto L_0x01d0
        L_0x01f7:
            r17 = r12
            r22 = r13
            r21 = r15
            r16 = 0
        L_0x01ff:
            r13 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 != 0) goto L_0x0207
            goto L_0x02a9
        L_0x0207:
            boolean r8 = r13.isConsumed()
            if (r8 == 0) goto L_0x020f
            goto L_0x02a9
        L_0x020f:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r8 == 0) goto L_0x0249
            java.util.List r1 = r1.getChanges()
            int r8 = r1.size()
            r10 = 0
        L_0x021e:
            if (r10 >= r8) goto L_0x0231
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.getPressed()
            if (r12 == 0) goto L_0x022e
            goto L_0x0232
        L_0x022e:
            int r10 = r10 + 1
            goto L_0x021e
        L_0x0231:
            r11 = 0
        L_0x0232:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x0238
            goto L_0x02a9
        L_0x0238:
            long r10 = r11.m4323getIdJ3iCeTQ()
            r7.element = r10
            r13 = r21
            r12 = r22
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r17
            goto L_0x02ad
        L_0x0249:
            long r10 = r13.m4324getPositionF1C5BW0()
            long r14 = r13.m4325getPreviousPositionF1C5BW0()
            float r1 = r0.m316mainAxisDeltak4lQ0M(r10)
            float r8 = r0.m316mainAxisDeltak4lQ0M(r14)
            float r1 = r1 - r8
            float r8 = r0.m315crossAxisDeltak4lQ0M(r10)
            float r10 = r0.m315crossAxisDeltak4lQ0M(r14)
            float r8 = r8 - r10
            float r1 = r1 + r6
            float r2 = r2 + r8
            if (r21 == 0) goto L_0x026c
            float r6 = java.lang.Math.abs(r1)
            goto L_0x0274
        L_0x026c:
            long r10 = r0.m317offsetFromChangesdBAh8RU(r1, r2)
            float r6 = androidx.compose.ui.geometry.Offset.m2570getDistanceimpl(r10)
        L_0x0274:
            int r8 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x02b2
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r9
            r12 = r22
            r3.L$1 = r12
            r8 = r17
            r3.L$2 = r8
            r3.L$3 = r0
            r3.L$4 = r7
            r3.L$5 = r13
            r10 = r21
            r3.I$0 = r10
            r3.F$0 = r5
            r3.F$1 = r1
            r3.F$2 = r2
            r11 = 4
            r3.label = r11
            java.lang.Object r6 = r8.awaitPointerEvent(r6, r3)
            if (r6 != r4) goto L_0x029e
            return r4
        L_0x029e:
            r6 = r1
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r8
        L_0x02a3:
            boolean r8 = r13.isConsumed()
            if (r8 == 0) goto L_0x02ac
        L_0x02a9:
            r6 = r9
            r13 = 0
            goto L_0x02e4
        L_0x02ac:
            r13 = r10
        L_0x02ad:
            r8 = 0
            r10 = 1
            r11 = 0
            goto L_0x019d
        L_0x02b2:
            r10 = r21
            r12 = r22
            r8 = r17
            r11 = 4
            if (r10 == 0) goto L_0x02c6
            float r6 = java.lang.Math.signum(r1)
            float r6 = r6 * r5
            float r1 = r1 - r6
            long r1 = r0.m317offsetFromChangesdBAh8RU(r1, r2)
            goto L_0x02d6
        L_0x02c6:
            long r1 = r0.m317offsetFromChangesdBAh8RU(r1, r2)
            long r14 = androidx.compose.ui.geometry.Offset.m2567divtuRUvjQ(r1, r6)
            long r14 = androidx.compose.ui.geometry.Offset.m2579timestuRUvjQ(r14, r5)
            long r1 = androidx.compose.ui.geometry.Offset.m2576minusMKHz9U(r1, r14)
        L_0x02d6:
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2561boximpl(r1)
            r12.invoke(r13, r1)
            boolean r1 = r13.isConsumed()
            if (r1 == 0) goto L_0x02f3
            r6 = r9
        L_0x02e4:
            if (r13 == 0) goto L_0x02f1
            long r0 = r6.element
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2561boximpl(r0)
            kotlin.Pair r11 = kotlin.TuplesKt.to(r13, r0)
            goto L_0x02f2
        L_0x02f1:
            r11 = 0
        L_0x02f2:
            return r11
        L_0x02f3:
            r2 = r5
            r5 = r7
            r7 = r8
            r13 = r10
            r1 = 0
            r6 = 0
            goto L_0x02ad
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU  reason: not valid java name */
    public static final Object m306awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, VelocityTracker velocityTracker, SendChannel<? super DragEvent> sendChannel, boolean z, Orientation orientation, Continuation<? super Boolean> continuation) {
        long j2;
        SendChannel<? super DragEvent> sendChannel2 = sendChannel;
        boolean z2 = z;
        sendChannel.m7552trySendJP2dKIU(new DragEvent.DragStarted(Offset.m2576minusMKHz9U(pointerInputChange.m4324getPositionF1C5BW0(), OffsetKt.Offset(Offset.m2572getXimpl(j) * Math.signum(Offset.m2572getXimpl(pointerInputChange.m4324getPositionF1C5BW0())), Offset.m2573getYimpl(j) * Math.signum(Offset.m2573getYimpl(pointerInputChange.m4324getPositionF1C5BW0())))), (DefaultConstructorMarker) null));
        if (z2) {
            long j3 = j;
            j2 = Offset.m2579timestuRUvjQ(j, -1.0f);
        } else {
            j2 = j;
        }
        sendChannel.m7552trySendJP2dKIU(new DragEvent.DragDelta(j2, (DefaultConstructorMarker) null));
        VelocityTracker velocityTracker2 = velocityTracker;
        return m307onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.m4323getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, sendChannel, z), continuation);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        if ((!r16) != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: onDragOrUp-Axegvzg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m307onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.foundation.gestures.Orientation r21, long r22, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r24, kotlin.coroutines.Continuation<? super java.lang.Boolean> r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = (androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0050
            if (r3 != r5) goto L_0x0047
            java.lang.Object r3 = r1.L$4
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r7 = r1.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$0
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            kotlin.ResultKt.throwOnFailure(r0)
            r17 = r3
            r3 = r1
            r1 = r10
            r10 = r17
            goto L_0x009e
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r0)
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            r3 = r21
            if (r3 != r0) goto L_0x005c
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1.INSTANCE
            goto L_0x005e
        L_0x005c:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2.INSTANCE
        L_0x005e:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.input.pointer.PointerEvent r3 = r20.getCurrentEvent()
            r7 = r22
            boolean r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m289isPointerUpDmW0f2w(r3, r7)
            if (r3 == 0) goto L_0x0072
            r1 = r24
            r0 = r5
            r14 = r6
            goto L_0x012e
        L_0x0072:
            r3 = r1
            r9 = r2
            r1 = r24
            r2 = r0
            r0 = r20
        L_0x0079:
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.element = r7
            r7 = r0
            r17 = r9
            r9 = r2
            r2 = r17
        L_0x0086:
            r3.L$0 = r1
            r3.L$1 = r9
            r3.L$2 = r0
            r3.L$3 = r7
            r3.L$4 = r10
            r3.label = r5
            java.lang.Object r8 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r7, r6, r3, r5, r6)
            if (r8 != r2) goto L_0x0099
            return r2
        L_0x0099:
            r17 = r8
            r8 = r0
            r0 = r17
        L_0x009e:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.getChanges()
            int r12 = r11.size()
            r13 = 0
        L_0x00a9:
            if (r13 >= r12) goto L_0x00c8
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            r20 = r7
            long r6 = r15.m4323getIdJ3iCeTQ()
            long r4 = r10.element
            boolean r4 = androidx.compose.ui.input.pointer.PointerId.m4309equalsimpl0(r6, r4)
            if (r4 == 0) goto L_0x00c1
            goto L_0x00cb
        L_0x00c1:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r20
            goto L_0x00a9
        L_0x00c8:
            r20 = r7
            r14 = 0
        L_0x00cb:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            if (r14 != 0) goto L_0x00d2
            r0 = 1
            r14 = 0
            goto L_0x011d
        L_0x00d2:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r14)
            if (r4 == 0) goto L_0x0103
            java.util.List r0 = r0.getChanges()
            int r4 = r0.size()
            r5 = 0
        L_0x00e1:
            if (r5 >= r4) goto L_0x00f4
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.getPressed()
            if (r7 == 0) goto L_0x00f1
            goto L_0x00f5
        L_0x00f1:
            int r5 = r5 + 1
            goto L_0x00e1
        L_0x00f4:
            r6 = 0
        L_0x00f5:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00fb
            r0 = 1
            goto L_0x011d
        L_0x00fb:
            long r4 = r6.m4323getIdJ3iCeTQ()
            r10.element = r4
            r0 = 1
            goto L_0x0156
        L_0x0103:
            java.lang.Object r0 = r9.invoke(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            r0 = 1
            r16 = 1
            goto L_0x0119
        L_0x0116:
            r0 = 1
            r16 = 0
        L_0x0119:
            r4 = r16 ^ 1
            if (r4 == 0) goto L_0x0156
        L_0x011d:
            if (r14 != 0) goto L_0x0121
        L_0x011f:
            r14 = 0
            goto L_0x012e
        L_0x0121:
            boolean r4 = r14.isConsumed()
            if (r4 == 0) goto L_0x0128
            goto L_0x011f
        L_0x0128:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r14)
            if (r4 == 0) goto L_0x0141
        L_0x012e:
            if (r14 == 0) goto L_0x0136
            r1.invoke(r14)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x0136:
            r6 = 0
        L_0x0137:
            if (r6 == 0) goto L_0x013b
            r4 = r0
            goto L_0x013c
        L_0x013b:
            r4 = 0
        L_0x013c:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r0
        L_0x0141:
            r1.invoke(r14)
            long r4 = r14.m4323getIdJ3iCeTQ()
            r6 = 0
            r17 = r4
            r5 = r0
            r0 = r8
            r7 = r17
            r19 = r9
            r9 = r2
            r2 = r19
            goto L_0x0079
        L_0x0156:
            r7 = r20
            r5 = r0
            r0 = r8
            r6 = 0
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m307onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k  reason: not valid java name */
    public static final float m308toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m2573getYimpl(j) : Offset.m2572getXimpl(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU  reason: not valid java name */
    public static final float m309toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5852getYimpl(j) : Velocity.m5851getXimpl(j);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Function1<? super PointerInputChange, Boolean> function1, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, Function0<Boolean> function0, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z2) {
        Modifier modifier2 = modifier;
        Intrinsics.checkNotNullParameter(modifier2, "<this>");
        Intrinsics.checkNotNullParameter(draggableState, "state");
        Intrinsics.checkNotNullParameter(function1, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(function0, "startDragImmediately");
        Intrinsics.checkNotNullParameter(function3, "onDragStarted");
        Intrinsics.checkNotNullParameter(function32, "onDragStopped");
        return ComposedModifierKt.composed(modifier2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new DraggableKt$draggable$$inlined$debugInspectorInfo$1(function1, orientation, z, z2, mutableInteractionSource, function0, function3, function32, draggableState) : InspectableValueKt.getNoInspectorInfo(), new DraggableKt$draggable$9(mutableInteractionSource, function0, function1, function3, function32, draggableState, orientation, z, z2));
    }
}
