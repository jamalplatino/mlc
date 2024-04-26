package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2", f = "Chip.kt", i = {}, l = {1711}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Chip.kt */
final class SelectableChipElevation$animateElevation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ float $target;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectableChipElevation$animateElevation$2(Animatable<Dp, AnimationVector1D> animatable, float f, Continuation<? super SelectableChipElevation$animateElevation$2> continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.$target = f;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectableChipElevation$animateElevation$2(this.$animatable, this.$target, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectableChipElevation$animateElevation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$animatable.snapTo(Dp.m5624boximpl(this.$target), this) == coroutine_suspended) {
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
