package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJn\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u00112\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u00112\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "()V", "DateRangePickerHeadline", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "startDateText", "", "endDateText", "startDatePlaceholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "endDatePlaceholder", "datesDelimiter", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerTitle", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DateRangePickerTitle(androidx.compose.material3.DateRangePickerState r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r29 = this;
            r2 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 499073135(0x1dbf406f, float:5.06239E-21)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r3 = "C(DateRangePickerTitle)P(1):DateRangePicker.kt#uh7d8r"
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
            java.lang.String r4 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r3, r4)
        L_0x0077:
            int r0 = r30.m1302getDisplayModejFl4v0()
            androidx.compose.material3.DisplayMode$Companion r3 = androidx.compose.material3.DisplayMode.Companion
            int r3 = r3.m1320getPickerjFl4v0()
            boolean r3 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r0, r3)
            r4 = 6
            if (r3 == 0) goto L_0x00cb
            r0 = 585814427(0x22ead19b, float:6.3647756E-18)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "308@13262L48,307@13240L121"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1606getDateRangePickerTitleadMyvUU()
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
            r0 = 585814583(0x22ead237, float:6.36484E-18)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "313@13418L47,312@13396L120"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1600getDateRangeInputTitleadMyvUU()
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
            r0 = 585814713(0x22ead2b9, float:6.364894E-18)
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
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1 r7 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DateRangePickerHeadline(androidx.compose.material3.DateRangePickerState r18, androidx.compose.material3.DatePickerFormatter r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r17 = this;
            r11 = r18
            r12 = r19
            r13 = r22
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -332090137(0xffffffffec34b4e7, float:-8.7384374E26)
            r1 = r21
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DateRangePickerHeadline)P(2)333@14138L47,334@14212L45,335@14266L400:DateRangePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r13 | 6
            goto L_0x0037
        L_0x0027:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0036
            boolean r1 = r14.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r13
            goto L_0x0037
        L_0x0036:
            r1 = r13
        L_0x0037:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x003e
            r1 = r1 | 48
            goto L_0x004e
        L_0x003e:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004e
            boolean r2 = r14.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x004b
            r2 = 32
            goto L_0x004d
        L_0x004b:
            r2 = 16
        L_0x004d:
            r1 = r1 | r2
        L_0x004e:
            r2 = r23 & 4
            if (r2 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0068
            r3 = r20
            boolean r4 = r14.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r4
            goto L_0x006a
        L_0x0068:
            r3 = r20
        L_0x006a:
            r4 = r23 & 8
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r15 = r17
            goto L_0x0085
        L_0x0073:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            r15 = r17
            if (r4 != 0) goto L_0x0085
            boolean r4 = r14.changed((java.lang.Object) r15)
            if (r4 == 0) goto L_0x0082
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r4
        L_0x0085:
            r4 = r1 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0098
            boolean r4 = r14.getSkipping()
            if (r4 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            r14.skipToGroupEnd()
            r4 = r3
            goto L_0x0113
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r16 = r2
            goto L_0x00a3
        L_0x00a1:
            r16 = r3
        L_0x00a3:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00b0
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x00b0:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1605getDateRangePickerStartHeadlineadMyvUU()
            r2 = 6
            java.lang.String r4 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r14, r2)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1602getDateRangePickerEndHeadlineadMyvUU()
            java.lang.String r5 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r14, r2)
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1 r0 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
            r0.<init>(r4)
            r2 = -1382084760(0xffffffffad9f0f68, float:-1.8083049E-11)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r2, r3, r0)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2 r0 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
            r0.<init>(r5)
            r2 = -199852025(0xfffffffff4168007, float:-4.769539E31)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r2, r3, r0)
            r7 = r0
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            androidx.compose.material3.ComposableSingletons$DateRangePickerKt r0 = androidx.compose.material3.ComposableSingletons$DateRangePickerKt.INSTANCE
            kotlin.jvm.functions.Function2 r8 = r0.m1264getLambda1$material3_release()
            r0 = 14352384(0xdb0000, float:2.0111974E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r1 = r1 << 15
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r10 = r0 | r1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r16
            r9 = r14
            r0.DateRangePickerHeadline(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0111
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0111:
            r4 = r16
        L_0x0113:
            androidx.compose.runtime.ScopeUpdateScope r7 = r14.endRestartGroup()
            if (r7 != 0) goto L_0x011a
            goto L_0x012f
        L_0x011a:
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3 r8 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(androidx.compose.material3.DateRangePickerState, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public final void DateRangePickerHeadline(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i) {
        int i2;
        Composer composer2;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        Modifier modifier2 = modifier;
        String str3 = str;
        String str4 = str2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-861159957);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerHeadline)P(7!1,4,6,3,5,2)*379@16359L15,418@18064L168,417@18002L796:DateRangePicker.kt#uh7d8r");
        DateRangePickerState dateRangePickerState2 = dateRangePickerState;
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) dateRangePickerState2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerFormatter2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) modifier2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) str3) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) str4) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((23967451 & i4) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861159957, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData stateData$material3_release = dateRangePickerState.getStateData$material3_release();
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            Locale locale = defaultLocale;
            int i5 = i4;
            String formatDate$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), locale, false, 8, (Object) null);
            String formatDate$material3_release$default2 = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), locale, false, 8, (Object) null);
            Locale locale2 = defaultLocale;
            String formatDate$material3_release = datePickerFormatter2.formatDate$material3_release(stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), locale2, true);
            startRestartGroup.startReplaceableGroup(-1212634278);
            String str5 = "";
            ComposerKt.sourceInformation(startRestartGroup, str5);
            if (formatDate$material3_release == null) {
                int r1 = stateData$material3_release.getDisplayMode().getValue().m1318unboximpl();
                if (DisplayMode.m1315equalsimpl0(r1, DisplayMode.Companion.m1320getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096411);
                    ComposerKt.sourceInformation(startRestartGroup, "398@17129L51");
                    formatDate$material3_release = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1587getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1315equalsimpl0(r1, DisplayMode.Companion.m1319getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096500);
                    ComposerKt.sourceInformation(startRestartGroup, "399@17218L46");
                    formatDate$material3_release = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1582getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544548443);
                    startRestartGroup.endReplaceableGroup();
                    formatDate$material3_release = str5;
                }
            }
            startRestartGroup.endReplaceableGroup();
            String formatDate$material3_release2 = datePickerFormatter2.formatDate$material3_release(stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), locale2, true);
            startRestartGroup.startReplaceableGroup(-1212633768);
            ComposerKt.sourceInformation(startRestartGroup, str5);
            if (formatDate$material3_release2 == null) {
                int r3 = stateData$material3_release.getDisplayMode().getValue().m1318unboximpl();
                if (DisplayMode.m1315equalsimpl0(r3, DisplayMode.Companion.m1320getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096919);
                    ComposerKt.sourceInformation(startRestartGroup, "409@17637L51");
                    str5 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1587getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1315equalsimpl0(r3, DisplayMode.Companion.m1319getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922097008);
                    ComposerKt.sourceInformation(startRestartGroup, "410@17726L46");
                    str5 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1582getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544532695);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                str5 = formatDate$material3_release2;
            }
            startRestartGroup.endReplaceableGroup();
            String str6 = str3 + ": " + formatDate$material3_release;
            String str7 = str4 + ": " + str5;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) str6) | startRestartGroup.changed((Object) str7);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerDefaults$DateRangePickerHeadline$4$1$1(str6, str7);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier2, (Function1) rememberedValue);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical r32 = Arrangement.INSTANCE.m410spacedBy0680j_4(Dp.m5626constructorimpl((float) 4));
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(r32, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r5 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r5, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r5, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r5, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r5, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 990390577, "C430@18586L16:DateRangePicker.kt#uh7d8r");
            if (formatDate$material3_release$default != null) {
                startRestartGroup.startReplaceableGroup(990390609);
                ComposerKt.sourceInformation(startRestartGroup, "426@18452L31");
                composer2 = startRestartGroup;
                TextKt.m1727Text4IGK_g(formatDate$material3_release$default, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(990390686);
                ComposerKt.sourceInformation(composer2, "428@18529L22");
                function24.invoke(composer2, Integer.valueOf((i5 >> 15) & 14));
                composer2.endReplaceableGroup();
            }
            function26.invoke(composer2, Integer.valueOf((i5 >> 21) & 14));
            if (formatDate$material3_release$default2 != null) {
                composer2.startReplaceableGroup(990390828);
                ComposerKt.sourceInformation(composer2, "432@18671L29");
                TextKt.m1727Text4IGK_g(formatDate$material3_release$default2, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390903);
                ComposerKt.sourceInformation(composer2, "434@18746L20");
                function25.invoke(composer2, Integer.valueOf((i5 >> 18) & 14));
                composer2.endReplaceableGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$5(this, dateRangePickerState, datePickerFormatter, modifier, str, str2, function2, function22, function23, i));
        }
    }
}
