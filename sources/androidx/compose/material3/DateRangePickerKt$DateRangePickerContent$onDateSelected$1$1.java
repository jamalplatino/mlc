package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
final class DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1(StateData stateData) {
        super(1);
        this.$stateData = stateData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        DateRangePickerKt.updateDateSelection(this.$stateData, j);
    }
}
