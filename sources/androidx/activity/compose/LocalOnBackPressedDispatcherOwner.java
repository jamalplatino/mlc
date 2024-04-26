package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "()V", "LocalOnBackPressedDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "dispatcherOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackHandler.kt */
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;
    public static final LocalOnBackPressedDispatcherOwner INSTANCE = new LocalOnBackPressedDispatcherOwner();
    private static final ProvidableCompositionLocal<OnBackPressedDispatcherOwner> LocalOnBackPressedDispatcherOwner = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.INSTANCE, 1, (Object) null);

    private LocalOnBackPressedDispatcherOwner() {
    }

    public final OnBackPressedDispatcherOwner getCurrent(Composer composer, int i) {
        composer.startReplaceableGroup(-2068013981);
        ComposerKt.sourceInformation(composer, "C50@2094L7,*52@2246L7:BackHandler.kt#q1dkbc");
        ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(LocalOnBackPressedDispatcherOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) consume;
        composer.startReplaceableGroup(1680121597);
        ComposerKt.sourceInformation(composer, "51@2127L7");
        if (onBackPressedDispatcherOwner == null) {
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer);
            onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get((View) consume2);
        }
        composer.endReplaceableGroup();
        if (onBackPressedDispatcherOwner == null) {
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Context context = (Context) consume3;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof OnBackPressedDispatcherOwner) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) context;
        }
        composer.endReplaceableGroup();
        return onBackPressedDispatcherOwner;
    }

    public final ProvidedValue<OnBackPressedDispatcherOwner> provides(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.provides(onBackPressedDispatcherOwner);
    }
}
