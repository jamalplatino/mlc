package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Checkbox.kt */
final class CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 INSTANCE = new CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1();

    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<ToggleableState>) (Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, int i) {
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        Intrinsics.checkNotNullParameter(segment, "$this$animateFloat");
        composer.startReplaceableGroup(-1324481169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1324481169, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:253)");
        }
        if (segment.getInitialState() == ToggleableState.Off) {
            finiteAnimationSpec = AnimationSpecKt.snap$default(0, 1, (Object) null);
        } else if (segment.getTargetState() == ToggleableState.Off) {
            finiteAnimationSpec = AnimationSpecKt.snap(100);
        } else {
            finiteAnimationSpec = AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
