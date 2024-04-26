package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$7$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentScope<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1<AnimatedContentScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$7$1(Transition<S> transition, S s, int i, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, AnimatedContentScope<S> animatedContentScope, Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> function4, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$$dirty = i;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentScope;
        this.$content = function4;
        this.$currentlyVisible = snapshotStateList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ExitTransition exitTransition;
        Composer composer2 = composer;
        int i2 = i;
        ComposerKt.sourceInformation(composer, "C664@30979L38,668@31193L323,675@31549L111,680@31843L1164:AnimatedContent.kt#xbi5r1");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(885640742, i2, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:663)");
            }
            Function1<AnimatedContentScope<S>, ContentTransform> function1 = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope = this.$rootScope;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = function1.invoke(animatedContentScope);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final ContentTransform contentTransform = (ContentTransform) rememberedValue;
            Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual((Object) this.$this_AnimatedContent.getSegment().getTargetState(), (Object) this.$stateForContent));
            Transition<S> transition = this.$this_AnimatedContent;
            S s = this.$stateForContent;
            Function1<AnimatedContentScope<S>, ContentTransform> function12 = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope2 = this.$rootScope;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed((Object) valueOf);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                if (Intrinsics.areEqual((Object) transition.getSegment().getTargetState(), (Object) s)) {
                    exitTransition = ExitTransition.Companion.getNone();
                } else {
                    exitTransition = function12.invoke(animatedContentScope2).getInitialContentExit();
                }
                rememberedValue2 = exitTransition;
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ExitTransition exitTransition2 = (ExitTransition) rememberedValue2;
            S s2 = this.$stateForContent;
            Transition<S> transition2 = this.$this_AnimatedContent;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new AnimatedContentScope.ChildData(Intrinsics.areEqual((Object) s2, (Object) transition2.getTargetState()));
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            AnimatedContentScope.ChildData childData = (AnimatedContentScope.ChildData) rememberedValue3;
            EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
            Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m35invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5576unboximpl());
                }

                /* renamed from: invoke-3p2s80s  reason: not valid java name */
                public final MeasureResult m35invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                    Intrinsics.checkNotNullParameter(measureScope, "$this$layout");
                    Intrinsics.checkNotNullParameter(measurable, "measurable");
                    final Placeable r9 = measurable.m4520measureBRTryo0(j);
                    int width = r9.getWidth();
                    int height = r9.getHeight();
                    final ContentTransform contentTransform = contentTransform;
                    return MeasureScope.layout$default(measureScope, width, height, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
                            placementScope.place(r9, 0, 0, contentTransform.getTargetContentZIndex());
                        }
                    }, 4, (Object) null);
                }
            });
            childData.setTarget(Intrinsics.areEqual((Object) this.$stateForContent, (Object) this.$this_AnimatedContent.getTargetState()));
            Modifier then = layout.then(childData);
            Transition<S> transition3 = this.$this_AnimatedContent;
            final S s3 = this.$stateForContent;
            final AnimatedContentScope<S> animatedContentScope3 = this.$rootScope;
            final S s4 = this.$stateForContent;
            final Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> function4 = this.$content;
            final int i3 = this.$$dirty;
            final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            AnimatedVisibilityKt.AnimatedVisibility(transition3, new Function1<S, Boolean>() {
                public final Boolean invoke(S s) {
                    return Boolean.valueOf(Intrinsics.areEqual((Object) s, (Object) s3));
                }
            }, then, targetContentEnter, exitTransition2, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer, -1894897681, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
                    ComposerKt.sourceInformation(composer, "C692@32555L253,700@32965L24:AnimatedContent.kt#xbi5r1");
                    if ((i & 14) == 0) {
                        i |= composer.changed((Object) animatedVisibilityScope) ? 4 : 2;
                    }
                    if ((i & 91) != 18 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1894897681, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:690)");
                        }
                        final SnapshotStateList<S> snapshotStateList = snapshotStateList;
                        final S s = s4;
                        final AnimatedContentScope<S> animatedContentScope = animatedContentScope3;
                        int i2 = i & 14;
                        EffectsKt.DisposableEffect((Object) animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1<DisposableEffectScope, DisposableEffectResult>() {
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
                                return new AnimatedContentKt$AnimatedContent$7$1$4$1$invoke$$inlined$onDispose$1(snapshotStateList, s, animatedContentScope);
                            }
                        }, composer, i2);
                        animatedContentScope3.getTargetSizeMap$animation_release().put(s4, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                        function4.invoke(animatedVisibilityScope, s4, composer, Integer.valueOf(i2 | ((i3 >> 9) & 896)));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), composer, 196608 | (this.$$dirty & 14), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
