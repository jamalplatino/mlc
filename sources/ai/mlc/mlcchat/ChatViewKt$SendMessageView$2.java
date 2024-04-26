package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$SendMessageView$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppViewModel.ChatState $chatState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$SendMessageView$2(AppViewModel.ChatState chatState, int i) {
        super(2);
        this.$chatState = chatState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatViewKt.SendMessageView(this.$chatState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
