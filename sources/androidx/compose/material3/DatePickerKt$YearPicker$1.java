package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$YearPicker$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$YearPicker$1(StateData stateData, DatePickerColors datePickerColors, Modifier modifier, Function1<? super Integer, Unit> function1, int i) {
        super(2);
        this.$stateData = stateData;
        this.$colors = datePickerColors;
        this.$modifier = modifier;
        this.$onYearSelected = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long j;
        Composer composer2 = composer;
        int i2 = i;
        ComposerKt.sourceInformation(composer2, "C1640@67154L329,1648@67656L11,1653@67868L24,1654@67933L53,1655@68025L51,1656@68085L2826:DatePicker.kt#uh7d8r");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145469688, i2, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
            }
            final int year = this.$stateData.getCurrentMonth().getYear();
            final int year2 = this.$stateData.getDisplayedMonth().getYear();
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Integer.max(0, (year2 - this.$stateData.getYearRange().getFirst()) - 3), 0, composer2, 0, 2);
            composer2.startReplaceableGroup(-969349200);
            ComposerKt.sourceInformation(composer2, "1649@67705L11,1649@67769L7");
            if (Color.m2822equalsimpl0(this.$colors.m1280getContainerColor0d7_KjU$material3_release(), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m1206getSurface0d7_KjU())) {
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = composer2.consume(SurfaceKt.getLocalAbsoluteTonalElevation());
                ComposerKt.sourceInformationMarkerEnd(composer);
                j = ColorSchemeKt.m1247surfaceColorAtElevation3ABfNKs(colorScheme, ((Dp) consume).m5640unboximpl());
            } else {
                j = this.$colors.m1280getContainerColor0d7_KjU$material3_release();
            }
            long j2 = j;
            composer.endReplaceableGroup();
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
            String r5 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1588getDatePickerScrollToShowEarlierYearsadMyvUU(), composer2, 6);
            final String r22 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1589getDatePickerScrollToShowLaterYearsadMyvUU(), composer2, 6);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m182backgroundbw27NRU$default(this.$modifier, j2, (Shape) null, 2, (Object) null), false, AnonymousClass1.INSTANCE, 1, (Object) null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            final StateData stateData = this.$stateData;
            Function1<Integer, Unit> function1 = this.$onYearSelected;
            final Function1<Integer, Unit> function12 = function1;
            final int i3 = this.$$dirty;
            final DatePickerColors datePickerColors = this.$colors;
            final LazyGridState lazyGridState = rememberLazyGridState;
            final CoroutineScope coroutineScope2 = coroutineScope;
            final String str = r5;
            LazyGridDslKt.LazyVerticalGrid(fixed, semantics$default, rememberLazyGridState, (PaddingValues) null, false, Arrangement.INSTANCE.m410spacedBy0680j_4(DatePickerKt.YearsVerticalPadding), spaceEvenly, (FlingBehavior) null, false, new Function1<LazyGridScope, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyGridScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridScope lazyGridScope) {
                    LazyGridScope lazyGridScope2 = lazyGridScope;
                    Intrinsics.checkNotNullParameter(lazyGridScope2, "$this$LazyVerticalGrid");
                    int count = CollectionsKt.count(stateData.getYearRange());
                    final StateData stateData = stateData;
                    final int i = year2;
                    final int i2 = year;
                    final Function1<Integer, Unit> function1 = function12;
                    final int i3 = i3;
                    final DatePickerColors datePickerColors = datePickerColors;
                    final LazyGridState lazyGridState = lazyGridState;
                    final CoroutineScope coroutineScope = coroutineScope2;
                    final String str = str;
                    final String str2 = r22;
                    LazyGridScope.items$default(lazyGridScope2, count, (Function1) null, (Function2) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1369226173, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                            int i3;
                            int i4 = i;
                            Composer composer2 = composer;
                            int i5 = i2;
                            LazyGridItemScope lazyGridItemScope2 = lazyGridItemScope;
                            Intrinsics.checkNotNullParameter(lazyGridItemScope, "$this$items");
                            ComposerKt.sourceInformation(composer, "C1697@70359L32,*1698@70427L54,1672@68906L1981:DatePicker.kt#uh7d8r");
                            if ((i5 & 112) == 0) {
                                i3 = (composer.changed(i) ? 32 : 16) | i5;
                            } else {
                                i3 = i5;
                            }
                            if ((i3 & 721) != 144 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1369226173, i5, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)");
                                }
                                int first = i4 + stateData.getYearRange().getFirst();
                                final String localString = DatePickerKt.toLocalString(first);
                                Modifier r10 = SizeKt.m557requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m1976getSelectionYearContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m1975getSelectionYearContainerHeightD9Ej5fM());
                                final LazyGridState lazyGridState = lazyGridState;
                                final CoroutineScope coroutineScope = coroutineScope;
                                final String str = str;
                                final String str2 = str2;
                                final int i6 = i;
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(r10, false, new Function1<SemanticsPropertyReceiver, Unit>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((SemanticsPropertyReceiver) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        List list;
                                        LazyGridItemInfo lazyGridItemInfo;
                                        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "$this$semantics");
                                        if (lazyGridState.getFirstVisibleItemIndex() == i6 || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull(lazyGridState.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i6)) {
                                            list = DatePickerKt.customScrollActions(lazyGridState, coroutineScope, str, str2);
                                        } else {
                                            list = CollectionsKt.emptyList();
                                        }
                                        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list);
                                    }
                                }, 1, (Object) null);
                                boolean z = first == i;
                                boolean z2 = first == i2;
                                Function1<Integer, Unit> function1 = function1;
                                Integer valueOf = Integer.valueOf(first);
                                Function1<Integer, Unit> function12 = function1;
                                composer.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = composer.changed((Object) function1) | composer.changed((Object) valueOf);
                                Object rememberedValue = composer.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new DatePickerKt$YearPicker$1$2$1$2$1(function12, first);
                                    composer.updateRememberedValue(rememberedValue);
                                }
                                composer.endReplaceableGroup();
                                String format = String.format(Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1586getDatePickerNavigateToYearDescriptionadMyvUU(), composer, 6), Arrays.copyOf(new Object[]{localString}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                                DatePickerKt.Year(semantics$default, z, z2, (Function0) rememberedValue, format, datePickerColors, ComposableLambdaKt.composableLambda(composer, 2095319565, true, new Function2<Composer, Integer, Unit>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        int i2 = i;
                                        ComposerKt.sourceInformation(composer, "C1702@70606L263:DatePicker.kt#uh7d8r");
                                        if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2095319565, i2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1701)");
                                            }
                                            TextKt.m1727Text4IGK_g(localString, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, AnonymousClass1.INSTANCE), 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m5499boximpl(TextAlign.Companion.m5506getCentere0LSkKk()), 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 130556);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer.skipToGroupEnd();
                                    }
                                }), composer, ((i3 << 9) & 458752) | 1572864);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), 14, (Object) null);
                }
            }, composer, 1769472, 408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
