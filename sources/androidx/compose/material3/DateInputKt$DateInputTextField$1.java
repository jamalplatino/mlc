package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DateInput.kt */
final class DateInputKt$DateInputTextField$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ MutableState<String> $errorText;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Function1<CalendarDate, Unit> $onDateChanged;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DateInputKt$DateInputTextField$1(DateInputFormat dateInputFormat, MutableState<String> mutableState, Function1<? super CalendarDate, Unit> function1, StateData stateData, DateInputValidator dateInputValidator, int i, Locale locale, MutableState<TextFieldValue> mutableState2) {
        super(1);
        this.$dateInputFormat = dateInputFormat;
        this.$errorText = mutableState;
        this.$onDateChanged = function1;
        this.$stateData = stateData;
        this.$dateInputValidator = dateInputValidator;
        this.$inputIdentifier = i;
        this.$locale = locale;
        this.$text$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "input");
        if (textFieldValue.getText().length() <= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
            CharSequence text = textFieldValue.getText();
            int i = 0;
            while (i < text.length()) {
                if (Character.isDigit(text.charAt(i))) {
                    i++;
                } else {
                    return;
                }
            }
            DateInputKt.DateInputTextField_zm97o8M$lambda$4(this.$text$delegate, textFieldValue);
            String obj = StringsKt.trim((CharSequence) textFieldValue.getText()).toString();
            CalendarDate calendarDate = null;
            if (obj.length() != 0 && obj.length() >= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
                CalendarDate parse = this.$stateData.getCalendarModel().parse(obj, this.$dateInputFormat.getPatternWithoutDelimiters());
                this.$errorText.setValue(this.$dateInputValidator.m1279validateXivgLIo(parse, this.$inputIdentifier, this.$locale));
                Function1<CalendarDate, Unit> function1 = this.$onDateChanged;
                if (this.$errorText.getValue().length() == 0) {
                    calendarDate = parse;
                }
                function1.invoke(calendarDate);
                return;
            }
            this.$errorText.setValue("");
            this.$onDateChanged.invoke(null);
        }
    }
}
