package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$StartView$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ NavController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$StartView$3(NavController navController, AppViewModel appViewModel, int i) {
        super(2);
        this.$navController = navController;
        this.$appViewModel = appViewModel;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StartViewKt.StartView(this.$navController, this.$appViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
