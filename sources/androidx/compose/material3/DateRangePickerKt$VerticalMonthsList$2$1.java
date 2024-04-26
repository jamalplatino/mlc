package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: DateRangePicker.kt */
final class DateRangePickerKt$VerticalMonthsList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ StateData $stateData;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, StateData stateData, Continuation<? super DateRangePickerKt$VerticalMonthsList$2$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$stateData = stateData;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.$lazyListState, this.$stateData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DatePickerKt.updateDisplayedMonth(this.$lazyListState, this.$stateData, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
