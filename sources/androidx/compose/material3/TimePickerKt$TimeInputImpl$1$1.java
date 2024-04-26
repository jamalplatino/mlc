package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$TimeInputImpl$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimeInputImpl$1$1(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, int i, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
        super(2);
        this.$hourValue$delegate = mutableState;
        this.$state = timePickerState;
        this.$$dirty = i;
        this.$colors = timePickerColors;
        this.$minuteValue$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            r12 = r42
            r1 = r43
            java.lang.String r2 = "C719@30761L411,731@31241L353,746@31903L38,717@30672L1318,749@32003L85,752@32197L376,765@32645L331,780@33287L38,750@32101L1273:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x001c
            boolean r2 = r42.getSkipping()
            if (r2 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r42.skipToGroupEnd()
            goto L_0x0231
        L_0x001c:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x002c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:715)"
            r4 = 1306700887(0x4de2ac57, float:4.7536816E8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x002c:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$hourValue$delegate
            androidx.compose.material3.TimePickerState r3 = r0.$state
            r13 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r13)
            java.lang.String r14 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r14)
            boolean r4 = r12.changed((java.lang.Object) r2)
            boolean r5 = r12.changed((java.lang.Object) r3)
            r4 = r4 | r5
            java.lang.Object r5 = r42.rememberedValue()
            if (r4 != 0) goto L_0x0056
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r5 != r4) goto L_0x0061
        L_0x0056:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1 r4 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1
            r4.<init>(r3, r2)
            r5 = r4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r12.updateRememberedValue(r5)
        L_0x0061:
            r42.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(r1, r5)
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$hourValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r2 = androidx.compose.material3.TimePickerKt.TimeInputImpl$lambda$5(r2)
            androidx.compose.material3.TimePickerState r3 = r0.$state
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r4 = r0.$hourValue$delegate
            r12.startReplaceableGroup(r13)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r14)
            boolean r5 = r12.changed((java.lang.Object) r3)
            boolean r6 = r12.changed((java.lang.Object) r4)
            r5 = r5 | r6
            java.lang.Object r6 = r42.rememberedValue()
            if (r5 != 0) goto L_0x0091
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x009c
        L_0x0091:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1 r5 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1
            r5.<init>(r3, r4)
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r12.updateRememberedValue(r6)
        L_0x009c:
            r42.endReplaceableGroup()
            r3 = r6
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.material3.TimePickerState r4 = r0.$state
            androidx.compose.material3.Selection$Companion r5 = androidx.compose.material3.Selection.Companion
            int r5 = r5.m1540getHourJiIwxys()
            androidx.compose.ui.text.input.ImeAction$Companion r6 = androidx.compose.ui.text.input.ImeAction.Companion
            int r19 = r6.m5294getNexteUduSuo()
            androidx.compose.ui.text.input.KeyboardType$Companion r6 = androidx.compose.ui.text.input.KeyboardType.Companion
            int r18 = r6.m5341getNumberPjHm6EE()
            androidx.compose.foundation.text.KeyboardOptions r6 = new androidx.compose.foundation.text.KeyboardOptions
            r16 = 0
            r17 = 0
            r20 = 3
            r21 = 0
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r23 = 0
            r24 = 0
            androidx.compose.material3.TimePickerState r7 = r0.$state
            r15 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r15)
            java.lang.String r11 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r11)
            boolean r8 = r12.changed((java.lang.Object) r7)
            java.lang.Object r9 = r42.rememberedValue()
            if (r8 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r9 != r8) goto L_0x00f2
        L_0x00e7:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1 r8 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1
            r8.<init>(r7)
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r12.updateRememberedValue(r9)
        L_0x00f2:
            r42.endReplaceableGroup()
            r25 = r9
            kotlin.jvm.functions.Function1 r25 = (kotlin.jvm.functions.Function1) r25
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 59
            r30 = 0
            androidx.compose.foundation.text.KeyboardActions r7 = new androidx.compose.foundation.text.KeyboardActions
            r22 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.material3.TimePickerColors r8 = r0.$colors
            int r9 = r0.$$dirty
            int r10 = r9 << 3
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            int r9 = r9 << 18
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r16
            r10 = r10 | r9
            r17 = 0
            r9 = r42
            r31 = r11
            r11 = r17
            androidx.compose.material3.TimePickerKt.m1743TimePickerTextFieldlxUZ_iY(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            float r2 = androidx.compose.material3.TimePickerKt.DisplaySeparatorWidth
            androidx.compose.material3.tokens.TimeInputTokens r3 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r3 = r3.m2335getPeriodSelectorContainerHeightD9Ej5fM()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r1, r2, r3)
            r2 = 6
            androidx.compose.material3.TimePickerKt.DisplaySeparator(r1, r12, r2)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$minuteValue$delegate
            androidx.compose.material3.TimePickerState r3 = r0.$state
            r12.startReplaceableGroup(r13)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r14)
            boolean r4 = r12.changed((java.lang.Object) r2)
            boolean r5 = r12.changed((java.lang.Object) r3)
            r4 = r4 | r5
            java.lang.Object r5 = r42.rememberedValue()
            if (r4 != 0) goto L_0x0161
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r5 != r4) goto L_0x016c
        L_0x0161:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1 r4 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1
            r4.<init>(r3, r2)
            r5 = r4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r12.updateRememberedValue(r5)
        L_0x016c:
            r42.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(r1, r5)
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$minuteValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r2 = androidx.compose.material3.TimePickerKt.TimeInputImpl$lambda$8(r2)
            androidx.compose.material3.TimePickerState r3 = r0.$state
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r4 = r0.$minuteValue$delegate
            r12.startReplaceableGroup(r13)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r14)
            boolean r5 = r12.changed((java.lang.Object) r3)
            boolean r6 = r12.changed((java.lang.Object) r4)
            r5 = r5 | r6
            java.lang.Object r6 = r42.rememberedValue()
            if (r5 != 0) goto L_0x019c
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x01a7
        L_0x019c:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1 r5 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1
            r5.<init>(r3, r4)
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r12.updateRememberedValue(r6)
        L_0x01a7:
            r42.endReplaceableGroup()
            r3 = r6
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.material3.TimePickerState r4 = r0.$state
            androidx.compose.material3.Selection$Companion r5 = androidx.compose.material3.Selection.Companion
            int r5 = r5.m1541getMinuteJiIwxys()
            androidx.compose.ui.text.input.ImeAction$Companion r6 = androidx.compose.ui.text.input.ImeAction.Companion
            int r21 = r6.m5292getDoneeUduSuo()
            androidx.compose.ui.text.input.KeyboardType$Companion r6 = androidx.compose.ui.text.input.KeyboardType.Companion
            int r20 = r6.m5341getNumberPjHm6EE()
            androidx.compose.foundation.text.KeyboardOptions r6 = new androidx.compose.foundation.text.KeyboardOptions
            r18 = 0
            r19 = 0
            r22 = 3
            r23 = 0
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r33 = 0
            r34 = 0
            androidx.compose.material3.TimePickerState r7 = r0.$state
            r12.startReplaceableGroup(r15)
            r8 = r31
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r8)
            boolean r8 = r12.changed((java.lang.Object) r7)
            java.lang.Object r9 = r42.rememberedValue()
            if (r8 != 0) goto L_0x01f0
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r9 != r8) goto L_0x01fb
        L_0x01f0:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1 r8 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1
            r8.<init>(r7)
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r12.updateRememberedValue(r9)
        L_0x01fb:
            r42.endReplaceableGroup()
            r35 = r9
            kotlin.jvm.functions.Function1 r35 = (kotlin.jvm.functions.Function1) r35
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 59
            r40 = 0
            androidx.compose.foundation.text.KeyboardActions r7 = new androidx.compose.foundation.text.KeyboardActions
            r32 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material3.TimePickerColors r8 = r0.$colors
            int r9 = r0.$$dirty
            int r10 = r9 << 3
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            int r9 = r9 << 18
            r9 = r9 & r16
            r10 = r10 | r9
            r11 = 0
            r9 = r42
            androidx.compose.material3.TimePickerKt.m1743TimePickerTextFieldlxUZ_iY(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0231
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
