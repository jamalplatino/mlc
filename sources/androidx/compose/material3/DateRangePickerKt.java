package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010 \u001a9\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\"\u001ad\u0010#\u001a\u00020\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010*\u001a.\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000b\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002\u001aM\u00103\u001a\u00020\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0013H\u0002\u001a)\u0010>\u001a\u00020\n*\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0006\u001a\u00020\u0007X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "stateData", "Landroidx/compose/material3/StateData;", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalMonthsList", "onDateSelected", "Lkotlin/ParameterName;", "name", "dateInMillis", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "rememberDateRangePickerState-pMw4iz8", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangePicker.kt */
public final class DateRangePickerKt {
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl((float) 24), Dp.m5626constructorimpl((float) 20), 0.0f, Dp.m5626constructorimpl((float) 8), 4, (Object) null);
    /* access modifiers changed from: private */
    public static final PaddingValues DateRangePickerHeadlinePadding;
    /* access modifiers changed from: private */
    public static final PaddingValues DateRangePickerTitlePadding;
    private static final float HeaderHeightOffset = Dp.m5626constructorimpl((float) 60);

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DateRangePicker(androidx.compose.material3.DateRangePickerState r56, androidx.compose.ui.Modifier r57, androidx.compose.material3.DatePickerFormatter r58, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r59, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, boolean r62, androidx.compose.material3.DatePickerColors r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            r1 = r56
            r9 = r65
            r10 = r66
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1835392055(0xffffffff929a23c9, float:-9.727588E-28)
            r2 = r64
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(DateRangePicker)P(6,4,1,2,7,3,5)87@4128L34,103@4743L8,124@5421L10,105@4760L1103:DateRangePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r10 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r9 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r9
            goto L_0x0031
        L_0x0030:
            r3 = r9
        L_0x0031:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r57
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
            goto L_0x004d
        L_0x004b:
            r5 = r57
        L_0x004d:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r58
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r58
        L_0x0069:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0083
            r11 = r59
            boolean r12 = r2.changedInstance(r11)
            if (r12 == 0) goto L_0x007f
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r12
            goto L_0x0085
        L_0x0083:
            r11 = r59
        L_0x0085:
            r12 = r10 & 16
            r54 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r13 = r9 & r54
            if (r13 != 0) goto L_0x00a2
            r13 = r60
            boolean r14 = r2.changedInstance(r13)
            if (r14 == 0) goto L_0x009e
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r14
            goto L_0x00a4
        L_0x00a2:
            r13 = r60
        L_0x00a4:
            r14 = r10 & 32
            if (r14 == 0) goto L_0x00ac
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00c1
        L_0x00ac:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00c1
            r15 = r61
            boolean r16 = r2.changedInstance(r15)
            if (r16 == 0) goto L_0x00bc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r3 = r3 | r16
            goto L_0x00c3
        L_0x00c1:
            r15 = r61
        L_0x00c3:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x00ce
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r0 = r62
            goto L_0x00e3
        L_0x00ce:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r9 & r17
            r0 = r62
            if (r17 != 0) goto L_0x00e3
            boolean r17 = r2.changed((boolean) r0)
            if (r17 == 0) goto L_0x00df
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r3 = r3 | r17
        L_0x00e3:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00ff
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f8
            r0 = r63
            boolean r17 = r2.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00f8:
            r0 = r63
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r3 = r3 | r17
            goto L_0x0101
        L_0x00ff:
            r0 = r63
        L_0x0101:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0120
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0112
            goto L_0x0120
        L_0x0112:
            r2.skipToGroupEnd()
            r3 = r57
            r55 = r62
            r8 = r63
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x0282
        L_0x0120:
            r2.startDefaults()
            r0 = r9 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r15 = 1
            if (r0 == 0) goto L_0x0147
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0132
            goto L_0x0147
        L_0x0132:
            r2.skipToGroupEnd()
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x013a
            r3 = r3 & r5
        L_0x013a:
            r0 = r57
            r8 = r61
            r55 = r62
            r5 = r3
            r4 = r11
            r6 = r13
        L_0x0143:
            r3 = r63
            goto L_0x01f7
        L_0x0147:
            if (r4 == 0) goto L_0x014e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0150
        L_0x014e:
            r0 = r57
        L_0x0150:
            if (r6 == 0) goto L_0x0183
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r4)
            java.lang.Object r4 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x017d
            androidx.compose.material3.DatePickerFormatter r4 = new androidx.compose.material3.DatePickerFormatter
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 7
            r22 = 0
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r2.updateRememberedValue(r4)
        L_0x017d:
            r2.endReplaceableGroup()
            androidx.compose.material3.DatePickerFormatter r4 = (androidx.compose.material3.DatePickerFormatter) r4
            r7 = r4
        L_0x0183:
            if (r8 == 0) goto L_0x018a
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$2 r4 = androidx.compose.material3.DateRangePickerKt$DateRangePicker$2.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L_0x018b
        L_0x018a:
            r4 = r11
        L_0x018b:
            if (r12 == 0) goto L_0x019c
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$3 r6 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
            r6.<init>(r1, r3)
            r8 = 492752701(0x1d5ecf3d, float:2.9488595E-21)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r15, r6)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            goto L_0x019d
        L_0x019c:
            r6 = r13
        L_0x019d:
            if (r14 == 0) goto L_0x01ae
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$4 r8 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
            r8.<init>(r1, r7, r3)
            r11 = -204181785(0xfffffffff3d46ee7, float:-3.3661386E31)
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r15, r8)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            goto L_0x01b0
        L_0x01ae:
            r8 = r61
        L_0x01b0:
            if (r16 == 0) goto L_0x01b5
            r55 = r15
            goto L_0x01b7
        L_0x01b5:
            r55 = r62
        L_0x01b7:
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01f4
            androidx.compose.material3.DatePickerDefaults r11 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            r12 = 0
            r16 = 0
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r51 = 0
            r52 = 805306368(0x30000000, float:4.656613E-10)
            r53 = 524287(0x7ffff, float:7.34683E-40)
            r50 = r2
            androidx.compose.material3.DatePickerColors r11 = r11.m1287colors1m2CgY(r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            r3 = r3 & r5
            r5 = r3
            r3 = r11
            goto L_0x01f7
        L_0x01f4:
            r5 = r3
            goto L_0x0143
        L_0x01f7:
            r2.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x020a
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)"
            r13 = -1835392055(0xffffffff929a23c9, float:-9.727588E-28)
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r5, r11, r12)
        L_0x020a:
            if (r55 == 0) goto L_0x021c
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$5 r11 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
            r11.<init>(r1, r5)
            r12 = -1062265737(0xffffffffc0af1c77, float:-5.4722247)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r11)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            goto L_0x021e
        L_0x021c:
            r13 = 1
            r11 = 0
        L_0x021e:
            r14 = r11
            androidx.compose.material3.MaterialTheme r11 = androidx.compose.material3.MaterialTheme.INSTANCE
            r12 = 6
            androidx.compose.material3.Typography r11 = r11.getTypography(r2, r12)
            androidx.compose.material3.tokens.DatePickerModalTokens r12 = androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r12 = r12.getRangeSelectionHeaderHeadlineFont()
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material3.TypographyKt.fromToken(r11, r12)
            androidx.compose.material3.tokens.DatePickerModalTokens r11 = androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE
            float r11 = r11.m1974getRangeSelectionHeaderContainerHeightD9Ej5fM()
            float r12 = HeaderHeightOffset
            float r11 = r11 - r12
            float r17 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r11)
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$6 r11 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$6
            r57 = r11
            r58 = r56
            r59 = r7
            r60 = r4
            r61 = r3
            r62 = r5
            r57.<init>(r58, r59, r60, r61, r62)
            r12 = -186850856(0xfffffffff4dce1d8, float:-1.4000073E32)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r11)
            r18 = r11
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            int r11 = r5 >> 3
            r11 = r11 & 14
            r12 = 14155776(0xd80000, float:1.9836467E-38)
            r11 = r11 | r12
            int r5 = r5 >> 9
            r12 = r5 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r5 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r5 = r5 & r54
            r20 = r11 | r5
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r3
            r19 = r2
            androidx.compose.material3.DatePickerKt.m1290DateEntryContainerau3_HiA(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x027e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x027e:
            r5 = r6
            r6 = r8
            r8 = r3
            r3 = r0
        L_0x0282:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.endRestartGroup()
            if (r11 != 0) goto L_0x0289
            goto L_0x029e
        L_0x0289:
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$7 r12 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$7
            r0 = r12
            r1 = r56
            r2 = r3
            r3 = r7
            r7 = r55
            r9 = r65
            r10 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: rememberDateRangePickerState-pMw4iz8  reason: not valid java name */
    public static final DateRangePickerState m1299rememberDateRangePickerStatepMw4iz8(Long l, Long l2, Long l3, IntRange intRange, int i, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        composer2.startReplaceableGroup(501019096);
        ComposerKt.sourceInformation(composer2, "C(rememberDateRangePickerState)P(3,2,1,4,0:c#material3.DisplayMode)164@7390L384:DateRangePicker.kt#uh7d8r");
        Long l4 = (i3 & 1) != 0 ? null : l;
        Long l5 = (i3 & 2) != 0 ? null : l2;
        Long l6 = (i3 & 4) != 0 ? l4 : l3;
        IntRange yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        int r13 = (i3 & 16) != 0 ? DisplayMode.Companion.m1320getPickerjFl4v0() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501019096, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.rememberSaveable(new Object[0], DateRangePickerState.Companion.Saver(), (String) null, new DateRangePickerKt$rememberDateRangePickerState$1(l4, l5, l6, yearRange, r13), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerState;
    }

    /* access modifiers changed from: private */
    public static final void SwitchableDateEntryContent(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(984055784);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)P(3,1,2)455@19358L648:DateRangePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) dateRangePickerState) ? 4 : 2) | i3;
        } else {
            DateRangePickerState dateRangePickerState2 = dateRangePickerState;
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerFormatter) ? 32 : 16;
        } else {
            DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        }
        Function1<? super Long, Boolean> function12 = function1;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984055784, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int r0 = dateRangePickerState.m1302getDisplayModejFl4v0();
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DateRangePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, (Object) null);
            DisplayMode r02 = DisplayMode.m1312boximpl(r0);
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$2 = r6;
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$22 = new DateRangePickerKt$SwitchableDateEntryContent$2(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i4);
            CrossfadeKt.Crossfade(r02, semantics$default, (FiniteAnimationSpec<Float>) spring$default, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1354418636, true, dateRangePickerKt$SwitchableDateEntryContent$2), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$SwitchableDateEntryContent$3(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlin.jvm.functions.Function1} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DateRangePickerContent(androidx.compose.material3.StateData r17, androidx.compose.material3.DatePickerFormatter r18, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r19, androidx.compose.material3.DatePickerColors r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r8 = r17
            r9 = r20
            r10 = r22
            r0 = -1003501610(0xffffffffc42fc7d6, float:-703.12244)
            r1 = r21
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DateRangePickerContent)P(3,1,2)485@20269L105,489@20401L82,492@20488L412:DateRangePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r10 & 14
            r2 = 2
            if (r1 != 0) goto L_0x0024
            boolean r1 = r11.changed((java.lang.Object) r8)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r1 = r1 | r10
            goto L_0x0025
        L_0x0024:
            r1 = r10
        L_0x0025:
            r3 = r10 & 112(0x70, float:1.57E-43)
            r12 = r18
            if (r3 != 0) goto L_0x0037
            boolean r3 = r11.changed((java.lang.Object) r12)
            if (r3 == 0) goto L_0x0034
            r3 = 32
            goto L_0x0036
        L_0x0034:
            r3 = 16
        L_0x0036:
            r1 = r1 | r3
        L_0x0037:
            r3 = r10 & 896(0x380, float:1.256E-42)
            r13 = r19
            if (r3 != 0) goto L_0x0049
            boolean r3 = r11.changedInstance(r13)
            if (r3 == 0) goto L_0x0046
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r1 = r1 | r3
        L_0x0049:
            r3 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r11.changed((java.lang.Object) r9)
            if (r3 == 0) goto L_0x0056
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r1 = r1 | r3
        L_0x0059:
            r3 = r1 & 5851(0x16db, float:8.199E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 != r4) goto L_0x006b
            boolean r3 = r11.getSkipping()
            if (r3 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r11.skipToGroupEnd()
            goto L_0x01e3
        L_0x006b:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0078
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L_0x0078:
            int r0 = r17.getDisplayedMonthIndex()
            r3 = 0
            androidx.compose.foundation.lazy.LazyListState r4 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r3, r11, r3, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            boolean r0 = r11.changed((java.lang.Object) r8)
            java.lang.Object r5 = r11.rememberedValue()
            if (r0 != 0) goto L_0x009e
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x00a9
        L_0x009e:
            androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 r0 = new androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1
            r0.<init>(r8)
            r5 = r0
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r11.updateRememberedValue(r5)
        L_0x00a9:
            r11.endReplaceableGroup()
            r0 = r5
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            float r6 = androidx.compose.material3.DatePickerKt.getDatePickerHorizontalPadding()
            r7 = 0
            r14 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m495paddingVpY3zN4$default(r5, r6, r7, r2, r14)
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r11.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r5.getTop()
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r6 = r6.getStart()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r5, r6, r11, r3)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r6)
            java.lang.String r6 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r14 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r7, r14)
            java.lang.Object r6 = r11.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r7, r14)
            java.lang.Object r15 = r11.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r3 = r16
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r7, r14)
            java.lang.Object r3 = r11.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r2 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            androidx.compose.runtime.Applier r14 = r11.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x0135
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0135:
            r11.startReusableNode()
            boolean r14 = r11.getInserting()
            if (r14 == 0) goto L_0x0142
            r11.createNode(r7)
            goto L_0x0145
        L_0x0142:
            r11.useNode()
        L_0x0145:
            r11.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r5, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r6, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r15, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r3, r5)
            r11.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.invoke(r3, r11, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r2)
            r2 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r3 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r2, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r2 = (androidx.compose.foundation.layout.ColumnScope) r2
            r2 = 1265369378(0x4b6c0122, float:1.5466786E7)
            java.lang.String r3 = "C493@20576L41,494@20626L268:DateRangePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r2, r3)
            androidx.compose.material3.CalendarModel r2 = r17.getCalendarModel()
            int r3 = r1 >> 9
            r3 = r3 & 14
            androidx.compose.material3.DatePickerKt.WeekDays(r9, r2, r11, r3)
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r1 = r1 << 6
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r7 = r2 | r1
            r1 = r17
            r2 = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            VerticalMonthsList(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e3:
            androidx.compose.runtime.ScopeUpdateScope r6 = r11.endRestartGroup()
            if (r6 != 0) goto L_0x01ea
            goto L_0x01ff
        L_0x01ea:
            androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$2 r7 = new androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$2
            r0 = r7
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r6.updateScope(r7)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent(androidx.compose.material3.StateData, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.compose.material3.CalendarMonth} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void VerticalMonthsList(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r19, androidx.compose.material3.StateData r20, androidx.compose.foundation.lazy.LazyListState r21, androidx.compose.material3.DatePickerFormatter r22, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r23, androidx.compose.material3.DatePickerColors r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r10 = r20
            r11 = r21
            r12 = r26
            r0 = -837198453(0xffffffffce195d8b, float:-6.4326112E8)
            r1 = r25
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(VerticalMonthsList)P(4,5,3,1,2)520@21434L168,527@21647L10,526@21607L2599,584@24241L62,584@24211L92:DateRangePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r12 & 14
            r14 = r19
            if (r1 != 0) goto L_0x0025
            boolean r1 = r13.changedInstance(r14)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r12
            goto L_0x0026
        L_0x0025:
            r1 = r12
        L_0x0026:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0036
            boolean r2 = r13.changed((java.lang.Object) r10)
            if (r2 == 0) goto L_0x0033
            r2 = 32
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r13.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x0043
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            r15 = r22
            if (r2 != 0) goto L_0x0058
            boolean r2 = r13.changed((java.lang.Object) r15)
            if (r2 == 0) goto L_0x0055
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            r9 = r23
            if (r2 != 0) goto L_0x006c
            boolean r2 = r13.changedInstance(r9)
            if (r2 == 0) goto L_0x0069
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006b
        L_0x0069:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006b:
            r1 = r1 | r2
        L_0x006c:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r12
            r8 = r24
            if (r2 != 0) goto L_0x007f
            boolean r2 = r13.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x007c
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007e
        L_0x007c:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r7 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r7
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x0095
            boolean r1 = r13.getSkipping()
            if (r1 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r13.skipToGroupEnd()
            goto L_0x0165
        L_0x0095:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a2
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r1, r2)
        L_0x00a2:
            androidx.compose.material3.CalendarModel r0 = r20.getCalendarModel()
            androidx.compose.material3.CalendarDate r16 = r0.getToday()
            kotlin.ranges.IntRange r0 = r20.getYearRange()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            boolean r0 = r13.changed((java.lang.Object) r0)
            java.lang.Object r1 = r13.rememberedValue()
            r6 = 1
            if (r0 != 0) goto L_0x00cc
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00df
        L_0x00cc:
            androidx.compose.material3.CalendarModel r0 = r20.getCalendarModel()
            kotlin.ranges.IntRange r1 = r20.getYearRange()
            int r1 = r1.getFirst()
            androidx.compose.material3.CalendarMonth r1 = r0.getMonth(r1, r6)
            r13.updateRememberedValue(r1)
        L_0x00df:
            r13.endReplaceableGroup()
            r4 = r1
            androidx.compose.material3.CalendarMonth r4 = (androidx.compose.material3.CalendarMonth) r4
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r5 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r13, r5)
            androidx.compose.material3.tokens.DatePickerModalTokens r1 = androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r1 = r1.getRangeSelectionMonthSubheadFont()
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material3.TypographyKt.fromToken(r0, r1)
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1 r2 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1
            r0 = r2
            r1 = r21
            r12 = r2
            r2 = r7
            r14 = r3
            r3 = r20
            r17 = r5
            r5 = r22
            r15 = r6
            r6 = r24
            r18 = r7
            r7 = r19
            r8 = r16
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 56792252(0x36294bc, float:6.658617E-37)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r15, r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = 48
            androidx.compose.material3.TextKt.ProvideTextStyle(r14, r0, r13, r1)
            int r0 = r18 >> 6
            r0 = r0 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            boolean r1 = r13.changed((java.lang.Object) r11)
            boolean r2 = r13.changed((java.lang.Object) r10)
            r1 = r1 | r2
            java.lang.Object r2 = r13.rememberedValue()
            if (r1 != 0) goto L_0x0146
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0152
        L_0x0146:
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1 r1 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1
            r2 = 0
            r1.<init>(r11, r10, r2)
            r2 = r1
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r13.updateRememberedValue(r2)
        L_0x0152:
            r13.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0 = r0 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r11, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r2, (androidx.compose.runtime.Composer) r13, (int) r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0165
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0165:
            androidx.compose.runtime.ScopeUpdateScope r8 = r13.endRestartGroup()
            if (r8 != 0) goto L_0x016c
            goto L_0x0185
        L_0x016c:
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3 r9 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList(kotlin.jvm.functions.Function1, androidx.compose.material3.StateData, androidx.compose.foundation.lazy.LazyListState, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final void updateDateSelection(StateData stateData, long j) {
        CalendarDate canonicalDate = stateData.getCalendarModel().getCanonicalDate(j);
        CalendarDate value = stateData.getSelectedStartDate().getValue();
        CalendarDate value2 = stateData.getSelectedEndDate().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && canonicalDate.compareTo(value) < 0))) {
            stateData.getSelectedStartDate().setValue(canonicalDate);
            stateData.getSelectedEndDate().setValue(null);
        } else if (value != null && canonicalDate.compareTo(value) >= 0) {
            stateData.getSelectedEndDate().setValue(canonicalDate);
        }
    }

    /* renamed from: drawRangeBackground-mxwnekA  reason: not valid java name */
    public static final void m1298drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        Intrinsics.checkNotNullParameter(contentDrawScope2, "$this$drawRangeBackground");
        Intrinsics.checkNotNullParameter(selectedRangeInfo, "selectedRangeInfo");
        float r1 = contentDrawScope2.m5607toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float r3 = contentDrawScope2.m5607toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float r4 = contentDrawScope2.m5607toPx0680j_4(DatePickerModalTokens.INSTANCE.m1967getDateStateLayerHeightD9Ej5fM());
        float f = (float) 2;
        float f2 = (r3 - r4) / f;
        float f3 = (float) 7;
        float r7 = (Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) - (f3 * r1)) / f3;
        long r8 = selectedRangeInfo.getGridCoordinates().getFirst().m5753unboximpl();
        int r10 = IntOffset.m5736component1impl(r8);
        int r82 = IntOffset.m5737component2impl(r8);
        long r11 = selectedRangeInfo.getGridCoordinates().getSecond().m5753unboximpl();
        int r9 = IntOffset.m5736component1impl(r11);
        int r112 = IntOffset.m5737component2impl(r11);
        float f4 = r1 + r7;
        float f5 = 0.0f;
        float f6 = r7 / f;
        float f7 = (((float) r10) * f4) + (selectedRangeInfo.getFirstIsSelectionStart() ? r1 / f : 0.0f) + f6;
        float f8 = (((float) r82) * r3) + f2;
        float f9 = ((float) r9) * f4;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            r1 /= f;
        }
        float f10 = f9 + r1 + f6;
        float f11 = (((float) r112) * r3) + f2;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            f7 = Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) - f7;
            f10 = Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) - f10;
        }
        DrawScope drawScope = contentDrawScope2;
        DrawScope.m3405drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(f7, f8), SizeKt.Size(r82 == r112 ? f10 - f7 : z ? -f7 : Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) - f7, r4), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, MenuKt.InTransitionDuration, (Object) null);
        if (r82 != r112) {
            for (int i = (r112 - r82) - 1; i > 0; i--) {
                DrawScope.m3405drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(0.0f, (((float) i) * r3) + f8), SizeKt.Size(Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()), r4), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, MenuKt.InTransitionDuration, (Object) null);
            }
            if (contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr) {
                f5 = Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc());
            }
            long Offset = OffsetKt.Offset(f5, f11);
            if (z) {
                f10 -= Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc());
            }
            DrawScope.m3405drawRectnJ9OG0$default(drawScope, j, Offset, SizeKt.Size(f10, r4), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, MenuKt.InTransitionDuration, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf(new CustomAccessibilityAction(str, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, coroutineScope)), new CustomAccessibilityAction(str2, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, coroutineScope)));
    }

    static {
        float f = (float) 64;
        float f2 = (float) 12;
        DateRangePickerTitlePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl(f), 0.0f, Dp.m5626constructorimpl(f2), 0.0f, 10, (Object) null);
        DateRangePickerHeadlinePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl(f), 0.0f, Dp.m5626constructorimpl(f2), Dp.m5626constructorimpl(f2), 2, (Object) null);
    }
}
