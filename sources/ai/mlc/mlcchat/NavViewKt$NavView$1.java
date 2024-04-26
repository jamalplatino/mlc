package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavView.kt */
final class NavViewKt$NavView$1 extends Lambda implements Function1<NavGraphBuilder, Unit> {
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ NavHostController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavViewKt$NavView$1(NavHostController navHostController, AppViewModel appViewModel) {
        super(1);
        this.$navController = navHostController;
        this.$appViewModel = appViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavGraphBuilder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "$this$NavHost");
        final NavHostController navHostController = this.$navController;
        final AppViewModel appViewModel = this.$appViewModel;
        NavGraphBuilderKt.composable$default(navGraphBuilder, "home", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(1641606390, true, new Function3<NavBackStackEntry, Composer, Integer, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1641606390, i, -1, "ai.mlc.mlcchat.NavView.<anonymous>.<anonymous> (NavView.kt:14)");
                }
                StartViewKt.StartView(navHostController, appViewModel, composer, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
        final NavHostController navHostController2 = this.$navController;
        final AppViewModel appViewModel2 = this.$appViewModel;
        NavGraphBuilderKt.composable$default(navGraphBuilder, "chat", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(-246143507, true, new Function3<NavBackStackEntry, Composer, Integer, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246143507, i, -1, "ai.mlc.mlcchat.NavView.<anonymous>.<anonymous> (NavView.kt:15)");
                }
                ChatViewKt.ChatView(navHostController2, appViewModel2.getChatState(), composer, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
    }
}
