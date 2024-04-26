package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "modelState", "Lai/mlc/mlcchat/AppViewModel$ModelState;", "Lai/mlc/mlcchat/AppViewModel;", "invoke", "(Lai/mlc/mlcchat/AppViewModel$ModelState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$deleteModel$1 extends Lambda implements Function1<AppViewModel.ModelState, Boolean> {
    final /* synthetic */ String $modelId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$deleteModel$1(String str) {
        super(1);
        this.$modelId = str;
    }

    public final Boolean invoke(AppViewModel.ModelState modelState) {
        Intrinsics.checkNotNullParameter(modelState, "modelState");
        return Boolean.valueOf(Intrinsics.areEqual((Object) modelState.getModelConfig().getModelId(), (Object) this.$modelId));
    }
}
