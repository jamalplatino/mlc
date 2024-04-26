package androidx.compose.material3;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0004H\u0016J\u001a\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010)\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u000eH\u0016J\u0014\u0010,\u001a\u00020\"*\u00020\b2\u0006\u0010-\u001a\u00020.H\u0002J\f\u0010,\u001a\u00020\"*\u00020 H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u00060"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "()V", "firstDayOfWeek", "", "getFirstDayOfWeek", "()I", "today", "Landroidx/compose/material3/CalendarDate;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "weekdayNames", "", "Lkotlin/Pair;", "", "getWeekdayNames", "()Ljava/util/List;", "dayInISO8601", "day", "formatWithPattern", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "getCanonicalDate", "timeInMillis", "getDateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "getDayOfWeek", "date", "getMonth", "Landroidx/compose/material3/CalendarMonth;", "firstDayCalendar", "Ljava/util/Calendar;", "year", "month", "minusMonths", "from", "subtractedMonthsCount", "parse", "plusMonths", "addedMonthsCount", "toString", "toCalendar", "timeZone", "Ljava/util/TimeZone;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LegacyCalendarModelImpl.kt */
public final class LegacyCalendarModelImpl implements CalendarModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TimeZone utcTimeZone;
    private final int firstDayOfWeek = dayInISO8601(Calendar.getInstance().getFirstDayOfWeek());
    private final List<Pair<String, String>> weekdayNames;

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    public LegacyCalendarModelImpl() {
        List createListBuilder = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(Locale.getDefault()).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(Locale.getDefault()).getShortWeekdays();
        Intrinsics.checkNotNullExpressionValue(weekdays, "weekdays");
        int i = 0;
        for (Object next : ArraysKt.drop((T[]) weekdays, 2)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            createListBuilder.add(new Pair((String) next, shortWeekdays[i + 2]));
            i = i2;
        }
        createListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = CollectionsKt.build(createListBuilder);
    }

    public CalendarDate getToday() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis() + ((long) (instance.get(15) + instance.get(16))));
    }

    public DateInputFormat getDateInputFormat(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "DateFormat.getDateInstan…leDateFormat).toPattern()");
        return CalendarModelKt.datePatternAsInputFormat(pattern);
    }

    public CalendarDate getCanonicalDate(long j) {
        Calendar instance = Calendar.getInstance(utcTimeZone);
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
    }

    public CalendarMonth getMonth(long j) {
        Calendar instance = Calendar.getInstance(utcTimeZone);
        instance.setTimeInMillis(j);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(instance, "firstDayCalendar");
        return getMonth(instance);
    }

    public CalendarMonth getMonth(CalendarDate calendarDate) {
        Intrinsics.checkNotNullParameter(calendarDate, "date");
        return getMonth(calendarDate.getYear(), calendarDate.getMonth());
    }

    public CalendarMonth getMonth(int i, int i2) {
        Calendar instance = Calendar.getInstance(utcTimeZone);
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, 1);
        Intrinsics.checkNotNullExpressionValue(instance, "firstDayCalendar");
        return getMonth(instance);
    }

    public int getDayOfWeek(CalendarDate calendarDate) {
        Intrinsics.checkNotNullParameter(calendarDate, "date");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return dayInISO8601(toCalendar(calendarDate, timeZone).get(7));
    }

    public CalendarMonth plusMonths(CalendarMonth calendarMonth, int i) {
        Intrinsics.checkNotNullParameter(calendarMonth, "from");
        if (i <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, i);
        return getMonth(calendar);
    }

    public CalendarMonth minusMonths(CalendarMonth calendarMonth, int i) {
        Intrinsics.checkNotNullParameter(calendarMonth, "from");
        if (i <= 0) {
            return calendarMonth;
        }
        Calendar calendar = toCalendar(calendarMonth);
        calendar.add(2, -i);
        return getMonth(calendar);
    }

    public String formatWithPattern(long j, String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return Companion.formatWithPattern(j, str, locale);
    }

    public CalendarDate parse(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(parse);
            return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl$Companion;", "", "()V", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LegacyCalendarModelImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String formatWithPattern(long j, String str, Locale locale) {
            Intrinsics.checkNotNullParameter(str, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(getUtcTimeZone$material3_release());
            Calendar instance = Calendar.getInstance(getUtcTimeZone$material3_release());
            instance.setTimeInMillis(j);
            String format = simpleDateFormat.format(Long.valueOf(instance.getTimeInMillis()));
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.timeInMillis)");
            return format;
        }

        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        utcTimeZone = timeZone;
    }

    private final int dayInISO8601(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    private final CalendarMonth getMonth(Calendar calendar) {
        int dayInISO8601 = dayInISO8601(calendar.get(7)) - getFirstDayOfWeek();
        if (dayInISO8601 < 0) {
            dayInISO8601 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), dayInISO8601, calendar.getTimeInMillis());
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar instance = Calendar.getInstance(utcTimeZone);
        instance.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return instance;
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.clear();
        instance.set(1, calendarDate.getYear());
        instance.set(2, calendarDate.getMonth() - 1);
        instance.set(5, calendarDate.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return instance;
    }
}
