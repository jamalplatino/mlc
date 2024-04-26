package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$SendMessageView$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppViewModel.ChatState $chatState;
    final /* synthetic */ FocusManager $localFocusManager;
    final /* synthetic */ MutableState<String> $text$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$SendMessageView$1$2(FocusManager focusManager, AppViewModel.ChatState chatState, MutableState<String> mutableState) {
        super(0);
        this.$localFocusManager = focusManager;
        this.$chatState = chatState;
        this.$text$delegate = mutableState;
    }

    public final void invoke() {
        FocusManager.clearFocus$default(this.$localFocusManager, false, 1, (Object) null);
        this.$chatState.requestGenerate(ChatViewKt.SendMessageView$lambda$3$lambda$0(this.$text$delegate));
        ChatViewKt.SendMessageView$lambda$3$lambda$1(this.$text$delegate, "");
    }
}
