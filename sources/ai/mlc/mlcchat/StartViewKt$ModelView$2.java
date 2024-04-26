package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$ModelView$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ AppViewModel.ModelState $modelState;
    final /* synthetic */ NavController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$ModelView$2(NavController navController, AppViewModel.ModelState modelState, AppViewModel appViewModel, int i) {
        super(2);
        this.$navController = navController;
        this.$modelState = modelState;
        this.$appViewModel = appViewModel;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StartViewKt.ModelView(this.$navController, this.$modelState, this.$appViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
