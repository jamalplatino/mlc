package ai.mlc.mlcchat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$AlertDialog$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$AlertDialog$1$1(Function0<Unit> function0) {
        super(0);
        this.$onDismissRequest = function0;
    }

    public final void invoke() {
        this.$onDismissRequest.invoke();
    }
}
