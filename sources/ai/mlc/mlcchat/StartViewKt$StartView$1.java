package ai.mlc.mlcchat;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "ai.mlc.mlcchat.StartViewKt$StartView$1", f = "StartView.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: StartView.kt */
final class StartViewKt$StartView$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusManager $localFocusManager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$StartView$1(FocusManager focusManager, Continuation<? super StartViewKt$StartView$1> continuation) {
        super(2, continuation);
        this.$localFocusManager = focusManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StartViewKt$StartView$1 startViewKt$StartView$1 = new StartViewKt$StartView$1(this.$localFocusManager, continuation);
        startViewKt$StartView$1.L$0 = obj;
        return startViewKt$StartView$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((StartViewKt$StartView$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FocusManager focusManager = this.$localFocusManager;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, (Function1) null, (Function1) null, (Function3) null, new Function1<Offset, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25invokek4lQ0M(((Offset) obj).m2582unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m25invokek4lQ0M(long j) {
                    FocusManager.clearFocus$default(focusManager, false, 1, (Object) null);
                }
            }, this, 7, (Object) null) == coroutine_suspended) {
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
