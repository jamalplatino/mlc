package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$ChatView$3 extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ AppViewModel.ChatState $chatState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$ChatView$3(AppViewModel.ChatState chatState) {
        super(3);
        this.$chatState = chatState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        PaddingValues paddingValues2 = paddingValues;
        Composer composer2 = composer;
        int i3 = i;
        Intrinsics.checkNotNullParameter(paddingValues2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (composer2.changed((Object) paddingValues2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1365483433, i3, -1, "ai.mlc.mlcchat.ChatView.<anonymous> (ChatView.kt:93)");
            }
            Modifier r0 = PaddingKt.m495paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues2), Dp.m5626constructorimpl((float) 10), 0.0f, 2, (Object) null);
            AppViewModel.ChatState chatState = this.$chatState;
            composer2.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r0);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r5 = Updater.m2444constructorimpl(composer);
            Updater.m2451setimpl(r5, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r5, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r5, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r5, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
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
            float f = (float) 5;
            float f2 = f;
            TextKt.m1727Text4IGK_g(chatState.getReport().getValue(), PaddingKt.m497paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), 0.0f, Dp.m5626constructorimpl(f), 0.0f, 0.0f, 13, (Object) null), 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m5499boximpl(TextAlign.Companion.m5506getCentere0LSkKk()), 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 48, 0, 130556);
            float f3 = (float) 1;
            DividerKt.m1322Divider9IZ8Weo(PaddingKt.m495paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5626constructorimpl(f2), 1, (Object) null), Dp.m5626constructorimpl(f3), 0, composer, 54, 4);
            AppViewModel.ChatState chatState2 = chatState;
            LazyListState lazyListState = rememberLazyListState;
            LazyDslKt.LazyColumn(ColumnScope.weight$default(columnScope, Modifier.Companion, 9.0f, false, 2, (Object) null), lazyListState, (PaddingValues) null, false, Arrangement.INSTANCE.m412spacedByD5KLDUw(Dp.m5626constructorimpl(f2), Alignment.Companion.getBottom()), (Alignment.Horizontal) null, (FlingBehavior) null, false, new ChatViewKt$ChatView$3$1$1(coroutineScope, chatState2, lazyListState), composer, 24576, 236);
            DividerKt.m1322Divider9IZ8Weo(PaddingKt.m497paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5626constructorimpl(f2), 0.0f, 0.0f, 13, (Object) null), Dp.m5626constructorimpl(f3), 0, composer, 54, 4);
            ChatViewKt.SendMessageView(chatState2, composer, 8);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
