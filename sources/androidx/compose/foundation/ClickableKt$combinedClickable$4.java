package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.Role;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Clickable.kt */
final class ClickableKt$combinedClickable$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Indication $indication;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Function0<Unit> $onDoubleClick;
    final /* synthetic */ Function0<Unit> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$combinedClickable$4(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, String str, Role role, String str2) {
        super(3);
        this.$onClick = function0;
        this.$onLongClick = function02;
        this.$onDoubleClick = function03;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$onClickLabel = str;
        this.$role = role;
        this.$onLongClickLabel = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(modifier, "$this$composed");
        composer2.startReplaceableGroup(1841718000);
        ComposerKt.sourceInformation(composer2, "C307@13021L29,308@13082L33,309@13149L35,312@13316L58,313@13417L56,332@14268L36,333@14352L33,334@14443L95,334@14422L116,337@14566L40,340@14722L1028,368@15803L445,383@16482L24:Clickable.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1841718000, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onClick, composer2, 0);
        State<T> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$onLongClick, composer2, 0);
        State<T> rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(this.$onDoubleClick, composer2, 0);
        boolean z = this.$onLongClick != null;
        boolean z2 = this.$onDoubleClick != null;
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LinkedHashMap();
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Map map = (Map) rememberedValue2;
        composer2.startReplaceableGroup(1321107720);
        ComposerKt.sourceInformation(composer2, "317@13690L342,317@13659L373,326@14045L170");
        if (this.$enabled) {
            Boolean valueOf = Boolean.valueOf(z);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer2.changed((Object) mutableState) | composer2.changed((Object) mutableInteractionSource);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ClickableKt$combinedClickable$4$1$1(mutableState, mutableInteractionSource);
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect((Object) valueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) (Function1) rememberedValue3, composer2, 0);
            ClickableKt.PressedInteractionSourceDisposableEffect(this.$interactionSource, mutableState, map, composer2, 560);
        }
        composer.endReplaceableGroup();
        Function0<Boolean> isComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer2, 0);
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
            MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer2.updateRememberedValue(mutableStateOf$default);
            rememberedValue4 = mutableStateOf$default;
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue4;
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer2.changed((Object) mutableState2) | composer2.changed((Object) isComposeRootInScrollableContainer);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new ClickableKt$combinedClickable$4$delayPressInteraction$1$1(mutableState2, isComposeRootInScrollableContainer);
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(rememberedValue5, composer2, 0);
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2561boximpl(Offset.Companion.m2588getZeroF1C5BW0()), (SnapshotMutationPolicy) null, 2, (Object) null);
            composer2.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue6;
        Object[] objArr = {this.$interactionSource, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.$enabled)};
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean valueOf3 = Boolean.valueOf(this.$enabled);
        Boolean valueOf4 = Boolean.valueOf(z);
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        Object[] objArr2 = objArr;
        Modifier modifier2 = Modifier.Companion;
        MutableState mutableState4 = mutableState2;
        Map map2 = map;
        MutableState mutableState5 = mutableState;
        String str = "CC(remember):Composables.kt#9igjgp";
        Object[] objArr3 = {mutableState3, valueOf2, valueOf3, rememberUpdatedState3, valueOf4, rememberUpdatedState2, mutableInteractionSource2, mutableState, rememberUpdatedState4, rememberUpdatedState};
        boolean z3 = this.$enabled;
        composer2.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z4 = false;
        for (int i2 = 0; i2 < 10; i2++) {
            z4 |= composer2.changed(objArr3[i2]);
        }
        Object rememberedValue7 = composer.rememberedValue();
        if (z4 || rememberedValue7 == Composer.Companion.getEmpty()) {
            rememberedValue7 = new ClickableKt$combinedClickable$4$gesture$1$1(mutableState3, z2, z3, z, rememberUpdatedState3, rememberUpdatedState2, mutableInteractionSource2, mutableState5, rememberUpdatedState4, rememberUpdatedState, (Continuation<? super ClickableKt$combinedClickable$4$gesture$1$1>) null);
            composer2.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, objArr2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue7);
        Modifier.Companion companion = Modifier.Companion;
        composer2.startReplaceableGroup(-492369756);
        String str2 = str;
        ComposerKt.sourceInformation(composer2, str2);
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == Composer.Companion.getEmpty()) {
            rememberedValue8 = new ClickableKt$combinedClickable$4$2$1(mutableState4);
            composer2.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceableGroup();
        Modifier then = companion.then((Modifier) rememberedValue8);
        MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
        Indication indication = this.$indication;
        composer2.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer2, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, str2);
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue9 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier r2 = ClickableKt.m211genericClickableWithoutGesturebdNGguI(then, pointerInput, mutableInteractionSource3, indication, coroutineScope, map2, mutableState3, this.$enabled, this.$onClickLabel, this.$role, this.$onLongClickLabel, this.$onLongClick, this.$onClick);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r2;
    }
}
