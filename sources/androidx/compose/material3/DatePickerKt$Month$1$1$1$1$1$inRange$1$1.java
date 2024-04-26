package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$Month$1$1$1$1$1$inRange$1$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ long $dateInMillis;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$Month$1$1$1$1$1$inRange$1$1(StateData stateData, boolean z, long j) {
        super(0);
        this.$stateData = stateData;
        this.$rangeSelectionEnabled = z;
        this.$dateInMillis = j;
    }

    public final Boolean invoke() {
        boolean z;
        StateData stateData = this.$stateData;
        boolean z2 = this.$rangeSelectionEnabled;
        long j = this.$dateInMillis;
        if (z2) {
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            if (j >= (value != null ? value.getUtcTimeMillis() : Long.MAX_VALUE)) {
                CalendarDate value2 = stateData.getSelectedEndDate().getValue();
                if (j <= (value2 != null ? value2.getUtcTimeMillis() : Long.MIN_VALUE)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
