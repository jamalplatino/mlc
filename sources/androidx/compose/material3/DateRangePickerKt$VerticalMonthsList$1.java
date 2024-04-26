package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
final class DateRangePickerKt$VerticalMonthsList$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$VerticalMonthsList$1(LazyListState lazyListState, int i, StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$lazyListState = lazyListState;
        this.$$dirty = i;
        this.$stateData = stateData;
        this.$firstMonth = calendarMonth;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$onDateSelected = function1;
        this.$today = calendarDate;
        this.$dateValidator = function12;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        ComposerKt.sourceInformation(composer2, "C531@21781L24,532@21847L59,533@21944L55,534@22008L2192:DateRangePicker.kt#uh7d8r");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56792252, i2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
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
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            final String r22 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1604getDateRangePickerScrollToShowPreviousMonthadMyvUU(), composer2, 6);
            final String r23 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1603getDateRangePickerScrollToShowNextMonthadMyvUU(), composer2, 6);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, AnonymousClass1.INSTANCE, 1, (Object) null);
            LazyListState lazyListState = this.$lazyListState;
            final StateData stateData = this.$stateData;
            final CalendarMonth calendarMonth = this.$firstMonth;
            final DatePickerFormatter datePickerFormatter = this.$dateFormatter;
            final DatePickerColors datePickerColors = this.$colors;
            Function1<Long, Unit> function1 = this.$onDateSelected;
            CalendarDate calendarDate = this.$today;
            Function1<Long, Boolean> function12 = this.$dateValidator;
            final Function1<Long, Unit> function13 = function1;
            final CalendarDate calendarDate2 = calendarDate;
            final Function1<Long, Boolean> function14 = function12;
            final int i3 = this.$$dirty;
            final LazyListState lazyListState2 = this.$lazyListState;
            LazyDslKt.LazyColumn(semantics$default, lazyListState, (PaddingValues) null, false, (Arrangement.Vertical) null, (Alignment.Horizontal) null, (FlingBehavior) null, false, new Function1<LazyListScope, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyListScope lazyListScope) {
                    LazyListScope lazyListScope2 = lazyListScope;
                    Intrinsics.checkNotNullParameter(lazyListScope2, "$this$LazyColumn");
                    int totalMonthsInRange = stateData.getTotalMonthsInRange();
                    final StateData stateData = stateData;
                    final CalendarMonth calendarMonth = calendarMonth;
                    final DatePickerFormatter datePickerFormatter = datePickerFormatter;
                    final DatePickerColors datePickerColors = datePickerColors;
                    final Function1<Long, Unit> function1 = function13;
                    final CalendarDate calendarDate = calendarDate2;
                    final Function1<Long, Boolean> function12 = function14;
                    final int i = i3;
                    final LazyListState lazyListState = lazyListState2;
                    CoroutineScope coroutineScope = coroutineScope;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final String str = r22;
                    final String str2 = r23;
                    LazyListScope.items$default(lazyListScope2, totalMonthsInRange, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1246706073, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                            int i3;
                            LazyItemScope lazyItemScope2 = lazyItemScope;
                            int i4 = i;
                            Composer composer2 = composer;
                            int i5 = i2;
                            Intrinsics.checkNotNullParameter(lazyItemScope2, "$this$items");
                            ComposerKt.sourceInformation(composer2, "C548@22622L1554:DateRangePicker.kt#uh7d8r");
                            if ((i5 & 14) == 0) {
                                i3 = (composer2.changed((Object) lazyItemScope2) ? 4 : 2) | i5;
                            } else {
                                i3 = i5;
                            }
                            if ((i5 & 112) == 0) {
                                i3 |= composer2.changed(i4) ? 32 : 16;
                            }
                            if ((i3 & 731) != 146 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1246706073, i5, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
                                }
                                CalendarMonth plusMonths = stateData.getCalendarModel().plusMonths(calendarMonth, i4);
                                Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope2, Modifier.Companion, 0.0f, 1, (Object) null);
                                DatePickerFormatter datePickerFormatter = datePickerFormatter;
                                StateData stateData = stateData;
                                DatePickerColors datePickerColors = datePickerColors;
                                Function1<Long, Unit> function1 = function1;
                                CalendarDate calendarDate = calendarDate;
                                Function1<Long, Boolean> function12 = function12;
                                int i6 = i;
                                LazyListState lazyListState = lazyListState;
                                CoroutineScope coroutineScope = coroutineScope2;
                                String str = str;
                                String str2 = str2;
                                composer2.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                                int i7 = i6;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                Function1<Long, Boolean> function13 = function12;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                Density density = (Density) consume;
                                CalendarDate calendarDate2 = calendarDate;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                Function1<Long, Unit> function14 = function1;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillParentMaxWidth$default);
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
                                Composer r8 = Updater.m2444constructorimpl(composer);
                                Updater.m2451setimpl(r8, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2451setimpl(r8, density, ComposeUiNode.Companion.getSetDensity());
                                Updater.m2451setimpl(r8, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m2451setimpl(r8, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                                ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1680467237, "C555@22915L15,551@22731L992,570@23744L414:DateRangePicker.kt#uh7d8r");
                                String formatMonthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(plusMonths, stateData.getCalendarModel(), CalendarModel_androidKt.defaultLocale(composer2, 0));
                                if (formatMonthYear$material3_release == null) {
                                    formatMonthYear$material3_release = "-";
                                }
                                int i8 = i7;
                                TextKt.m1727Text4IGK_g(formatMonthYear$material3_release, SemanticsModifierKt.semantics$default(ClickableKt.m206clickableXHw0xAI$default(PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, (String) null, (Role) null, DateRangePickerKt$VerticalMonthsList$1$2$1$1$1.INSTANCE, 7, (Object) null), false, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(lazyListState, coroutineScope, str, str2), 1, (Object) null), datePickerColors.m1283getSubheadContentColor0d7_KjU$material3_release(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131064);
                                int i9 = i8 << 3;
                                int i10 = i8 << 6;
                                DatePickerKt.Month(plusMonths, function14, calendarDate2, stateData, true, function13, datePickerFormatter, datePickerColors, composer, ((i8 << 9) & 3670016) | (i9 & 458752) | (i9 & 112) | 24576 | (i10 & 7168) | (29360128 & i10));
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
                    }), 6, (Object) null);
                }
            }, composer, (this.$$dirty >> 3) & 112, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
