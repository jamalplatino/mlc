package ai.mlc.mlcchat;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$SendMessageView$1$text$2 extends Lambda implements Function0<MutableState<String>> {
    public static final ChatViewKt$SendMessageView$1$text$2 INSTANCE = new ChatViewKt$SendMessageView$1$text$2();

    ChatViewKt$SendMessageView$1$text$2() {
        super(0);
    }

    public final MutableState<String> invoke() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}