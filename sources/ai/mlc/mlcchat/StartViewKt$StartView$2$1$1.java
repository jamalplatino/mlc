package ai.mlc.mlcchat;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$StartView$2$1$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ NavController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$StartView$2$1$1(AppViewModel appViewModel, NavController navController) {
        super(1);
        this.$appViewModel = appViewModel;
        this.$navController = navController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List modelList = this.$appViewModel.getModelList();
        Function1 function1 = AnonymousClass1.INSTANCE;
        NavController navController = this.$navController;
        AppViewModel appViewModel = this.$appViewModel;
        lazyListScope.items(modelList.size(), function1 != null ? new StartViewKt$StartView$2$1$1$invoke$$inlined$items$default$2(function1, modelList) : null, new StartViewKt$StartView$2$1$1$invoke$$inlined$items$default$3(StartViewKt$StartView$2$1$1$invoke$$inlined$items$default$1.INSTANCE, modelList), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new StartViewKt$StartView$2$1$1$invoke$$inlined$items$default$4(modelList, navController, appViewModel)));
    }
}
