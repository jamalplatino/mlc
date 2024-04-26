package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$Month$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ Locale $defaultLocale;
    final /* synthetic */ MutableState<CalendarDate> $endSelection;
    final /* synthetic */ CalendarMonth $month;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ Modifier $rangeSelectionDrawModifier;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ MutableState<CalendarDate> $startSelection;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$Month$1(Modifier modifier, CalendarMonth calendarMonth, CalendarDate calendarDate, MutableState<CalendarDate> mutableState, MutableState<CalendarDate> mutableState2, boolean z, int i, DatePickerFormatter datePickerFormatter, Locale locale, Function1<? super Long, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$rangeSelectionDrawModifier = modifier;
        this.$month = calendarMonth;
        this.$today = calendarDate;
        this.$startSelection = mutableState;
        this.$endSelection = mutableState2;
        this.$rangeSelectionEnabled = z;
        this.$$dirty = i;
        this.$dateFormatter = datePickerFormatter;
        this.$defaultLocale = locale;
        this.$onDateSelected = function1;
        this.$colors = datePickerColors;
        this.$stateData = stateData;
        this.$dateValidator = function12;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: androidx.compose.runtime.State} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: androidx.compose.runtime.State} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r13 = r39
            r1 = r40
            java.lang.String r2 = "C1446@58969L4887:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x001c
            boolean r2 = r39.getSkipping()
            if (r2 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r39.skipToGroupEnd()
            goto L_0x0513
        L_0x001c:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x002c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.Month.<anonymous> (DatePicker.kt:1444)"
            r4 = -1776200645(0xffffffff9621543b, float:-1.3032055E-25)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x002c:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            float r2 = androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility()
            r14 = 6
            float r3 = (float) r14
            float r2 = r2 * r3
            float r2 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.m552requiredHeight3ABfNKs(r1, r2)
            androidx.compose.ui.Modifier r2 = r0.$rangeSelectionDrawModifier
            androidx.compose.ui.Modifier r1 = r1.then(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r2 = r2.getSpaceEvenly()
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = (androidx.compose.foundation.layout.Arrangement.Vertical) r2
            androidx.compose.material3.CalendarMonth r15 = r0.$month
            androidx.compose.material3.CalendarDate r12 = r0.$today
            androidx.compose.runtime.MutableState<androidx.compose.material3.CalendarDate> r11 = r0.$startSelection
            androidx.compose.runtime.MutableState<androidx.compose.material3.CalendarDate> r10 = r0.$endSelection
            boolean r9 = r0.$rangeSelectionEnabled
            int r8 = r0.$$dirty
            androidx.compose.material3.DatePickerFormatter r7 = r0.$dateFormatter
            java.util.Locale r6 = r0.$defaultLocale
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r5 = r0.$onDateSelected
            androidx.compose.material3.DatePickerColors r4 = r0.$colors
            androidx.compose.material3.StateData r3 = r0.$stateData
            kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> r14 = r0.$dateValidator
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getStart()
            r16 = r4
            r4 = 6
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r2, r0, r13, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r4)
            java.lang.String r2 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r4 = r17
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r17 = r14
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            r19 = r7
            java.lang.String r7 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r14, r7)
            java.lang.Object r4 = r13.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r20 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r21 = r5
            r5 = r20
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r14, r7)
            java.lang.Object r5 = r13.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r20 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r22 = r6
            r6 = r20
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r14, r7)
            java.lang.Object r6 = r13.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r14 = r20.getConstructor()
            kotlin.jvm.functions.Function3 r1 = androidx.compose.ui.layout.LayoutKt.materializerOf(r1)
            r20 = r3
            androidx.compose.runtime.Applier r3 = r39.getApplier()
            boolean r3 = r3 instanceof androidx.compose.runtime.Applier
            if (r3 != 0) goto L_0x00e8
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00e8:
            r39.startReusableNode()
            boolean r3 = r39.getInserting()
            if (r3 == 0) goto L_0x00f5
            r13.createNode(r14)
            goto L_0x00f8
        L_0x00f5:
            r39.useNode()
        L_0x00f8:
            r39.disableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.Updater.m2444constructorimpl(r39)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r0, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r4, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r5, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r6, r0)
            r39.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r39)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r14 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r1.invoke(r0, r13, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r0)
            r1 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r3 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r1, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r1 = (androidx.compose.foundation.layout.ColumnScope) r1
            r1 = -1111255490(0xffffffffbdc3963e, float:-0.09550141)
            java.lang.String r6 = "C:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r1, r6)
            r1 = -713647587(0xffffffffd5769a1d, float:-1.69463607E13)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "*1453@59267L4565"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r14
            r5 = r1
            r3 = 6
        L_0x015e:
            if (r5 >= r3) goto L_0x04f5
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r4 = 0
            r0 = 0
            r14 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r3, r4, r14, r0)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r3 = r3.getSpaceEvenly()
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r3
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r4 = r4.getCenterVertically()
            r14 = 693286680(0x2952b718, float:4.6788176E-14)
            r13.startReplaceableGroup(r14)
            java.lang.String r14 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r14)
            r14 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r3, r4, r13, r14)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            r18 = r5
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r7)
            java.lang.Object r14 = r13.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r23 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r4 = r23
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r7)
            java.lang.Object r4 = r13.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r23 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r27 = r1
            r1 = r23
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r7)
            java.lang.Object r1 = r13.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r23 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r5 = r23.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            r23 = r2
            androidx.compose.runtime.Applier r2 = r39.getApplier()
            boolean r2 = r2 instanceof androidx.compose.runtime.Applier
            if (r2 != 0) goto L_0x01eb
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01eb:
            r39.startReusableNode()
            boolean r2 = r39.getInserting()
            if (r2 == 0) goto L_0x01f8
            r13.createNode(r5)
            goto L_0x01fb
        L_0x01f8:
            r39.useNode()
        L_0x01fb:
            r39.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m2444constructorimpl(r39)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r2, r3, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r2, r14, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r2, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r2, r1, r3)
            r39.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r39)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r0.invoke(r1, r13, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r0)
            r1 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r2 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r1, r2)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r1 = (androidx.compose.foundation.layout.RowScope) r1
            r1 = -1481813225(0xffffffffa7ad5317, float:-4.810723E-15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r1, r6)
            r1 = -1111255211(0xffffffffbdc39755, float:-0.09550349)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r4 = r14
            r5 = r27
        L_0x025f:
            r1 = 7
            if (r4 >= r1) goto L_0x04aa
            int r1 = r15.getDaysFromStartOfWeekToFirstOfMonth()
            if (r5 < r1) goto L_0x0442
            int r1 = r15.getDaysFromStartOfWeekToFirstOfMonth()
            int r2 = r15.getNumberOfDays()
            int r1 = r1 + r2
            if (r5 < r1) goto L_0x0275
            goto L_0x0442
        L_0x0275:
            r1 = 382637385(0x16ce9549, float:3.3375307E-25)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "1478@60757L644,1489@61458L366,1504@62314L32,1509@62702L129,1501@62133L1597"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            int r1 = r15.getDaysFromStartOfWeekToFirstOfMonth()
            int r3 = r5 - r1
            long r1 = r15.getStartUtcTimeMillis()
            r24 = r15
            long r14 = (long) r3
            r29 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r14 * r29
            long r14 = r14 + r1
            long r1 = r12.getUtcTimeMillis()
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x029e
            r27 = 1
            goto L_0x02a0
        L_0x029e:
            r27 = 0
        L_0x02a0:
            java.lang.Object r1 = r11.getValue()
            androidx.compose.material3.CalendarDate r1 = (androidx.compose.material3.CalendarDate) r1
            if (r1 == 0) goto L_0x02b3
            long r1 = r1.getUtcTimeMillis()
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02b3
            r29 = 1
            goto L_0x02b5
        L_0x02b3:
            r29 = 0
        L_0x02b5:
            java.lang.Object r1 = r10.getValue()
            androidx.compose.material3.CalendarDate r1 = (androidx.compose.material3.CalendarDate) r1
            if (r1 == 0) goto L_0x02c8
            long r1 = r1.getUtcTimeMillis()
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02c8
            r30 = 1
            goto L_0x02ca
        L_0x02c8:
            r30 = 0
        L_0x02ca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            int r31 = r8 >> 12
            r31 = r31 & 14
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            boolean r1 = r13.changed((java.lang.Object) r1)
            boolean r2 = r13.changed((java.lang.Object) r2)
            r1 = r1 | r2
            java.lang.Object r2 = r39.rememberedValue()
            if (r1 != 0) goto L_0x02fd
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x02f9
            goto L_0x02fd
        L_0x02f9:
            r1 = r2
            r2 = r20
            goto L_0x030d
        L_0x02fd:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$inRange$1$1 r1 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$inRange$1$1
            r2 = r20
            r1.<init>(r2, r9, r14)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r1)
            r13.updateRememberedValue(r1)
        L_0x030d:
            r39.endReplaceableGroup()
            r20 = r1
            androidx.compose.runtime.State r20 = (androidx.compose.runtime.State) r20
            java.lang.Object r1 = r20.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r32 = r1.booleanValue()
            r1 = r9
            r33 = r23
            r23 = r2
            r2 = r27
            r34 = r9
            r9 = r3
            r3 = r29
            r26 = r4
            r35 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4 = r30
            r36 = r12
            r12 = r21
            r28 = 2023513938(0x789c5f52, float:2.5372864E34)
            r21 = r5
            r5 = r32
            r32 = r11
            r11 = r22
            r22 = r6
            r6 = r39
            r37 = r7
            r7 = r31
            java.lang.String r1 = androidx.compose.material3.DatePickerKt.dayContentDescription(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = r19.getSelectedDateDescriptionSkeleton$material3_release()
            java.lang.String r2 = androidx.compose.material3.CalendarModel_androidKt.formatWithSkeleton(r14, r2, r11)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            if (r29 != 0) goto L_0x035f
            if (r30 == 0) goto L_0x035d
            goto L_0x035f
        L_0x035d:
            r4 = 0
            goto L_0x0360
        L_0x035f:
            r4 = 1
        L_0x0360:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            boolean r0 = r13.changed((java.lang.Object) r12)
            boolean r5 = r13.changed((java.lang.Object) r5)
            r0 = r0 | r5
            java.lang.Object r5 = r39.rememberedValue()
            if (r0 != 0) goto L_0x0384
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x038f
        L_0x0384:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$1$1 r0 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$1$1
            r0.<init>(r12, r14)
            r5 = r0
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r13.updateRememberedValue(r5)
        L_0x038f:
            r39.endReplaceableGroup()
            r0 = r5
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r6 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r6)
            boolean r5 = r13.changed((java.lang.Object) r5)
            java.lang.Object r6 = r39.rememberedValue()
            if (r5 != 0) goto L_0x03ba
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x03b7
            goto L_0x03ba
        L_0x03b7:
            r14 = r17
            goto L_0x03d1
        L_0x03ba:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r14 = r17
            java.lang.Object r5 = r14.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r13.updateRememberedValue(r6)
        L_0x03d1:
            r39.endReplaceableGroup()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            java.lang.Object r6 = r20.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r7 = r6.booleanValue()
            if (r1 == 0) goto L_0x03ff
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.String r6 = ", "
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r15 = r1
            goto L_0x0400
        L_0x03ff:
            r15 = r2
        L_0x0400:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$3 r1 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$3
            r1.<init>(r9)
            r2 = 1633583293(0x615e80bd, float:2.5652836E20)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r2, r9, r1)
            r17 = r1
            kotlin.jvm.functions.Function2 r17 = (kotlin.jvm.functions.Function2) r17
            int r1 = r8 << 3
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r2 = 805306374(0x30000006, float:4.656616E-10)
            r20 = r1 | r2
            r1 = r3
            r2 = r4
            r3 = r0
            r4 = r29
            r6 = r27
            r0 = r8
            r8 = r15
            r25 = r9
            r15 = r34
            r9 = r16
            r27 = r10
            r10 = r17
            r29 = r11
            r17 = r32
            r11 = r39
            r31 = r12
            r30 = r36
            r12 = r20
            androidx.compose.material3.DatePickerKt.Day(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r39.endReplaceableGroup()
            r2 = 6
            goto L_0x0488
        L_0x0442:
            r26 = r4
            r37 = r7
            r0 = r8
            r27 = r10
            r30 = r12
            r24 = r15
            r14 = r17
            r31 = r21
            r29 = r22
            r33 = r23
            r25 = 1
            r28 = 2023513938(0x789c5f52, float:2.5372864E34)
            r35 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r21 = r5
            r22 = r6
            r15 = r9
            r17 = r11
            r23 = r20
            r1 = 382636990(0x16ce93be, float:3.3374333E-25)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "1464@59838L291"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            float r2 = androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility()
            float r3 = androidx.compose.material3.DatePickerKt.getRecommendedSizeForAccessibility()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.m557requiredSizeVpY3zN4(r1, r2, r3)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.Spacer(r1, r13, r2)
            r39.endReplaceableGroup()
        L_0x0488:
            int r5 = r21 + 1
            int r4 = r26 + 1
            r8 = r0
            r9 = r15
            r11 = r17
            r6 = r22
            r20 = r23
            r15 = r24
            r10 = r27
            r22 = r29
            r12 = r30
            r21 = r31
            r23 = r33
            r7 = r37
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r17 = r14
            r14 = 0
            goto L_0x025f
        L_0x04aa:
            r37 = r7
            r0 = r8
            r27 = r10
            r30 = r12
            r24 = r15
            r14 = r17
            r31 = r21
            r29 = r22
            r33 = r23
            r2 = 6
            r28 = 2023513938(0x789c5f52, float:2.5372864E34)
            r35 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r21 = r5
            r22 = r6
            r15 = r9
            r17 = r11
            r23 = r20
            r39.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            r39.endReplaceableGroup()
            r39.endNode()
            r39.endReplaceableGroup()
            r39.endReplaceableGroup()
            int r5 = r18 + 1
            r3 = r2
            r1 = r21
            r15 = r24
            r22 = r29
            r21 = r31
            r2 = r33
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r17 = r14
            r14 = 0
            goto L_0x015e
        L_0x04f5:
            r39.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r39)
            r39.endReplaceableGroup()
            r39.endNode()
            r39.endReplaceableGroup()
            r39.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0513
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0513:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$Month$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
