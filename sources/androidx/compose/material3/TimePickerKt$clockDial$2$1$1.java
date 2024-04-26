package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$clockDial$2$1$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$clockDial$2$1$1(TimePickerState timePickerState) {
        super(1);
        this.$state = timePickerState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1756invokeozmzZPI(((IntSize) obj).m5790unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m1756invokeozmzZPI(long j) {
        this.$state.m1772setCentergyyYBs$material3_release(IntSizeKt.m5792getCenterozmzZPI(j));
    }
}
