package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$ModelView$1$1$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppViewModel.ModelState $modelState;
    final /* synthetic */ NavController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$ModelView$1$1$3(AppViewModel.ModelState modelState, NavController navController) {
        super(0);
        this.$modelState = modelState;
        this.$navController = navController;
    }

    public final void invoke() {
        this.$modelState.startChat();
        NavController.navigate$default(this.$navController, "chat", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }
}
