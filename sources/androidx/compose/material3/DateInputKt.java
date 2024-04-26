package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0001¢\u0006\u0002\u0010\u0011\u001a\u0001\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "DateInputContent", "", "stateData", "Landroidx/compose/material3/StateData;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "modifier", "Landroidx/compose/ui/Modifier;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "initialDate", "Landroidx/compose/material3/CalendarDate;", "onDateChanged", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "dateInputValidator", "Landroidx/compose/material3/DateInputValidator;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "locale", "Ljava/util/Locale;", "DateInputTextField-zm97o8M", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/StateData;Landroidx/compose/material3/CalendarDate;Lkotlin/jvm/functions/Function1;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateInput.kt */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m5626constructorimpl((float) 16);

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.material3.DateInputFormat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DateInputContent(androidx.compose.material3.StateData r21, androidx.compose.material3.DatePickerFormatter r22, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r25
            java.lang.String r0 = "stateData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "dateValidator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 814303288(0x30894838, float:9.988588E-10)
            r1 = r24
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DateInputContent)P(2)54@2202L15,55@2244L97,58@2369L45,59@2449L44,60@2527L45,61@2602L503,74@3194L42,87@3730L52,75@3241L730:DateInput.kt#uh7d8r"
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
            goto L_0x01c0
        L_0x006c:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0079
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DateInputContent (DateInput.kt:48)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r1, r2)
        L_0x0079:
            r0 = 0
            java.util.Locale r10 = androidx.compose.material3.CalendarModel_androidKt.defaultLocale(r11, r0)
            r8 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r8)
            java.lang.String r7 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r7)
            boolean r0 = r11.changed((java.lang.Object) r10)
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00a6
        L_0x009b:
            androidx.compose.material3.CalendarModel r0 = r21.getCalendarModel()
            androidx.compose.material3.DateInputFormat r1 = r0.getDateInputFormat(r10)
            r11.updateRememberedValue(r1)
        L_0x00a6:
            r11.endReplaceableGroup()
            r6 = r1
            androidx.compose.material3.DateInputFormat r6 = (androidx.compose.material3.DateInputFormat) r6
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1578getDateInputInvalidForPatternadMyvUU()
            r5 = 6
            java.lang.String r16 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r5)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1580getDateInputInvalidYearRangeadMyvUU()
            java.lang.String r17 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r5)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1579getDateInputInvalidNotAllowedadMyvUU()
            java.lang.String r18 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r5)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            boolean r0 = r11.changed((java.lang.Object) r6)
            boolean r1 = r11.changed((java.lang.Object) r13)
            r0 = r0 | r1
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x00f4
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            r14 = r5
            r16 = r6
            r20 = r7
            goto L_0x0115
        L_0x00f4:
            androidx.compose.material3.DateInputValidator r4 = new androidx.compose.material3.DateInputValidator
            java.lang.String r19 = ""
            r0 = r4
            r1 = r21
            r2 = r6
            r3 = r22
            r13 = r4
            r4 = r23
            r14 = r5
            r5 = r16
            r16 = r6
            r6 = r17
            r20 = r7
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.updateRememberedValue(r13)
            r1 = r13
        L_0x0115:
            r11.endReplaceableGroup()
            r7 = r1
            androidx.compose.material3.DateInputValidator r7 = (androidx.compose.material3.DateInputValidator) r7
            java.lang.String r0 = r16.getPatternWithDelimiters()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.compose.material3.Strings$Companion r1 = androidx.compose.material3.Strings.Companion
            int r1 = r1.m1581getDateInputLabeladMyvUU()
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r1, r11, r14)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r2, r3, r5, r4)
            androidx.compose.foundation.layout.PaddingValues r3 = InputTextFieldPadding
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.padding(r2, r3)
            androidx.compose.material3.DateInputKt$DateInputContent$1 r3 = new androidx.compose.material3.DateInputKt$DateInputContent$1
            r3.<init>(r1, r0)
            r1 = -438341159(0xffffffffe5df71d9, float:-1.3189848E23)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r1, r5, r3)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.material3.DateInputKt$DateInputContent$2 r3 = new androidx.compose.material3.DateInputKt$DateInputContent$2
            r3.<init>(r0)
            r0 = 1914447672(0x721c2738, float:3.0929327E30)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r0, r5, r3)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.runtime.MutableState r0 = r21.getSelectedStartDate()
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            androidx.compose.material3.CalendarDate r4 = (androidx.compose.material3.CalendarDate) r4
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r0)
            r0 = r20
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            boolean r0 = r11.changed((java.lang.Object) r12)
            java.lang.Object r5 = r11.rememberedValue()
            if (r0 != 0) goto L_0x018b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x0196
        L_0x018b:
            androidx.compose.material3.DateInputKt$DateInputContent$3$1 r0 = new androidx.compose.material3.DateInputKt$DateInputContent$3$1
            r0.<init>(r12)
            r5 = r0
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r11.updateRememberedValue(r5)
        L_0x0196:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.material3.InputIdentifier$Companion r0 = androidx.compose.material3.InputIdentifier.Companion
            int r6 = r0.m1405getSingleDateInputJ2x2o4M()
            int r0 = r9 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = 1075315126(0x401801b6, float:2.3751044)
            r13 = r0 | r8
            r0 = r2
            r2 = r3
            r3 = r21
            r8 = r16
            r9 = r10
            r10 = r11
            r14 = r11
            r11 = r13
            m1278DateInputTextFieldzm97o8M(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01c0:
            androidx.compose.runtime.ScopeUpdateScope r0 = r14.endRestartGroup()
            if (r0 != 0) goto L_0x01c7
            goto L_0x01d5
        L_0x01c7:
            androidx.compose.material3.DateInputKt$DateInputContent$4 r1 = new androidx.compose.material3.DateInputKt$DateInputContent$4
            r2 = r22
            r3 = r23
            r1.<init>(r12, r2, r3, r15)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.updateScope(r1)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt.DateInputContent(androidx.compose.material3.StateData, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: DateInputTextField-zm97o8M  reason: not valid java name */
    public static final void m1278DateInputTextFieldzm97o8M(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, StateData stateData, CalendarDate calendarDate, Function1<? super CalendarDate, Unit> function1, int i, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, Composer composer, int i2) {
        float f;
        StateData stateData2 = stateData;
        DateInputFormat dateInputFormat2 = dateInputFormat;
        Locale locale2 = locale;
        int i3 = i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(stateData2, "stateData");
        Intrinsics.checkNotNullParameter(function1, "onDateChanged");
        Intrinsics.checkNotNullParameter(dateInputValidator, "dateInputValidator");
        Intrinsics.checkNotNullParameter(dateInputFormat2, "dateInputFormat");
        Intrinsics.checkNotNullParameter(locale2, "locale");
        Composer startRestartGroup = composer.startRestartGroup(626552973);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateInputTextField)P(6,4,8,9,2,7,3:c#material3.InputIdentifier,1)109@4431L39,110@4487L528,166@6737L88,127@5021L2277:DateInput.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626552973, i3, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        Composer composer2 = startRestartGroup;
        MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], (Saver) null, (String) null, DateInputKt$DateInputTextField$errorText$1.INSTANCE, composer2, 3080, 6);
        MutableState<T> rememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], TextFieldValue.Companion.getSaver(), (String) null, new DateInputKt$DateInputTextField$text$2(stateData2, calendarDate, dateInputFormat2, locale2), composer2, 72, 4);
        TextFieldValue DateInputTextField_zm97o8M$lambda$3 = DateInputTextField_zm97o8M$lambda$3(rememberSaveable);
        Composer composer3 = startRestartGroup;
        Function1 dateInputKt$DateInputTextField$1 = new DateInputKt$DateInputTextField$1(dateInputFormat, mutableState, function1, stateData, dateInputValidator, i, locale, rememberSaveable);
        if (!StringsKt.isBlank((CharSequence) mutableState.getValue())) {
            f = Dp.m5626constructorimpl((float) 0);
        } else {
            f = InputTextNonErroneousBottomPadding;
        }
        Modifier r1 = PaddingKt.m497paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f, 7, (Object) null);
        Composer composer4 = composer3;
        composer4.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer4, "CC(remember)P(1):Composables.kt#9igjgp");
        MutableState mutableState2 = mutableState;
        boolean changed = composer4.changed((Object) mutableState2);
        Object rememberedValue = composer4.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateInputKt$DateInputTextField$2$1(mutableState2);
            composer4.updateRememberedValue(rememberedValue);
        }
        composer4.endReplaceableGroup();
        KeyboardOptions keyboardOptions = r32;
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, KeyboardType.Companion.m5341getNumberPjHm6EE(), ImeAction.Companion.m5292getDoneeUduSuo(), 1, (DefaultConstructorMarker) null);
        int i4 = i3 << 15;
        OutlinedTextFieldKt.OutlinedTextField(DateInputTextField_zm97o8M$lambda$3, (Function1<? super TextFieldValue, Unit>) dateInputKt$DateInputTextField$1, SemanticsModifierKt.semantics$default(r1, false, (Function1) rememberedValue, 1, (Object) null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer4, 785795078, true, new DateInputKt$DateInputTextField$3(mutableState2)), !StringsKt.isBlank((CharSequence) mutableState2.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat2), keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer4, (3670016 & i4) | (i4 & 29360128), 12779904, 0, 8195896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateInputKt$DateInputTextField$4(modifier, function2, function22, stateData, calendarDate, function1, i, dateInputValidator, dateInputFormat, locale, i2));
        }
    }

    private static final TextFieldValue DateInputTextField_zm97o8M$lambda$3(MutableState<TextFieldValue> mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void DateInputTextField_zm97o8M$lambda$4(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    static {
        float f = (float) 24;
        InputTextFieldPadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl(f), Dp.m5626constructorimpl((float) 10), Dp.m5626constructorimpl(f), 0.0f, 8, (Object) null);
    }
}
