package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int r0 = imeOptions.m5302getImeActioneUduSuo();
        int i = 6;
        if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5291getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5295getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5293getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5294getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5296getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5297getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5298getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m5279equalsimpl0(r0, ImeAction.Companion.m5292getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int r02 = imeOptions.m5303getKeyboardTypePjHm6EE();
        if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5345getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5338getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5341getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5344getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5346getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5340getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5343getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5342getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m5325equalsimpl0(r02, KeyboardType.Companion.m5339getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m5279equalsimpl0(imeOptions.m5302getImeActioneUduSuo(), ImeAction.Companion.m5291getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int r03 = imeOptions.m5301getCapitalizationIUNYP9k();
            if (KeyboardCapitalization.m5310equalsimpl0(r03, KeyboardCapitalization.Companion.m5318getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m5310equalsimpl0(r03, KeyboardCapitalization.Companion.m5321getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m5310equalsimpl0(r03, KeyboardCapitalization.Companion.m5320getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m5131getStartimpl(textFieldValue.m5352getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m5126getEndimpl(textFieldValue.m5352getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor asExecutor(Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1(choreographer);
    }

    /* access modifiers changed from: private */
    public static final void asExecutor$lambda$1(Choreographer choreographer, Runnable runnable) {
        Intrinsics.checkNotNullParameter(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0(runnable));
    }

    /* access modifiers changed from: private */
    public static final void asExecutor$lambda$1$lambda$0(Runnable runnable, long j) {
        runnable.run();
    }
}
