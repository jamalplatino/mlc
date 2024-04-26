package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001eJÓ\u0001\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J'\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0001¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "()V", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", "F", "YearAbbrMonthDaySkeleton", "", "YearMonthSkeleton", "YearMonthWeekdayDaySkeleton", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "DatePickerHeadline", "", "state", "Landroidx/compose/material3/DatePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "colors", "Landroidx/compose/material3/DatePickerColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "yearContentColor", "currentYearContentColor", "selectedYearContentColor", "selectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "colors-1m2Cg-Y", "(JJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/DatePickerColors;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final float TonalElevation = DatePickerModalTokens.INSTANCE.m1962getContainerElevationD9Ej5fM();
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    private static final IntRange YearRange = new IntRange(1900, 2100);

    /* renamed from: getTonalElevation-D9Ej5fM  reason: not valid java name */
    public final float m1288getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final IntRange getYearRange() {
        return YearRange;
    }

    private DatePickerDefaults() {
    }

    /* renamed from: colors-1m2Cg-Y  reason: not valid java name */
    public final DatePickerColors m1287colors1m2CgY(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(543433842);
        ComposerKt.sourceInformation(composer2, "C(colors)P(0:c#ui.graphics.Color,14:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,13:c#ui.graphics.Color,18:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,10:c#ui.graphics.Color,7:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.Color)359@16109L9,360@16203L9,361@16294L9,362@16387L9,364@16501L9,366@16618L9,367@16716L9,369@16839L9,371@16964L9,372@17059L9,375@17301L9,379@17573L9,382@17826L9,384@17940L9,386@18069L9,388@18209L9:DatePicker.kt#uh7d8r");
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getContainerColor(), composer2, 6) : j;
        long color2 = (i4 & 2) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor(), composer2, 6) : j2;
        long color3 = (i4 & 4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor(), composer2, 6) : j3;
        long color4 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor(), composer2, 6) : j4;
        long color5 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor(), composer2, 6) : j5;
        long color6 = (i4 & 32) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor(), composer2, 6) : j6;
        long color7 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer2, 6) : j7;
        long color8 = (i4 & 128) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor(), composer2, 6) : j8;
        long color9 = (i4 & 256) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor(), composer2, 6) : j9;
        long color10 = (i4 & 512) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor(), composer2, 6) : j10;
        long r28 = (i4 & 1024) != 0 ? Color.m2820copywmQWz5c$default(color10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long color11 = (i4 & 2048) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor(), composer2, 6) : j12;
        long r32 = (i4 & 4096) != 0 ? Color.m2820copywmQWz5c$default(color11, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long color12 = (i4 & 8192) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor(), composer2, 6) : j14;
        long r36 = (i4 & 16384) != 0 ? Color.m2820copywmQWz5c$default(color12, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long color13 = (32768 & i4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer2, 6) : j16;
        long color14 = (65536 & i4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor(), composer2, 6) : j17;
        long color15 = (131072 & i4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor(), composer2, 6) : j18;
        long color16 = (i4 & 262144) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor(), composer2, 6) : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(543433842, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:358)");
        }
        DatePickerColors datePickerColors = new DatePickerColors(color, color2, color3, color4, color5, color6, color7, color8, color9, color10, r28, color11, r32, color12, r36, color13, color14, color16, color15, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerColors;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DatePickerTitle(androidx.compose.material3.DatePickerState r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r29 = this;
            r2 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1157401173(0xffffffffbb0375ab, float:-0.002005915)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r3 = "C(DatePickerTitle)P(1):DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r33 | 6
            goto L_0x002f
        L_0x001d:
            r3 = r33 & 14
            if (r3 != 0) goto L_0x002d
            boolean r3 = r1.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r33 | r3
            goto L_0x002f
        L_0x002d:
            r3 = r33
        L_0x002f:
            r4 = r34 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
            goto L_0x0049
        L_0x0036:
            r5 = r33 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r31
            boolean r6 = r1.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
            goto L_0x004b
        L_0x0049:
            r5 = r31
        L_0x004b:
            r15 = r3
            r3 = r15 & 91
            r6 = 18
            if (r3 != r6) goto L_0x005f
            boolean r3 = r1.getSkipping()
            if (r3 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r1.skipToGroupEnd()
            r3 = r5
            goto L_0x012d
        L_0x005f:
            if (r4 == 0) goto L_0x0068
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r28 = r3
            goto L_0x006a
        L_0x0068:
            r28 = r5
        L_0x006a:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0077
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r3, r4)
        L_0x0077:
            int r0 = r30.m1296getDisplayModejFl4v0()
            androidx.compose.material3.DisplayMode$Companion r3 = androidx.compose.material3.DisplayMode.Companion
            int r3 = r3.m1320getPickerjFl4v0()
            boolean r3 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r0, r3)
            r4 = 6
            if (r3 == 0) goto L_0x00cb
            r0 = -2065111000(0xffffffff84e8e828, float:-5.475614E-36)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "422@19876L43,421@19847L123"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1596getDatePickerTitleadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r1, r4)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r0 = 0
            r24 = r15
            r15 = r0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r24 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m1727Text4IGK_g((java.lang.String) r3, (androidx.compose.ui.Modifier) r4, (long) r5, (long) r7, (androidx.compose.ui.text.font.FontStyle) r9, (androidx.compose.ui.text.font.FontWeight) r10, (androidx.compose.ui.text.font.FontFamily) r11, (long) r12, (androidx.compose.ui.text.style.TextDecoration) r14, (androidx.compose.ui.text.style.TextAlign) r15, (long) r16, (int) r18, (boolean) r19, (int) r20, (int) r21, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r22, (androidx.compose.ui.text.TextStyle) r23, (androidx.compose.runtime.Composer) r24, (int) r25, (int) r26, (int) r27)
            r1.endReplaceableGroup()
            goto L_0x0122
        L_0x00cb:
            r24 = r15
            androidx.compose.material3.DisplayMode$Companion r3 = androidx.compose.material3.DisplayMode.Companion
            int r3 = r3.m1319getInputjFl4v0()
            boolean r0 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r0, r3)
            if (r0 == 0) goto L_0x0119
            r0 = -2065110842(0xffffffff84e8e8c6, float:-5.4756707E-36)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "427@20034L42,426@20005L122"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1583getDateInputTitleadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r1, r4)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r24 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m1727Text4IGK_g((java.lang.String) r3, (androidx.compose.ui.Modifier) r4, (long) r5, (long) r7, (androidx.compose.ui.text.font.FontStyle) r9, (androidx.compose.ui.text.font.FontWeight) r10, (androidx.compose.ui.text.font.FontFamily) r11, (long) r12, (androidx.compose.ui.text.style.TextDecoration) r14, (androidx.compose.ui.text.style.TextAlign) r15, (long) r16, (int) r18, (boolean) r19, (int) r20, (int) r21, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r22, (androidx.compose.ui.text.TextStyle) r23, (androidx.compose.runtime.Composer) r24, (int) r25, (int) r26, (int) r27)
            r1.endReplaceableGroup()
            goto L_0x0122
        L_0x0119:
            r0 = -2065110710(0xffffffff84e8e94a, float:-5.475718E-36)
            r1.startReplaceableGroup(r0)
            r1.endReplaceableGroup()
        L_0x0122:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x012b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x012b:
            r3 = r28
        L_0x012d:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.endRestartGroup()
            if (r6 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1 r7 = new androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1
            r0 = r7
            r1 = r29
            r2 = r30
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r6.updateScope(r7)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.DatePickerTitle(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DatePickerHeadline(androidx.compose.material3.DatePickerState r38, androidx.compose.material3.DatePickerFormatter r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r37 = this;
            r2 = r38
            r10 = r39
            r11 = r42
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1893194407(0xffffffff8f282559, float:-8.2902324E-30)
            r1 = r41
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r3 = "C(DatePickerHeadline)P(2)*448@20771L15,479@22178L135,477@22089L268:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r43 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r11 | 6
            goto L_0x0037
        L_0x0027:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0036
            boolean r3 = r1.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r11
            goto L_0x0037
        L_0x0036:
            r3 = r11
        L_0x0037:
            r4 = r43 & 2
            if (r4 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004e
            boolean r4 = r1.changed((java.lang.Object) r10)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r43 & 4
            if (r4 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r40
            boolean r6 = r1.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r40
        L_0x006a:
            r3 = r3 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r3 != r6) goto L_0x007d
            boolean r3 = r1.getSkipping()
            if (r3 != 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            r1.skipToGroupEnd()
        L_0x007a:
            r4 = r5
            goto L_0x0288
        L_0x007d:
            if (r4 == 0) goto L_0x0085
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r12 = r3
            goto L_0x0086
        L_0x0085:
            r12 = r5
        L_0x0086:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0093
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r3, r4)
        L_0x0093:
            androidx.compose.material3.StateData r0 = r38.getStateData$material3_release()
            r13 = 0
            java.util.Locale r14 = androidx.compose.material3.CalendarModel_androidKt.defaultLocale(r1, r13)
            androidx.compose.runtime.MutableState r3 = r0.getSelectedStartDate()
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            androidx.compose.material3.CalendarDate r4 = (androidx.compose.material3.CalendarDate) r4
            androidx.compose.material3.CalendarModel r5 = r0.getCalendarModel()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r39
            r6 = r14
            java.lang.String r3 = androidx.compose.material3.DatePickerFormatter.formatDate$material3_release$default(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.MutableState r4 = r0.getSelectedStartDate()
            java.lang.Object r4 = r4.getValue()
            androidx.compose.material3.CalendarDate r4 = (androidx.compose.material3.CalendarDate) r4
            androidx.compose.material3.CalendarModel r5 = r0.getCalendarModel()
            r6 = 1
            java.lang.String r4 = r10.formatDate$material3_release(r4, r5, r14, r6)
            r5 = 729783869(0x2b7f9e3d, float:9.08138E-13)
            r1.startReplaceableGroup(r5)
            java.lang.String r5 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r5)
            r7 = 6
            if (r4 != 0) goto L_0x0139
            androidx.compose.runtime.MutableState r4 = r0.getDisplayMode()
            java.lang.Object r4 = r4.getValue()
            androidx.compose.material3.DisplayMode r4 = (androidx.compose.material3.DisplayMode) r4
            int r4 = r4.m1318unboximpl()
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1320getPickerjFl4v0()
            boolean r8 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r4, r8)
            if (r8 == 0) goto L_0x010a
            r4 = 933108990(0x379e1cfe, float:1.8848568E-5)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "460@21322L51"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.material3.Strings$Companion r4 = androidx.compose.material3.Strings.Companion
            int r4 = r4.m1587getDatePickerNoSelectionDescriptionadMyvUU()
            java.lang.String r4 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r4, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x0139
        L_0x010a:
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1319getInputjFl4v0()
            boolean r4 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r4, r8)
            if (r4 == 0) goto L_0x012f
            r4 = 933109079(0x379e1d57, float:1.884873E-5)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "461@21411L46"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.material3.Strings$Companion r4 = androidx.compose.material3.Strings.Companion
            int r4 = r4.m1582getDateInputNoInputDescriptionadMyvUU()
            java.lang.String r4 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r4, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x0139
        L_0x012f:
            r4 = -1138387422(0xffffffffbc259622, float:-0.010106595)
            r1.startReplaceableGroup(r4)
            r1.endReplaceableGroup()
            r4 = r5
        L_0x0139:
            r1.endReplaceableGroup()
            r8 = 729784366(0x2b7fa02e, float:9.0816493E-13)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r5)
            if (r3 != 0) goto L_0x01a9
            androidx.compose.runtime.MutableState r3 = r0.getDisplayMode()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.material3.DisplayMode r3 = (androidx.compose.material3.DisplayMode) r3
            int r3 = r3.m1318unboximpl()
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1320getPickerjFl4v0()
            boolean r8 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r3, r8)
            if (r8 == 0) goto L_0x017a
            r3 = 933109281(0x379e1e21, float:1.8849098E-5)
            r1.startReplaceableGroup(r3)
            java.lang.String r3 = "466@21613L37"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            androidx.compose.material3.Strings$Companion r3 = androidx.compose.material3.Strings.Companion
            int r3 = r3.m1584getDatePickerHeadlineadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r3, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x01a9
        L_0x017a:
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1319getInputjFl4v0()
            boolean r3 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r3, r8)
            if (r3 == 0) goto L_0x019f
            r3 = 933109356(0x379e1e6c, float:1.8849234E-5)
            r1.startReplaceableGroup(r3)
            java.lang.String r3 = "467@21688L36"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            androidx.compose.material3.Strings$Companion r3 = androidx.compose.material3.Strings.Companion
            int r3 = r3.m1576getDateInputHeadlineadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r3, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x01a9
        L_0x019f:
            r3 = -1138379145(0xffffffffbc25b677, float:-0.010114304)
            r1.startReplaceableGroup(r3)
            r1.endReplaceableGroup()
            r3 = r5
        L_0x01a9:
            r1.endReplaceableGroup()
            androidx.compose.runtime.MutableState r0 = r0.getDisplayMode()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.material3.DisplayMode r0 = (androidx.compose.material3.DisplayMode) r0
            int r0 = r0.m1318unboximpl()
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1320getPickerjFl4v0()
            boolean r8 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r0, r8)
            if (r8 == 0) goto L_0x01df
            r0 = 933109538(0x379e1f22, float:1.8849565E-5)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "472@21870L48"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1585getDatePickerHeadlineDescriptionadMyvUU()
            java.lang.String r5 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x020d
        L_0x01df:
            androidx.compose.material3.DisplayMode$Companion r8 = androidx.compose.material3.DisplayMode.Companion
            int r8 = r8.m1319getInputjFl4v0()
            boolean r0 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r0, r8)
            if (r0 == 0) goto L_0x0204
            r0 = 933109624(0x379e1f78, float:1.8849722E-5)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "473@21956L47"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1577getDateInputHeadlineDescriptionadMyvUU()
            java.lang.String r5 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r1, r7)
            r1.endReplaceableGroup()
            goto L_0x020d
        L_0x0204:
            r0 = -1138370496(0xffffffffbc25d840, float:-0.010122359)
            r1.startReplaceableGroup(r0)
            r1.endReplaceableGroup()
        L_0x020d:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.String r4 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            boolean r4 = r1.changed((java.lang.Object) r0)
            java.lang.Object r5 = r1.rememberedValue()
            if (r4 != 0) goto L_0x023c
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r5 != r4) goto L_0x0247
        L_0x023c:
            androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1$1 r4 = new androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1$1
            r4.<init>(r0)
            r5 = r4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1.updateRememberedValue(r5)
        L_0x0247:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r12, r13, r5, r6, r0)
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 3072(0xc00, float:4.305E-42)
            r36 = 122876(0x1dffc, float:1.72186E-40)
            r5 = r12
            r12 = r3
            r33 = r1
            androidx.compose.material3.TextKt.m1727Text4IGK_g((java.lang.String) r12, (androidx.compose.ui.Modifier) r13, (long) r14, (long) r16, (androidx.compose.ui.text.font.FontStyle) r18, (androidx.compose.ui.text.font.FontWeight) r19, (androidx.compose.ui.text.font.FontFamily) r20, (long) r21, (androidx.compose.ui.text.style.TextDecoration) r23, (androidx.compose.ui.text.style.TextAlign) r24, (long) r25, (int) r27, (boolean) r28, (int) r29, (int) r30, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r31, (androidx.compose.ui.text.TextStyle) r32, (androidx.compose.runtime.Composer) r33, (int) r34, (int) r35, (int) r36)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x007a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x007a
        L_0x0288:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x028f
            goto L_0x02a4
        L_0x028f:
            androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2 r8 = new androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2
            r0 = r8
            r1 = r37
            r2 = r38
            r3 = r39
            r5 = r42
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x02a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.DatePickerHeadline(androidx.compose.material3.DatePickerState, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-2036003494);
        ComposerKt.sourceInformation(composer, "C(rememberSnapFlingBehavior)P(1)500@22875L7,501@22898L295:DatePicker.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, (Object) null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:496)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapFlingBehavior(lazyListState, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null), density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(700927667);
        ComposerKt.sourceInformation(composer, "C518@23583L9:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:518)");
        }
        Shape shape = ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
