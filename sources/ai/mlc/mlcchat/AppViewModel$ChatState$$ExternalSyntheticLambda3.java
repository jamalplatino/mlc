package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$ChatState$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ AppViewModel.ChatState f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ AppViewModel f$2;

    public /* synthetic */ AppViewModel$ChatState$$ExternalSyntheticLambda3(AppViewModel.ChatState chatState, String str, AppViewModel appViewModel) {
        this.f$0 = chatState;
        this.f$1 = str;
        this.f$2 = appViewModel;
    }

    public final void run() {
        AppViewModel.ChatState.requestGenerate$lambda$4(this.f$0, this.f$1, this.f$2);
    }
}
