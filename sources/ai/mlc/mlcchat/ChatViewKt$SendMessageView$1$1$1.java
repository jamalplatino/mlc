package ai.mlc.mlcchat;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$SendMessageView$1$1$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<String> $text$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$SendMessageView$1$1$1(MutableState<String> mutableState) {
        super(1);
        this.$text$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        ChatViewKt.SendMessageView$lambda$3$lambda$1(this.$text$delegate, str);
    }
}
