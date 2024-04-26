package ai.mlc.mlcchat;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$ModelView$isDeletingModel$2 extends Lambda implements Function0<MutableState<Boolean>> {
    public static final StartViewKt$ModelView$isDeletingModel$2 INSTANCE = new StartViewKt$ModelView$isDeletingModel$2();

    StartViewKt$ModelView$isDeletingModel$2() {
        super(0);
    }

    public final MutableState<Boolean> invoke() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
