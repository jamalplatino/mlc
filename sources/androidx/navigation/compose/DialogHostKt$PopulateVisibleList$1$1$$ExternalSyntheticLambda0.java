package androidx.navigation.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DialogHostKt$PopulateVisibleList$1$1$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ List f$0;
    public final /* synthetic */ NavBackStackEntry f$1;

    public /* synthetic */ DialogHostKt$PopulateVisibleList$1$1$$ExternalSyntheticLambda0(List list, NavBackStackEntry navBackStackEntry) {
        this.f$0 = list;
        this.f$1 = navBackStackEntry;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        DialogHostKt$PopulateVisibleList$1$1.m5915invoke$lambda0(this.f$0, this.f$1, lifecycleOwner, event);
    }
}
