package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$ChatState$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ AppViewModel.ChatState f$0;
    public final /* synthetic */ AppViewModel f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ AppViewModel$ChatState$$ExternalSyntheticLambda4(AppViewModel.ChatState chatState, AppViewModel appViewModel, Function0 function0) {
        this.f$0 = chatState;
        this.f$1 = appViewModel;
        this.f$2 = function0;
    }

    public final void run() {
        AppViewModel.ChatState.mainTerminateChat$lambda$2(this.f$0, this.f$1, this.f$2);
    }
}
