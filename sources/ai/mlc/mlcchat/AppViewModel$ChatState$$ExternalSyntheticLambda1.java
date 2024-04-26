package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$ChatState$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ AppViewModel f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ AppViewModel$ChatState$$ExternalSyntheticLambda1(AppViewModel appViewModel, Function0 function0) {
        this.f$0 = appViewModel;
        this.f$1 = function0;
    }

    public final void run() {
        AppViewModel.ChatState.interruptChat$lambda$1(this.f$0, this.f$1);
    }
}
