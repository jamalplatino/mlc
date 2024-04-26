package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ Function0<Unit> $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SheetState $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1(SheetState sheetState, String str, String str2, String str3, Function0<Unit> function0, CoroutineScope coroutineScope) {
        super(1);
        this.$sheetState = sheetState;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = function0;
        this.$scope = coroutineScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "$this$semantics");
        SheetState sheetState = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        Function0<Unit> function0 = this.$animateToDismiss;
        CoroutineScope coroutineScope = this.$scope;
        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$1(function0));
        if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$2(sheetState, coroutineScope, sheetState));
        } else if (sheetState.getHasPartiallyExpandedState()) {
            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3(sheetState, coroutineScope));
        }
    }
}
