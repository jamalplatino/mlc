package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$ChatState$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ AppViewModel f$0;
    public final /* synthetic */ AppViewModel.ChatState f$1;
    public final /* synthetic */ ModelConfig f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ AppViewModel$ChatState$$ExternalSyntheticLambda2(AppViewModel appViewModel, AppViewModel.ChatState chatState, ModelConfig modelConfig, String str) {
        this.f$0 = appViewModel;
        this.f$1 = chatState;
        this.f$2 = modelConfig;
        this.f$3 = str;
    }

    public final void run() {
        AppViewModel.ChatState.mainReloadChat$lambda$3(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
