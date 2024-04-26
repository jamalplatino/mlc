package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ \u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\u0011*\u00020\u000fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "generateBatchErrorMessage", "", "failedCommand", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "toStringForLog", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: EditProcessor.kt */
public final class EditProcessor {
    public static final int $stable = 8;
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m5352getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m5136getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual((Object) textFieldValue.m5351getCompositionMzsxiRA(), (Object) this.mBuffer.m5273getCompositionMzsxiRA$ui_text_release());
        boolean z3 = false;
        if (!Intrinsics.areEqual((Object) this.mBufferState.getAnnotatedString(), (Object) textFieldValue.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m5352getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (!TextRange.m5124equalsimpl0(this.mBufferState.m5352getSelectiond9O1mEE(), textFieldValue.m5352getSelectiond9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.m5129getMinimpl(textFieldValue.m5352getSelectiond9O1mEE()), TextRange.m5128getMaximpl(textFieldValue.m5352getSelectiond9O1mEE()));
            z3 = true;
            z = false;
        } else {
            z = false;
        }
        if (textFieldValue.m5351getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m5125getCollapsedimpl(textFieldValue.m5351getCompositionMzsxiRA().m5135unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m5129getMinimpl(textFieldValue.m5351getCompositionMzsxiRA().m5135unboximpl()), TextRange.m5128getMaximpl(textFieldValue.m5351getCompositionMzsxiRA().m5135unboximpl()));
        }
        if (z || (!z3 && z2)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m5347copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m5273getCompositionMzsxiRA$ui_text_release() + ", selection=" + TextRange.m5134toStringimpl(this.mBuffer.m5274getSelectiond9O1mEE$ui_text_release()) + "):");
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append.append(10), "append('\\n')");
        CollectionsKt.joinTo$default(list, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this), 60, (Object) null);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            return "CommitTextCommand(text.length=" + commitTextCommand.getText().length() + ", newCursorPosition=" + commitTextCommand.getNewCursorPosition() + ')';
        } else if (editCommand instanceof SetComposingTextCommand) {
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            return "SetComposingTextCommand(text.length=" + setComposingTextCommand.getText().length() + ", newCursorPosition=" + setComposingTextCommand.getNewCursorPosition() + ')';
        } else if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        } else {
            if (editCommand instanceof DeleteSurroundingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof SetSelectionCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof FinishComposingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof BackspaceCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof MoveCursorCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteAllCommand) {
                return editCommand.toString();
            }
            StringBuilder sb = new StringBuilder("Unknown EditCommand: ");
            String simpleName = Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            return sb.append(simpleName).toString();
        }
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        Exception e;
        Intrinsics.checkNotNullParameter(list, "editCommands");
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                editCommand = (EditCommand) list.get(i);
                try {
                    editCommand.applyTo(this.mBuffer);
                    i++;
                    EditCommand editCommand2 = editCommand;
                } catch (Exception e2) {
                    e = e2;
                    EditCommand editCommand3 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m5274getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m5273getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            editCommand = null;
            e = e3;
            EditCommand editCommand32 = editCommand;
            throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
        }
    }
}
