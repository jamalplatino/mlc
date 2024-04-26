package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$HorizontalMonthsList$2$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$HorizontalMonthsList$2$1(StateData stateData, CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, int i) {
        super(1);
        this.$stateData = stateData;
        this.$firstMonth = calendarMonth;
        this.$onDateSelected = function1;
        this.$today = calendarDate;
        this.$dateValidator = function12;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        int totalMonthsInRange = this.$stateData.getTotalMonthsInRange();
        final StateData stateData = this.$stateData;
        final CalendarMonth calendarMonth = this.$firstMonth;
        final Function1<Long, Unit> function1 = this.$onDateSelected;
        final CalendarDate calendarDate = this.$today;
        final Function1<Long, Boolean> function12 = this.$dateValidator;
        final DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        final DatePickerColors datePickerColors = this.$colors;
        final int i = this.$$dirty;
        LazyListScope.items$default(lazyListScope, totalMonthsInRange, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-65053693, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() {
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
                ComposerKt.sourceInformation(composer2, "C1306@54250L487:DatePicker.kt#uh7d8r");
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
                        ComposerKt.traceEventStart(-65053693, i5, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1300)");
                    }
                    CalendarMonth plusMonths = stateData.getCalendarModel().plusMonths(calendarMonth, i4);
                    Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope2, Modifier.Companion, 0.0f, 1, (Object) null);
                    Function1<Long, Unit> function1 = function1;
                    CalendarDate calendarDate = calendarDate;
                    StateData stateData = stateData;
                    Function1<Long, Boolean> function12 = function12;
                    DatePickerFormatter datePickerFormatter = datePickerFormatter;
                    DatePickerColors datePickerColors = datePickerColors;
                    int i6 = i;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
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
                    Composer r14 = Updater.m2444constructorimpl(composer);
                    Updater.m2451setimpl(r14, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2451setimpl(r14, density, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2451setimpl(r14, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2451setimpl(r14, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScope boxScope = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1656167412, "C1309@54344L379:DatePicker.kt#uh7d8r");
                    int i7 = i6 << 3;
                    int i8 = i6 << 6;
                    DatePickerKt.Month(plusMonths, function1, calendarDate, stateData, false, function12, datePickerFormatter, datePickerColors, composer, (i7 & 458752) | (i7 & 112) | 24576 | (i8 & 7168) | ((i6 << 9) & 3670016) | (29360128 & i8));
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
}
