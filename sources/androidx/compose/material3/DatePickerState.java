package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB.\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\tB\u000f\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dR4\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8F@FX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "", "initialSelectedDateMillis", "", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "stateData", "Landroidx/compose/material3/StateData;", "(Landroidx/compose/material3/StateData;)V", "<set-?>", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode$delegate", "Landroidx/compose/runtime/MutableState;", "selectedDateMillis", "getSelectedDateMillis", "()Ljava/lang/Long;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "setSelection", "", "dateMillis", "(Ljava/lang/Long;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
public final class DatePickerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final MutableState displayMode$delegate;
    private final StateData stateData;

    public /* synthetic */ DatePickerState(StateData stateData2, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData2);
    }

    public /* synthetic */ DatePickerState(Long l, Long l2, IntRange intRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, intRange, i);
    }

    public final StateData getStateData$material3_release() {
        return this.stateData;
    }

    private DatePickerState(StateData stateData2) {
        this.stateData = stateData2;
        this.displayMode$delegate = stateData2.getDisplayMode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private DatePickerState(Long l, Long l2, IntRange intRange, int i) {
        this(new StateData(l, (Long) null, l2, intRange, i, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(intRange, "yearRange");
    }

    public final Long getSelectedDateMillis() {
        CalendarDate value = this.stateData.getSelectedStartDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    public final void setSelection(Long l) {
        this.stateData.setSelection(l, (Long) null);
    }

    /* renamed from: getDisplayMode-jFl-4v0  reason: not valid java name */
    public final int m1296getDisplayModejFl4v0() {
        return ((DisplayMode) this.displayMode$delegate.getValue()).m1318unboximpl();
    }

    /* renamed from: setDisplayMode-vCnGnXg  reason: not valid java name */
    public final void m1297setDisplayModevCnGnXg(int i) {
        this.displayMode$delegate.setValue(DisplayMode.m1312boximpl(i));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DatePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DatePicker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<DatePickerState, ?> Saver() {
            return SaverKt.Saver(DatePickerState$Companion$Saver$1.INSTANCE, DatePickerState$Companion$Saver$2.INSTANCE);
        }
    }
}
