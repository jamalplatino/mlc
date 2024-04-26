package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$MessageView$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MessageData $messageData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$MessageView$2(MessageData messageData, int i) {
        super(2);
        this.$messageData = messageData;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatViewKt.MessageView(this.$messageData, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
