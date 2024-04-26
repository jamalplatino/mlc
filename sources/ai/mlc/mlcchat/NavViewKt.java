package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"NavView", "", "appViewModel", "Lai/mlc/mlcchat/AppViewModel;", "(Lai/mlc/mlcchat/AppViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavView.kt */
public final class NavViewKt {
    public static final void NavView(AppViewModel appViewModel, Composer composer, int i, int i2) {
        CreationExtras creationExtras;
        Composer startRestartGroup = composer.startRestartGroup(-897932879);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavView)");
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if (i3 == 1 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if (i3 != 0) {
                startRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                if (current != null) {
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        creationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel(AppViewModel.class, current, (String) null, (ViewModelProvider.Factory) null, creationExtras, startRestartGroup, 36936, 0);
                    startRestartGroup.endReplaceableGroup();
                    appViewModel = (AppViewModel) viewModel;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-897932879, i, -1, "ai.mlc.mlcchat.NavView (NavView.kt:11)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
            NavHostKt.NavHost(rememberNavController, "home", (Modifier) null, (String) null, new NavViewKt$NavView$1(rememberNavController, appViewModel), startRestartGroup, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavViewKt$NavView$2(appViewModel, i, i2));
        }
    }
}
