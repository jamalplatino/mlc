package androidx.compose.material3;

import androidx.compose.ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
final class SearchBarKt$SearchBarInputField$2$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onActiveChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBarInputField$2$1(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$onActiveChange = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusState) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "it");
        if (focusState.isFocused()) {
            this.$onActiveChange.invoke(true);
        }
    }
}
