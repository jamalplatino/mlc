package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/ImmHelper21;", "Landroidx/compose/ui/text/input/ImmHelper;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "hideSoftInput", "", "imm", "Landroid/view/inputmethod/InputMethodManager;", "showSoftInput", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InputMethodManager.kt */
final class ImmHelper21 implements ImmHelper {
    private final View view;

    public ImmHelper21(View view2) {
        Intrinsics.checkNotNullParameter(view2, "view");
        this.view = view2;
    }

    public void showSoftInput(InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        this.view.post(new ImmHelper21$$ExternalSyntheticLambda0(inputMethodManager, this));
    }

    /* access modifiers changed from: private */
    public static final void showSoftInput$lambda$0(InputMethodManager inputMethodManager, ImmHelper21 immHelper21) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "$imm");
        Intrinsics.checkNotNullParameter(immHelper21, "this$0");
        inputMethodManager.showSoftInput(immHelper21.view, 0);
    }

    public void hideSoftInput(InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.view.getWindowToken(), 0);
    }
}
