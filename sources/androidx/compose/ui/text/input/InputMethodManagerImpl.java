package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "helper", "Landroidx/compose/ui/text/input/ImmHelper;", "imm", "Landroid/view/inputmethod/InputMethodManager;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm$delegate", "Lkotlin/Lazy;", "hideSoftInput", "", "restartInput", "showSoftInput", "updateExtractedText", "token", "", "extractedText", "Landroid/view/inputmethod/ExtractedText;", "updateSelection", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InputMethodManager.kt */
public final class InputMethodManagerImpl implements InputMethodManager {
    private final ImmHelper helper;
    private final Lazy imm$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(this));
    /* access modifiers changed from: private */
    public final View view;

    public InputMethodManagerImpl(View view2) {
        ImmHelper immHelper;
        Intrinsics.checkNotNullParameter(view2, "view");
        this.view = view2;
        if (Build.VERSION.SDK_INT < 30) {
            immHelper = new ImmHelper21(view2);
        } else {
            immHelper = new ImmHelper30(view2);
        }
        this.helper = immHelper;
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.imm$delegate.getValue();
    }

    public void restartInput() {
        getImm().restartInput(this.view);
    }

    public void showSoftInput() {
        this.helper.showSoftInput(getImm());
    }

    public void hideSoftInput() {
        this.helper.hideSoftInput(getImm());
    }

    public void updateExtractedText(int i, ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        getImm().updateExtractedText(this.view, i, extractedText);
    }

    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.view, i, i2, i3, i4);
    }
}
