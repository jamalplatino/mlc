package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$AlertDialog$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $error;
    final /* synthetic */ Function0<Unit> $onConfirmation;
    final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$AlertDialog$5(Function0<Unit> function0, Function0<Unit> function02, String str, int i) {
        super(2);
        this.$onDismissRequest = function0;
        this.$onConfirmation = function02;
        this.$error = str;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StartViewKt.AlertDialog(this.$onDismissRequest, this.$onConfirmation, this.$error, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
