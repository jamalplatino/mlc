package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$TimeInputImpl$1$1$1$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimeInputImpl$1$1$1$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m1753invokeZmokQxo(((KeyEvent) obj).m4170unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m1753invokeZmokQxo(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, NotificationCompat.CATEGORY_EVENT);
        int r3 = KeyEvent_androidKt.m4183getUtf16CodePointZmokQxo(keyEvent);
        if (48 <= r3 && r3 < 58 && TextRange.m5131getStartimpl(TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate).m5352getSelectiond9O1mEE()) == 2 && TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate).getText().length() == 2) {
            this.$state.m1773setSelectioniHAOin8$material3_release(Selection.Companion.m1541getMinuteJiIwxys());
        }
        return false;
    }
}
