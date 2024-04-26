package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Clickable.kt */
public final class ClickableKt$combinedClickable$4$2$1 implements ModifierLocalConsumer {
    final /* synthetic */ MutableState<Boolean> $isClickableInScrollableContainer;

    ClickableKt$combinedClickable$4$2$1(MutableState<Boolean> mutableState) {
        this.$isClickableInScrollableContainer = mutableState;
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        Intrinsics.checkNotNullParameter(modifierLocalReadScope, "scope");
        this.$isClickableInScrollableContainer.setValue(modifierLocalReadScope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
    }
}
