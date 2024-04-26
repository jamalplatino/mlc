package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$ModelState$$ExternalSyntheticLambda0 implements FilenameFilter {
    public final /* synthetic */ AppViewModel.ModelState f$0;

    public /* synthetic */ AppViewModel$ModelState$$ExternalSyntheticLambda0(AppViewModel.ModelState modelState) {
        this.f$0 = modelState;
    }

    public final boolean accept(File file, String str) {
        return AppViewModel.ModelState.clear$lambda$0(this.f$0, file, str);
    }
}
