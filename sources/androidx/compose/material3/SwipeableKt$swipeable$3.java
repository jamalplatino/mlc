package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "T", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Swipeable.kt */
final class SwipeableKt$swipeable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ResistanceConfig resistanceConfig, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z2;
        this.$resistance = resistanceConfig;
        this.$thresholds = function2;
        this.$velocityThreshold = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "$this$composed");
        composer.startReplaceableGroup(1169892884);
        ComposerKt.sourceInformation(composer, "C588@24733L7,590@24775L502,611@25538L55:Swipeable.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1169892884, i, -1, "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)");
        }
        if (!(!this.$anchors.isEmpty())) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        } else if (CollectionsKt.distinct(this.$anchors.values()).size() == this.$anchors.size()) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            final Density density = (Density) consume;
            this.$state.ensureInit$material3_release(this.$anchors);
            Map<Float, T> map = this.$anchors;
            SwipeableState<T> swipeableState = this.$state;
            final SwipeableState<T> swipeableState2 = this.$state;
            final Map<Float, T> map2 = this.$anchors;
            final ResistanceConfig resistanceConfig = this.$resistance;
            final Function2<T, T, ThresholdConfig> function2 = this.$thresholds;
            final float f = this.$velocityThreshold;
            EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3((Continuation<? super AnonymousClass3>) null), composer, 520);
            Modifier.Companion companion = Modifier.Companion;
            boolean isAnimationRunning = this.$state.isAnimationRunning();
            DraggableState draggableState$material3_release = this.$state.getDraggableState$material3_release();
            Modifier modifier2 = companion;
            Orientation orientation = this.$orientation;
            boolean z = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            SwipeableState<T> swipeableState3 = this.$state;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed((Object) swipeableState3);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwipeableKt$swipeable$3$4$1(swipeableState3, (Continuation<? super SwipeableKt$swipeable$3$4$1>) null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier draggable$default = DraggableKt.draggable$default(modifier2, draggableState$material3_release, orientation, z, mutableInteractionSource, isAnimationRunning, (Function3) null, (Function3) rememberedValue, this.$reverseDirection, 32, (Object) null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return draggable$default;
        } else {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {603}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3  reason: invalid class name */
    /* compiled from: Swipeable.kt */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(swipeableState2, map2, resistanceConfig, density, function2, f, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Map<Float, T> anchors$material3_release = swipeableState2.getAnchors$material3_release();
                swipeableState2.setAnchors$material3_release(map2);
                swipeableState2.setResistance$material3_release(resistanceConfig);
                SwipeableState<T> swipeableState = swipeableState2;
                final Map<Float, T> map = map2;
                final Function2<T, T, ThresholdConfig> function2 = function2;
                final Density density = density;
                swipeableState.setThresholds$material3_release(new Function2<Float, Float, Float>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    }

                    public final Float invoke(float f, float f2) {
                        return Float.valueOf(function2.invoke(MapsKt.getValue(map, Float.valueOf(f)), MapsKt.getValue(map, Float.valueOf(f2))).computeThreshold(density, f, f2));
                    }
                });
                swipeableState2.setVelocityThreshold$material3_release(density.m5607toPx0680j_4(f));
                this.label = 1;
                if (swipeableState2.processNewAnchors$material3_release(anchors$material3_release, map2, this) == coroutine_suspended) {
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
}
