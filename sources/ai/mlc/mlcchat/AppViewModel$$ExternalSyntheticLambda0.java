package ai.mlc.mlcchat;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppViewModel$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AppViewModel$$ExternalSyntheticLambda0(Function1 function1) {
        this.f$0 = function1;
    }

    public final boolean test(Object obj) {
        return AppViewModel.deleteModel$lambda$1(this.f$0, obj);
    }
}
