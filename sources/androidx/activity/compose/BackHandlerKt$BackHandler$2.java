package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackHandler.kt */
final class BackHandlerKt$BackHandler$2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 $backCallback;
    final /* synthetic */ OnBackPressedDispatcher $backDispatcher;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackHandlerKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(1);
        this.$backDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = lifecycleOwner;
        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$1;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$backDispatcher.addCallback(this.$lifecycleOwner, this.$backCallback);
        return new BackHandlerKt$BackHandler$2$invoke$$inlined$onDispose$1(this.$backCallback);
    }
}
