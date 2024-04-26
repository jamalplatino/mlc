package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020B2\b\b\u0002\u0010j\u001a\u00020!H\u0000¢\u0006\u0002\bkJ%\u0010l\u001a\u00020?2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ\r\u0010u\u001a\u00020BH\u0000¢\u0006\u0002\bvJ\u001f\u0010w\u001a\u00020B2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\bxJ\r\u0010y\u001a\u00020BH\u0000¢\u0006\u0002\bzJ\r\u0010{\u001a\u00020BH\u0000¢\u0006\u0002\b|J\b\u0010}\u001a\u00020~H\u0002J$\u0010\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u0001H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\f2\u0007\u0010\u0001\u001a\u00020!H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020T2\u0007\u0010\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0001J\u0013\u0010\u0001\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u000f\u0010\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0001J6\u0010\u0001\u001a\u00020B2\u0006\u0010Y\u001a\u00020?2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020!2\b\u0010\u0001\u001a\u00030\u0001H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR8\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0019\u0010\u0017\u001a\u00020\fX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R\u0019\u0010\u0019\u001a\u00020\fX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8F@BX\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u000e¢\u0006\u0002\n\u0000R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020B0AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR+\u0010Y\u001a\u00020?2\u0006\u0010\u000b\u001a\u00020?8@@@X\u0002¢\u0006\u0012\n\u0004\b^\u0010\u0013\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020`X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateSelection", "transformedStartOffset", "transformedEndOffset", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    /* access modifiers changed from: private */
    public Integer dragBeginOffsetInText;
    /* access modifiers changed from: private */
    public long dragBeginPosition;
    /* access modifiers changed from: private */
    public long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this((UndoManager) null, 1, (DefaultConstructorMarker) null);
    }

    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager2) {
        this.clipboardManager = clipboardManager2;
    }

    public final void setFocusRequester(FocusRequester focusRequester2) {
        this.focusRequester = focusRequester2;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping2) {
        Intrinsics.checkNotNullParameter(offsetMapping2, "<set-?>");
        this.offsetMapping = offsetMapping2;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar2) {
        this.textToolbar = textToolbar2;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation2) {
        Intrinsics.checkNotNullParameter(visualTransformation2, "<set-?>");
        this.visualTransformation = visualTransformation2;
    }

    public TextFieldSelectionManager(UndoManager undoManager2) {
        this.undoManager = undoManager2;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.dragBeginPosition = Offset.Companion.m2588getZeroF1C5BW0();
        this.dragTotalDistance = Offset.Companion.m2588getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.oldValue = new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextFieldSelectionManager$touchSelectionObserver$1(this);
        this.mouseSelectionObserver = new TextFieldSelectionManager$mouseSelectionObserver$1(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager2);
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m1070getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    public final TextDragObserver handleDragObserver$foundation_release(boolean z) {
        return new TextFieldSelectionManager$handleDragObserver$1(this, z);
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextFieldSelectionManager$cursorDragObserver$1(this);
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester2;
        TextFieldState textFieldState = this.state;
        if (!(textFieldState == null || textFieldState.getHasFocus() || (focusRequester2 = this.focusRequester) == null)) {
            focusRequester2.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m1066deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1069deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m1069deselect_kEHs6E$foundation_release(Offset offset) {
        HandleState handleState;
        int i;
        if (!TextRange.m5125getCollapsedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
            if (offset == null || layoutResult == null) {
                i = TextRange.m5128getMaximpl(getValue$foundation_release().m5352getSelectiond9O1mEE());
            } else {
                i = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m963getOffsetForPosition3MmeM6k$default(layoutResult, offset.m2582unboximpl(), false, 2, (Object) null));
            }
            this.onValueChange.invoke(TextFieldValue.m5347copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(i), (TextRange) null, 5, (Object) null));
        }
        if (offset == null || getValue$foundation_release().getText().length() <= 0) {
            handleState = HandleState.None;
        } else {
            handleState = HandleState.Cursor;
        }
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean z) {
        if (!TextRange.m5125getCollapsedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE())) {
            ClipboardManager clipboardManager2 = this.clipboardManager;
            if (clipboardManager2 != null) {
                clipboardManager2.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
            }
            if (z) {
                int r4 = TextRange.m5128getMaximpl(getValue$foundation_release().m5352getSelectiond9O1mEE());
                this.onValueChange.invoke(m1065createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(r4, r4)));
                setHandleState(HandleState.None);
            }
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager2 = this.clipboardManager;
        if (clipboardManager2 != null && (text = clipboardManager2.getText()) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int r2 = TextRange.m5129getMinimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()) + text.length();
            this.onValueChange.invoke(m1065createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(r2, r2)));
            setHandleState(HandleState.None);
            UndoManager undoManager2 = this.undoManager;
            if (undoManager2 != null) {
                undoManager2.forceNextSnapshot();
            }
        }
    }

    public final void cut$foundation_release() {
        if (!TextRange.m5125getCollapsedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE())) {
            ClipboardManager clipboardManager2 = this.clipboardManager;
            if (clipboardManager2 != null) {
                clipboardManager2.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
            }
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int r1 = TextRange.m5129getMinimpl(getValue$foundation_release().m5352getSelectiond9O1mEE());
            this.onValueChange.invoke(m1065createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(r1, r1)));
            setHandleState(HandleState.None);
            UndoManager undoManager2 = this.undoManager;
            if (undoManager2 != null) {
                undoManager2.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue r0 = m1065createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(r0);
        this.oldValue = TextFieldValue.m5347copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, r0.m5352getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m1072getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        long r0 = getValue$foundation_release().m5352getSelectiond9O1mEE();
        int r02 = z ? TextRange.m5131getStartimpl(r0) : TextRange.m5126getEndimpl(r0);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(r02), z, TextRange.m5130getReversedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()));
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m1071getCursorPositiontuRUvjQ$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5131getStartimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.m5607toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / ((float) 2)), cursorRect.getBottom());
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager2;
        boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
        Function0 function0 = null;
        Function0 textFieldSelectionManager$showSelectionToolbar$copy$1 = (TextRange.m5125getCollapsedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()) || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        Function0 textFieldSelectionManager$showSelectionToolbar$cut$1 = (TextRange.m5125getCollapsedimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()) || !getEditable() || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        Function0 textFieldSelectionManager$showSelectionToolbar$paste$1 = (!getEditable() || (clipboardManager2 = this.clipboardManager) == null || !clipboardManager2.hasText()) ? null : new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
        if (TextRange.m5127getLengthimpl(getValue$foundation_release().m5352getSelectiond9O1mEE()) != getValue$foundation_release().getText().length()) {
            function0 = new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this);
        }
        Function0 function02 = function0;
        TextToolbar textToolbar2 = this.textToolbar;
        if (textToolbar2 != null) {
            textToolbar2.showMenu(getContentRect(), textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, function02);
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar2;
        TextToolbar textToolbar3 = this.textToolbar;
        if ((textToolbar3 != null ? textToolbar3.getStatus() : null) == TextToolbarStatus.Shown && (textToolbar2 = this.textToolbar) != null) {
            textToolbar2.hide();
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m1068contextMenuOpenAdjustmentk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            int r10 = TextLayoutResultProxy.m963getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, (Object) null);
            if (!TextRange.m5122containsimpl(getValue$foundation_release().m5352getSelectiond9O1mEE(), r10)) {
                updateSelection(getValue$foundation_release(), r10, r10, false, SelectionAdjustment.Companion.getWord());
            }
        }
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual((Object) this.oldValue.getText(), (Object) getValue$foundation_release().getText());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r1 = (r9 = r9.getValue()).getCursorRect(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.ui.geometry.Rect getContentRect() {
        /*
            r11 = this;
            androidx.compose.foundation.text.TextFieldState r0 = r11.state
            if (r0 == 0) goto L_0x0109
            boolean r1 = r0.isLayoutResultStale()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0109
            androidx.compose.ui.text.input.OffsetMapping r1 = r11.offsetMapping
            androidx.compose.ui.text.input.TextFieldValue r3 = r11.getValue$foundation_release()
            long r3 = r3.m5352getSelectiond9O1mEE()
            int r3 = androidx.compose.ui.text.TextRange.m5131getStartimpl(r3)
            int r1 = r1.originalToTransformed(r3)
            androidx.compose.ui.text.input.OffsetMapping r3 = r11.offsetMapping
            androidx.compose.ui.text.input.TextFieldValue r4 = r11.getValue$foundation_release()
            long r4 = r4.m5352getSelectiond9O1mEE()
            int r4 = androidx.compose.ui.text.TextRange.m5126getEndimpl(r4)
            int r3 = r3.originalToTransformed(r4)
            androidx.compose.foundation.text.TextFieldState r4 = r11.state
            if (r4 == 0) goto L_0x0047
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.getLayoutCoordinates()
            if (r4 == 0) goto L_0x0047
            long r5 = r11.m1072getHandlePositiontuRUvjQ$foundation_release(r2)
            long r4 = r4.m4498localToRootMKHz9U(r5)
            goto L_0x004d
        L_0x0047:
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r2.m2588getZeroF1C5BW0()
        L_0x004d:
            androidx.compose.foundation.text.TextFieldState r2 = r11.state
            if (r2 == 0) goto L_0x0061
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getLayoutCoordinates()
            if (r2 == 0) goto L_0x0061
            r6 = 0
            long r6 = r11.m1072getHandlePositiontuRUvjQ$foundation_release(r6)
            long r6 = r2.m4498localToRootMKHz9U(r6)
            goto L_0x0067
        L_0x0061:
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.Companion
            long r6 = r2.m2588getZeroF1C5BW0()
        L_0x0067:
            androidx.compose.foundation.text.TextFieldState r2 = r11.state
            r8 = 0
            if (r2 == 0) goto L_0x0097
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getLayoutCoordinates()
            if (r2 == 0) goto L_0x0097
            androidx.compose.foundation.text.TextLayoutResultProxy r9 = r0.getLayoutResult()
            if (r9 == 0) goto L_0x0089
            androidx.compose.ui.text.TextLayoutResult r9 = r9.getValue()
            if (r9 == 0) goto L_0x0089
            androidx.compose.ui.geometry.Rect r1 = r9.getCursorRect(r1)
            if (r1 == 0) goto L_0x0089
            float r1 = r1.getTop()
            goto L_0x008a
        L_0x0089:
            r1 = r8
        L_0x008a:
            long r9 = androidx.compose.ui.geometry.OffsetKt.Offset(r8, r1)
            long r1 = r2.m4498localToRootMKHz9U(r9)
            float r1 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r1)
            goto L_0x0098
        L_0x0097:
            r1 = r8
        L_0x0098:
            androidx.compose.foundation.text.TextFieldState r2 = r11.state
            if (r2 == 0) goto L_0x00c6
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getLayoutCoordinates()
            if (r2 == 0) goto L_0x00c6
            androidx.compose.foundation.text.TextLayoutResultProxy r9 = r0.getLayoutResult()
            if (r9 == 0) goto L_0x00b9
            androidx.compose.ui.text.TextLayoutResult r9 = r9.getValue()
            if (r9 == 0) goto L_0x00b9
            androidx.compose.ui.geometry.Rect r3 = r9.getCursorRect(r3)
            if (r3 == 0) goto L_0x00b9
            float r3 = r3.getTop()
            goto L_0x00ba
        L_0x00b9:
            r3 = r8
        L_0x00ba:
            long r8 = androidx.compose.ui.geometry.OffsetKt.Offset(r8, r3)
            long r2 = r2.m4498localToRootMKHz9U(r8)
            float r8 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r2)
        L_0x00c6:
            float r2 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r4)
            float r3 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r6)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r4)
            float r9 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r6)
            float r3 = java.lang.Math.max(r3, r9)
            float r1 = java.lang.Math.min(r1, r8)
            float r4 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r4)
            float r5 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r6)
            float r4 = java.lang.Math.max(r4, r5)
            r5 = 25
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r5)
            androidx.compose.foundation.text.TextDelegate r0 = r0.getTextDelegate()
            androidx.compose.ui.unit.Density r0 = r0.getDensity()
            float r0 = r0.getDensity()
            float r5 = r5 * r0
            float r4 = r4 + r5
            androidx.compose.ui.geometry.Rect r0 = new androidx.compose.ui.geometry.Rect
            r0.<init>(r2, r1, r3, r4)
            return r0
        L_0x0109:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r0 = r0.getZero()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.getContentRect():androidx.compose.ui.geometry.Rect");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r2 = r2.getLayoutResult();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateSelection(androidx.compose.ui.text.input.TextFieldValue r11, int r12, int r13, boolean r14, androidx.compose.foundation.text.selection.SelectionAdjustment r15) {
        /*
            r10 = this;
            androidx.compose.ui.text.input.OffsetMapping r0 = r10.offsetMapping
            long r1 = r11.m5352getSelectiond9O1mEE()
            int r1 = androidx.compose.ui.text.TextRange.m5131getStartimpl(r1)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.input.OffsetMapping r1 = r10.offsetMapping
            long r2 = r11.m5352getSelectiond9O1mEE()
            int r2 = androidx.compose.ui.text.TextRange.m5126getEndimpl(r2)
            int r1 = r1.originalToTransformed(r2)
            long r0 = androidx.compose.ui.text.TextRangeKt.TextRange(r0, r1)
            androidx.compose.foundation.text.TextFieldState r2 = r10.state
            r3 = 0
            if (r2 == 0) goto L_0x0031
            androidx.compose.foundation.text.TextLayoutResultProxy r2 = r2.getLayoutResult()
            if (r2 == 0) goto L_0x0031
            androidx.compose.ui.text.TextLayoutResult r2 = r2.getValue()
            r4 = r2
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            boolean r2 = androidx.compose.ui.text.TextRange.m5125getCollapsedimpl(r0)
            if (r2 == 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            androidx.compose.ui.text.TextRange r3 = androidx.compose.ui.text.TextRange.m5119boximpl(r0)
        L_0x003d:
            r7 = r3
            r5 = r12
            r6 = r13
            r8 = r14
            r9 = r15
            long r12 = androidx.compose.foundation.text.selection.TextFieldSelectionDelegateKt.m1062getTextFieldSelectionbb3KNj8(r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.text.input.OffsetMapping r14 = r10.offsetMapping
            int r15 = androidx.compose.ui.text.TextRange.m5131getStartimpl(r12)
            int r14 = r14.transformedToOriginal(r15)
            androidx.compose.ui.text.input.OffsetMapping r15 = r10.offsetMapping
            int r12 = androidx.compose.ui.text.TextRange.m5126getEndimpl(r12)
            int r12 = r15.transformedToOriginal(r12)
            long r12 = androidx.compose.ui.text.TextRangeKt.TextRange(r14, r12)
            long r14 = r11.m5352getSelectiond9O1mEE()
            boolean r14 = androidx.compose.ui.text.TextRange.m5124equalsimpl0(r12, r14)
            if (r14 == 0) goto L_0x0069
            return
        L_0x0069:
            androidx.compose.ui.hapticfeedback.HapticFeedback r14 = r10.hapticFeedBack
            if (r14 == 0) goto L_0x0076
            androidx.compose.ui.hapticfeedback.HapticFeedbackType$Companion r15 = androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion
            int r15 = r15.m3565getTextHandleMove5zf0vsI()
            r14.m3556performHapticFeedbackCdsT49E(r15)
        L_0x0076:
            androidx.compose.ui.text.AnnotatedString r11 = r11.getAnnotatedString()
            androidx.compose.ui.text.input.TextFieldValue r11 = r10.m1065createTextFieldValueFDrldGo(r11, r12)
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r12 = r10.onValueChange
            r12.invoke(r11)
            androidx.compose.foundation.text.TextFieldState r11 = r10.state
            if (r11 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r12 = 1
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(r10, r12)
            r11.setShowSelectionHandleStart(r12)
        L_0x0090:
            androidx.compose.foundation.text.TextFieldState r11 = r10.state
            if (r11 != 0) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            r12 = 0
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(r10, r12)
            r11.setShowSelectionHandleEnd(r12)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.updateSelection(androidx.compose.ui.text.input.TextFieldValue, int, int, boolean, androidx.compose.foundation.text.selection.SelectionAdjustment):void");
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo  reason: not valid java name */
    public final TextFieldValue m1065createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value$delegate.setValue(textFieldValue);
    }

    /* access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E  reason: not valid java name */
    public final void m1067setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }
}
