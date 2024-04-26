package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$updateDisplayedMonth$3 implements FlowCollector<Integer> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ StateData $stateData;

    DatePickerKt$updateDisplayedMonth$3(LazyListState lazyListState, StateData stateData) {
        this.$lazyListState = lazyListState;
        this.$stateData = stateData;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
    }

    public final Object emit(int i, Continuation<? super Unit> continuation) {
        int firstVisibleItemIndex = this.$lazyListState.getFirstVisibleItemIndex() / 12;
        int firstVisibleItemIndex2 = (this.$lazyListState.getFirstVisibleItemIndex() % 12) + 1;
        StateData stateData = this.$stateData;
        if (!(stateData.getDisplayedMonth().getMonth() == firstVisibleItemIndex2 && stateData.getDisplayedMonth().getYear() == stateData.getYearRange().getFirst() + firstVisibleItemIndex)) {
            stateData.setDisplayedMonth(stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst() + firstVisibleItemIndex, firstVisibleItemIndex2));
        }
        return Unit.INSTANCE;
    }
}
