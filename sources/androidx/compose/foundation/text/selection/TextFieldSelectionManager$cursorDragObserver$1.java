package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$cursorDragObserver$1", "Landroidx/compose/foundation/text/TextDragObserver;", "onCancel", "", "onDown", "point", "Landroidx/compose/ui/geometry/Offset;", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager$cursorDragObserver$1 implements TextDragObserver {
    final /* synthetic */ TextFieldSelectionManager this$0;

    public void onCancel() {
    }

    TextFieldSelectionManager$cursorDragObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.this$0 = textFieldSelectionManager;
    }

    /* renamed from: onDown-k-4lQ0M  reason: not valid java name */
    public void m1073onDownk4lQ0M(long j) {
        this.this$0.setDraggingHandle(Handle.Cursor);
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.m1067setCurrentDragPosition_kEHs6E(Offset.m2561boximpl(SelectionHandlesKt.m1011getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1072getHandlePositiontuRUvjQ$foundation_release(true))));
    }

    public void onUp() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m1067setCurrentDragPosition_kEHs6E((Offset) null);
    }

    /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
    public void m1075onStartk4lQ0M(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1011getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1072getHandlePositiontuRUvjQ$foundation_release(true));
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        textFieldSelectionManager2.m1067setCurrentDragPosition_kEHs6E(Offset.m2561boximpl(textFieldSelectionManager2.dragBeginPosition));
        this.this$0.dragTotalDistance = Offset.Companion.m2588getZeroF1C5BW0();
        this.this$0.setDraggingHandle(Handle.Cursor);
    }

    /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
    public void m1074onDragk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        textFieldSelectionManager.dragTotalDistance = Offset.m2577plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
        TextFieldState state$foundation_release = this.this$0.getState$foundation_release();
        if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            textFieldSelectionManager2.m1067setCurrentDragPosition_kEHs6E(Offset.m2561boximpl(Offset.m2577plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
            OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
            Offset r1 = textFieldSelectionManager2.m1070getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(r1);
            int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(value.m5103getOffsetForPositionk4lQ0M(r1.m2582unboximpl()));
            long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
            if (!TextRange.m5124equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m5352getSelectiond9O1mEE())) {
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.m3556performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3565getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m1065createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange));
            }
        }
    }

    public void onStop() {
        this.this$0.setDraggingHandle((Handle) null);
        this.this$0.m1067setCurrentDragPosition_kEHs6E((Offset) null);
    }
}
