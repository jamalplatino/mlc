package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$touchSelectionObserver$1", "Landroidx/compose/foundation/text/TextDragObserver;", "onCancel", "", "onDown", "point", "Landroidx/compose/ui/geometry/Offset;", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$touchSelectionObserver$1 implements TextDragObserver {
    final /* synthetic */ TextFieldSelectionManager this$0;

    public void onCancel() {
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m1083onDownk4lQ0M(long j) {
    }

    public void onUp() {
    }

    TextFieldSelectionManager$touchSelectionObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.this$0 = textFieldSelectionManager;
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m1085onStartk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState state$foundation_release;
        TextLayoutResultProxy layoutResult2;
        TextLayoutResultProxy layoutResult3;
        if (this.this$0.getDraggingHandle() == null) {
            this.this$0.setDraggingHandle(Handle.SelectionEnd);
            this.this$0.hideSelectionToolbar$foundation_release();
            TextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
            if ((state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m966isPositionOnTextk4lQ0M(j)) && (state$foundation_release = this.this$0.getState$foundation_release()) != null && (layoutResult2 = state$foundation_release.getLayoutResult()) != null) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult2, layoutResult2.getLineForVerticalPosition(Offset.m2573getYimpl(j)), false, 2, (Object) null));
                HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.m3556performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3565getTextHandleMove5zf0vsI());
                }
                TextFieldValue r9 = textFieldSelectionManager.m1065createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                textFieldSelectionManager.enterSelectionMode$foundation_release();
                textFieldSelectionManager.getOnValueChange$foundation_release().invoke(r9);
            } else if (this.this$0.getValue$foundation_release().getText().length() != 0) {
                this.this$0.enterSelectionMode$foundation_release();
                TextFieldState state$foundation_release3 = this.this$0.getState$foundation_release();
                if (!(state$foundation_release3 == null || (layoutResult = state$foundation_release3.getLayoutResult()) == null)) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    int r1 = TextLayoutResultProxy.m963getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, (Object) null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), r1, r1, false, SelectionAdjustment.Companion.getWord());
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(r1);
                }
                this.this$0.dragBeginPosition = j;
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                textFieldSelectionManager3.m1067setCurrentDragPosition_kEHs6E(Offset.m2561boximpl(textFieldSelectionManager3.dragBeginPosition));
                this.this$0.dragTotalDistance = Offset.Companion.m2588getZeroF1C5BW0();
            }
        }
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m1084onDragk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        if (this.this$0.getValue$foundation_release().getText().length() != 0) {
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            textFieldSelectionManager.dragTotalDistance = Offset.m2577plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
            TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
            if (!(state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null)) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1067setCurrentDragPosition_kEHs6E(Offset.m2561boximpl(Offset.m2577plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                Integer access$getDragBeginOffsetInText$p = textFieldSelectionManager2.dragBeginOffsetInText;
                int intValue = access$getDragBeginOffsetInText$p != null ? access$getDragBeginOffsetInText$p.intValue() : layoutResult.m965getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                Offset r1 = textFieldSelectionManager2.m1070getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(r1);
                textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), intValue, layoutResult.m965getOffsetForPosition3MmeM6k(r1.m2582unboximpl(), false), false, SelectionAdjustment.Companion.getWord());
            }
            TextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
            if (state$foundation_release2 != null) {
                state$foundation_release2.setShowFloatingToolbar(false);
            }
        }
    }

    public void onStop() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m1067setCurrentDragPosition_kEHs6E((Offset) null);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null) {
            state$foundation_release.setShowFloatingToolbar(true);
        }
        TextToolbar textToolbar = this.this$0.getTextToolbar();
        if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
            this.this$0.showSelectionToolbar$foundation_release();
        }
        this.this$0.dragBeginOffsetInText = null;
    }
}
