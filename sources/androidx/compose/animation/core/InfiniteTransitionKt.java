package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000e\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\fH\u0007¢\u0006\u0002\u0010\u0015\u001ac\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: InfiniteTransition.kt */
public final class InfiniteTransitionKt {
    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1013651573);
        ComposerKt.sourceInformation(composer, "C(rememberInfiniteTransition)45@1981L38,46@2043L5:InfiniteTransition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return infiniteTransition;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(InfiniteTransition infiniteTransition, T t, T t2, TwoWayConverter<T, V> twoWayConverter, InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        InfiniteRepeatableSpec<T> infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        TwoWayConverter<T, V> twoWayConverter2 = twoWayConverter;
        Intrinsics.checkNotNullParameter(twoWayConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(infiniteRepeatableSpec, "animationSpec");
        composer2.startReplaceableGroup(-1062847727);
        ComposerKt.sourceInformation(composer2, "C(animateValue)P(1,3,4)262@10743L151,268@10900L357,280@11263L166:InfiniteTransition.kt#pdpnli");
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:254)");
        }
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        InfiniteTransition.TransitionAnimationState transitionAnimationState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            InfiniteTransition.TransitionAnimationState transitionAnimationState2 = new InfiniteTransition.TransitionAnimationState(infiniteTransition, t, t2, twoWayConverter, infiniteRepeatableSpec2, str2);
            composer2.updateRememberedValue(transitionAnimationState2);
            transitionAnimationState = transitionAnimationState2;
        }
        composer.endReplaceableGroup();
        InfiniteTransition.TransitionAnimationState transitionAnimationState3 = (InfiniteTransition.TransitionAnimationState) transitionAnimationState;
        T t3 = t;
        T t4 = t2;
        EffectsKt.SideEffect(new InfiniteTransitionKt$animateValue$1(t, transitionAnimationState3, t2, infiniteRepeatableSpec), composer2, 0);
        EffectsKt.DisposableEffect((Object) transitionAnimationState3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new InfiniteTransitionKt$animateValue$2(infiniteTransition, transitionAnimationState3), composer2, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState3;
    }

    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        int i3 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        InfiniteRepeatableSpec<Float> infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        Intrinsics.checkNotNullParameter(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(-644770905);
        ComposerKt.sourceInformation(composer, "C(animateFloat)P(1,3)316@12588L84:InfiniteTransition.kt#pdpnli");
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i3, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        int i4 = i3 << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), infiniteRepeatableSpec, str2, composer, (i3 & 112) | 8 | (i3 & 896) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i) {
        composer.startReplaceableGroup(-840193660);
        ComposerKt.sourceInformation(composer, "C(rememberInfiniteTransition)324@12880L48:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberInfiniteTransition;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        TwoWayConverter twoWayConverter2 = twoWayConverter;
        Intrinsics.checkNotNullParameter(twoWayConverter, "typeConverter");
        InfiniteRepeatableSpec infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        Intrinsics.checkNotNullParameter(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(-1695411770);
        ComposerKt.sourceInformation(composer, "C(animateValue)P(1,2,3)338@13274L202:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:332)");
        }
        int i3 = (i2 >> 3) & 8;
        State animateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i3 << 6) | (i3 << 3) | 196616 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        Intrinsics.checkNotNullParameter(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(469472752);
        ComposerKt.sourceInformation(composer, "C(animateFloat)P(1,2)357@13770L155:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:352)");
        }
        State<Float> animateFloat = animateFloat(infiniteTransition, f, f2, infiniteRepeatableSpec, "FloatAnimation", composer, (i & 112) | 24584 | (i & 896) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloat;
    }
}
