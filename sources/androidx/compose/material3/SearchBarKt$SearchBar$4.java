package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
final class SearchBarKt$SearchBar$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $active;
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ SearchBarColors $colors;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function1<Boolean, Unit> $onActiveChange;
    final /* synthetic */ Function1<String, Unit> $onQueryChange;
    final /* synthetic */ Function1<String, Unit> $onSearch;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ State<Dp> $topPadding;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBar$4(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, boolean z, Function1<? super Boolean, Unit> function13, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, SearchBarColors searchBarColors, MutableInteractionSource mutableInteractionSource, int i, int i2, State<Float> state, State<Dp> state2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$query = str;
        this.$onQueryChange = function1;
        this.$onSearch = function12;
        this.$active = z;
        this.$onActiveChange = function13;
        this.$enabled = z2;
        this.$placeholder = function2;
        this.$leadingIcon = function22;
        this.$trailingIcon = function23;
        this.$colors = searchBarColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$animationProgress = state;
        this.$topPadding = state2;
        this.$content = function3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        State<Float> state;
        Composer composer2 = composer;
        int i2 = i;
        ComposerKt.sourceInformation(composer2, "C251@12445L1142:SearchBar.kt#uh7d8r");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867266817, i2, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:250)");
            }
            String str = this.$query;
            Function1<String, Unit> function1 = this.$onQueryChange;
            Function1<String, Unit> function12 = this.$onSearch;
            boolean z = this.$active;
            Function1<Boolean, Unit> function13 = this.$onActiveChange;
            boolean z2 = this.$enabled;
            Function2<Composer, Integer, Unit> function2 = this.$placeholder;
            Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
            SearchBarColors searchBarColors = this.$colors;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            State<Float> state2 = this.$animationProgress;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            State<Dp> state3 = this.$topPadding;
            Function2<Composer, Integer, Unit> function24 = function23;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$content;
            composer2.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
            String str2 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo";
            Function2<Composer, Integer, Unit> function25 = function22;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            String str3 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
            Function2<Composer, Integer, Unit> function26 = function2;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            boolean z3 = z2;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            Function1<Boolean, Unit> function14 = function13;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            String str4 = "C:CompositionLocal.kt#9igjgp";
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            boolean z4 = z;
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
            Composer r4 = Updater.m2444constructorimpl(composer);
            Updater.m2451setimpl(r4, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r4, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -685095508, "C252@12498L93,255@12604L590,270@13227L115:SearchBar.kt#uh7d8r");
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedPaddingValues(state2, state3);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            String str5 = "C79@4027L9:Column.kt#2w3rfo";
            String str6 = str4;
            String str7 = str3;
            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
            State<Float> state4 = state2;
            int i5 = i4;
            SearchBarColors searchBarColors2 = searchBarColors;
            SearchBarKt.SearchBarInputField(str, function1, function12, z4, function14, PaddingKt.padding(Modifier.Companion, (AnimatedPaddingValues) rememberedValue), z3, function26, function25, function24, searchBarColors.getInputFieldColors(), mutableInteractionSource2, composer, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i4 >> 9) & 112, 0);
            Composer composer3 = composer;
            composer3.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer3, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                state = state4;
                rememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new SearchBarKt$SearchBar$4$1$showResults$2$1(state));
                composer3.updateRememberedValue(rememberedValue2);
            } else {
                state = state4;
            }
            composer.endReplaceableGroup();
            composer3.startReplaceableGroup(551421060);
            ComposerKt.sourceInformation(composer3, "274@13420L35,274@13390L173");
            if (invoke$lambda$5$lambda$2((State) rememberedValue2)) {
                Modifier modifier = Modifier.Companion;
                composer3.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = composer3.changed((Object) state);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new SearchBarKt$SearchBar$4$1$1$1(state);
                    composer3.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue3);
                composer3.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composer3, str2);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                composer3.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer3, str7);
                String str8 = str6;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str8);
                Object consume4 = composer3.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str8);
                Object consume5 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str8);
                Object consume6 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(graphicsLayer);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer r5 = Updater.m2444constructorimpl(composer);
                Updater.m2451setimpl(r5, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r5, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r5, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r5, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer3, 276693704, str5);
                ComposerKt.sourceInformationMarkerStart(composer3, 1234674882, "C275@13479L36,276@13536L9:SearchBar.kt#uh7d8r");
                DividerKt.m1322Divider9IZ8Weo((Modifier) null, 0.0f, searchBarColors2.m1522getDividerColor0d7_KjU(), composer, 0, 3);
                function33.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i5 >> 12) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    private static final boolean invoke$lambda$5$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
