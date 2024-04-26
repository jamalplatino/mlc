package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J#\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0017H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "()V", "getAutofillId", "Landroid/view/autofill/AutofillId;", "structure", "Landroid/view/ViewStructure;", "isDate", "", "value", "Landroid/view/autofill/AutofillValue;", "isList", "isText", "isToggle", "setAutofillHints", "", "hints", "", "", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "setAutofillId", "parent", "virtualId", "", "setAutofillType", "type", "textValue", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidAutofill.android.kt */
public final class AutofillApi26Helper {
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, "structure");
        Intrinsics.checkNotNullParameter(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    public final AutofillId getAutofillId(ViewStructure viewStructure) {
        Intrinsics.checkNotNullParameter(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final void setAutofillType(ViewStructure viewStructure, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    public final void setAutofillHints(ViewStructure viewStructure, String[] strArr) {
        Intrinsics.checkNotNullParameter(viewStructure, "structure");
        Intrinsics.checkNotNullParameter(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final boolean isText(AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean isDate(AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean isList(AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean isToggle(AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final CharSequence textValue(AutofillValue autofillValue) {
        Intrinsics.checkNotNullParameter(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        Intrinsics.checkNotNullExpressionValue(textValue, "value.textValue");
        return textValue;
    }
}
