package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
final class DateRangePickerKt$SwitchableDateEntryContent$2 extends Lambda implements Function3<DisplayMode, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$SwitchableDateEntryContent$2(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i) {
        super(3);
        this.$state = dateRangePickerState;
        this.$dateFormatter = datePickerFormatter;
        this.$dateValidator = function1;
        this.$colors = datePickerColors;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m1301invokeQujVXRc(((DisplayMode) obj).m1318unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-QujVXRc  reason: not valid java name */
    public final void m1301invokeQujVXRc(int i, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "CP(0:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1354418636, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:458)");
            }
            if (DisplayMode.m1315equalsimpl0(i, DisplayMode.Companion.m1320getPickerjFl4v0())) {
                composer.startReplaceableGroup(-1168754929);
                ComposerKt.sourceInformation(composer, "460@19572L208");
                StateData stateData$material3_release = this.$state.getStateData$material3_release();
                DatePickerFormatter datePickerFormatter = this.$dateFormatter;
                Function1<Long, Boolean> function1 = this.$dateValidator;
                DatePickerColors datePickerColors = this.$colors;
                int i4 = this.$$dirty;
                DateRangePickerKt.DateRangePickerContent(stateData$material3_release, datePickerFormatter, function1, datePickerColors, composer, (i4 & 112) | (i4 & 896) | (i4 & 7168));
                composer.endReplaceableGroup();
            } else if (DisplayMode.m1315equalsimpl0(i, DisplayMode.Companion.m1319getInputjFl4v0())) {
                composer.startReplaceableGroup(-1168754686);
                ComposerKt.sourceInformation(composer, "467@19815L175");
                StateData stateData$material3_release2 = this.$state.getStateData$material3_release();
                DatePickerFormatter datePickerFormatter2 = this.$dateFormatter;
                Function1<Long, Boolean> function12 = this.$dateValidator;
                int i5 = this.$$dirty;
                DateRangeInputKt.DateRangeInputContent(stateData$material3_release2, datePickerFormatter2, function12, composer, (i5 & 896) | (i5 & 112));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1168754501);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
