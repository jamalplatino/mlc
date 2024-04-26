package ai.mlc.mlcchat;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$deleteModel$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $modelId;
    final /* synthetic */ AppViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$deleteModel$2(AppViewModel appViewModel, String str) {
        super(0);
        this.this$0 = appViewModel;
        this.$modelId = str;
    }

    /* access modifiers changed from: private */
    public static final boolean invoke$lambda$0(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void invoke() {
        List<ModelRecord> modelList = this.this$0.appConfig.getModelList();
        final String str = this.$modelId;
        modelList.removeIf(new AppViewModel$deleteModel$2$$ExternalSyntheticLambda0(new Function1<ModelRecord, Boolean>() {
            public final Boolean invoke(ModelRecord modelRecord) {
                Intrinsics.checkNotNullParameter(modelRecord, "modelRecord");
                return Boolean.valueOf(Intrinsics.areEqual((Object) modelRecord.getModelId(), (Object) str));
            }
        }));
    }
}
