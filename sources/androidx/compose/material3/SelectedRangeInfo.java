package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB,\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "gridCoordinates", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/IntOffset;", "firstIsSelectionStart", "", "lastIsSelectionEnd", "(Lkotlin/Pair;ZZ)V", "getFirstIsSelectionStart", "()Z", "getGridCoordinates", "()Lkotlin/Pair;", "getLastIsSelectionEnd", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
public final class SelectedRangeInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean firstIsSelectionStart;
    private final Pair<IntOffset, IntOffset> gridCoordinates;
    private final boolean lastIsSelectionEnd;

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    public final Pair<IntOffset, IntOffset> getGridCoordinates() {
        return this.gridCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    public SelectedRangeInfo(Pair<IntOffset, IntOffset> pair, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pair, "gridCoordinates");
        this.gridCoordinates = pair;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "()V", "calculateRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "month", "Landroidx/compose/material3/CalendarMonth;", "startDate", "Landroidx/compose/material3/CalendarDate;", "endDate", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DateRangePicker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(calendarMonth, "month");
            if (calendarDate == null || calendarDate2 == null || calendarDate.getUtcTimeMillis() > calendarMonth.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < calendarMonth.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = false;
            boolean z2 = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
            if (calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis()) {
                z = true;
            }
            if (z2) {
                i = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1;
            } else {
                i = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
            }
            if (z) {
                i2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1;
            } else {
                i2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
            }
            return new SelectedRangeInfo(new Pair(IntOffset.m5735boximpl(IntOffsetKt.IntOffset(i % 7, i / 7)), IntOffset.m5735boximpl(IntOffsetKt.IntOffset(i2 % 7, i2 / 7))), z2, z);
        }
    }
}
