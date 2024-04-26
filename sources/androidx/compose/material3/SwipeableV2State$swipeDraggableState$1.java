package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u0000\u0003\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016JB\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"androidx/compose/material3/SwipeableV2State$swipeDraggableState$1", "Landroidx/compose/foundation/gestures/DraggableState;", "dragScope", "androidx/compose/material3/SwipeableV2State$swipeDraggableState$1$dragScope$1", "Landroidx/compose/material3/SwipeableV2State$swipeDraggableState$1$dragScope$1;", "dispatchRawDelta", "", "delta", "", "drag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeableV2.kt */
public final class SwipeableV2State$swipeDraggableState$1 implements DraggableState {
    /* access modifiers changed from: private */
    public final SwipeableV2State$swipeDraggableState$1$dragScope$1<T> dragScope;
    final /* synthetic */ SwipeableV2State<T> this$0;

    SwipeableV2State$swipeDraggableState$1(SwipeableV2State<T> swipeableV2State) {
        this.this$0 = swipeableV2State;
        this.dragScope = new SwipeableV2State$swipeDraggableState$1$dragScope$1(swipeableV2State);
    }

    public Object drag(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object access$swipe = this.this$0.swipe(mutatePriority, new SwipeableV2State$swipeDraggableState$1$drag$2(function2, this, (Continuation<? super SwipeableV2State$swipeDraggableState$1$drag$2>) null), continuation);
        return access$swipe == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$swipe : Unit.INSTANCE;
    }

    public void dispatchRawDelta(float f) {
        this.this$0.dispatchRawDelta(f);
    }
}
