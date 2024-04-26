package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0002\u0010\r\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"TextFieldSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangeInputContent", "", "stateData", "Landroidx/compose/material3/StateData;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateRangeInput.kt */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m5626constructorimpl((float) 8);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.compose.material3.DateInputFormat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DateRangeInputContent(androidx.compose.material3.StateData r24, androidx.compose.material3.DatePickerFormatter r25, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r28
            java.lang.String r0 = "stateData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "dateValidator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1163802470(0xffffffffbaa1c89a, float:-0.0012343109)
            r1 = r27
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DateRangeInputContent)P(2)37@1398L15,38@1440L97,41@1565L45,42@1645L44,43@1723L45,44@1797L50,45@1877L482,57@2364L1939:DateRangeInput.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0037
            boolean r1 = r11.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r1 = r1 | r15
            goto L_0x0038
        L_0x0037:
            r1 = r15
        L_0x0038:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0048
            boolean r2 = r11.changed((java.lang.Object) r13)
            if (r2 == 0) goto L_0x0045
            r2 = 32
            goto L_0x0047
        L_0x0045:
            r2 = 16
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r2 = r15 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0058
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x0055
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r9 = r1
            r1 = r9 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x006c
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r11.skipToGroupEnd()
            r14 = r11
            goto L_0x0366
        L_0x006c:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0079
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r1, r2)
        L_0x0079:
            r10 = 0
            java.util.Locale r8 = androidx.compose.material3.CalendarModel_androidKt.defaultLocale(r11, r10)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r7)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r6)
            boolean r0 = r11.changed((java.lang.Object) r8)
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00a6
        L_0x009b:
            androidx.compose.material3.CalendarModel r0 = r24.getCalendarModel()
            androidx.compose.material3.DateInputFormat r1 = r0.getDateInputFormat(r8)
            r11.updateRememberedValue(r1)
        L_0x00a6:
            r11.endReplaceableGroup()
            r5 = r1
            androidx.compose.material3.DateInputFormat r5 = (androidx.compose.material3.DateInputFormat) r5
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1578getDateInputInvalidForPatternadMyvUU()
            r4 = 6
            java.lang.String r16 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r4)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1580getDateInputInvalidYearRangeadMyvUU()
            java.lang.String r17 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r4)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1579getDateInputInvalidNotAllowedadMyvUU()
            java.lang.String r18 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r4)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1599getDateRangeInputInvalidRangeInputadMyvUU()
            java.lang.String r19 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r4)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            boolean r0 = r11.changed((java.lang.Object) r5)
            boolean r1 = r11.changed((java.lang.Object) r13)
            r0 = r0 | r1
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x0100
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            r13 = r4
            r20 = r5
            r21 = r6
            r16 = r8
            goto L_0x0121
        L_0x0100:
            androidx.compose.material3.DateInputValidator r3 = new androidx.compose.material3.DateInputValidator
            r0 = r3
            r1 = r24
            r2 = r5
            r10 = r3
            r3 = r25
            r13 = r4
            r4 = r26
            r20 = r5
            r5 = r16
            r21 = r6
            r6 = r17
            r7 = r18
            r16 = r8
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.updateRememberedValue(r10)
            r1 = r10
        L_0x0121:
            r11.endReplaceableGroup()
            r17 = r1
            androidx.compose.material3.DateInputValidator r17 = (androidx.compose.material3.DateInputValidator) r17
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.material3.DateInputKt.getInputTextFieldPadding()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.padding(r0, r1)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r2 = TextFieldSpacing
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.m410spacedBy0680j_4(r2)
            androidx.compose.foundation.layout.Arrangement$Horizontal r1 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r1
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r2 = r2.getTop()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r1, r2, r11, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r3, r4)
            java.lang.Object r2 = r11.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r3, r4)
            java.lang.Object r5 = r11.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r3, r4)
            java.lang.Object r3 = r11.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r4 = r4.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r6 = r11.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x01ae
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01ae:
            r11.startReusableNode()
            boolean r6 = r11.getInserting()
            if (r6 == 0) goto L_0x01bb
            r11.createNode(r4)
            goto L_0x01be
        L_0x01bb:
            r11.useNode()
        L_0x01be:
            r11.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r2, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r5, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r3, r1)
            r11.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r11, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r0)
            r0 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r1 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r1)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r18 = r0
            androidx.compose.foundation.layout.RowScope r18 = (androidx.compose.foundation.layout.RowScope) r18
            r0 = 1849028810(0x6e35f0ca, float:1.4076971E28)
            java.lang.String r1 = "C62@2625L56,74@3193L52,63@2690L763,80@3481L54,92@4041L50,81@3544L753:DateRangeInput.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r1)
            java.lang.String r0 = r20.getPatternWithDelimiters()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r10 = r0.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1605getDateRangePickerStartHeadlineadMyvUU()
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r13)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            r2 = r1
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r18
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.RowScope.weight$default(r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1 r2 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1
            r2.<init>(r0, r10)
            r0 = 576559191(0x225d9857, float:3.0031733E-18)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r0, r8, r2)
            r2 = r0
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2 r0 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2
            r0.<init>(r10)
            r3 = 1726391478(0x66e6a4b6, float:5.4459134E23)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r3, r8, r0)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.runtime.MutableState r0 = r24.getSelectedStartDate()
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            androidx.compose.material3.CalendarDate r4 = (androidx.compose.material3.CalendarDate) r4
            r7 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r7)
            r6 = r21
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r6)
            boolean r0 = r11.changed((java.lang.Object) r12)
            java.lang.Object r5 = r11.rememberedValue()
            if (r0 != 0) goto L_0x0289
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x0294
        L_0x0289:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$3$1 r0 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$3$1
            r0.<init>(r12)
            r5 = r0
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r11.updateRememberedValue(r5)
        L_0x0294:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.material3.InputIdentifier$Companion r0 = androidx.compose.material3.InputIdentifier.Companion
            int r19 = r0.m1406getStartDateInputJ2x2o4M()
            int r0 = r9 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = 1075315120(0x401801b0, float:2.375103)
            r21 = r0 | r9
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r24
            r9 = r6
            r6 = r19
            r7 = r17
            r8 = r20
            r22 = r9
            r9 = r16
            r23 = r10
            r10 = r11
            r14 = r11
            r11 = r21
            androidx.compose.material3.DateInputKt.m1278DateInputTextFieldzm97o8M(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1602getDateRangePickerEndHeadlineadMyvUU()
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r14, r13)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            r2 = r1
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r18
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.RowScope.weight$default(r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4 r2 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4
            r3 = r23
            r2.<init>(r0, r3)
            r0 = -663502784(0xffffffffd873c040, float:-1.07202813E15)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r0, r4, r2)
            r2 = r0
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5 r0 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5
            r0.<init>(r3)
            r3 = 518729951(0x1eeb30df, float:2.4901805E-20)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r3, r4, r0)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.runtime.MutableState r0 = r24.getSelectedEndDate()
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            androidx.compose.material3.CalendarDate r4 = (androidx.compose.material3.CalendarDate) r4
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r0)
            r0 = r22
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            boolean r0 = r14.changed((java.lang.Object) r12)
            java.lang.Object r5 = r14.rememberedValue()
            if (r0 != 0) goto L_0x0324
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x032f
        L_0x0324:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$6$1 r0 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$6$1
            r0.<init>(r12)
            r5 = r0
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r14.updateRememberedValue(r5)
        L_0x032f:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.material3.InputIdentifier$Companion r0 = androidx.compose.material3.InputIdentifier.Companion
            int r6 = r0.m1404getEndDateInputJ2x2o4M()
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r24
            r7 = r17
            r8 = r20
            r9 = r16
            r10 = r14
            r11 = r21
            androidx.compose.material3.DateInputKt.m1278DateInputTextFieldzm97o8M(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r14.endReplaceableGroup()
            r14.endNode()
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0366
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0366:
            androidx.compose.runtime.ScopeUpdateScope r0 = r14.endRestartGroup()
            if (r0 != 0) goto L_0x036d
            goto L_0x037b
        L_0x036d:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2
            r2 = r25
            r3 = r26
            r1.<init>(r12, r2, r3, r15)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.updateScope(r1)
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangeInputKt.DateRangeInputContent(androidx.compose.material3.StateData, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
