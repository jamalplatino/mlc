package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"lazyLayoutSemantics", "Landroidx/compose/ui/Modifier;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "", "reverseScrolling", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyLayoutSemantics.kt */
public final class LazyLayoutSemanticsKt {
    public static final Modifier lazyLayoutSemantics(Modifier modifier, LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i) {
        Modifier modifier2 = modifier;
        LazyLayoutItemProvider lazyLayoutItemProvider2 = lazyLayoutItemProvider;
        LazyLayoutSemanticState lazyLayoutSemanticState2 = lazyLayoutSemanticState;
        Orientation orientation2 = orientation;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(modifier2, "<this>");
        Intrinsics.checkNotNullParameter(lazyLayoutItemProvider2, "itemProvider");
        Intrinsics.checkNotNullParameter(lazyLayoutSemanticState2, "state");
        Intrinsics.checkNotNullParameter(orientation2, "orientation");
        composer2.startReplaceableGroup(290103779);
        ComposerKt.sourceInformation(composer2, "C(lazyLayoutSemantics)P(!1,3!1,4)46@1895L24,48@1950L3445:LazyLayoutSemantics.kt#wow0x6");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290103779, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        composer2.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer2, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {lazyLayoutItemProvider2, lazyLayoutSemanticState2, orientation2, Boolean.valueOf(z)};
        composer2.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z3 |= composer2.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            boolean z4 = orientation2 == Orientation.Vertical;
            rememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(lazyLayoutItemProvider2), z4, new ScrollAxisRange(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1(lazyLayoutSemanticState2), new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2(lazyLayoutSemanticState2, lazyLayoutItemProvider2), z2), z ? new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(z4, coroutineScope, lazyLayoutSemanticState2) : null, z ? new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1(lazyLayoutItemProvider2, coroutineScope, lazyLayoutSemanticState2) : null, lazyLayoutSemanticState.collectionInfo()), 1, (Object) null);
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier2.then((Modifier) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
