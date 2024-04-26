package ai.mlc.mlcchat;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$ModelView$1$1$5$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $isDeletingModel$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$ModelView$1$1$5$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isDeletingModel$delegate = mutableState;
    }

    public final void invoke() {
        StartViewKt.ModelView$lambda$2(this.$isDeletingModel$delegate, true);
    }
}
