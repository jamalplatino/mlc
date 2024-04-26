package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$2", f = "Card.kt", i = {}, l = {681, 688}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Card.kt */
final class CardElevation$animateElevation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2(boolean z, Animatable<Dp, AnimationVector1D> animatable, CardElevation cardElevation, float f, Interaction interaction, Continuation<? super CardElevation$animateElevation$2> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$animatable = animatable;
        this.this$0 = cardElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardElevation$animateElevation$2(this.$enabled, this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardElevation$animateElevation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$enabled) {
                float r7 = this.$animatable.getTargetValue().m5640unboximpl();
                Interaction interaction = null;
                if (Dp.m5631equalsimpl0(r7, this.this$0.pressedElevation)) {
                    interaction = new PressInteraction.Press(Offset.Companion.m2588getZeroF1C5BW0(), (DefaultConstructorMarker) null);
                } else if (Dp.m5631equalsimpl0(r7, this.this$0.hoveredElevation)) {
                    interaction = new HoverInteraction.Enter();
                } else if (Dp.m5631equalsimpl0(r7, this.this$0.focusedElevation)) {
                    interaction = new FocusInteraction.Focus();
                } else if (Dp.m5631equalsimpl0(r7, this.this$0.draggedElevation)) {
                    interaction = new DragInteraction.Start();
                }
                this.label = 1;
                if (ElevationKt.m1336animateElevationrAjV9yQ(this.$animatable, this.$target, interaction, this.$interaction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 2;
                if (this.$animatable.snapTo(Dp.m5624boximpl(this.$target), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
